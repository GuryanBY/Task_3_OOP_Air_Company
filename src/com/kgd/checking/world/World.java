package com.kgd.checking.world;


import java.util.Set;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;
import com.kgd.air_company.aircraft.impl.Plane;
import com.kgd.air_company.company.impl.AirCompany;
import com.kgd.air_company.service.AirCompanyService;

public class World {

	public static void main(String[] args) {
		
		AirCompany guruAir = new AirCompany("Minsk, Main street, 2", "GuruAir", 987565, "SY23765765");

		// https://belavia.by/company/air_fleet/
		Aircraft plane1 = new Plane(20, 9, 1000, 78, 8587574, Model.BOIENG_737_500);
		Aircraft plane2 = new Plane(13, 17, 1340, 100, 238967, Model.AIRBUS_A320);
		Aircraft plane3 = new Plane(12, 10, 2345, 98, 2365236, Model.EMBRAER_E_175);
		Aircraft plane4 = new Plane(33, 43, 2342, 54, 235452354, Model.EMBRAER_E_175);

		AirCompanyService service = new AirCompanyService(guruAir);

		service.add(plane1);
		service.add(plane2);
		service.add(plane3);
		service.add(plane4);

		int x = service.getCargoPower();
		System.out.println("Общая грузоподьемность авиакомпании составляет " + x + " тонн.");

		int y = service.getPassengerPower();
		System.out.println("Общая пассажировместимость авиакомпании составляет " + y + " человек.");

		Set<Aircraft> res = service.searchByFuelConsumption(0, 90);

		System.out.println("Летательные аппараты с заданными параметрами потребления топлива:");
		for (Aircraft aa : res) {
			System.out.println(aa.toString());
		}
	}

}
