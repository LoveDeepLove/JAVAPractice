package test10;

import java.io.File;

public class test11 {

	public static void main(String[] args) {
		File n=new File("D:\\");
		File[] m=n.listFiles();
		for(File q :m) {
			file(q);
		}
	
				
			
		}
	@SuppressWarnings("null")
	public static void file(File file) {
		if(file!=null) {
			if(file.isDirectory()) {
				System.out.println(file.getName());
				File[] a=file.listFiles();
				if(a!=null) {
					int b;
					for(b=0;b<a.length;b++) {
						file(a[b]);
					}
				}
			}
			else {
				System.out.println(file.getName());
			}
		}
		else {
			System.out.println(file.getName());
		}
	}

	}
	


