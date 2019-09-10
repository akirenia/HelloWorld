/**
 * 
 */
package com.epam.jm;

import com.epam.jm.home.Dishwasher;
import com.epam.jm.home.Freezer;
import com.epam.jm.home.Home;
import com.epam.jm.home.HomeAppliance;
import com.epam.jm.home.HomeRoom;
import com.epam.jm.room.RoomType;

/**
 * @author Anna_Kirenia
 *
 */
public class Runner {

	public static void main(String[] args) {

		Home home = new Home("Home1");
		System.out.println(home.getPower());

		HomeRoom room1 = new HomeRoom("Room1", RoomType.Kitchen);
		HomeRoom room2 = new HomeRoom("Room2", RoomType.Kitchen);
		HomeRoom room3 = new HomeRoom("Room3", RoomType.Kitchen);
		HomeRoom room4 = new HomeRoom("Room4", RoomType.Badroom);
		System.out.println("1:" + room4.getPower());

		HomeAppliance app1 = new Dishwasher("App1", 1);
		app1.setManufacturer("SONY");
		HomeAppliance app2 = new Dishwasher("App2", 10);
		System.out.println("2:" + home.getPower());
		app1.on();
		app2.on();
		System.out.println("3:" + home.getPower());

		Dishwasher app3 = new Dishwasher("App3", 100);
		Freezer app4 = new Freezer("App4", 1000);

		room1.plugIn(app1);
		room2.plugIn(app2);
		room3.plugIn(app3);
		room4.plugIn(app4);
		System.out.println("4:" + home.getPower());

		home.addRoom(room1);
		home.addRoom(room2);
		home.addRoom(room3);
		home.addRoom(room4);

		app1.off();
		app2.on();

		System.out.println("6:" + home.getPower());

		app1.on();
		app2.on();
		app3.on();
		app4.on();

		System.out.println("7:" + home.getPossiblePower());
		System.out.println("7:" + home.getPower());
		System.out.println("7:" + home.toString());
		home.removeRoom(room3);
		System.out.println("8:" + home.getPossiblePower());
		System.out.println("8:" + home.getPower());
		System.out.println("8:" + home.toString());
		home.removeRoom(room1);
		room2.plugOff(app2);
		app4.off();
		System.out.println("9:" + home.getPossiblePower());
		System.out.println("9:" + home.getPower());
		System.out.println("9:" + home.toString());
		room2.plugIn(app2);
		System.out.println("10:" + home.getPossiblePower());
		System.out.println("10:" + home.getPower());
		System.out.println("10:" + home.toString());

		System.out.println("11:" + home.getRoomByName("room2").getRoomId());

		System.out.println("12:" + home.getRoomByName("room4").getAppliancesByManufacturer("SONY").toString());
		System.out.println("13:" + home.getApplianceByName("App4").getRoom().getName());

	}

}
