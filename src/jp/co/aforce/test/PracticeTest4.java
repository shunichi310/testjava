//練習問題１
//②でコーディングをするべきである。①の比較演算子「==」はint等の基本データ型を比較するから。

//練習問題2
package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
	
		ArrayList<String> animals;
		animals = new ArrayList<String>();
		
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
//練習問題3
		
		String favAnimal = "犬" ;
		
		if( animals.contains(favAnimal)) {
			System.out.println(favAnimal + "はリストに含まれています。");
		}
			else {
				System.out.println(favAnimal + "は含まれていません。");
			}
	
//練習問題４	
		String bm = "4月";
		
		switch(bm) {
		
		case "1月":
			System.out.println("元日,成人の日");
			break;
		
		case "2月":
			System.out.println("建国記念日,天皇誕生日");
			break;
			
		case "3月":
			System.out.println("春分の日");
			break;
			
		case "4月":
			System.out.println("昭和の日");
			break;
		
		case "5月":
			System.out.println("憲法記念日,みどりの日,こどもの日");
			break;
			
		case "6月":
			System.out.println("なし");
			break;
			
		case "7月":
			System.out.println("海の日,スポーツの日");
			break;
			
		case "8月":
			System.out.println("山の日");
			break;
			
		case "9月":
			System.out.println("敬老の日,秋分の日");
			break;
			
		case "10月":
			System.out.println("なし");
			break;
			
		case "11月":
			System.out.println("文化の日,勤労感謝の日");
			break;
			
		case "12月":
			System.out.println("なし");
			break;
		
			
		//1月～12月の
		}
	}
}
