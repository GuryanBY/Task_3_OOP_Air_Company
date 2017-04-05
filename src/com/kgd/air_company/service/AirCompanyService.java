package com.kgd.air_company.service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.company.impl.AirCompany;

public class AirCompanyService {
	private AirCompany airCompany;

	public AirCompanyService(AirCompany airCompany) {
		this.airCompany = airCompany;
	}

	public boolean add(Aircraft aircraft) {
		Set<Aircraft> fleet = airCompany.getFleet();
		return fleet.add(aircraft);
	}

	public boolean remove(Aircraft aircraft) {
		Set<Aircraft> fleet = airCompany.getFleet();
		
		return fleet.remove(aircraft);

	}

	public int getCargoPower() {
		
		Set<Aircraft> fleet = airCompany.getFleet();

		int cargoPower = 0;

		for (Aircraft a : fleet) {
			cargoPower += a.getCargoCapacity();
		}

		return cargoPower;
	}

	public int getPassengerPower() {
		Set<Aircraft> fleet = airCompany.getFleet();
		int passengerPower = 0;

		for (Aircraft a : fleet) {
			passengerPower += a.getPassangerCapasity();
		}

		return passengerPower;
	}

	public Set<Aircraft> searchByFuelConsumption(int lowerLimit, int upperLimit) {
		Set<Aircraft> fleet = airCompany.getFleet();
		Set<Aircraft> result = new HashSet<Aircraft>();
		for (Aircraft element : fleet) {

			int fuelConsumption = element.getFuelConsumption();
			if ((fuelConsumption >= lowerLimit) && (fuelConsumption <= upperLimit)) {
				result.add(element);
			}
		}

		return result;
	}
	public Set<Aircraft> sortByFlightRange(Set<Aircraft> fleet){
			
		Set<Aircraft> result = new TreeSet<>(new FlightRangeComparator());
		result.addAll(fleet);
		return result;
	}
	//Simple factory
	//Comparator

}
