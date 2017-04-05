package com.kgd.air_company.service;

import java.util.Comparator;

import com.kgd.air_company.aircraft.Aircraft;

public class FlightRangeComparator implements Comparator<Aircraft>{

	public int compare(Aircraft aircraft1, Aircraft aircraft2) {
		int flightRange1 = aircraft1.getFlightRange();
		int flightRange2 = aircraft2.getFlightRange();
		return flightRange1 - flightRange2;
	}

}
