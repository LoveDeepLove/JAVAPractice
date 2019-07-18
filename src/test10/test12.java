package test10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test12 {
	public static void main(String[] args) throws IOException {
	long starttime=System.currentTimeMillis();
	File file=new File("D:\\sb.txt");
	@SuppressWarnings("resource")
	FileInputStream input=new FileInputStream(file);
	byte[]byt=new byte[input.available()];
	int i;
	for(i=0;i<byt.length;i++) {
		byt[i]=(byte) input.read();
	}
	String s=new String(byt);
	System.out.println(s);
	long endtime=System.currentTimeMillis();
	long time =(endtime-starttime)/1000;
	System.out.println(time);
	input.close();
	File file2=new File("D:\\sb1.txt");
	try{
		if(!file2.exists()) {
			file2.createNewFile();
		}
		FileOutputStream file1=new FileOutputStream(file2);
		file1.write(byt);
		file1.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	

}
