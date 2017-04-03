package com.kgd.checking.world;

import java.util.HashSet;
import java.util.TreeSet;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Model;
import com.kgd.air_company.aircraft.Plane;
import com.kgd.air_company.company.AirCompany;
import com.kgd.air_company.company.AirCompanyService;

public class World2 {
	public static void main(String[] args) {
		AirCompany guruAir = new AirCompany("Minsk, Main street, 2", "GuruAir", 987565, "SY23765765");

		// https://belavia.by/company/air_fleet/
		Aircraft plane1 = new Plane(20, 9, 5000, 78, 8587574, Model.BOIENG_737_500);
		Aircraft plane2 = new Plane(13, 17, 1340, 100, 238967, Model.AIRBUS_A320);
		Aircraft plane3 = new Plane(12, 10, 2345, 98, 2365236, Model.EMBRAER_E_175);
		Aircraft plane4 = new Plane(33, 43, 2342, 54, 235452354, Model.EMBRAER_E_175);

		AirCompanyService service = new AirCompanyService(guruAir);

		service.add(plane1);
		service.add(plane2);
		service.add(plane3);
		service.add(plane4);

		HashSet<Aircraft> beforeSorting = guruAir.getFleet();
		for (Aircraft a : beforeSorting) {
			System.out.println(a.toString());

		}
		System.out.println("------------------------------------");

		TreeSet<Aircraft> afterSorting = service.sortByFlightRange(beforeSorting);

		for (Aircraft a : afterSorting) {
			System.out.println(a.toString());
		}

	}

}
