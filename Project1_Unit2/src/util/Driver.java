/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 */
package util;

import adapter.*;
import model.*;

public class Driver {

	public static void main(String[] args) {
		
		/*
		 * Test interface
		 */
		BuildAuto auto = new BuildAuto();
		auto.buildAuto("src/data1.txt");
		auto.buildAuto("src/data2.txt");
		
		System.out.println();
		System.out.println("Print the first model:");
		auto.printAuto("Wagon ZTW");
		
		System.out.println();
		System.out.println("Change option price and name");
		
		auto.updateOptionPrice("Wagon ZTW", "Transmission", "Automatic", 1000);
		auto.updateOptionSetName("Wagon ZTW", "Transmission", "AHHHHHHHH");
		System.out.println();
		System.out.println("Print the first model after the change:");

		auto.printAuto("Wagon ZTW");
		System.out.println();
		System.out.println("Print the second model:");

		auto.printAuto("Wagon XYZ");
		
		
		
		/*
		 * Test setOptionChoice and getOptionChoice
		 */
		System.out.println();
		Automobile FordZTW = new Automobile();
		FileIO fio = new FileIO();
		FordZTW = fio.buildAutoObject("src/data1.txt");
		FordZTW.setOptionChoice("Side Impact Air Bags", "Selected");
		FordZTW.setOptionChoice("Color", "Infra-Red Clearcoat");
		FordZTW.setOptionChoice("Transmission", "Standard");
		FordZTW.setOptionChoice("Brakes/Traction Control", "ABS with Advance Trac");
		
		
		
		System.out.println("Option choice for Air Bags: " + FordZTW.getOptionChoice("Side Impact Air Bags"));
		System.out.println("Option choice for Color: " + FordZTW.getOptionChoice("Color"));
		System.out.println("Get option price for Air Bags: " + FordZTW.getOptionChoicePrice("Side Impact Air Bags"));
		System.out.println("Get total price: " + FordZTW.getTotalPrice());
	}

}
