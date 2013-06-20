package com.aircondition;

public class AirCondition implements Comparable<AirCondition> {
	private int temperature = 20;

	public AirCondition(int temp) {
		this.temperature = temp;
	}

	public void increase() {
		temperature++;
	}

	public void discrease() {
		temperature--;
	}

	public int getTemp() {
		return temperature;
	}

	@Override
	public int compareTo(AirCondition args) {
		if (this.getTemp() == args.getTemp()) {
			return 0;
		} else {
			return this.getTemp() > args.getTemp() ? +1 : -1;
		}
	}
}
