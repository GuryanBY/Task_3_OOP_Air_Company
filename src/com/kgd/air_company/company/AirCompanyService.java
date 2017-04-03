package com.kgd.air_company.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kgd.air_company.aircraft.Aircraft;

public class AirCompanyService {
	private Set<Aircraft> fleet;

	public AirCompanyService(AirCompany airCompany) {
		fleet = airCompany.getFleet();
	}

	public boolean add(Aircraft aircraft) {
		return fleet.add(aircraft);
	}

	public boolean remove(Aircraft aircraft) {
		return fleet.remove(aircraft);

	}

	public int getCargoPower() {

		int cargoPower = 0;

		for (Aircraft a : fleet) {
			cargoPower += a.getCargoCapacity();
		}

		return cargoPower;
	}

	public int getPassengerPower() {
		int passengerPower = 0;

		for (Aircraft a : fleet) {
			passengerPower += a.getPassangerCapasity();
		}

		return passengerPower;
	}

	public HashSet<Aircraft> searchByFuelConsumption(int lowerLimit, int upperLimit) {
		HashSet<Aircraft> result = new HashSet<Aircraft>();
		for (Aircraft element : fleet) {

			int fuelConsumption = element.getFuelConsumption();
			if ((fuelConsumption >= lowerLimit) && (fuelConsumption <= upperLimit)) {
				result.add(element);
			}
		}

		return result;
	}
	public TreeSet<Aircraft> sortByFlightRange(Set<Aircraft> fleet){
		TreeSet<Aircraft> result = new TreeSet<Aircraft> (fleet);
		return result;
	}

}
