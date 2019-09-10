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
public class HomeRoom extends Room implements IHomeRoom {

	private List<HomeAppliance> appliances;

	public HomeRoom(String name) {
		super(name);
		appliances = new ArrayList<HomeAppliance>();
	}

	public HomeRoom(String name, RoomType type) {
		super(name);
		appliances = new ArrayList<HomeAppliance>();
	}

	public Integer getPower() {
		Integer power = 0;
		if (appliances != null) {
			for (HomeAppliance app : appliances) {
				power += app.isOn() ? app.getPower() : 0;
			}
		}
		return power;
	}

	public void assign(HomeAppliance appliance) {
		if (appliance == null)
			throw new IllegalArgumentException("appliance can't be null");
		if (!isAssigned(appliance)) {
			appliances.add(appliance);
			appliance.assign(this);
		}
	}

	public void unassign(HomeAppliance appliance) {
		if (appliance == null)
			throw new IllegalArgumentException("appliance can't be null");
		if (isAssigned(appliance)) {
			appliances.remove(appliance);
			appliance.unassign();
		}
	}

	public void unassignAll() {
		if (appliances != null)
			appliances.clear();
	}

	public boolean isAssigned(HomeAppliance appliance) {

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
