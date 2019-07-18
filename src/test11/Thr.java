package test11;

public class Thr extends Thread{
	private int start;
	private int end;
	
	public Thr(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	

	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	@Override
	public void run() {
		int i;
		for(i=start;i<=end;i++) {
			if(i%2!=0&&i%5!=0&&i%3!=0) {
				System.out.println("ËØÊı"+i);
			}
		}
		super.run();
	}
	
	
	 
	

}
