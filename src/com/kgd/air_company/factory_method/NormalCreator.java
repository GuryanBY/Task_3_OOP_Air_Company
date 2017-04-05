package com.kgd.air_company.factory_method;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;
import com.kgd.air_company.aircraft.impl.Dirigible;
import com.kgd.air_company.aircraft.impl.Helicopter;
import com.kgd.air_company.aircraft.impl.Plane;

public class NormalCreator extends Creator{

	@Override
	public Aircraft createAircraft(String type) {
		Aircraft aircraft = null;
		
		int passangerCapasity = 12;//Scanner, BufferedReader, XML, DB, etc.
		int cargoCapacity = 2;
		int flightRange = 90;
		int fuelConsumption = 67;
		int boardNumber = 6534623;
		Model model = Model.CRJ_100_200;
		
		
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
