package com.veryoo.method;


/**
 * 方法演示，计算器类
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class ScoreCalc {

	public double java = 89;
	public double csharp = 76;
	public double db = 93;
	
	public double avgScore;
	public double sumScore;
	
	public void avg(){
//		avgScore = (java+csharp+db)/3;
		avgScore = sum()/3;
	}
	
	public double showAvg(){
		return avgScore;
	}
	
	public double sum(){
		sumScore = java + csharp + db;
		return sumScore;
	}
	
	public double showSum(){
		return sumScore;
	}
	
	
	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc();
		sc.avg();
		System.out.println(sc.showAvg());
		
		sc.sum();
		System.out.println(sc.showSum());
	}
	
}
