package kr.co.mlec.day08.inter.type02;

public interface TV {
	
	int MAX_VOLUME = 40;
//	public static final int MAX_VOLUME = 40; //������ �κ��� �ִ�
	int MIN_VOLUME = 0;
	
	void powerOn();
//	public abstract void powerOn(); // ������ �κ��� �ִ�
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
}
