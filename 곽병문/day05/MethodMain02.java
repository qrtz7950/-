package kr.co.mlec.day05;

/*
 * �޼ҵ� �����ε�(overloading)
 * 	: �ڽ��� Ŭ������ �޼ҵ���� �����ϸ鼭 "�Ű�����"�� ���� �Ǵ� �ڷ����� �ٸ���
 */

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.info();
		m.call(1);
		m.call(1.1);
		m.call("hi");
		m.call("hihi",1);
		m.call('A');			// �� ����������ȯ �Ͽ� ���� ������ ���ǰ� �������� ���� �ȳ�
		
	}

}
