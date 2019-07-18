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
import java.util.Arrays;
import java.util.StringTokenizer;

public class LocalCom {


	public static void main(String[] args) throws IOException {
		ServerSocket ss=null;
		Socket sk=null;
		InputStream ins;
		System.out.println("服务器已启动。");
		while(true) {
			ss=new ServerSocket(8000);
			sk=ss.accept();
			ins=sk.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(ins));
			String str=br.readLine();
			String result = null;
			StringTokenizer st=new StringTokenizer(str," ");
			int count=0;
			while(st.hasMoreTokens()) {
				count++;
			}
			int in[] = null;
			int i;
			int flag=1;
			for(i=0;i<count;i++) {
					try{
						if(st.hasMoreTokens()) {
							in[i]=Integer.parseInt(st.nextToken());
						    flag=1;
						}
					}
					catch(Exception e) {
						result="请输入整数类型。";
						flag=0;
					}
				}
			if(flag==1) {
				for(i=0;i<in.length;i++) {
					for(int j=1;j<in.length-i;j++) {
						if(in[i]>in[j]) {
							int a=in[j];
							in[j]=in[i];
							in[i]=a;
						}
					}
				}
				result=Arrays.toString(in);
			}
			br.close();
			ins.close();
			sk=ss.accept();
			OutputStream out=sk.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
			bw.write(result);
			bw.close();
			out.close();
			sk.close();
			ss.close();
			
			
		    
		
		}

	}

}
