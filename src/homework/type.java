package homework;

import java.util.Scanner;

public class type {
	int d;
	int len;
	int j;
	
	public void nandu() {
		System.out.println("��ѡ���Ѷȡ�");
		@SuppressWarnings("resource")
		Scanner ch=new Scanner(System.in);
		String choose=ch.nextLine();
		if(choose.equals("��")) {
			System.out.println("��ֻ������Сд��ĸ��"); 
			System.out.println("������master.");
			len=6;
			d=1;
		}
		if(choose.equals("��")) {
			System.out.println("���������Сд��ĸ�����֡�");
			System.out.println("������masteris567");
			len=11;
			d=2;
		}
		if(choose.equals("��")) {
			System.out.println("����������Сд��ĸ������");
			System.out.println("������Masterisfamous963");
			len=17;
			d=3;
		}
		System.out.println("��ѡ��ȼ���");
		Scanner jj=new Scanner(System.in);
		String jjj=jj.nextLine();
		if(jjj.equals("�ȼ�1")) {
			System.out.println("����10��������1��");
			j=1;
		}
		if(jjj.equals("�ȼ�2")) {
			System.out.println("����15��������2��");
			j=2;
		}
		if(jjj.equals("�ȼ�3")) {
			System.out.println("����20��������3��");
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
		System.out.println("������ĳ���Ϊ"+a+"������Ĵ���Ϊ"+b+"������ʱ��Ϊ"+time);
        int deng = t.dengji(a, b, time);
        if(deng!=j) {
        	System.out.println("����սʧ�ܡ�");
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
