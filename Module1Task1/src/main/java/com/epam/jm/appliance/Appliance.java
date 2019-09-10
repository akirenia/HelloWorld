/**
 * 
 */
package com.epam.jm.appliance;

/**
 * @author Anna_Kirenia
 *
 */
public abstract class Appliance implements IAppliance {

	String name = "";
	String description = "";
	Integer power = 0;
	String manufacturer = "";
	ApplianceCategory category;

	public Appliance(String name, Integer power, ApplianceCategory category) {
		this.name = name;
		this.power = power;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public ApplianceCategory getCategory() {
		return category;
	}

	public void setCategory(ApplianceCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return name + " " + description;
	}
}
