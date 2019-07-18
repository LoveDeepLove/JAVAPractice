package test11;

public class Buy {

	public static void main(String[] args) {
		Buyer z=new Buyer(0,0,0,1,0);
		Buyer l=new Buyer(0,0,1,0,0);
		Buyer w=new Buyer(0,1,0,0,0);
		Buyer zl=new Buyer(1,0,0,0,0);
		Seller seller=new Seller(3,0,0,0);
		Sell s=new Sell(z,seller);
		Sell s1=new Sell(l,seller);
		Sell s2=new Sell(w,seller);
		Sell s3=new Sell(zl,seller);
		
		Thread t=new Thread(s,"张三");
		Thread t1=new Thread(s1,"李四");
		Thread t2=new Thread(s2,"王五");
		Thread t3=new Thread(s3,"赵六");
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		}
		

	}



