package com.veryoo.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			int i=0;
			ServerSocket server = new ServerSocket(5678);
			while(true){
				
				System.out.println("正在等待连接...");
				Socket socket = server.accept();
				System.out.println("连接成功..." + i);
				InputStream in = socket.getInputStream();
				System.out.println((char)in.read());
				
				
				i++;
				socket.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
