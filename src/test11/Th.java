package test11;

public class Th implements Runnable{
	int a;
	int b;
	

	public Th(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public void run() {
		int i;
		for(i=0;i<=a;i++) {
			System.out.println("线程"+b+"正在运行");
		}
		
	}
	

}
