package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {	
		
		int x = 10;
		int y = 28;
		double z = 3.14;
	    
		//練習問題１
		System.out.println(x * y);
		
		//練習問題２	
		System.out.println(y % x);
		
		//練習問題３
		double yzseki = 28 * 3.14;
		System.out.println(yzseki);
		
		//練習問題４
		yzseki ++ ;
		System.out.println(yzseki);
		
		//練習問題５
		Random rand = new Random();
		int age = 25;
		int randomNumber = rand.nextInt(100);
		
		if(age > randomNumber) {
			System.out.println("私の方が年上です。" + "randomNumber =" + randomNumber);
		}	
		if(age < randomNumber) {
			System.out.println("私の方が年下です。"+ "randomNumber =" + randomNumber);
		}	
		if(age == randomNumber) {
			System.out.println("私と同い年です。"+ "randomNumber =" + randomNumber);
		}
	}

}
