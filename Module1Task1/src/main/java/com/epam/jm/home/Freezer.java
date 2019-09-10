/**
 * 
 */
package com.epam.jm.home;

import com.epam.jm.appliance.ApplianceCategory;

/**
 * @author Anna_Kirenia
 *
 */
public class Freezer extends HomeAppliance implements IFreezer {

	public Freezer(String name, Integer power) {
		super(name, power, ApplianceCategory.Freezer);
	}

	@Override
	public Integer getTemperature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTemperature(Integer temp) {
		// TODO Auto-generated method stub

	}

}
