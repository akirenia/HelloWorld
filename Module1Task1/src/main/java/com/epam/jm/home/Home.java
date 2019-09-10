/**
 * 
 */
package com.epam.jm.home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anna_Kirenia
 *
 */
public class Home implements IHome, IPowered {

	private String name = "";
	private List<HomeRoom> rooms = new ArrayList<HomeRoom>();

	public Home(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<HomeRoom> getRooms() {
		return this.rooms;
	}

	@Override
	public HomeRoom getRoomByName(String name) {

		for (HomeRoom room : this.rooms) {
			if (room.getName().equalsIgnoreCase(name))
				return room;
		}
		return null;
	}

	@Override
	public List<HomeRoom> getRoomsByType(String type) {

		return rooms.stream().filter(v -> v.getType().name().equalsIgnoreCase(type)).collect(Collectors.toList());
	}

	@Override
	public HomeAppliance getApplianceByName(String name) {
		for (HomeRoom room : this.rooms) {
			HomeAppliance app = room.getApplianceByName(name);
			if (app != null)
				return app;
		}
		return null;
	}

	@Override
	public void addRoom(HomeRoom room) {

		this.rooms.add(room);
	}

	@Override
	public void removeRoom(HomeRoom room) {
		this.rooms.remove(room);
	}

	@Override
	public Integer getPossiblePower() {

		Integer power = 0;
		for (HomeRoom room : rooms) {
			power += room.getPossiblePower();
		}
		return power;
	}

	@Override
	public Integer getPower() {

		Integer power = 0;
		for (HomeRoom room : rooms) {
			power += room.getPower();
		}
		return power;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer("Home name: " + name);
		rooms.forEach(v -> {
			sb.append("\n Home room: " + v.getName());
		});
		return sb.toString();
	}

	public boolean equals(Home home) {
		return this.getName().equalsIgnoreCase(home.getName());
	}
}
