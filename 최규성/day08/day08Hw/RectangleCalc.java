package day08Hw;

import java.util.Random;

public class RectangleCalc extends Calculate{

	@Override
	public void calc() {

		int b = r.nextInt(19)+ 1;
		System.out.println("���簢���� ����:" + a * b);
	}
}
