package test12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket s=null;
		InputStream in=null;
		Socket so=null;
		OutputStream out=null;
		System.out.println("服务器已启动。");

		while(true) {
			s=new ServerSocket(6666);
			so=s.accept();
			in=so.getInputStream();
			BufferedReader bf=new BufferedReader(new InputStreamReader(in));
			String str = bf.readLine();
			System.out.println(str);
		    bf.close();
			in.close();
			so=s.accept();
			out=so.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			String string=sc.nextLine();
			bw.write(string);
			bw.close();
			out.close();
			s.close();
			so.close();
		}
		
		}
		

	}


