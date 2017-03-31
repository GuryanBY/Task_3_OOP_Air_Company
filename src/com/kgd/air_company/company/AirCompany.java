package com.kgd.air_company.company;

import java.util.HashSet;
import java.util.Set;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Plane;

public class AirCompany extends Company {

	private String airCompanyLicence;
	private Set<Aircraft> base = new HashSet<>();

	public AirCompany(String address, String name, int taxNumber, String airCompanyLicence) {
		super(address, name, taxNumber);
		this.airCompanyLicence = airCompanyLicence;

	}

	public String getAirCompanyLicence() {
		return airCompanyLicence;
	}

	public void setAirCompanyLicence(String airCompanyLicence) {
		this.airCompanyLicence = airCompanyLicence;
	}

	public void add(Aircraft aircraft) {
		base.add(aircraft);
	}

	public void remove(Aircraft aircraft) {
		try {
			if (base.isEmpty()) {
				throw new Exception();
			}

			if (!base.remove(aircraft)) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.err.println("Deleting problem");
		}
	}

	public int getCargoPower() {

		int cargoPower = 0;

		for (Aircraft a : base) {
			cargoPower += a.getCargoCapacity();
		}

		return cargoPower;
	}

	public int getPassengerPower() {
		int passengerPower = 0;

		for (Aircraft a : base) {
			passengerPower += a.getPassangerCapasity();
		}

		return passengerPower;
	}

	public HashSet<Aircraft> searchByFuelConsamption(int lowerLimit, int upperLimit) {
		HashSet<Aircraft> result = new HashSet<Aircraft>();
		for (Aircraft element : base) {
			element = (Plane) element;
			if ((element.getFuelConsumption() >= lowerLimit) && (element.getFuelConsumption() <= upperLimit)) {
				result.add(element);
			}
		}

		return result;
	}
}
