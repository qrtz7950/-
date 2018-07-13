package kr.co.mlec.homework.homework08;

import java.util.Random;

/**
 * ���������� ����
 * @author ��Ʈ����
 *
 */
public class ScissorsRockPaper implements Game{
	final static int SCISSOER = 1;	// ����
	final static int ROCK = 2;		// ����
	final static int PAPER = 3;		// ��
	
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(3) + 1;
		int result = 0;
		String str;
		
		if(me == you) {
			str = "�����ϴ�";
		}else if(me == SCISSOER) {
			str = (you==3) ? "You lose" : "You win";
		}else if(me == ROCK) {
			str = (you==1) ? "You lose" : "You win";
		}else{
			str = (you==1) ? "You win" : "You lose";
		}
		
		if(str == "You win") {
			result = 1;
		}
		
		System.out.println(str);
		
		return result;
	}
}
