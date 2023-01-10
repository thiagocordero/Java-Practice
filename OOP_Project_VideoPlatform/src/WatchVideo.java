
public class WatchVideo {
	//Attributes
	private Student personWatching;
	private Video videoWatched;
	
	//Constructor
	public WatchVideo(Student personWatching, Video videoWatched) {
		this.personWatching = personWatching;
		this.videoWatched = videoWatched;
		this.personWatching.setTotalWatched(this.personWatching.getTotalWatched() + 1);
		this.videoWatched.setViews(this.videoWatched.getViews() + 1);
	}
	
	//Methods
	public void evaluate() {
		this.videoWatched.setStars(5);
	}

	public void evaluate(int grade) {
		if (grade <= 2) {
			this.videoWatched.setStars(1);
		} else if (grade <= 4 ) {
			this.videoWatched.setStars(2);
		} else if (grade <= 6) {
			this.videoWatched.setStars(3);
		} else if (grade <= 8) {
			this.videoWatched.setStars(4);
		} else {
			this.videoWatched.setStars(5);
		}
	}
	
	public void evaluate(float percentage) {
		int total = 0;
		
		if (percentage <= 20) {
			total = 1;
		} else if (percentage <= 40) {
			total = 2;
		} else if (percentage <= 60) {
			total = 3;			
		} else if (percentage <= 80) {
			total = 4;	
		} else {
			total = 5;
		}
		this.videoWatched.setStars(total);
	}
	
	//Getters and Setters
	public Student getPersonWatching() {
		return personWatching;
	}
	public void setPersonWatching(Student personWatching) {
		this.personWatching = personWatching;
	}
	public Video getVideoWatched() {
		return videoWatched;
	}
	public void setVideoWatched(Video videoWatched) {
		this.videoWatched = videoWatched;
	}

	// toString
	@Override
	public String toString() {
		return "WatchVideo [personWatching=" + personWatching + ", videoWatched=" + videoWatched + "]";
	}

}
