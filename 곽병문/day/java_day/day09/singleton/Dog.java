package kr.co.mlec.day09.singleton;

public class Dog {						// Singleton pattern : �ϳ��� Ŭ������ �ϳ��� ��ü�� ���
	
	private static final Dog d = new Dog();
	
	private Dog() {}
	
	static Dog getInstance() {
		return d;
	}
}
