package com.gil.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		try {
			// LOADING THE CLASS
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			// All constructors on that class
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			// All the methods on that class
			System.out.println(Arrays.toString(myClass.getMethods()));
			// it will use the constructor depending the number of parameters

			// CREATE AN OBJECT
			Constructor<?> constructor = myClass.getConstructor(null);

			// creates the object with default constructor
			System.out.println(constructor.newInstance(null));

			// INVOKE THE PARAMETERIZED CONSTRUCTOR

			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			// creates the object with parameterized constructor
			Object myObj = constructor2.newInstance(5, 10);

			// INVOKE THE GETTERS
			// null because getNum1 has no parameters
			Method method = myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));

			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));

			// INVOKE THE SETTERS
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);

			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 11);

			// MODIFYING PRIVATE FIELDS
			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.set(myObj, 80);
			
			//INVOKING GETTERS
			Method method3 = myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));

			Method method4 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));
			
			//INVOKE SUM METHOD
			Method mySum = myClass.getMethod("sum", double.class, double.class);
			System.out.println(mySum.invoke(myObj, 10, 25));

			
			//ACCESSING ANNOTATIONS
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			Annotation[] a = num1Field.getAnnotations();
			System.out.println(Arrays.toString(a));
			
			//ACCESSING FIELDS ON ANNOTATIONS
			MyAnnotation annotation= (MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());
			
			// throws classnotfoundexception if it cant find the class in the
			// classpath
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * you have successfully assigned the loaded class to a variable
	 * 
	 * and you have accessed the name, the constructors on that class and even
	 * the methods dynamically at runtime.
	 */
}
