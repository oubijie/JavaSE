package com.veryoo.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			// 向本机的8189端口发出客户请求
			Socket socket = new Socket("127.0.0.1", 8189);
			// 由系统标准输入设备构造BufferedReader对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 由Socket对象得到输出流，并构造PrintWriter对象
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline = sin.readLine();// 从系统标准输入读入字符串
			while (!readline.equals("bye")) {
				// 将从系统标准输入读入的字符串输出到Server
				os.println(readline);
				// 并刷新输出流，使Server马上收到该字符串
				os.flush();
				System.out.println("客户端：" + readline);
				// 从Server读出字符串，并打印到标准输出设备上
				System.out.println("服务器端：" + is.readLine());
				readline = sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
