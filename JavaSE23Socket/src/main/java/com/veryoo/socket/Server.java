package com.veryoo.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8189);
			Socket socket = server.accept();
			String line;
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("客户端：" + is.readLine());
			line = sin.readLine();
			while (!line.equals("bye")) {
				os.println(line);
				os.flush();
				System.out.println("服务器：" + line);
				System.out.println("客户端：" + is.readLine());
				line = sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
