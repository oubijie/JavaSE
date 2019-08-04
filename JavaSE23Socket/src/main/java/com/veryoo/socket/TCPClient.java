package com.veryoo.socket;

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 6666);
			
			Thread.sleep(30000);
			
			OutputStream out = socket.getOutputStream();
			out.write('b');
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
