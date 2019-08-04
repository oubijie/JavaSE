package com.veryoo.array;


/**
 * 多维数组
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test11 {

	public static void main(String[] args) {
		int[][] a = new int[3][2];

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = 8;
			}
		}

		// for(int i=0; i<a.length; i++){
		// for(int j=0; j<a[i].length; j++){
		// System.out.print(a[i][j] + " ");
		// }
		// System.out.println();
		// }

		// for(int[] t1 : a){
		// for(int t2 : t1){
		// System.out.print(t2 + " ");
		// }
		// System.out.println();
		// }
	}
}
