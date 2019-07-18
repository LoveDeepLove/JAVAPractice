package test11;

public class test2 {

	public static void main(String[] args) {
		Runna st1 = new Runna(1, 1000);
		Runna st2 = new Runna(1001, 2000);
		Runna st3 = new Runna(2001, 3000);
		
		Thread p1 = new Thread(st1);
		Thread p2 = new Thread(st2);
		Thread p3 = new Thread(st3);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
