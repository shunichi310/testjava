package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

//練習問題１
	public static void main(String[] args) {
		
		Random kichi = new Random();
	    int x = kichi.nextInt(4);
	    
	    switch(x) {
	    	
	    case 1:
	    	System.out.println("吉です");
	    	break;
	    	
	    case 2:
	    	System.out.println("中吉です");
	    	break;
	    	
	    case 3:
	    	System.out.println("大吉です");
	    	break;
	    	
	    case 4:
	    	System.out.println("凶です");
	    	break;
		}
//練習問題2		
	    int i;
	    int sum = 0;
	    
		for ( i = 1 ; i<101 ; i++ ) {
			
			if (i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("7の倍数の合計は" + sum + "です。");
		
//練習問題3
		int z;
		int j;
		
		for ( z = 1; z < 10; z ++ ) {
			for ( j = 1; j <= 9; j ++ ) {
				System.out.print( z * j );
			}
			
			System.out.println();
			
		}
	}	
}
