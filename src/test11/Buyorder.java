package test11;

public class Buyorder {
	Buyer buyer;
	Seller sell;
	
	public Buyorder(Buyer buyer, Seller sell) {
		super();
		this.buyer = buyer;
		this.sell = sell;
	}

	@SuppressWarnings("static-access")
	public void order() {
		if(buyer.getTen()==1&&buyer.t==0) {
			sell.ten++;
			buyer.ten--;
			buyer.t++;
			System.out.println(Thread.currentThread().getName()+"买到一张票。");
		}
		if(buyer.getTwen()==1&&sell.ten!=0&&buyer.t==0) {
			sell.ten--;
			sell.twen++;
			buyer.ten++;
			buyer.twen--;
			buyer.t++;
			System.out.println(Thread.currentThread().getName()+"买到一张票。");
		}
		if(buyer.getFif()==1&&((sell.ten==4)||(sell.ten>=2&&sell.twen==1))&&buyer.t==0) {
			if(sell.ten==4) {
				sell.ten=sell.ten-4;
				sell.fif++;
				buyer.ten=buyer.ten+4;
				buyer.fif--;
				buyer.t++;
				System.out.println(Thread.currentThread().getName()+"买到一张票。");
			}
			if(sell.ten>=2&&sell.twen==1) {
				sell.ten=sell.ten-2;
				sell.twen=sell.twen-1;
				sell.fif++;
				buyer.fif--;
				buyer.twen++;
				buyer.ten=buyer.ten+2;
				buyer.t++;
				System.out.println(Thread.currentThread().getName()+"买到一张票。");
			}
		}else if(buyer.getFif()==1&&buyer.t==0){
				System.out.println("没零钱请等待");
		    	Thread.currentThread().yield();
		    }
		if(buyer.getHun()==1&&(sell.ten==4&&sell.fif==1)&&buyer.t==0) {
			    sell.ten=sell.ten-4;
			    sell.fif--;
			    sell.hun++;
		    	buyer.hun--;
		    	buyer.ten=buyer.ten+4;
		    	buyer.fif++;
		    	buyer.t++;
		    	System.out.println(Thread.currentThread().getName()+"买到一张票。");
		    	
		    }else if(buyer.getHun()==1){
		    	Thread.currentThread().yield();
		    }
			
		}
	}


