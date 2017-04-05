package com.kgd.air_company.company.impl;

import java.util.HashSet;

import com.kgd.air_company.aircraft.Aircraft;
import com.kgd.air_company.company.Company;

public class AirCompany extends Company {

	private String airCompanyLicence;
	private HashSet<Aircraft> fleet = new HashSet<>();

	public AirCompany(String address, String name, int taxNumber, String airCompanyLicence) {
		super(address, name, taxNumber);
		this.airCompanyLicence = airCompanyLicence;

	}

	public String getAirCompanyLicence() {
		return airCompanyLicence;
	}

	public void setAirCompanyLicence(String airCompanyLicence) {
		this.airCompanyLicence = airCompanyLicence;
	}

	public HashSet<Aircraft> getFleet() {
		return fleet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((airCompanyLicence == null) ? 0 : airCompanyLicence.hashCode());
		result = prime * result + ((fleet == null) ? 0 : fleet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirCompany other = (AirCompany) obj;
		if (airCompanyLicence == null) {
			if (other.airCompanyLicence != null)
				return false;
		} else if (!airCompanyLicence.equals(other.airCompanyLicence))
			return false;
		if (fleet == null) {
			if (other.fleet != null)
				return false;
		} else if (!fleet.equals(other.fleet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AirCompany [airCompanyLicence=" + airCompanyLicence + ", fleet=" + fleet + "]";
	}

}
