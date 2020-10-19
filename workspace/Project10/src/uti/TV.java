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
		if (newChannel < 0 || newChannel > 120){
			System.out.println ("That is an invalid channel");
			return;
		}
		channel = newChannel;
	}
	public void setVolume (int newVolumeLevel){
		if (newVolumeLevel < 1 || newVolumeLevel > 7){
			System.out.println ("That is an invalid volume");
			return;
		}
		volumeLevel = newVolumeLevel;
	}
	
}
