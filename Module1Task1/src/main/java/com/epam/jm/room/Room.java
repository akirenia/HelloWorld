/**
 * 
 */
package com.epam.jm.room;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna_Kirenia
 *
 */
public class Room {

	private static Integer roomIdCounter = 0;

	private Integer roomId = 0;
	private String name = "";
	private RoomType type;

	public Room(String name) {
		roomIdCounter++;
		this.roomId = roomIdCounter;
		this.name = name;
		this.type = RoomType.Kitchen;
	}

	public Room(String name, RoomType type) {
		roomIdCounter++;
		this.name = name;
		this.type = type;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer("Room:: ");

		sb.append(" name: " + name);
		sb.append(";type: " + type);

		return sb.toString();
	}

	public boolean equals(Room room) {
		return this.getName().equalsIgnoreCase(room.getName());
	}

}
