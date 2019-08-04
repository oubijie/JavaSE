package com.veryoo.control.for1;


/**
 * break和continue
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {

		// for(int i=1; i<5; i++){ //1,2
		// if(i==3){
		// break;
		// }
		// System.out.println(i);
		// }

		// for(int i=1; i<5; i++){ //1,2,4
		// if(i==3){
		// continue;
		// }
		// System.out.println(i);
		// }

		for (int i = 1; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println("j=" + j);
			}

			System.out.println("iiiiiiiii=" + i);
			// if(i==2){
			// break;
			// }

		}
	}
}
