package day08.inter.type02;

public interface TV {
	
	int MAX_VOLUME = 40;	//�տ� public static final�� �������ִ�
	int MIN_VOLUME = 0;		//����̴�.
	
	/*public abstract�� ����*/void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
}
