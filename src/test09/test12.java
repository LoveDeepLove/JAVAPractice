package test09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		/**System.out.println("请输入两个字符串形式的数。");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String s1=s.nextLine();
		String d1=s.nextLine();
		double s2=Double.parseDouble(s1);
		double d2=Double.parseDouble(d1);
		double c=s2+d2;
		System.out.println("其中更大的是"+Math.max(s2, d2));
		System.out.println("其中更小的是"+Math.min(s2, d2));
		System.out.println("两数之和为"+c);
		
		@SuppressWarnings("resource")
		Scanner o=new Scanner(System.in);
		String o1=o.nextLine();
		int i;
		int count = 0;
		char a;
		for(i=0;i<o1.length();i++) {
			a=o1.charAt(i);
			String b=String.valueOf(a);
			if(b.equals("e")) {
				count++;
			}
		}
		System.out.println("出现了"+count+"次e.");
		*/
		List<Integer> list=new ArrayList<Integer>();
		int coun;
		for(coun=0;coun<100;coun++) {
			int random=(int) (Math.random()*100+1);
			list.add(random);
		}
		int a1;
		int a2;
		for(a1=0;a1<list.size();a1++) {
			for(a2=1;a2<list.size()-a1;a2++) {
				if(list.get(a2-1).compareTo(list.get(a2))>0) {
					int big=list.get(a2-1);
					list.set(a2-1,list.get(a2));
					list.set(a2, big);
			}
		}
		}
		Iterator<Integer> list1=list.iterator();
		while(list1.hasNext()) {
			System.out.println(list1.next());
		}
		}
}



