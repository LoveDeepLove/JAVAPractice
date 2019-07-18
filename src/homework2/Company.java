package homework2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Company {
	static Map<Integer,String> employee=new HashMap<Integer,String>();
	
	
	public static Map<Integer, String> getEmployee() {
		return employee;
	}
	public static void setEmployee(Map<Integer, String> employee) {
		Company.employee = employee;
	}
	public static void addinfor(DakaInfo daka) throws IOException {
		File emplo=new File("D:\\company\\employee.txt");
		if(!emplo.exists()) {
			emplo.createNewFile();
		}
		FileInputStream reader=new FileInputStream(emplo);
		byte byt[]=new byte[reader.available()];
		int i;
		for(i=0;i<byt.length;i++) {
			byt[i]=(byte) reader.read();
		}
		String empl=new String(byt);
		StringTokenizer stn=new StringTokenizer(empl,"\n");
		while(stn.hasMoreTokens()) {
		String sb=stn.nextToken();
		StringTokenizer stn2=new StringTokenizer(sb,":");
		int id3 =Integer.parseInt(stn2.nextToken());
		String name =stn2.nextToken();
		employee.put(id3, name);
		reader.close();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String s=sdf.format(new Date());
		File emplo1=new File("D:\\company\\签到记录\\签到"+s+".txt");
		if(!emplo1.exists()) {
			emplo1.createNewFile();
		}
		FileInputStream reader1=new FileInputStream(emplo1);
		byte byt1[]=new byte[reader1.available()];
		int i1;
		for(i1=0;i1<byt1.length;i1++) {
			byt1[i1]=(byte) reader1.read();
		}
		String empl1=new String(byt1);
		StringTokenizer stn1=new StringTokenizer(empl1,"\n");
		while(stn1.hasMoreTokens()) {
		String sb1=stn1.nextToken();
		StringTokenizer stn3=new StringTokenizer(sb1," ");
		int id4 =Integer.parseInt(stn3.nextToken());
		@SuppressWarnings("unused")
		String name1 =stn3.nextToken();
		String time1 =stn3.nextToken();
		String time10=String.valueOf(stn3.nextToken());
		daka.getMap1().put(id4, time1+" "+time10);
		reader1.close();
		}
		File emplo5=new File("D:\\company\\签退记录\\签退"+s+".txt");
		if(!emplo5.exists()) {
			emplo5.createNewFile();
		}
		FileInputStream reader5=new FileInputStream(emplo5);
		byte byt5[]=new byte[reader5.available()];
		int i5;
		for(i5=0;i5<byt5.length;i5++) {
			byt5[i5]=(byte) reader5.read();
		}
		String empl5=new String(byt5);
		StringTokenizer stn5=new StringTokenizer(empl5,"\n");
		while(stn5.hasMoreTokens()) {
		String sb5=stn5.nextToken();
		StringTokenizer stn6=new StringTokenizer(sb5," ");
		int id6 =Integer.parseInt(stn6.nextToken());
		@SuppressWarnings("unused")
		String name6 =stn6.nextToken();
		String time6 =stn6.nextToken();
		String time20=String.valueOf(stn6.nextToken());
		daka.getMap2().put(id6, time6+" "+time20);
		reader5.close();
		}
	}
	public static void addperson() throws IOException {
		System.out.println("请输入你要添加的员工信息，并用空格隔开");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringTokenizer stn=new StringTokenizer(str," ");
		int id = Integer.parseInt(stn.nextToken());
		Employee em=new Employee(id,stn.nextToken());
		Set<Integer> ch=employee.keySet();
		int bol=1;
		for(Integer i:ch) {
			if(i==id||employee.get(i)==em.name) {
				System.out.println("员工系统里已经有这个人了。");
				bol=0;
				}
			}
		if(bol==1) {
			employee.put(em.ID,em.name);
			System.out.println("添加员工信息成功。");
			
		}
	}
	public static void removeperson() throws IOException {
		System.out.println("请输入你要移除的员工信息，并用空格隔开");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringTokenizer stn=new StringTokenizer(str," ");
		int id = Integer.parseInt(stn.nextToken());
		Employee em=new Employee(id,stn.nextToken());
		employee.remove(em.ID,em.name);
		System.out.println("移除员工信息成功。");
		
		}
	
	public static void checkperson() {
		System.out.println("请输入你要查找的员工ID");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int id =Integer.parseInt(str);
		if(employee.containsKey(id)) {
			System.out.println("你要查找的员工是"+employee.get(id));
		}else {
			System.out.println("查无此人。");
		}
	}
	public static void storeinfor(DakaInfo daka) throws IOException {
		File allin=new File("D:\\company\\全员信息.txt");
		if(!allin.exists()) {
			allin.createNewFile();
		}
		FileWriter fw3=new FileWriter(allin);
		PrintWriter pw3=new PrintWriter(fw3);
		Set<Integer> i=employee.keySet();
		for(Integer ii:i) {
			pw3.println(ii+":"+employee.get(ii)+"签到时间："+daka.getMap1().get(ii)+"签退时间："+daka.getMap2().get(ii));
		}
		pw3.close();
		File employ = new File("D:\\company\\employee.txt");
		if(!employ.exists()) {
			employ.createNewFile();
		}
		FileWriter fw=new FileWriter(employ);
		PrintWriter pw=new PrintWriter(fw);
		Set<Integer> set=employee.keySet();
		for(Integer inte:set) {
			pw.println(inte+":"+employee.get(inte));
		}
		pw.close();
	}

}
