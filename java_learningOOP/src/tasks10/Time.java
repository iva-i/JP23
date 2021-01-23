package tasks10;

class Time {

	// data field
	private int hour, minute, second;

	// constructors
	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long time) {
		this.hour = (int) ((time / 3600000) % 24);
		this.minute = (int) ((time / 60000) % 60);
		this.second = (int) ((time / 1000) % 60);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// getters
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// methods
	public void setTime(long elapseTime) {
		this.hour = (int) ((elapseTime / 3600000) % 24);
		this.minute = (int) ((elapseTime / 60000) % 60);
		this.second = (int) ((elapseTime / 1000) % 60);
	}

}
