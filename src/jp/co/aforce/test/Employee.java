package jp.co.aforce.test;

public class Employee {
		
		private String number;
		private String name;
		private String sex ;
		private String age;
		
		void showProfile() {
			System.out.println("番号は" + this.number + "名前は" + this.name + "性別は" + this.sex + "、年齢は" + this.age + "歳です。");
		}
			
			void setNumber(String number) {
				this.number = number;
			}
			void setName(String name) {
				this.name = name;	
			}
			void setSex(String sex ) {
				this.name = sex;
			}
			void setAge(String age) {
				this.age = age;
			}
		
}

