package kr.co.mlec.day08.cast;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = new Parent();			// ������ ����
//		Child01 c = (CHild01)new Parent();	// ��Ÿ�� ����
		
		Parent p = new Child01();
		Child01 c = (Child01) p;	// ����� ��ü ����ȯ
		
		p.info();
//		p.study();	// ������ ����ȯ�̶� ������
		
		c.info();	
		c.study();
	}

}
