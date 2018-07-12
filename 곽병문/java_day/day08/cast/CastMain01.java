package kr.co.mlec.day08.cast;

public class CastMain01 {
	
	public static void print(Parent p) {
		p.info();
		
		if(p instanceof Child01) {
			Child01 c = (Child01) p;
			c.study();
			c.play();
		}else if(p instanceof Child02){
			Child02 c = (Child02) p;
			c.sing();
			c.sleep();
		}else if(p instanceof Parent) {
			System.out.println("Parent �Ķ���� ����...");
		}
		
//		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
//		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
//		System.out.println("p instanceof Parent : " + (p instanceof Parent));
//		System.out.println("============================================");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		print(p);
		
		Child01 c01 = new Child01();
		print(c01);						// ������ ����ȯ

		Child02 c02 = new Child02();
		print(c02);						// ������ ����ȯ
		
		p = new Child01();				// ������ ����ȯ
		print(p);						// ������ ����ȯ�� �� �������̵� �켱
		
	}

}
