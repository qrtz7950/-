package kr.co.mlec.day09;

/*final*/ class Super{ //final ���� �� ��ӺҰ�
	void print() { //final ���� �� �������̵� �Ұ�
		System.out.println("���۾�����");
	}
}

class Sub extends Super{
	@Override
	void print() {
		System.out.println("��������");
	}
}

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
