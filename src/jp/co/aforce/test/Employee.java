//練習問題４

package jp.co.aforce.test;

public class Employee {
		
	private int number;
	private String name;
	private String sex ;
	private int age;
			
	void setNumber(int number) {
		this.number = number;
	}
	void setName(String name) {
		this.name = name;
	}
	void setSex(String sex ) {
		this.sex = sex;
	}
	void setAge(int age) {
		this.age = age;
	}
	public void showProfile() {
		System.out.println("番号は" + this.number + "名前は" + this.name + "性別は" + this.sex + "、年齢は" + this.age + "歳です。");
	}
}

