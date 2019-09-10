/**
 * 
 */
package com.epam.jm.home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.epam.jm.room.Room;
import com.epam.jm.room.RoomType;

/**
 * @author Anna_Kirenia
 *
 */
public class HomeRoom extends Room implements IHomeRoom, IPluggable, IPowered {

	private List<HomeAppliance> appliances = new ArrayList<HomeAppliance>();

	public HomeRoom(String name) {
		super(name);
	}

	public HomeRoom(String name, RoomType type) {
		super(name);
	}

	public Integer getPossiblePower() {
		Integer power = 0;
		for (HomeAppliance app : appliances) {
			power += app.getPossiblePower();
		}
		return power;
	}

	public Integer getPower() {
		Integer power = 0;
		for (HomeAppliance app : appliances) {
			power += app.getPower();
		}
		return power;
	}

	public void plugIn(HomeAppliance appliance) {
		if (appliance == null)
			throw new IllegalArgumentException("appliance can't be null");
		if (!isPlugged(appliance)) {
			appliances.add(appliance);
			appliance.plugIn(this);
		}
	}

	public void plugOff(HomeAppliance appliance) {
		if (appliance == null)
			throw new IllegalArgumentException("appliance can't be null");
		if (isPlugged(appliance)) {
			appliances.remove(appliance);
			appliance.plugOff();
		}
	}

	public void plugOffAll() {

		appliances.clear();
	}

	public boolean isPlugged(HomeAppliance appliance) {

		return appliances.contains(appliance);
	}

	public HomeAppliance getApplianceByName(String name) {

		for (HomeAppliance app : this.appliances) {
			if (app.getName().equalsIgnoreCase(name))
				return app;
		}
		return null;
	}

	public List<HomeAppliance> getAppliancesByManufacturer(String manufacturer) {

		return appliances.stream().filter(v -> v.getManufacturer().equalsIgnoreCase(manufacturer))
				.collect(Collectors.toList());
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer("Room:: ");

		sb.append(" name: " + getName());
		sb.append(";type: " + getType());
		if (appliances != null)
			appliances.forEach(v -> sb.append(";appliance: " + v.toString()));

		return sb.toString();
	}

}
