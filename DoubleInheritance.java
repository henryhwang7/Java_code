package java_practice;

class TV {
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class VCR {
	int count = 0;
	void play() {
		System.out.println("VCR Play");
	}
	void stop() {
		System.out.println("VCR Stop");
	}
	void rew() {
		System.out.println("VCR Rewind");
	}
	void ff() {
		System.out.println("VCR Fast Forward");
	}
}

class TVCR extends TV {
	VCR v = new VCR();
	void play() {
		v.play();
	}
	void stop() {
		v.stop();
	}
	void rew() {
		v.rew();
	}
	void ff() {
		v.ff();
	}
}

public class DoubleInheritance {
	public static void main(String[] args) {
		TVCR tv = new TVCR();
		tv.power = true;
		tv.channel = 10;
		System.out.println("TV Power: "+tv.power);
		
		tv.channelUp();
		System.out.println("TV Channel: "+tv.channel);
		tv.play();
		tv.ff();
		tv.stop();
	}
}
