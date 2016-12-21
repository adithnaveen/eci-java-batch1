package com.eci.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ interface MyAnnotation{
	public String name();
	public String value();
}


interface MyInterface{}

class Car{}

@MyAnnotation(name="My Annotation Name", value="Some Values for Annotation")
class MyClass implements MyInterface{
	public String pubX;
	
	String str;
	
	
	private int ival;
	private String privateString;
	
	
	public MyClass(){}
	private Car car;
	
	public MyClass(int val){
		this.setIval(val);
	}
	public MyClass(Car car){
		this.setCar(car);
	}
	
	public MyClass(String val){
		this.str = val;
	}
	
	@Override
	public String toString() {
		return "MyClass [str=" + str + "]";
	}
	
	
	
	
	public int getIval() {
		return ival;
	}
	public void setIval(int ival) {
		this.ival = ival;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getPubX() {
		return pubX;
	}
	public void setPubX(String pubX) {
		this.pubX = pubX;
	}
	public String getPrivateStrin() {
		return privateString;
	}
	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}
	
	
	
}



public class Client {
	public static void main(String[] args) 
			throws ClassNotFoundException, NoSuchMethodException, 
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, 
			NoSuchFieldException {
		
		
		
		
		Method []  methods = Class.class.getMethods();
		
//		for(Method method : methods){
//			System.out.println("Name " + method.getName() +" Modifiers " + method.getModifiers());
//		}
		
		Class myClass = Class.forName("com.eci.reflection.MyClass");
		System.out.println("---------------------------------------------------------");
		System.out.println("Name " + myClass.getName());
		System.out.println("Simple Name " + myClass.getSimpleName());
		System.out.println("Package : " + myClass.getPackage());
		System.out.println("Super Class : " + myClass.getSuperclass());
		
		System.out.println("***********Get All Interfaces************************");
		for(Class temp : myClass.getInterfaces()){
			System.out.println(temp.getName());
		}
		
		System.out.println("****************** Get All Constructors**************");
		for(Constructor temp : myClass.getConstructors()){
			System.out.println(temp);
		}
		
		System.out.println("------------------- instantiate String in Reflection Way---------------");
		
		Constructor constructor  = MyClass.class.getConstructor(String.class);
		
		MyClass str =  (MyClass) constructor.newInstance("hello");
		System.out.println(str);
		
		System.out.println("-------------- instantiating Int for class in Reflection way----------------");
		Constructor<MyClass> iConstructor = MyClass.class.getConstructor(int.class);
		MyClass mClass = iConstructor.newInstance(1000);
		System.out.println("Integer Values " +mClass.getIval());
		
		System.out.println("-------------- instantiating Car for class in Reflection way----------------");

		Constructor<MyClass> iConstructorCar = MyClass.class.getConstructor(Car.class);
		MyClass mClassCar = iConstructorCar.newInstance(new Car());
		System.out.println(mClassCar.getCar());
		
		
		// list all methods from my class 
		
		System.out.println("---------------- getting all methods from myClass-----------------");
		Method [] methods1 = myClass.getMethods();
		
		for(Method temp : methods1){
			System.out.println(temp);
		}
		
		// Get all fileds of the class 
		Field [] fileds = myClass.getFields();
		System.out.println("*************** getting all fields***************");
		for(Field temp : fileds){
			System.out.println(temp.getName());
		}
		
		Field f1 = myClass.getField("pubX");
		System.out.println("Get Name " + f1.getName());
		System.out.println("Get Type " + f1.getType());
		
//		f1.set(f1, "Welcome Public");
		// ? print the field value 
		// System.out.println(f1);
		
		
		Annotation [] annotations = myClass.getAnnotations();
		
		System.out.println("--------------list all annotation-------------------");
		

		for(Annotation temp : annotations){
			if(temp instanceof MyAnnotation){
				MyAnnotation ma = (MyAnnotation) temp;
				System.out.println("Name : " + ma.name());
				System.out.println("Value : " + ma.value());
			}
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^Accessing Private Field^^^^^^^^^^^^^^");
		// privateString
		MyClass mclass1 = new MyClass();
		
		mclass1.setPrivateString("Hello World From Private");
		Field pFiled = MyClass.class.getDeclaredField("privateString");
		
		pFiled.setAccessible(true);
		String fieldValue = (String) pFiled.get(mclass1);
		System.out.println(fieldValue);
		
	}
}


















