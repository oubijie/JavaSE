package com.veryoo.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class URLClient {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("www.javacui.com", 80);
		
		socket.getOutputStream().write("GET / HTTP/1.1\n".getBytes());
		socket.getOutputStream().write("Host: www.javacui.com\n".getBytes());
//		socket.getOutputStream().write("Connection: keep-alive\n".getBytes());
//		socket.getOutputStream().write("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8\n".getBytes());
//		socket.getOutputStream().write("User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36\n".getBytes());
		socket.getOutputStream().write("\n".getBytes());
		socket.getOutputStream().write("\n".getBytes());
		
		socket.getOutputStream().flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
	}
}
