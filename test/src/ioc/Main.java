package ioc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    // TODO
    public static void  ioc(String className,Shiyanlou s,String methodName, String name) throws Exception{
    	Class<?> clazz = Class.forName(className);
    	Object obj = clazz.newInstance();
    	
    	Field[] fields = clazz.getDeclaredFields();
    	//��ȡShiyanlou���͵ı�����
    	String fieldName = "";
    	for (Field field : fields) {
    		field.setAccessible(true);
			if(field.getType().getName().equals("ioc.Shiyanlou")) {
				fieldName = field.getName();
			}
		}
    	
    	//��fieldName�е�һ����ĸת��Ϊ��д
    	fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    	
    	//set��ʽע�����s
    	Method methodOfSet = clazz.getMethod("set" + fieldName, Shiyanlou.class);
    	methodOfSet.invoke(obj, s);
    	
    	//ִ��methodName����
    	Method methodOfMethodName = clazz.getMethod(methodName, String.class);
    	methodOfMethodName.invoke(obj, name);
    }
    
    public static void main(String[] args) throws Exception {
		ioc("ioc.ShiyanlouTest", new ShiyanlouImpl(), "toUp", " 12ffgfdhgs dd");
	}
}
