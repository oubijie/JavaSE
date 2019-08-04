package com.veryoo.co;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * Map演示
 * @author obj
 *
 */
public class Test16 {

	public static void main(String[] args) {
		Map<String, String> c = new HashMap<String, String>();
		c.put("CN", "中国");
		c.put("US", "美国");
		c.put("FR", "法国");
		c.put("RU", "俄罗斯");
		
		c.put("RU", "斯");  //键一样，覆盖
		
		String china = c.get("CN");  //键
		System.out.println(china);
		
		System.out.println(c.size());
		
		System.out.println("是否包含FR："+c.containsKey("FR"));
		c.remove("FR");
		System.out.println("是否包含FR："+c.containsKey("FR"));
		
		for(String key : c.keySet()){
			System.out.println(key + "-" + c.get(key));
		}
		
		//遍历1
		Iterator<String> it = c.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = c.get(key);
			System.out.println(key + "-" + value);
		}
		
		Set<Map.Entry<String, String>> set = c.entrySet();
		Set set2 = c.entrySet();
		
		
		//遍历2
		for(Map.Entry<String, String> entry : c.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
