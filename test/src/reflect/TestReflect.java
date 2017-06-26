package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
	
	//�����ȡ��̬����
	public static void getStaticMethod() throws Exception {
		Class<?> person = Class.forName("reflect.Person");
		Method method = person.getMethod("printName", null);
		Object obj = person.newInstance();
//		obj = (Person)obj;
		method.invoke(obj, null);
	}	
	
	//�����ȡָ����ͨ����
	public static void getPlainMethod() throws Exception, SecurityException {
		Class clazz = Person.class;
		Method play = clazz.getMethod("play", String.class);
		Object obj = clazz.newInstance();
		
		play.invoke(obj, "��Խ����");
	}
	
	//�����ȡ���е���ͨ����
	public static void getAllPlainMethods() throws Exception {
		Class clazz = Person.class;
		Object obj = clazz.newInstance();
		
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if(method.getName().equals("play")) {
				method.invoke(obj, "����");
			} else if(method.getName().equals("printName")) {
				method.invoke(obj, null);
			}
		}
	}
	
	//�����ȡָ�����췽��
	public static void getConstructor() throws Exception {
		Class clazz = Person.class;
		Constructor con = clazz.getConstructor(String.class, int.class);
		Object obj = con.newInstance("lisi", 8);
		Method method = clazz.getMethod("play", String.class);
		method.invoke(obj, "ƹ����");
	}
	
	//�����ȡ���еĹ��췽��
	public static void getAllContructors() throws Exception {
		Class<?> clazz = Class.forName("io.Person");
		Constructor<?>[] cons = clazz.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}
	}
	
	//�����ȡ˽�г�Ա����
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
		//�����ȡ��̬����
//		TestReflect.getStaticMethod();
		//�����ȡָ����ͨ����
//		TestReflect.getPlainMethod();
//		getAllPlainMethods();
		//�����ȡָ���Ĺ��췽��
//		getConstructor();
		//�����ȡ���еĹ��췽��
//		getAllContructors();
		//�����ȡ��Ա��������ֵ
		getField();
	}

}
