package com.entor.rw;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 缓冲流性能演示
 * @author obj
 *
 */
public class TestTime {

	public static void main(String[] args) throws Exception {
		File src = new File("D:/temp/java.pdf");
		File dest = new File("D:/temp/javacopy.pdf");
		long start = System.currentTimeMillis();
		copy4(src, dest);
		System.out.println(System.currentTimeMillis() - start);
	}

	// 使用节点流，从硬盘一个字节一个字节读写， 66516ms
	public static void copy1(File src, File dest) throws Exception {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);

		int b = -1;
		while ((b = in.read()) != -1) {
			out.write(b);
		}

		out.close();
		in.close();
	}

	// 使用缓冲流，从内存一个字节一个字节读写， 433ms
	public static void copy2(File src, File dest) throws Exception {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);
		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);

		int b = -1;
		while ((b = bi.read()) != -1) {
			bo.write(b);
		}

		bo.close();
		bi.close();
	}

	// 使用节点流，从硬盘每次读写1024字节， 125ms
	public static void copy3(File src, File dest) throws Exception {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);

		byte[] b = new byte[1024];
		while (in.read(b) != -1) {
			out.write(b);
		}

		out.close();
		in.close();
	}
	
	// 使用缓冲流，从内存一个字节一个字节读写， 46ms
	public static void copy4(File src, File dest) throws Exception {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);
		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);

		byte[] b = new byte[1024];
		while (bi.read(b) != -1) {
			bo.write(b);
		}

		bo.close();
		bi.close();
	}
}
