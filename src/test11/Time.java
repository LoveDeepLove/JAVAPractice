package test11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends Thread{

	@Override
	public void run() {
		while(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String a=sdf.format(new Date());
			System.out.println(a);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
