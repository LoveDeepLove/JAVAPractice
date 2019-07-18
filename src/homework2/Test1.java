package homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class Test1 {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws IOException {
		Company cp=new Company();
		DakaInfo daka=new DakaInfo();
		Main main=new Main();
		int a=0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String s=sdf.format(new Date());
		File file =new File("D:\\company\\签到记录\\签到"+s+".txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		File file2 =new File("D:\\company\\签退记录\\签退"+s+".txt");
		if(!file2.exists()) {
			file.createNewFile();
		}
		cp.addinfor(daka);
		FileWriter fw=new FileWriter(file);
		FileWriter fw2=new FileWriter(file2);
		PrintWriter pw=new PrintWriter(fw);
		PrintWriter pw2=new PrintWriter(fw2);
		int choose = 4;
		while(choose!=0) {
		System.out.println("按1操作员工信息；按2开启签到系统；按0退出系统");
		Scanner use=new Scanner(System.in);
		int user=use.nextInt();
		choose=user;
		if(choose==1) {
		while(a==0) {
			System.out.println("按1添加员工，按2移除员工，按3查找员工。");
			Scanner sc=new Scanner(System.in);
			int b=sc.nextInt();
			switch(b) {
			case(1):
				cp.addperson();
			    break;
			case(2):
				cp.removeperson();
			    break;
			case(3):
				cp.checkperson();
			    break;
			default:
				System.out.println("请输入合适的数字。");
			}
			System.out.println("继续请按0，退出请输入不为0的数。");
			Scanner sc1=new Scanner(System.in);
			a=sc1.nextInt();
			
		}
		}
		if(choose==2) {
		int b=1;
		while(b==1) {
			b=main.start(daka, cp);
			
		}
		Set<Integer> set=daka.getMap1().keySet();
		Set<Integer> set2=daka.getMap2().keySet();
		for(Integer i:set) {
			pw.println(i+" "+cp.getEmployee().get(i)+" "+daka.getMap1().get(i));
		}
		for(Integer i2:set2) {
			pw2.println(i2+" "+cp.getEmployee().get(i2)+" "+daka.getMap1().get(i2));
		}
		pw.close();
		fw.close();
		pw2.close();
		fw2.close();

	}
		if(choose==0) {
			cp.storeinfor(daka);
			System.out.println("系统退出");
			System.exit(0);
		}
		
		}

}
	
}