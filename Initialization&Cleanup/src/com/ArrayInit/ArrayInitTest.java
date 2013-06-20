package com.ArrayInit;

public class ArrayInitTest {

	public static void main(String[] args) {
		/*
		 * ArrayInit[] arrayInit = new ArrayInit[5]; 
		 * arrayInit[0] = new ArrayInit("first");
		 */
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args) {
			System.out.println(s + " ");
		}
	}
}
