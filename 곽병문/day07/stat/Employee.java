package kr.co.mlec.day07.stat;

public class Employee {

	String name;
	static int totalCnt = 0;
	
	Employee(){
		totalCnt++;
	}
	Employee(String name){
		this.name = name;
		totalCnt++;
	}
	
	void info() {
		System.out.println(this.name + " ���");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	static void howMany() {
		System.out.println("�뵿�� : " + totalCnt + "��");
	}
}
