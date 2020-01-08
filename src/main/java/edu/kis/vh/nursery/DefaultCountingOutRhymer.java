package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT_MINUS_ONE = -1;
	public static final int INT_TWELVE = 12;
	private int[] numbers = new int[INT_TWELVE];

	public int total = INT_MINUS_ONE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT_MINUS_ONE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return INT_MINUS_ONE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INT_MINUS_ONE;
		return numbers[total--];
	}

}
