package day05;

public class Method {

	void call() {
		System.out.println("call() �޼ҵ� ȣ��...");
	}

	void call(int i) {		//�޼ҵ� �����ε��� ��ȯ������ ������ ���� x
		System.out.println("call(int) �޼ҵ� ȣ��...");
	}

	void call(double d) {	//���� call������ �������� ���� �ٸ��� ���е� 
		System.out.println("call(double) �޼ҵ� ȣ��...");
	}

	void call(String str) {
		System.out.println("String �޼ҵ� ȣ��...");
	}

	void call(String str, int j) {
		System.out.println("call(String, int) �޼ҵ� ȣ��...");
	}

	void call(char ch) {
		System.out.println("char �޼ҵ� ȣ��...");
	}

	void info() {
		System.out.println("info() �޼ҵ� ȣ��...");
	}
}
