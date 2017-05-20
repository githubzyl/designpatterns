package com.jason.patterns.proxy.example.dynamicproxy.jdkproxy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

/**
 * 模拟JDK动态代理的实现
 * 实现功能：通过Proxy的newProxyInstance()返回代理对象
 * 实现思路：
 * 1、声明一段源码（动态产生代理）
 * 2、编译源码（JDK Compiler API）,产生新的类（代理类）
 * 3、将这个类load到内存中，产生一个新的对象（代理对象）
 * 4、return 代理对象
 * @author zhaoyl
 * @createdate 2017年5月20日
 */
public class Proxy {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object newProxyInstance(Class<?> infce,InvocationHandler h) throws Exception{
		String rt = "\r\n";
		String methodStr = "";
		String className = "$Proxy0";
		String compilerPath = "/bin/com/jason/patterns/proxy/example/dynamicproxy/jdkproxy/";
		String packageName = "com.jason.patterns.proxy.example.dynamicproxy.jdkproxy";
		for(Method m : infce.getMethods()){
			methodStr += "@Override" + rt +
						 "public void " + m.getName() + "() {" + rt +
						     "try{" + rt +
								 "Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
							     "h.invoke(this,md);" + rt +
							  "}catch(Exception e){" + rt +
							  	  "e.printStackTrace();" + rt +
							  "}" + rt +
						 "}";
		}
		String str = "package " + packageName + ";" + rt +
					 "import " + packageName + ".InvocationHandler;" + rt +
					 "import java.lang.reflect.Method;" + rt +
					 "public class " + className + " implements " + infce.getName() + "{" + rt +
						"private InvocationHandler h;" + rt +
						"public " + className + "(InvocationHandler h) {" + rt +
							"super();" + rt +
							"this.h = h;" + rt +
						"}" + rt +
						 methodStr + rt +
					 "}";
		
		//产生代理类的java文件
		String filename = System.getProperty("user.dir") + compilerPath + className + ".java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
	
		//编译
		//得到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileManager = 
				compiler.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units = fileManager.getJavaFileObjects(filename);
		//编译任务
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		//进行编译
		task.call();
		//关闭文件管理者
		fileManager.close();
		//将编译好的文件load到内存中
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class clazz = cl.loadClass(packageName + "." + className);
		//创建代理类
		Constructor ctr = clazz.getConstructor(InvocationHandler.class);
		
		return ctr.newInstance(h);
	}
	
}
