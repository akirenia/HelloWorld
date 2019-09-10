/**
 * 
 */
package com.epam.jm.home;

import com.epam.jm.appliance.Appliance;
import com.epam.jm.appliance.ApplianceCategory;

/**
 * @author Anna_Kirenia
 *
 */
public abstract class HomeAppliance extends Appliance implements IHomeAppliance {

	private HomeRoom room = null;
	private boolean isOn = false;

	public HomeAppliance(String name, Integer power, ApplianceCategory category) {
		super(name, power, category);
	}

	protected void assign(HomeRoom room) {
		this.room = room;
	}

	protected void unassign() {
		this.room = null;
	}

	public boolean isAssigned() {
		return (this.room != null);
	}

	public HomeRoom getRoom() {
		return this.room;
	}

	@Override
	public void on() {
		this.isOn = true;
	}

	@Override
	public void off() {
		this.isOn = false;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

}
