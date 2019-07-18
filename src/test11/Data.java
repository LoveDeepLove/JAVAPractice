package test11;

public class Data {
	int a;
	
	public Data(int a) {
		super();
		this.a = a;
	}
	public synchronized void add() {
		a++;
	}
	public synchronized void del() {
		a--;
	}

}
