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
		
		
		Automobile a1 = new Automobile();
		
	}

}
