package kr.co.day50;

import java.util.Random;

/**���������� ���� 
 * 
 * @author ������
 *
 */
public class ScissorsRockPaper implements Game {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	public int startGame(int you) {
		
		int me = r.nextInt(3)+1;
		String str = null; 
		
		if (you > 0 && you < 4) {
			if(you == me) {
				System.out.println("�����ϴ�");
			} else if(me == 1) {
				str = you==2 ? "You win" : "You lose"; 
			} else if (me == 2) {
				str = you==3 ? "You win" : "You lose";
			} else {
				str = you==1 ? "You win" : "You lose";
			}
		} else {
			System.out.println("�ٽ� �Է��ϼ���");
			return 0;
		}
		
		System.out.println(str);
		
		int winOrLose = str == "You win" ? 1 : 0;
		
		return winOrLose;
	}
	
}
