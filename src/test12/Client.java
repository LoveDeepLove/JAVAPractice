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

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=null;
		while(true) {
			client=new Socket("localhost",6666);
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			OutputStream out=client.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
			bw.write(str);
			bw.close();
			client=new Socket("localhost",6666);
			InputStream input=client.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(input));
			System.out.println(br.readLine());
			br.close();
			out.close();
			client.close();
			
		}
		

	}

}
