package test13;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TEST {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			while(true) {
				Class<?> stu=Class.forName("test13.Student");
				Constructor<?>[] con=stu.getConstructors();
				System.out.println("请输入学生的姓名年龄成绩，并用空格隔开。输入exit退出");
				Scanner scan=new Scanner(System.in);
				String str=scan.nextLine();
				if(str.equals("exit")) {
					System.exit(0);
				}
				StringTokenizer stn=new StringTokenizer(str," ");
				String a=stn.nextToken();
				int b=Integer.parseInt(stn.nextToken());
				int c=Integer.parseInt(stn.nextToken());
				Student sd=(Student)con[0].newInstance(a,b,c);
				
				File f=new File("D:\\f.txt");
				if(!f.exists()) {
					f.createNewFile();
				}
				FileWriter fw=new FileWriter(f,true);
				PrintWriter ps=new PrintWriter(fw);
				ps.println("姓名: "+sd.getName());
				String s=String.valueOf(sd.getAge());
				ps.println("年龄: "+s);
				String s1=String.valueOf(sd.getScore());
				ps.println("成绩: "+s1);
				fw.close();
				ps.close();
			
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
