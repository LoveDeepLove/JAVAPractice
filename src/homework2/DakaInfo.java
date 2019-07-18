package homework2;

import java.util.HashMap;
import java.util.Map;

public class DakaInfo {
	int ID;
	String startdate;
	String enddate;
	public Map<Integer, String> map1=new HashMap<Integer,String>();
	public Map<Integer,String> map2=new HashMap<Integer,String>();
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Map<Integer, String> getMap1() {
		return map1;
	}
	public void setMap1(Map<Integer, String> map1) {
		this.map1 = map1;
	}
	public Map<Integer, String> getMap2() {
		return map2;
	}
	public void setMap2(Map<Integer,String> map2) {
		this.map2 = map2;
	
	}
	
	
	

}
