package day07Hw;

public class ControlString {

	public static int checkChar(String strData, char ch) {

		int cnt = 0;

		for (int i = strData.length(); i >= 0; i--) {
			i = strData.lastIndexOf(ch, i);
			if (i != -1) {
				cnt++;
			}
		}

		return cnt;
	}

	/**
	 * �Էµ� ���ڿ��� �Էµ� ���ڿ� ���� ���ڸ� �� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	 */
	public static String removeChar(String oriStr, char delChar) {

		String str = "";
		char[] cs = new char[oriStr.length()];
		oriStr.getChars(0, oriStr.length(), cs, 0);

		for (int i = 0; i < oriStr.length(); i++) {
			if (cs[i] != delChar) {
				str += cs[i];
			}
		}

		return str;
	}
}
