/**
 * 
 */
package com.epam.jm.home;

import java.util.List;

/**
 * @author Anna_Kirenia
 *
 */
public interface IHome {

	public String getName();

	public void setName(String name);

	public void addRoom(HomeRoom room);

	public void removeRoom(HomeRoom room);

	public List<HomeRoom> getRooms();

	public HomeRoom getRoomByName(String name);

	public List<HomeRoom> getRoomsByType(String type);

	public HomeAppliance getApplianceByName(String name);

	public Integer getPower();
}
