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
public class Home implements IHome {

	private String name;
	private List<HomeRoom> rooms;

	public Home(String name) {
		this.name = name;
		this.rooms = new ArrayList<HomeRoom>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<HomeRoom> getRooms() {
		return this.rooms;
	}

	public HomeRoom getRoomByName(String name) {

		for (HomeRoom room : this.rooms) {
			if (room.getName().equalsIgnoreCase(name))
				return room;
		}
		return null;
	}

	public List<HomeRoom> getRoomsByType(String type) {

		return rooms.stream().filter(v -> v.getType().name().equalsIgnoreCase(type)).collect(Collectors.toList());
	}

	public HomeAppliance getApplianceByName(String name) {
		for (HomeRoom room : this.rooms) {
			HomeAppliance app = room.getApplianceByName(name);
			if (app != null)
				return app;
		}
		return null;
	}

	public void addRoom(HomeRoom room) {
		if (this.rooms == null)
			this.rooms = new ArrayList<HomeRoom>();

		this.rooms.add(room);
	}

	public void removeRoom(HomeRoom room) {
		if (this.rooms != null)
			this.rooms.remove(room);
	}

	public Integer getPower() {

		Integer power = 0;
		if (rooms != null) {
			for (HomeRoom room : rooms) {
				power += room.getPower();
			}
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
