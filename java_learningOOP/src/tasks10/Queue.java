package tasks10;

class Queue {

	private int size;
	private int[] elements;
	private int index = 0;

	// constructors
	public Queue() {
		this(8);
	}

	public Queue(int size) {
		this.size=size;
		elements = new int[size];
	}

	// methods

	public int getElement(int i) {
		return elements[i];
	}
	
	public int getSizeVar() {
		return size;
	}

	/**
	 * adds v into the queue doubles the size if needed
	 * 
	 * @param v
	 */
	public void enqueue(int v) {
		if (index == elements.length) {
			doubleSize();
			size++;
			elements[index++] = v;
		} else {
			elements[index++] = v;
		}

	}

	/**
	 * removes and returns the element from the queue
	 * 
	 * @return int
	 */
	public int dequeue() {
		int help = elements[0];
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return help;
	}

	/**
	 * method returns true if the queue is empty
	 * 
	 * @return bool
	 */
	public boolean empty() {
		return size == 0;
	}

	/**
	 * returns the size of the queue
	 * 
	 * @return int
	 */
	public int getSize() {
		return elements.length;
	}

	/**
	 * doubles the size of an array if the last index is full
	 */
	public void doubleSize() {
		int[] help = new int[elements.length * 2];
		for (int i = 0; i < elements.length; i++) {
			help[i] = elements[i];
		}
		elements = help;
	}

}
