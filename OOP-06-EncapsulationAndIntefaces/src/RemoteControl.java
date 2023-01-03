
public class RemoteControl implements ControllerInterface {
	
	// ATTRIBUTES
	private int volume;
	private boolean powerOn;
	private boolean onPlay;
	
	// CONSTRUCTOR
	public RemoteControl() {
		this.volume = 50;
		this.powerOn = false;
		this.onPlay = false;
	}
	 
	// GETTERS AND SETTERS
	private int getVolume() {
		return volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private boolean getPowerOn() {
		return powerOn;
	}
	private void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	
	private boolean getOnPlay() {
		return onPlay;
	}
	private void setOnPlay(boolean onPlay) {
		this.onPlay = onPlay;
	}
	
	//  ABSTRACT METHODS

	@Override
	public void powerOn() {
		this.setPowerOn(true);		
	}

	@Override
	public void powerOff() {
		this.setPowerOn(false);		
	}

	@Override
	public void openSetup() {
		System.out.println("------- SETUP -------");
		System.out.println("Power On: " + this.getPowerOn());
		System.out.println("Playing Now: " + this.getOnPlay());
		System.out.print("Volume: " + this.getVolume());
		
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print(" |");
		}
	}

	@Override
	public void closeSetup() {
		System.out.println("Closing Setup...");
	}

	@Override
	public void volumeUp() {
		if (this.getPowerOn()) {
			this.setVolume(this.getVolume() + 5);	
		}		
	}

	@Override
	public void volumeDown() {
		if (this.getPowerOn()) {
			this.setVolume(this.getVolume() - 5);				
		}	
	}

	@Override
	public void soundOff() {
		if (this.getPowerOn() && this.getVolume() > 0) {
			this.setVolume(0);			
		}
	}

	@Override
	public void soundOn() {
		if (this.getPowerOn() && this.getVolume() == 0) {
			this.setVolume(50);
		}	
	}

	@Override
	public void play() {
		if (this.getPowerOn() && !(this.getOnPlay())) {
			this.setOnPlay(true);	
		}	
	}

	@Override
	public void pause() {
		if (this.getPowerOn() && this.getOnPlay()) {
			this.setOnPlay(false);;			
		}
	}

}
