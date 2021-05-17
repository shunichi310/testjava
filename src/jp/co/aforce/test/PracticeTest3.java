package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {

	public static void main(String[] args) {
	
		
		//練習問題１
		String[] tanaka;
		tanaka = new String[4];
		
		tanaka[0] = "1";
		tanaka[1] = "田中太郎";
		tanaka[2] = "男性";
		tanaka[3] = "27";
		
		
		//練習問題２
		System.out.println(tanaka[1]);
		
		
		//練習問題４
		
		Employee employee;
		employee = new Employee();
		
		Employee employee2;
		employee2 = new Employee();
		
		Employee employee3;
		employee3 = new Employee();
		
		//Employeeクラスで得たデータを入れるArrylistの形の箱を作る
		ArrayList<Employee> employees;
		employees = new ArrayList<Employee>();
		
		
		employee.setNumber(1);
		employee.setName("田中太郎");
		employee.setSex("男性");
		employee.setAge(27);
		
		employees.add(employee);
		
		employee2.setNumber(2);
		employee2.setName("鈴木花子");
		employee2.setSex("女性");
		employee2.setAge(22);
		
		employees.add(employee2);
		
		employee3.setNumber(3);
		employee3.setName("佐藤駿一");
		employee3.setSex("男性");
		employee3.setAge(31);
		
		employees.add(employee3);
		
		
		//お試し
		//employees.get(0).showProfile();
		//employees.get(1).showProfile();
		//employees.get(2).showProfile();
		
		
		for(Employee kojin : employees) {
			kojin.showProfile();
		}
		
		//練習問題５
		
		//HashMap<String , Integer> records;		
		//records = new HashMap<String , Integer>();
		
		//records.put("国語", 90);
		//records.put("数学", 80);
		//records.put("英語", 65);
	
		//for(Integer record : records) {
			//System.out.println();
		//}
		
		String[] record1 = new String[2];
		String[] record2 = new String[2];
		String[] record3 = new String[2];
		
		
		ArrayList<String> records;
		records = new ArrayList<String>();
		
		record1[0] = "国語";
		record1[1] = "90点";
		Collections.addAll(records ,record1);
		//System.out.println(record1[0]+":"+ record1[1]);
		
		record2[0] = "数学";
		record2[1] = "80点";
		Collections.addAll(records ,record2);
		
		
		record3[0] = "英語";
		record3[1] = "65点";
		Collections.addAll(records ,record3);
		
		for(String record : records) {
			
		}
	}
}
