package kr.co.mlec.day02;
import java.util.Random;

/**
 * �ζǿ� ���õ� ���� ����� �����ϴ� Ŭ����
 * @author ������
 */

public class LottoUtil {
	/**
	 * ������ �ζ�Ȯ���� �����մϴ�
	 * ������ �ζ�Ȯ��(0-100%)
	 * @return
	 */
		public static int todayprobaillty() {
			return new Random().nextInt(100) +1;
	}

}
