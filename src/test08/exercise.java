package test08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class exercise {

	public static void main(String[] args) throws IOException{
		LinkedHashMap<String,Map<String,String>> map= new LinkedHashMap<String,Map<String,String>>();
		Map<String,String> area1=new HashMap<String,String>();
		Map<String,String> area2=new HashMap<String,String>();
		area1.put("丹东:", "大东区");
		area1.put("沈阳:", "浑南区");
		area1.put("大连:", "南湖区");
		area2.put("南宁:", "青秀区");
		
		
		map.put("辽宁:", area1);
		map.put("广西:", area2);
		
		for(Map.Entry<String, Map<String,String>> i:map.entrySet()) {
			Map<String,String> a = i.getValue();
			System.out.println(i.getKey());
			for(Map.Entry<String, String> j:a.entrySet()) {
				System.out.println(j.getKey()+j.getValue());
			}
			

	}
		String json=JSON.toJSONString(map);
		File file=new File("d:\\map.txt");
		FileWriter i= new FileWriter(file);
		i.write(json);
		i.close();
		
		FileReader j=new FileReader(file);
        char[] ch = new char[1024];
        int len;
        while((len=j.read(ch)) != -1){
            String str = new String(ch,0,len);
            System.out.print(str);
        	
        }

        j.close();

			
		}

	}


