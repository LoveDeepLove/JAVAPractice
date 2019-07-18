package test11;

public class test3 {

	public static void main(String[] args) {
		/**Th tt=new Th(200,1);
		Th tt2=new Th(200,2);
		
		Thread t=new Thread(tt);
		Thread t2=new Thread(tt2);
		
		t.setPriority(10);
		t2.setPriority(6);
		
		t.start();
		t2.start();
		
		Time ti=new Time();
		ti.start();*/
		Data d=new Data(0);
		Count a=new Count(d,1);
		Count a2=new Count(d,-1);
		Thread b=new Thread(a);
		Thread b2=new Thread(a);
		Thread b3=new Thread(a2);
		Thread b4=new Thread(a2);
		
		b.start();
		b2.start();
		b3.start();
		b4.start();
		System.out.println(d.a);

	}

}
