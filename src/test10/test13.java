package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test13 {

	public static void main(String[] args) throws IOException {
		FileReader i=new FileReader("D:\\sb.txt");
		BufferedReader b=new BufferedReader(i);
		
		FileWriter w=new FileWriter("D:\\sb2.txt");
		BufferedWriter bw=new BufferedWriter(w);
		
		StringBuffer str=new StringBuffer();
		String line="";
		while((line=b.readLine())!=null) {
			str.append(line);
		System.out.println(str.toString());
		bw.write(str.toString());
		b.close();
		bw.close();
		i.close();
		w.close();
		
		}

	}

}
