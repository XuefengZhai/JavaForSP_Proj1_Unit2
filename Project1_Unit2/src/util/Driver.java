/*
 * Xuefeng Zhai
 * xzhai@cmu.edu
 */
package util;

import adapter.*;
import model.*;

public class Driver {

	public static void main(String[] args) {
		
		BuildAuto auto = new BuildAuto();

		auto.buildAuto("src/data1.txt");

		auto.buildAuto("src/data2.txt");


		auto.printAuto("Wagon ZTW");
		
		auto.updateOptionPrice("Wagon ZTW", "Transmission", "Automatic", 1000);
		auto.updateOptionSetName("Wagon ZTW", "Transmission", "AHHHHHHHH");
		auto.printAuto("Wagon ZTW");	
		auto.printAuto("Wagon XYZ");
		
		
		Automobile FordZTW = new Automobile();
		FileIO fio = new FileIO();
		FordZTW = fio.buildAutoObject("src/data1.txt");
		FordZTW.setOptionChoice("Side Impact Air Bags", "Selected");
		System.out.println(FordZTW.getOptionChoice("Side Impact Air Bags"));
		System.out.println(FordZTW.getOptionChoicePrice("Side Impact Air Bags"));
		System.out.println(FordZTW.getTotalPrice());

		
	}

}
