package test13;

public class Player {
	String name;
	int score;
	int paiming;
	public Player(String name, int score, int paiming) {
		super();
		this.name = name;
		this.score = score;
		this.paiming = paiming;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPaiming() {
		return paiming;
	}
	public void setPaiming(int paiming) {
		this.paiming = paiming;
	}
	
	

}
