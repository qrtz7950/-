package day10Hw;

import java.util.Arrays;

public class MC {

	public void mentStart() throws Exception {
		
		System.out.println("�� XXȸ �ζ� ����� �����մϴ�");
		
		Machine machine = new Machine();
		machine.start();
		
		int[] lottoNums = new int[6];
		for(int i = 0; i < 6; i++) {
			Ball ball = machine.getBall();
			Thread.sleep(1000);
			System.out.println(i + 1 + "��° �ζ� ��ȣ�� : " + ball.getNumber() );
			lottoNums[i] = ball.getNumber();
		}
		
		System.out.println("�� XXȸ �ζ� ��÷��ȣ�� " + Arrays.toString(lottoNums) + "�Դϴ�");
	}
}









