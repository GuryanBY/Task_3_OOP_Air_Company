package com.kgd.air_company.simple_factory;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;
import com.kgd.air_company.aircraft.impl.Dirigible;
import com.kgd.air_company.aircraft.impl.Helicopter;
import com.kgd.air_company.aircraft.impl.Plane;

public class SimpleAircraftFactory {

	public static Aircraft createAircraft(String type, int passangerCapasity, int cargoCapacity, int flightRange,
			int fuelConsumption, int boardNumber, Model model) {
		Aircraft aircraft = null;
		if(type.equalsIgnoreCase("Plane")){
			aircraft = new Plane(passangerCapasity, cargoCapacity, flightRange, fuelConsumption,boardNumber, model);
		}else if(type.equalsIgnoreCase("Helicopter")){
			aircraft = new Helicopter(passangerCapasity, cargoCapacity, flightRange, fuelConsumption,boardNumber, model);
		}if(type.equalsIgnoreCase("Dirigible")){
			aircraft = new Dirigible(passangerCapasity, cargoCapacity, flightRange, fuelConsumption,boardNumber, model);
		}

		return aircraft;
	}

}
