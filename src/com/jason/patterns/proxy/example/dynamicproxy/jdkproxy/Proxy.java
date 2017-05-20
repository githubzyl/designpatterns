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
 * ģ��JDK��̬�����ʵ��
 * ʵ�ֹ��ܣ�ͨ��Proxy��newProxyInstance()���ش������
 * ʵ��˼·��
 * 1������һ��Դ�루��̬��������
 * 2������Դ�루JDK Compiler API��,�����µ��ࣨ�����ࣩ
 * 3���������load���ڴ��У�����һ���µĶ��󣨴������
 * 4��return �������
 * @author zhaoyl
 * @createdate 2017��5��20��
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
		
		//�����������java�ļ�
		String filename = System.getProperty("user.dir") + compilerPath + className + ".java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
	
		//����
		//�õ�������
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//�ļ�������
		StandardJavaFileManager fileManager = 
				compiler.getStandardFileManager(null, null, null);
		//��ȡ�ļ�
		Iterable units = fileManager.getJavaFileObjects(filename);
		//��������
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		//���б���
		task.call();
		//�ر��ļ�������
		fileManager.close();
		//������õ��ļ�load���ڴ���
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class clazz = cl.loadClass(packageName + "." + className);
		//����������
		Constructor ctr = clazz.getConstructor(InvocationHandler.class);
		
		return ctr.newInstance(h);
	}
	
}
