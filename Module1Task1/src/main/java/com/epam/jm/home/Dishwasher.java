/**
 * 
 */
package com.epam.jm.home;

import com.epam.jm.appliance.ApplianceCategory;

/**
 * @author Anna_Kirenia
 *
 */
public class Dishwasher extends HomeAppliance implements IWashable {

	public Dishwasher(String name, Integer power) {
		super(name, power, ApplianceCategory.Cleaning);
	}

	@Override
	public String getWashingType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWashingType(String type) {
		// TODO Auto-generated method stub

	}

}
