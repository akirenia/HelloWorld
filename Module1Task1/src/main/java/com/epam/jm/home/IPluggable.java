/**
 * 
 */
package com.epam.jm.home;

/**
 * @author Anna_Kirenia
 *
 */
public interface IPluggable {

	public void plugIn(HomeAppliance appliance);

	public void plugOff(HomeAppliance appliance);

	public void plugOffAll();

	public boolean isPlugged(HomeAppliance appliance);
}
