/**
 * 
 */
package com.epam.jm.appliance;

/**
 * @author Anna_Kirenia
 *
 */
public interface IAppliance {

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public Integer getPower();

	public void setPower(Integer power);

	public String getManufacturer();

	public void setManufacturer(String manufacturer);

	public ApplianceCategory getCategory();

	public void setCategory(ApplianceCategory category);
}
