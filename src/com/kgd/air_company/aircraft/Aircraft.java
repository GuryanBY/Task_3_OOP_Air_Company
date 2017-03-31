package com.kgd.air_company.aircraft;

public abstract class Aircraft {

	private int passangerCapasity;
	private int cargoCapacity;
	private int flightRange;
	private int fuelConsumption;

	public Aircraft() {
	}

	public Aircraft(int passangerCapasity, int cargoCapacity, int flightRange, int fuelConsumption) {
		this.passangerCapasity = passangerCapasity;
		this.cargoCapacity = cargoCapacity;
		this.flightRange = flightRange;
		this.fuelConsumption = fuelConsumption;
	}

	public abstract void takeOff();

	public abstract void fly();

	public abstract void landing();

	public int getPassangerCapasity() {
		return passangerCapasity;
	}

	public void setPassangerCapasity(int passangerCapasity) {
		this.passangerCapasity = passangerCapasity;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public int getFlightRange() {
		return flightRange;
	}

	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargoCapacity;
		result = prime * result + flightRange;
		result = prime * result + fuelConsumption;
		result = prime * result + passangerCapasity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aircraft other = (Aircraft) obj;
		if (cargoCapacity != other.cargoCapacity)
			return false;
		if (flightRange != other.flightRange)
			return false;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (passangerCapasity != other.passangerCapasity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aircraft [passangerCapasity=" + passangerCapasity + ", cargoCapacity=" + cargoCapacity
				+ ", flightRange=" + flightRange + ", fuelConsumption=" + fuelConsumption + "]";
	}

}
