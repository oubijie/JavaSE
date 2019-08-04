package com.veryoo.co;

import java.util.HashMap;
import java.util.Map;


/**
 * ����һ���ʼ���ַ��aasdf@sina.com, bb@163.com, cc@sina.com, ...����
 * ��дһ��������Щ�ʼ���ȡ�����������ʼ����û����͹�˾�������룬
 * �Լ�ֵ�Ե���ʽ����HashMap
 * @author obj
 *
 */
public class Test19 {

	public static void main(String[] args) {
		String mails = "aasdf@sina.com, bb@163.com, cc@sina.com";
		String[] arr = mails.split(",");
		
		
		Map<String, String> userMailMap = new HashMap<String, String>();
		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i].trim());
			String mail = arr[i].trim();
			int index = mail.indexOf("@");
			String user = mail.substring(0, index);
			System.out.println(user);
			String company = mail.substring(index+1);
			System.out.println(company);
			userMailMap.put(user, company);
		}
		
		
		System.out.println(userMailMap);
		
	}
}
