package day05;

/*
 *  �޼ҵ� �����ε�
 *  	: �ڽ��� Ŭ������ �޼ҵ� ���� �����ϸ鼭 �Ű������� ���� �Ǵ� �ڷ����� �ٸ� ��
 */
public class MethodMain02 {

	public static void main(String[] args) {

		Method m = new Method();
		m.info();
		m.call();
		m.call(10);
		m.call(1.1);
		m.call("HI",12);
		m.call('A');   	//A�� ���� int, double �ε� �������ֱ� ������ char�޼ҵ带 ��������������� ������ ���� ����� �޼ҵ��� int�޼ҵ�� �ްԵȴ�.
	}

}
