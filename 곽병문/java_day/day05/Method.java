package kr.co.mlec.day05;

public class Method {
	
	void call() {
		System.out.println("call() �޼ҵ� ȣ��...");
	}
	
	void call(int i) {
		System.out.println("call(int) �޼ҵ� ȣ��...");
	}
	
	void call(double d) {
		System.out.println("call(double) �޼ҵ� ȣ��...");
	}
	
	void call(String d) {
		System.out.println("call(String) �޼ҵ� ȣ��...");
	}
	
	void call(String d, int i) {
		System.out.println("call(String, int) �޼ҵ� ȣ��...");
	}
		
	void info() {
		System.out.println("info() �޼ҵ� ȣ��...");
	}
	
	Method() {
		System.out.println("�����ڴ�!");
	}
}
