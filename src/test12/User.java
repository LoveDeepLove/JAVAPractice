package test12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class User {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=null;
		
		while(true) {
			s=new Socket("localhost",8000);
			System.out.println("请输入一组数并用空格隔开。");
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			OutputStream out=s.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
			bw.write(str);
			bw.close();
			out.close();
			s=new Socket("localhost",8000);
			InputStream input=s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(input));
			System.out.println(br.readLine());
			br.close();
			input.close();
			s.close();
	
		}

	}

}
