package day08.inter.type02;

public class UserMain {

	public static void main(String[] args) {

		//LGTV tv = new LGTV();	//LGTV, SSTV ���� �ϳ��� �ᵵ ������ �����ʴ´�
		SSTV tv = new SSTV();
		//TV tv = new SSTV();
		
		tv.powerOn();
		tv.soundDown();
		tv.channelUp();
		tv.powerOff();
	}

}
