package com.veryoo.co;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * 练习六
 * @author obj
 *
 */
public class Test17 {

	public static void main(String[] args) {
		Map<String, Penguin> map = new HashMap<String, Penguin>();
		
		map.put("Q妹", new Penguin(4,1));
		map.put("Q哥", new Penguin(3,3));
		
		String nickName = "Q妹1";
		if(map.containsKey(nickName)){
			System.out.println(map.get(nickName));
		}else{
			System.out.println("查无此人");
		}
	}
}
