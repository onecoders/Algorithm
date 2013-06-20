package com.ArrayInit;

public class VarargType {

	static void print(char... str) {
		for (char c : str) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		print('s','t','u','d','e','n','t');
	}

}
