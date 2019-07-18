package test08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class champion {

	public static void main(String[] args) {
		Map<Integer,String> champion=new HashMap<Integer,String>();
		
		champion.put(2019, "猛龙");
		champion.put(2018, "勇士");
		champion.put(2017, "勇士");
		champion.put(2016, "骑士");
		champion.put(2015, "勇士");
	
		System.out.println("请输入你想查询的年份。");
		Scanner i=new Scanner(System.in);
		int year=i.nextInt();
		System.out.println(year+"年的总冠军是"+champion.get(year));
		
		

	}

}
