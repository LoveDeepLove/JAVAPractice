package homework3;

public class Test {

	public static void main(String[] args) {
		Computer c=new Computer();
		produce s = new produce(c);
		carry ca=new carry(c);
		Thread t=new Thread(s,"张三");
		Thread t2=new Thread(ca,"李四");
		t.start();
		t2.start();

	}

}
