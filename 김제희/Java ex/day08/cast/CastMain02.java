package kr.co.mlec.day08.cast;

public class CastMain02 {
	public static void main(String[] args) {
		
//		Child01 c = new Parent();			//������ ����
//		Child01 c = (Child01)new Parent();	//��Ÿ�� ����
		
		Parent p = new Child01();
		Child01 c = (Child01)p; //����� ��ü����ȯ
		
		p.info();	//Child01���� �޼ҵ尡 �������̵��ȴ�
//		p.study(); 	//Child01�������� �θ�Ŭ������ ���� �޼ҵ尡 �ƴϱ� ������ ȣ�� �Ұ�
		
		c.info();
		c.study();
		
	}
}
