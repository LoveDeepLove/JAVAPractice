package homework3;

public class Computer{
	int i=0;
	boolean flag=true;
	
	
	public synchronized void product(){
			if(!flag){
				try {
					super.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}try {
				Thread.sleep(500);
				i++;
				System.out.println(Thread.currentThread().getName()+"生产出"+i+"号电脑。");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag=false;
			super.notify();

	}
	public synchronized void carry() {
			if(flag) {
				try {
					super.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"搬运出"+i+"号电脑。");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag=true;
			super.notify();

	}
}
	

	








