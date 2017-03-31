package com.kgd.checking.world;

import java.util.HashSet;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.aircraft.Plane;
import com.kgd.air_company.company.AirCompany;

public class World {

	public static void main(String[] args) {

		AirCompany guruAir = new AirCompany("Minsk, Main street, 2", "GuruAir", 987565, "SY23765765");

		// Planes
		// https://belavia.by/company/air_fleet/
		Aircraft plane1 = new Plane(20, 9, 1000, 78, 8587574, "Boieng 737-500");
		Aircraft plane2 = new Plane(13, 17, 1340, 100, 238967, "Airbus A320");
		Aircraft plane3 = new Plane(12, 10, 2345, 98, 2365236, "Embraer E-175");
		Aircraft plane4 = new Plane(33, 43, 2342, 54, 235452354, "CRJ-100/200");

		guruAir.add(plane1);
		guruAir.add(plane2);
		guruAir.add(plane3);
		guruAir.add(plane4);

		int x = guruAir.getCargoPower();
		System.out.println("Общая грузоподьемность авиакомпании составляет " + x + " тонн.");

		int y = guruAir.getPassengerPower();
		System.out.println("Общая пассажировместимость авиакомпании составляет " + y + " человек.");

		HashSet<Aircraft> res = guruAir.searchByFuelConsamption(0, 90);

		System.out.println("Самолеты с заданными параметрами потребления топлива:");
		for (Aircraft aa : res) {
			System.out.println(aa.toString());
		}
	}

}
