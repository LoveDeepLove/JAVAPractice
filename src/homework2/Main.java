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
		System.out.println("----Ա����ϵͳ----");
		System.out.println("���� 0--------�˳�");
		System.out.println("���� 1--------ǩ��");
		System.out.println("���� 2--------ǩ��");
		System.out.println("���� 3--------�鿴ǩ����Ϣ");
		System.out.println("��������ִ�еĲ�����");
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		int cho=input.nextInt();
		switch(cho) {
		case(0):
			System.out.println("ǩ��ϵͳ�˳���");
		    return 0;
		case(1):
			System.out.println("����������ID��");
		    Scanner sc1=new Scanner(System.in);
		    int id=sc1.nextInt();
		    Set<Integer> key1= cp.getEmployee().keySet();
		    int count=0;
		    for(Integer key: key1) {
		    	if(key==id) {
		    		System.out.println(cp.getEmployee().get(id)+"��ӭ����");
		    		count=1;
		    	}
		    }
		    if(count==0){
		    	System.out.println("�޴�IDԱ����");
		    	}
		    if(count==1){
		    	Set<Integer> key2=daka.getMap1().keySet();
		    	int count1=0;
			    for(Integer key: key2) {
			    	if(key==id) {
			    		System.out.println("�������Ѿ�������ˡ�");
			    		count1=1;
			    	}
			    }if(count1==0) {
			    	String ca=sdf.format(new Date());
			    	daka.getMap1().put(id, ca);
			        System.out.println("ǩ���ɹ���");
			    }
		    	
		    }
		    return 1; 
		case(2):
			System.out.println("����������ID��");
		    Scanner sc2=new Scanner(System.in);
		    int id2=sc2.nextInt();
		    Set<Integer> key2=cp.getEmployee().keySet();
		    int count3=0;
		    for(Integer key: key2) {
		    	if(key==id2) {
		    		System.out.println(cp.getEmployee().get(id2)+"��ӭ����");
		    		count3=1;
		    	}
		    }
		    if(count3==0) {
		    	System.out.println("�޴�IDԱ����");
		    }
		    if(count3==1){
		    	Set<Integer> key3=daka.getMap2().keySet();
		    	int count4=0;
		    	int count5=0;
			    for(Integer key: key3) {
			    	if(key==id2) {
			    		System.out.println("�������Ѿ�ǩ�˹��ˡ�");
			    		count4=1;
			    	}
			    }
			    if(daka.getMap1().containsKey(id2)) {
			    		count5=0;
			    }else {
			    		count5=1;
			    		System.out.println("����ûǩ���ء�");
			    }
			    if(count4==0&&count5==0) {
			    	String ca2=sdf.format(new Date());
			    	daka.getMap2().put(id2, ca2);
			        System.out.println("ǩ�˳ɹ���");
			    }
		   
		    
		    }
		    return 1;
		case(3):
			Set<Integer> set1=daka.getMap1().keySet();
			for(Integer kq:set1) {
		    	System.out.println(kq+cp.getEmployee().get(kq)+"��ǩ����"+daka.getMap1().get(kq));
		    }
		    Set<Integer> set2=daka.getMap2().keySet();
		    for(Integer kq2:set2) {
		    	System.out.println(kq2+cp.getEmployee().get(kq2)+"��ǩ�ˡ�"+daka.getMap2().get(kq2));
		    }
		    return 1;
	}
		return 1;

}
	}