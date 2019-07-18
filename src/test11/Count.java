package test11;

public class Count implements Runnable{
	Data d;
	int a;
	

	public Count(Data d, int a) {
		super();
		this.d = d;
		this.a = a;
	}


	@Override
	public void run() {
		int c;
		for(c=0;c<10;c++) {
			if(a==1) {
				d.add();;
			}else if (a==-1) {
				d.del();;
			}
		}

		
	}

}
