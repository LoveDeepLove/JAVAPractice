package homework;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		player play=new player("James",0);
		int count=1;
		while(count==1) {
			play.score=play.starttype(play);
			System.out.println(play.score);
			System.out.print("��Ҫ������ս�밴1���˳���2");
			Scanner i=new Scanner(System.in);
			count=i.nextInt();
			if(count==2) {
				System.exit(0);;
			}
		}
		

	}

}
