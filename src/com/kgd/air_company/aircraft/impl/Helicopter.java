package com.kgd.air_company.aircraft.impl;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;

public class Helicopter extends Aircraft{
	private int boardNumber;
	private Model model;

	public Helicopter() {
		super();
	}

	public Helicopter(int passangerCapasity, int cargoCapacity, int flightRange, int fuelConsumption, int boardNumber,
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
		Helicopter other = (Helicopter) obj;
		if (boardNumber != other.boardNumber)
			return false;
		if (model != other.model)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Helicopter [boardNumber=" + boardNumber + ", model=" + model + "]";
	}
	

}
