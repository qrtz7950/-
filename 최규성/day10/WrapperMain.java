package day10;

/*
 * �⺻�ڷ�	->	�����ڷ���
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int 			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * ���� �ڷᱸ��: ������ ũ���� �ڷᱸ���� �迭�� ��ǥ���� ���� ����ִ�.
 * ���� �ڷᱸ��: �迭�� ������ �ٸ� �ڷᱸ���� ���������� ������ �����Ҽ��ִ�.
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		int num = 10;
		Integer i = new Integer(10);
		
		System.out.println(num);
		System.out.println(i);
		
		num = new Integer(100);	//���� �ڽ�
		i = 120;				//���� ��ڽ�
		
		System.out.println(num);
		System.out.println(i);

		String str = "12345";
		
		//�� �� �ٸ�Ÿ���� ���������� �ٲ��ش�.
		System.out.println(Integer.parseInt(str));	//�⺻�ڷ������� ����
		System.out.println(Integer.valueOf(str));	//�����ڷ������� ����
	}

}
