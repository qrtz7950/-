package kr.co.mlec.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;

abstract class Parent {
	abstract void a();
	abstract void b() throws Exception;
}

class Child extends Parent {
	
	@Override
	void a() {
		
	}
	
	@Override 
	void b() throws Exception {
		
	}
}

public class ExceptionMain05 {
	
	static void a() {
		System.out.println("a() Strat");
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("a() End");
	}

	static void b() throws Exception {
		System.out.println("b() Start");
		
		int [] arr = new int[5];
		System.out.println(arr[5]);
		
		FileReader fr = new FileReader("a.txt");

		System.out.println("b() End");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		a();
		//���� ���� ó�� ����
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		} //���� �߻� ��� B()�޼ҵ��� ������ ��¹��� ������� �ʰԵȴ�
		System.out.println("main End");
	}
}
