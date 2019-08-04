package com.veryoo.class1;

import java.util.Scanner;

public class Test04Admin {

	public static void main(String[] args) {
		Administrator admin = new Administrator();
		
		admin.name="admin1";
		admin.password="111111";
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = s.nextLine();
		
		System.out.println("请输入密码：");
		String password = s.nextLine();
		
		boolean isRight = admin.checkPassword(username, password);
		
		if(isRight){
			//登录成功，修改密码
			while( true ){
				System.out.println("请输入新密码：");
				String newPassword = s.nextLine();
				
				System.out.println("请再次输入新密码：");
				String newPassword2 = s.nextLine();
				
				if(newPassword.equals(newPassword2)){
					admin.password = newPassword;
					System.out.println("修改密码成功，您的新密码为：" + newPassword);
					break;
				}else{
					System.out.println("您两次输入的密码不一致，请重新输入");
				}
			}
			
			
		}else{
			System.out.println("用户名或密码错误！");
		}
		
		
		
	}
}
