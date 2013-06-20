package com.Vampire;

import java.util.ArrayList;
import java.util.List;

public class Vampire {

	/*
	 * Exercise 10: (5) A vampire number has an even number of digits and is
	 * formed by multiplying a pair of numbers containing half the number of
	 * digits of the result. The digits are taken from the original number in
	 * any order. Pairs of trailing zeroes are not allowed. Examples include:
	 * 1260 = 21 * 60 1827 = 21 * 87 2187 = 27 * 81 Write a program that finds
	 * all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
	 */

	public List<Integer> findVampireNum() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1000; i < 10000; i++) {
			if (i % 100 != 0 && isVampire(i)) {
				list.add(i);
			}
		}
		return list;
	}

	private boolean isVampire(int fourDigitNum) {
		int[] each = getEachNum(fourDigitNum);
		return isEqual(each, fourDigitNum);
	}

	private int[] getEachNum(int num) {
		int[] each = new int[4];
		each[0] = num % 10;
		each[1] = num / 10 % 10;
		each[2] = num / 100 % 10;
		each[3] = num / 1000;
		return each;
	}

	private boolean isEqual(int[] each, int fourDigitNum) {
		int[] eachPair = new int[2];
		int[][] compositions = new int[][] { { 0, 1, 2, 3 }, { 0, 1, 3, 2 },
				{ 0, 2, 1, 3 }, { 0, 2, 3, 1 }, { 0, 3, 1, 2 }, { 0, 3, 2, 1 },
				{ 1, 2, 0, 3 }, { 1, 2, 3, 0 }, { 1, 3, 0, 2 }, { 1, 3, 2, 0 },
				{ 2, 3, 0, 1 }, { 2, 3, 1, 0 } };
		for (int i = 0; i < compositions.length; i++) {
			eachPair[0] = each[compositions[i][0]] * 10
					+ each[compositions[i][2]];
			eachPair[1] = each[compositions[i][1]] * 10
					+ each[compositions[i][3]];
			if (equalResult(eachPair, fourDigitNum)) {
				return true;
			}
		}
		return false;
	}

	private boolean equalResult(int[] eachPair, int fourDigitNum) {
		return eachPair[0] * eachPair[1] == fourDigitNum;
	}

	public static void main(String[] args) {
		for (Integer vampire : new Vampire().findVampireNum()) {
			System.out.print(vampire + " ");
		}
	}

}
