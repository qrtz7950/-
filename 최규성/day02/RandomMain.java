package day02;
import java.util.Random;
/*
 * Random Ŭ���� : ������ ������ �����ϴ� ����ϴ� Ŭ����
 */
public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(); //������ ������ �����ϴ� �޼ҵ�
		System.out.println("int������ ������ ����: " + num);
		
		//0~9������ ���� ����
		int num2 = r.nextInt(10);
		System.out.println("0~9 ���� ����: " + num2);
		
		//1~100������ ���� ����
		
		int num3 = r.nextInt(100) + 1 ; //0~99  -> (100)+1 -> 1~100
		System.out.println("1~100���� ����: " + num3);
		
	}

}
