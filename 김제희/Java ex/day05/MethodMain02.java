package kr.co.mlec.day05;
/*
 * 
 */
public class MethodMain02 {
	
	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(654545454); //�����ε�
		m.call(6545454.54); //�����ε�
		m.call("�ȴϾ�ääääää�������������"); //�����ε�
		m.call("�ȴϾ�ääääää�������������",48585858); //�����ε�
		m.call('A'); //�����ε� int������ ������ ����ȯ�Ǽ� ĳ�������� ��� ������ �ȵ�
		m.info();
	}

}
