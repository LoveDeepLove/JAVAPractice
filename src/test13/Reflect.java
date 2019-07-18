package test13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class Reflect {
	public static void main(String[] args)  {
		Class<?> r = null;
		try {
			r = Player.class;
			Constructor<?>[] con=r.getConstructors();
			Player re=(Player)con[0].newInstance("momo",10,1);
			System.out.println(re.getName()+re.getScore()+re.getPaiming());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Field[] fi=r.getDeclaredFields();
		for(int i=0;i<fi.length;i++) {
		      Class<?> type = fi[i].getType();
		      int mod=fi[i].getModifiers();
		      String str=Modifier.toString(mod);
		      System.out.println(str+" "+type.getName()+" "+fi[i].getName());
		}
		Method[] m=r.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			int mo=m[i].getModifiers();
			String st=Modifier.toString(mo);
			Class<?> returnType = m[i].getReturnType();
			String name = returnType.getName();
			String name2=m[i].getName();
			String pts="²ÎÊý£º";
			Class<?>[] parameterTypes = m[i].getParameterTypes();
			for(int j=0;j<parameterTypes.length;j++) {
				if(j==parameterTypes.length-1) {
					pts=pts+parameterTypes[j].getName();
				}else {
					pts=pts+parameterTypes[j].getName()+",";
				}
			}
			System.out.println(st+" "+name+" "+name2+" "+pts);
		}
		
		
		

	}

}
