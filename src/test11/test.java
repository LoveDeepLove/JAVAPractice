package test11;

public class test {

	public static void main(String[] args) {
		Thr t1=new Thr(1,1000);
		Thr t2=new Thr(1001,2000);
		Thr t3=new Thr(2000,3000);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
