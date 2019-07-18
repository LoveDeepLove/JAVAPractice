package homework;

import java.util.Scanner;

public class type {
	int d;
	int len;
	int j;
	
	public void nandu() {
		System.out.println("请选择难度。");
		@SuppressWarnings("resource")
		Scanner ch=new Scanner(System.in);
		String choose=ch.nextLine();
		if(choose.equals("易")) {
			System.out.println("你只能输入小写字母。"); 
			System.out.println("请输入master.");
			len=6;
			d=1;
		}
		if(choose.equals("中")) {
			System.out.println("你可以输入小写字母和数字。");
			System.out.println("请输入masteris567");
			len=11;
			d=2;
		}
		if(choose.equals("难")) {
			System.out.println("你可以输入大小写字母和数字");
			System.out.println("请输入Masterisfamous963");
			len=17;
			d=3;
		}
		System.out.println("请选择等级。");
		Scanner jj=new Scanner(System.in);
		String jjj=jj.nextLine();
		if(jjj.equals("等级1")) {
			System.out.println("请在10秒内输入1次");
			j=1;
		}
		if(jjj.equals("等级2")) {
			System.out.println("请在15秒内输入2次");
			j=2;
		}
		if(jjj.equals("等级3")) {
			System.out.println("请在20秒内输入3次");
			j=3;
		}
		
		
	}
	public int starttype(type t) {
		t.nandu();
		long startTime = System.currentTimeMillis();
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		String in=input.nextLine();
		long endTime = System.currentTimeMillis();
		int a=in.length();
		int b=a/len;
		long time=(endTime-startTime)/1000;
		System.out.println("你输入的长度为"+a+"你输入的次数为"+b+"你所用时间为"+time);
        int deng = t.dengji(a, b, time);
        if(deng!=j) {
        	System.out.println("你挑战失败。");
        }
		return t.getscore(j,d,b);
		
	}
	public int dengji(int l,int times,double time) {
		int num=0;
		if(l<=6&&times>=1&&time<10.9) {
			num=1;
			return num;
		}
		if(l<=12&&l>6&&times>=2&&time<15.9) {
			num=2;
			return num;
		}
		if(l>12&&times>=3&&time<20) {
			num=3;
			return num;
		}
		return num;
		
	}
	private int getscore(int deng,int d,int b) {
		int num = 0;
		if(deng==1) {
			if(d==1) {
				num= b*30;
			}
			if(d==2) {
				num= b*35;
			}
			if(d==3) {
				num= b*40;
			}
		}
		if(deng==2) {
			if(d==1) {
				num= b*30+10;
			}
			if(d==2) {
				num= b*35+10;
			}
			if(d==3) {
				num= b*40+10;
			}
		}
		if(deng==3) {
			if(d==1) {
				num= b*30+20;
			}
			if(d==2) {
				num= b*35+20;
			}
			if(d==3) {
				num= b*40+20;
			}
		}
		return num;
	}
	
	
	

}
