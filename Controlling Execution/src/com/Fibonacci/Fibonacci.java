package com.Fibonacci;

public class Fibonacci {

	/*
	 * Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2,
	 * 3, 5, 8, 13, 21, 34, and so on, where each number (from the third on) is
	 * the sum of the previous two. Create a method that takes an integer as an
	 * argument and displays that many Fibonacci numbers starting from the
	 * beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the name
	 * of the class) the output will be: 1, 1, 2, 3, 5.
	 */

	public void getFibonacci(int pos) {
		for (int i = 1; i <= pos; i++) {
			String fibonacci = recursive(i) + "";
			if (i == pos)
				fibonacci += "¡£";
			else
				fibonacci += "¡¢";
			System.out.print(fibonacci);
		}
	}

	private int recursive(int pos) {
		if (pos == 1) {
			return 1;
		} else if (pos == 2) {
			return 1;
		} else {
			return recursive(pos - 1) + recursive(pos - 2);
		}
	}

	public static void main(String[] args) {
		new Fibonacci().getFibonacci(5);
	}

}
