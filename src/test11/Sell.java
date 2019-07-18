package test11;

public class Sell implements Runnable{
	Buyer buyer;
	Seller sell;

	

	public Sell(Buyer buyer, Seller sell) {
		super();
		this.buyer = buyer;
		this.sell = sell;
	}




	@SuppressWarnings("static-access")
	@Override
	public void run() {
		while(buyer.t==0) {
			Buyorder bo=new Buyorder(buyer,sell);
			bo.order();
		}
		
		
	}
	}
	


