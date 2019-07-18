package test10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test14 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\¥ß¥Ã¥¯¥¹.2018.1080P.WEB-DL.x265.AAC.mp4");
		DataInputStream dis = new DataInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("D:\\gakkiÈü¸ß.mp4");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int data=0;
		byte[] bytes = new byte[1024*1024];//
		
		while ((data=dis.read(bytes))!=-1) {
			for (int i = 0; i < bytes.length; i++) {
			}
			dos.write(bytes,0,data);
		}
		
		
	
		dis.close();
		dos.close();
		fis.close();
		fos.close();
	
	}

	}


