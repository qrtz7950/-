package day02;
import java.util.Random;
/**
 * �ζǿ� ���õ� ���� ����� �����ϴ� Ŭ����
 * @author CKS
 *
 */
public class LottoUtil {
/**
 * ������ �ζ� Ȯ���� �����մϴ�
 * @return ������ �ζ�Ȯ��(0~100% ����)
 */
		public static int todayProabability() {
			return new Random().nextInt(100) + 1;
	}

}
