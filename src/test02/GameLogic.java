package test02;

public class GameLogic {
	Wanjia  wanjia1;
	Computer computer1;
	
	
	
	public void setWanjia1(Wanjia wanjia1) {
		this.wanjia1 = wanjia1;
	}


	public void setComputer1(Computer computer1) {
		this.computer1 = computer1;
	}


	public void set和局数(int 和局数) {
		this.和局数 = 和局数;
	}


	public void set总局数(int 总局数) {
		this.总局数 = 总局数;
	}


	int 和局数;
	int 总局数;
	
	public void startGame(){
		wanjia1=new Wanjia("john",0);
		computer1=new Computer("max",0);
		int a=wanjia1.出拳();
		int b=computer1.出拳();
		if(a==b){
			System.out.println("平局");
		}
		if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1)) {
			System.out.println("电脑赢");
			computer1.score++;
		}
		if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)) {
			System.out.println("玩家赢");
			wanjia1.score++;
		}
	}
	
	public void showscore() {
		System.out.println("玩家分数"+wanjia1.score+"电脑分数"+computer1.score);
	}
	
	
	
}
