package com.aircondition;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class AirConditionTest {

	public AirCondition[] sort(AirCondition[] acArray) {
		AirCondition tempAC;
		for (int i = 0; i < acArray.length - 1; i++) {
			for (int j = i + 1; j < acArray.length; j++) {
				if (acArray[i].getTemp() > acArray[j].getTemp()) {
					tempAC = acArray[i];
					acArray[i] = acArray[j];
					acArray[j] = tempAC;
				}
			}
		}
		return acArray;
	}

	public AirCondition[] sortByPriorityQueue(AirCondition[] acArray) {
		Queue<AirCondition> queue = new PriorityQueue<AirCondition>(
				Arrays.asList(acArray));
		for (int i = 0; i < acArray.length; i++) {
			acArray[i] = queue.peek() != null ? queue.poll() : null;
		}
		return acArray;
	}

	public AirCondition[] sortByArraysSort(AirCondition[] acArray) {
		Arrays.sort(acArray);
		return acArray;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AirCondition[] acArray = { new AirCondition(12), new AirCondition(13),
				new AirCondition(14), new AirCondition(10),
				new AirCondition(10), new AirCondition(23),
				new AirCondition(15), new AirCondition(9), new AirCondition(24) };

		for (AirCondition airCondition : new AirConditionTest().sort(acArray)) {
			System.out.print(airCondition);
			System.out.println(" " + airCondition.getTemp());
		}

		System.out.println();

		for (AirCondition airCondition : new AirConditionTest()
				.sortByPriorityQueue(acArray)) {
			System.out.print(airCondition);
			System.out.println(" " + airCondition.getTemp());
		}

		System.out.println();

		for (AirCondition airCondition : new AirConditionTest()
				.sortByArraysSort(acArray)) {
			System.out.print(airCondition);
			System.out.println(" " + airCondition.getTemp());
		}
	}

}
