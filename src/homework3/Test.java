package homework3;

public class Test {

	public static void main(String[] args) {
		Computer c=new Computer();
		produce s = new produce(c);
		carry ca=new carry(c);
		Thread t=new Thread(s,"����");
		Thread t2=new Thread(ca,"����");
		t.start();
		t2.start();

	}

}
