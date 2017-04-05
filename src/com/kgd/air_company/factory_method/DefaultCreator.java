package com.kgd.air_company.factory_method;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.impl.Dirigible;
import com.kgd.air_company.aircraft.impl.Helicopter;
import com.kgd.air_company.aircraft.impl.Plane;

public class DefaultCreator extends Creator{

	@Override
	public Aircraft createAircraft(String type) {
		Aircraft aircraft = null;
		if(type.equalsIgnoreCase("Plane")){
			aircraft = new Plane();
		}else if(type.equalsIgnoreCase("Helicopter")){
			aircraft = new Helicopter();
		}if(type.equalsIgnoreCase("Dirigible")){
			aircraft = new Dirigible();
		}

		return aircraft;
	}

}
