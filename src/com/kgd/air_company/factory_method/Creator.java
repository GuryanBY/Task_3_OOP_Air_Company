package com.kgd.air_company.factory_method;

import com.kgd.air_company.aircraft.Aircraft;

public abstract class Creator {
	public abstract Aircraft createAircraft(String type);
}
