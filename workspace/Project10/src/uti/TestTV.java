package uti;

public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(20);
		tv1.setVolume(5);
		tv1.volumeUp();
		tv1.channelUp();
		tv1.turnOff();
		tv1.volumeDown();
		System.out.println("The channel of the TV is " + tv1.channel + " and the volume is " + tv1.volumeLevel);
	}

}
