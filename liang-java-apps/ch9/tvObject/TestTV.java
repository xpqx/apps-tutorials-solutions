package liang.ch9.tvObject;

public class TestTV {
	public static void main(String[] args) {
		TV tv1 = new TV();//--TV is the class name, tv1 is the object reference variable, assignment operator, keyword new and TV() to invoke the constructor
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		
		
	}

}
