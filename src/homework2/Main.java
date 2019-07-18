package homework2;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class Main {
	@SuppressWarnings("static-access")
	public static int start(DakaInfo daka,Company cp) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("----员工打卡系统----");
		System.out.println("输入 0--------退出");
		System.out.println("输入 1--------签到");
		System.out.println("输入 2--------签退");
		System.out.println("输入 3--------查看签到信息");
		System.out.println("请输入想执行的操作：");
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		int cho=input.nextInt();
		switch(cho) {
		case(0):
			System.out.println("签到系统退出。");
		    return 0;
		case(1):
			System.out.println("请输入您的ID。");
		    Scanner sc1=new Scanner(System.in);
		    int id=sc1.nextInt();
		    Set<Integer> key1= cp.getEmployee().keySet();
		    int count=0;
		    for(Integer key: key1) {
		    	if(key==id) {
		    		System.out.println(cp.getEmployee().get(id)+"欢迎您。");
		    		count=1;
		    	}
		    }
		    if(count==0){
		    	System.out.println("无此ID员工。");
		    	}
		    if(count==1){
		    	Set<Integer> key2=daka.getMap1().keySet();
		    	int count1=0;
			    for(Integer key: key2) {
			    	if(key==id) {
			    		System.out.println("您今天已经打过卡了。");
			    		count1=1;
			    	}
			    }if(count1==0) {
			    	String ca=sdf.format(new Date());
			    	daka.getMap1().put(id, ca);
			        System.out.println("签到成功。");
			    }
		    	
		    }
		    return 1; 
		case(2):
			System.out.println("请输入您的ID。");
		    Scanner sc2=new Scanner(System.in);
		    int id2=sc2.nextInt();
		    Set<Integer> key2=cp.getEmployee().keySet();
		    int count3=0;
		    for(Integer key: key2) {
		    	if(key==id2) {
		    		System.out.println(cp.getEmployee().get(id2)+"欢迎您。");
		    		count3=1;
		    	}
		    }
		    if(count3==0) {
		    	System.out.println("无此ID员工。");
		    }
		    if(count3==1){
		    	Set<Integer> key3=daka.getMap2().keySet();
		    	int count4=0;
		    	int count5=0;
			    for(Integer key: key3) {
			    	if(key==id2) {
			    		System.out.println("您今天已经签退过了。");
			    		count4=1;
			    	}
			    }
			    if(daka.getMap1().containsKey(id2)) {
			    		count5=0;
			    }else {
			    		count5=1;
			    		System.out.println("您还没签到呢。");
			    }
			    if(count4==0&&count5==0) {
			    	String ca2=sdf.format(new Date());
			    	daka.getMap2().put(id2, ca2);
			        System.out.println("签退成功。");
			    }
		   
		    
		    }
		    return 1;
		case(3):
			Set<Integer> set1=daka.getMap1().keySet();
			for(Integer kq:set1) {
		    	System.out.println(kq+cp.getEmployee().get(kq)+"已签到。"+daka.getMap1().get(kq));
		    }
		    Set<Integer> set2=daka.getMap2().keySet();
		    for(Integer kq2:set2) {
		    	System.out.println(kq2+cp.getEmployee().get(kq2)+"已签退。"+daka.getMap2().get(kq2));
		    }
		    return 1;
	}
		return 1;

}
	}