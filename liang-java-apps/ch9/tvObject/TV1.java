package liang.ch9.tvObject;

public class TV1 { 

	int channel = 1;
	int volumeLevel = 1;
	boolean isInternetConnected = true;
	boolean isOn = false;

	public TV1() {

	}

	public void accessInternet() {
		isInternetConnected = true;
	}
	
	public void denyInternet() {
		isInternetConnected = false;
	}
	
	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int newChannel) {
		if (isOn && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int newVolumeLevel) {
		if (isOn && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (isOn && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (isOn && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (isOn && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (isOn && volumeLevel > 1)
			volumeLevel++;
	}
}

