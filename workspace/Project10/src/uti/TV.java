package uti;

public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;
	
	public void turnOn(){
		on = true;
	}
	public void turnOff(){
		on = false;
	}
	public void setChannel(int newChannel){
		if (on) {
			if (newChannel < 0 || newChannel > 120){
				System.out.println ("That is an invalid channel");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		channel = newChannel;
	}
	public void setVolume (int newVolumeLevel){
		if (on) {
			if (newVolumeLevel < 1 || newVolumeLevel > 7){
				System.out.println ("That is an invalid volume");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		volumeLevel = newVolumeLevel;
	}
	public void channelUp () {
		if (on) {
			if (channel + 1 > 120) {
				System.out.println ("That is an invalid channel");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		channel++;
	}
	public void channelDown () {
		if (on) {
			if (channel - 1 < 0) {
				System.out.println ("That is an invalid channel");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		channel--;
	}
	public void volumeUp () {
		if (on) {
			if (volumeLevel + 1 > 7) {
				System.out.println ("That is an invalid volume");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		volumeLevel++;
	}
	public void volumeDown () {
		if (on) {
			if (volumeLevel - 1 < 0) {
				System.out.println ("That is an invalid volume");
				return;
			}
		} else {
			System.out.println("The TV is off");
		}
		volumeLevel--;
	}
	
}
