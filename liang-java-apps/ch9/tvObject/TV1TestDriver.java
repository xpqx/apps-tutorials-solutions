package liang.ch9.tvObject;


/*
 * OUTPUT
 * Print the default values of the TV: 1 1 1 1 false true

Print the default values of the TV2: 1 1 1 1 false true


Print the default values of the TV2: 30 7 30 7 true false
Print the default values of the TV: 11 6 11 6 true true
 * 
 * 
 */
public class TV1TestDriver {
	
	public static void main(String[] args) {
	
	TV1 myTV1 = new TV1();
	
	System.out.printf("Print the default values of the TV: " + myTV1.channel + " " + myTV1.volumeLevel + " " + myTV1.getChannel() + " "
	+ myTV1.getVolumeLevel() + " " + myTV1.isOn + " " + myTV1.isInternetConnected );
	
	TV1 myTV2 = new TV1();
	System.out.println("\n");
	System.out.println("Print the default values of the TV2: " + myTV2.channel + " " + myTV2.volumeLevel + " " + myTV2.getChannel() + " "
			+ myTV2.getVolumeLevel() + " " + myTV2.isOn + " " + myTV2.isInternetConnected);
	
	myTV2.turnOn();
	myTV2.setChannel(30);
	myTV2.setVolumeLevel(7);
	
	
	myTV1.turnOn();
	myTV1.setChannel(11);
	myTV1.setVolumeLevel(6);
	myTV2.isInternetConnected = false;
	
	//myTV2.channelUp();
	
	System.out.println("\n");
	System.out.println("Print the default values of the TV2: " + myTV2.channel + " " + myTV2.volumeLevel + " " + myTV2.getChannel() + " "
			+ myTV2.getVolumeLevel() + " " + myTV2.isOn + " " + myTV2.isInternetConnected);
	
	System.out.printf("Print the default values of the TV: " + myTV1.channel + " " + myTV1.volumeLevel + " " + myTV1.getChannel() + " "
			+ myTV1.getVolumeLevel() + " " + myTV1.isOn + " " + myTV1.isInternetConnected );
			
	

	}
}
