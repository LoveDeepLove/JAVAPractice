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


	public void set�;���(int �;���) {
		this.�;��� = �;���;
	}


	public void set�ܾ���(int �ܾ���) {
		this.�ܾ��� = �ܾ���;
	}


	int �;���;
	int �ܾ���;
	
	public void startGame(){
		wanjia1=new Wanjia("john",0);
		computer1=new Computer("max",0);
		int a=wanjia1.��ȭ();
		int b=computer1.��ȭ();
		if(a==b){
			System.out.println("ƽ��");
		}
		if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1)) {
			System.out.println("����Ӯ");
			computer1.score++;
		}
		if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)) {
			System.out.println("���Ӯ");
			wanjia1.score++;
		}
	}
	
	public void showscore() {
		System.out.println("��ҷ���"+wanjia1.score+"���Է���"+computer1.score);
	}
	
	
	
}
