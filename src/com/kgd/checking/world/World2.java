package com.kgd.checking.world;

import java.util.Set;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;
import com.kgd.air_company.company.impl.AirCompany;
import com.kgd.air_company.factory_method.Creator;
import com.kgd.air_company.factory_method.DefaultCreator;
import com.kgd.air_company.factory_method.NormalCreator;
import com.kgd.air_company.service.AirCompanyService;
import com.kgd.air_company.simple_factory.SimpleAircraftFactory;

public class World2 {
	public static void main(String[] args) {
		//Simple factory
		Aircraft aircraft1 = SimpleAircraftFactory.createAircraft("Plane", 20, 9, 5000, 78, 8587574,
				Model.BOIENG_737_500);
		Aircraft aircraft2 = SimpleAircraftFactory.createAircraft("Helicopter", 13, 17, 1340, 100, 238967,
				Model.AIRBUS_A320);
		Aircraft aircraft3 = SimpleAircraftFactory.createAircraft("Dirigible", 12, 10, 2345, 98, 2365236,
				Model.EMBRAER_E_175);
		Aircraft aircraft4 = SimpleAircraftFactory.createAircraft("Plane", 33, 43, 2342, 54, 235452354,
				Model.EMBRAER_E_175);
		//----------------------------------------------------------------------------------------------
		
		//Factory Method
		Creator defaultCreator = new DefaultCreator();//create objects with default values (0, null, false)
		Aircraft aircraft5 = defaultCreator.createAircraft("Plane");
		Aircraft aircraft6 = defaultCreator.createAircraft("Helicopter");
		Aircraft aircraft7 = defaultCreator.createAircraft("Dirigible");
		
		Creator normalCreator = new NormalCreator(); //create objects with concrete values 
		Aircraft aircraft8 = normalCreator.createAircraft("Plane");
		Aircraft aircraft9 = normalCreator.createAircraft("Helicopter");
		Aircraft aircraft10 = normalCreator.createAircraft("Dirigible");
		//----------------------------------------------------------------------------------------------
		AirCompany guruAir = new AirCompany("Minsk, Main street, 2", "GuruAir", 987565, "SY23765765");

		AirCompanyService service = new AirCompanyService(guruAir);

		service.add(aircraft1);
		service.add(aircraft2);
		service.add(aircraft3);
		service.add(aircraft4);

		Set<Aircraft> beforeSorting = guruAir.getFleet();
		for (Aircraft a : beforeSorting) {
			System.out.println(a.getClass().getSimpleName());

		}
		System.out.println("------------------------------------");

		Set<Aircraft> afterSorting = service.sortByFlightRange(beforeSorting);

		for (Aircraft a : afterSorting) {
			System.out.println(a.toString());
		}
		System.out.println("------------------------------------");

	}

}
