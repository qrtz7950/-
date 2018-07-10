package kr.co.mlec.homework.homework05;
/**
 * ��Ʈ����������
 * @author ��Ʈ����
 *
 */
public class StringUtil {
	
	/**
	 * �ش� ������ �빮�� Ȯ�� �޼ҵ�
	 * @param char
	 * @return boolean
	 */
	boolean isUpperChar(char c) {
		boolean bool;
		int a = (int)c;
		bool = (a>='A' && a<='Z');
		
		return bool;
	}
	
	/**
	 * �ش� ������ �ҹ��� Ȯ�� �޼ҵ�
	 * @param char
	 * @return boolean
	 */
	boolean isLowerChar(char c) {
		boolean bool;
		int a = (int)c;
		bool = (a>='a' && a<='z');
		
		return bool;
	}
	
	/**
	 * �� �� �� ū�� ��ȯ
	 * @param int
	 * @param int
	 * @return int
	 */
	int max(int a, int b) {
		int max = a>b ? a : b;
		return max;
	}
	
	/**
	 * �� �� �� ������ ��ȯ
	 * @param int
	 * @param int
	 * @return int
	 */
	int min(int a, int b) {
		int min = a<b ? a : b;
		return min;
	}
	
	/**
	 * ���ڿ� �Ųٷ� ���� ��ȯ�ϴ� �������� �޼ҵ�
	 * @param String
	 * @return String
	 */
	String reverseString(String str) {
		
		String rts = new String();	
		
		char[] c = new char[str.length()];
		c = stringToChar(str);
			
		for(int i = str.length()-1; i>=0; i--) {
			rts += c[i];
		}
		return rts;
	}
	
	/**
	 * ���ڿ� ��� �빮�ڷ�!!
	 * @param String
	 * @return String
	 */
	String toUpperString(String str) {
		
		String strA = new String();
		
		char[] c = new char[str.length()];
		c = stringToChar(str);
		
		for(int i=0; i<str.length(); i++) {
			if(c[i]>='a' && c[i]<='z') {
				c[i] = (char)(c[i]-('a'-'A'));
			}
			strA += c[i];
		}
		
		
		return strA;
	}
	
	/**
	 * ���ڿ� ��� �ҹ��ڷ�!!
	 * @param String
	 * @return String
	 */
	String toLowerString(String str) {
			
			String stra = new String();
			
			char[] c = new char[str.length()];
			c = stringToChar(str);
			
			for(int i=0; i<str.length(); i++) {
				if(c[i]>='A' && c[i]<='Z') {
					c[i] = (char)(c[i]+('a'-'A'));
				}
				stra += c[i];
			}
			
			
			return stra;
		}
	
	/**
	 * �����Ƽ� ���� ���ڿ� �迭��ȯ �޼ҵ�
	 * @param String
	 * @return char[]
	 */
	char[] stringToChar(String str) {
		
		char[] c = new char[str.length()];
		str.getChars(0, str.length(), c, 0);
		
		return c;
	}
}
