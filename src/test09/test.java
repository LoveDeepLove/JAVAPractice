package test09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		product product1=new product("abc",12);
		product product2=new product("abc",12);
		if(product1.equals(product2)) {
			System.out.println("Yes");
			

	}else {
		System.out.println("No");
	}
       Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		StringBuffer ab =new StringBuffer(st);
		StringBuffer str=ab.delete(3, 6);
		StringBuffer stri=str.insert(3, "****");
		String bc=new String(stri);
		System.out.println(bc);
		
		Scanner a1=new Scanner(System.in);
		Scanner b1=new Scanner(System.in);
		Scanner c1=new Scanner(System.in);
		double a =a1.nextDouble();
		double b =b1.nextDouble();
		double c =c1.nextDouble();
		double p=(a+b+c)/2;
		System.out.println("三角形的面积为"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try{
			String i=sdf.format(new Date());
			System.out.println(i);
		}catch(Exception e) {
			e.printStackTrace();
		}

	
	}
	
	
	

}
