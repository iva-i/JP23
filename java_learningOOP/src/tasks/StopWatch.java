package tasks;

class StopWatch {

	// defined data fields
	private long startTime;
	private long endTime;

	// no-arg constructor that initializes
	// startTime with the current time.
	public StopWatch() {
		super();
		this.startTime = System.currentTimeMillis();
	}	

	// getters
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime-startTime;
	}
	
	

}
