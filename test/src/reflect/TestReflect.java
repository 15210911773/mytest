package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
	
	//反射获取静态方法
	public static void getStaticMethod() throws Exception {
		Class<?> person = Class.forName("reflect.Person");
		Method method = person.getMethod("printName", null);
		Object obj = person.newInstance();
//		obj = (Person)obj;
		method.invoke(obj, null);
	}	
	
	//反射获取指定普通方法
	public static void getPlainMethod() throws Exception, SecurityException {
		Class clazz = Person.class;
		Method play = clazz.getMethod("play", String.class);
		Object obj = clazz.newInstance();
		
		play.invoke(obj, "穿越火线");
	}
	
	//反射获取所有的普通方法
	public static void getAllPlainMethods() throws Exception {
		Class clazz = Person.class;
		Object obj = clazz.newInstance();
		
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if(method.getName().equals("play")) {
				method.invoke(obj, "足球");
			} else if(method.getName().equals("printName")) {
				method.invoke(obj, null);
			}
		}
	}
	
	//反射获取指定构造方法
	public static void getConstructor() throws Exception {
		Class clazz = Person.class;
		Constructor con = clazz.getConstructor(String.class, int.class);
		Object obj = con.newInstance("lisi", 8);
		Method method = clazz.getMethod("play", String.class);
		method.invoke(obj, "乒乓球");
	}
	
	//反射获取所有的构造方法
	public static void getAllContructors() throws Exception {
		Class<?> clazz = Class.forName("io.Person");
		Constructor<?>[] cons = clazz.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}
	}
	
	//反射获取私有成员变量
	public static void getField() throws Exception {
		Class<?> clazz = Class.forName("io.Person");
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		Object obj = clazz.newInstance();
		System.out.println(name.get(obj));
		
		Field age = clazz.getField("age");
		System.out.println(age.get(obj));
	}
	
	public static void main(String[] args) throws Exception {
		//反射获取静态方法
//		TestReflect.getStaticMethod();
		//反射获取指定普通方法
//		TestReflect.getPlainMethod();
//		getAllPlainMethods();
		//反射获取指定的构造方法
//		getConstructor();
		//反射获取所有的构造方法
//		getAllContructors();
		//反射获取成员变量属性值
		getField();
	}

}
