package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ControlGame c = new ControlGame();
		char sel;
		int you, score = 0;
		
		while(true) {
			sel = c.menu();
			
			
			if(sel == 'A') {
				ScissorsRockPaper srp = new ScissorsRockPaper();
				you = c.srpsel();
				score += srp.startGame(you);
			}else if(sel == 'B') {
				Dice d = new Dice();
				you = c.dsel();
				score += d.startGame(you);
			}else {
				System.out.println("������ �����մϴ�.");
				System.out.println("����� total score�� " + score + "�Դϴ�.");
				break;
			}
		}
		s.close();
	}

}
