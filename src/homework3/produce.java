package homework3;

public class produce implements Runnable{
	Computer cp;

	public produce(Computer cp) {
		super();
		this.cp = cp;
	}

	@Override
	public void run() {
		while(true) {
			cp.product();
		}
		
		
	}

}
