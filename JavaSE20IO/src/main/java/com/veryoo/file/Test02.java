package com.veryoo.file;

import java.io.File;

/**
 * 递归列出所有目录和文件
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File file = new File("d:/temp");
		treeDir(file, "");
	}
	
	
	
	public static void treeDir(File file, String level){
		File[] files = file.listFiles();
		System.out.println(level + file.getName());
		level = level + "    ";
		for(File f : files){
			if(f.isDirectory()){
				treeDir(f, level);
			}else{
				System.out.println(level + f.getName());
			}
		}
	}
}
