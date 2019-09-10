/**
 * 
 */
package com.epam.jm.home;

/**
 * @author Anna_Kirenia
 *
 */
public interface IHomeAppliance extends IPluggable {

	public boolean isAssigned();

	public HomeRoom getRoom();

}
