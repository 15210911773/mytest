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
    	//获取Shiyanlou类型的变量名
    	String fieldName = "";
    	for (Field field : fields) {
    		field.setAccessible(true);
			if(field.getType().getName().equals("ioc.Shiyanlou")) {
				fieldName = field.getName();
			}
		}
    	
    	//将fieldName中第一个字母转换为大写
    	fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    	
    	//set方式注入参数s
    	Method methodOfSet = clazz.getMethod("set" + fieldName, Shiyanlou.class);
    	methodOfSet.invoke(obj, s);
    	
    	//执行methodName方法
    	Method methodOfMethodName = clazz.getMethod(methodName, String.class);
    	methodOfMethodName.invoke(obj, name);
    }
    
    public static void main(String[] args) throws Exception {
		ioc("ioc.ShiyanlouTest", new ShiyanlouImpl(), "toUp", " 12ffgfdhgs dd");
	}
}
