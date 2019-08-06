package com.veryoo.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferedPerf {

	public static void main(String[] args) throws Exception {
		File src = new File("d:/temp/src.zip");
		File dest = new File("d:/temp/dest.zip");
		dest.createNewFile();

		long start = System.currentTimeMillis();

		copy4(src, dest);

		System.out.println(System.currentTimeMillis() - start);

	}

	// 使用节点流，一个字节一个字节读写，55120ms
	public static void copy1(File src, File dest) throws Exception {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);

		int b = -1;
		while ((b = in.read()) != -1) {
			out.write(b);
		}

		out.close();
		in.close();
	}

	// 使用节点流，每次读写1024，137ms
	public static void copy2(File src, File dest) throws Exception {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);

		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}

		out.close();
		in.close();
	}

	// 使用缓冲流，一个字节一个字节读写，640ms
	public static void copy3(File src, File dest) throws Exception {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);

		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);

		int b = -1;
		while ((b = bi.read()) != -1) {
			bo.write(b);
		}

		bo.close();
		bi.close();
	}

	// 使用缓冲流，每次读写1024，38ms
	public static void copy4(File src, File dest) throws Exception {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);

		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);

		byte[] b = new byte[1024];
		int len = -1;
		while ((len = bi.read(b)) != -1) {
			bo.write(b, 0, len);
		}

		bo.close();
		bi.close();
	}

}
