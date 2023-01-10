
public class Video implements Actions {
	//Attributes
	private String title;
	private int stars;
	private int views;
	private int likes;
	private boolean playingNow;
	
	//Constructor
	public Video(String title) {
		this.title = title;
		this.stars = 1;
		this.views = 0;
		this.likes = 0;
		this.playingNow = false;
	}
	
	//Implemented Methods (Override from Interface)
	@Override
	public void play() {
		this.playingNow = true;
	}

	@Override
	public void pause() {
		this.playingNow = false;
	}

	@Override
	public void like() {
		this.likes++;	
	}
	
	// toString
	@Override
	public String toString() {
		return "Video [title=" + title + ", stars=" + stars + ", views=" + views + ", likes=" + likes + ", playingNow="
				+ playingNow + "]";
	}

	//Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		int newValue = (this.stars + stars)/2;
		this.stars = newValue;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean isPlayingNow() {
		return playingNow;
	}

	public void setPlayingNow(boolean playingNow) {
		this.playingNow = playingNow;
	}
	

}
