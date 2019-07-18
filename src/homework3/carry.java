package homework3;

public class carry implements Runnable{
	Computer cp;

	public carry(Computer cp) {
		super();
		this.cp = cp;
	}

	@Override
	public void run() {
		while(true) {
			cp.carry();
		}
		
	}
	

}
