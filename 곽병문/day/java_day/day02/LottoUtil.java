package kr.co.mlec.day02;

import java.util.Random;

/**
 * �ζǿ� ���õ� ���� ����� �����ϴ� Ŭ����
 * @author BeeMil
 *
 */

public class LottoUtil {
	/**
	 * ������ �ζ�Ȯ���� ����
	 * @return ������ �ζ�Ȯ�� (0~100%����)
	 */
	public static int todayProbability() {
		return new Random().nextInt(100) + 1;
	}

}
