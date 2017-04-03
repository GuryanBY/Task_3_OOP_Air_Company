package com.kgd.air_company.aircraft;

public class Plane extends Aircraft {

	private int boardNumber;
	private Model model;

	public Plane() {
		super();
	}

	public Plane(int passangerCapasity, int cargoCapacity, int flightRange, int fuelConsumption, int boardNumber,
			Model model) {
		super(passangerCapasity, cargoCapacity, flightRange, fuelConsumption);
		this.boardNumber = boardNumber;
		this.model = model;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + boardNumber;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (boardNumber != other.boardNumber)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plane [boardNumber=" + boardNumber + ", model=" + model + ",flight range=" + this.getFlightRange()+"]";
	}

}
