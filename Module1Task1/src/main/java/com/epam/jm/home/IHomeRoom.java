/**
 * 
 */
package com.epam.jm.home;

import java.util.List;

/**
 * @author Anna_Kirenia
 *
 */
public interface IHomeRoom {

	public Integer getPower();

	public void assign(HomeAppliance appliance);

	public void unassign(HomeAppliance appliance);

	public void unassignAll();

	public boolean isAssigned(HomeAppliance appliance);

	public HomeAppliance getApplianceByName(String name);

	public List<HomeAppliance> getAppliancesByManufacturer(String manufacturer);

}
