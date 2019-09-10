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

	public HomeAppliance getApplianceByName(String name);

	public List<HomeAppliance> getAppliancesByManufacturer(String manufacturer);

}
