package day08.cast;

public class CastMain02 {

	public static void print(Parent p) {
		p.info();
		
		
		if(p instanceof Child01) {	//p�� Child01�� ��ü���� ���� �Ҹ����� �˷���
			Child01 c= (Child01)p;
			c.study();
			c.play();
		} else if(p instanceof Child02) {
			//((Child02)p).sing();
			Child02 c = (Child02)p;
			c.sing();
			c.sleep();
		} else if(p instanceof Parent) {
			System.out.println("Parent �Ķ���� ����...");
		}
	}
	/*	System.out.println
	 * ("p instanceof Child01: "+ (p instanceof Child01));
		System.out.println("p instanceof Child02: "+ (p instanceof Child02));
		System.out.println("p instanceof Parent: "+ (p instanceof Parent));
	}*/
	
	public static void main(String[] args) {
		
		
//		Child01 c = new Parent(); //�����Ͻ� ����
//		Child01 c = (Child01)new Parent(); //�����ϸ� ����
		
		Parent p = new Child01();//������ ����ȯ
		Child01 c =(Child01) p;	//����� ��ü����ȯ ����
		
		p.info();
		c.info();	//���� ���� ���

		c.study();
		
	}
}
