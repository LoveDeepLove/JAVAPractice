package test02;
/**
 * ������   
 * @author Administrator
 *
 */
public class Computer {
	String name;
	int score;
	
	
	
	public Computer(String string,int i) {
		this.name=string;
		this.score=i;
	}



	public int ��ȭ(){
		int a = (int) (Math.random()*3+1);
		return a;
	}
}
