package test08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class champion {

	public static void main(String[] args) {
		Map<Integer,String> champion=new HashMap<Integer,String>();
		
		champion.put(2019, "����");
		champion.put(2018, "��ʿ");
		champion.put(2017, "��ʿ");
		champion.put(2016, "��ʿ");
		champion.put(2015, "��ʿ");
	
		System.out.println("�����������ѯ����ݡ�");
		Scanner i=new Scanner(System.in);
		int year=i.nextInt();
		System.out.println(year+"����ܹھ���"+champion.get(year));
		
		

	}

}
