package client;

import processes.GeneralProcessManufacturing;
import processes.LaptopProcessManufacturing;
import processes.SmartphoneProcessManufacturing;

public class App {
	public static void main(String[] args) {
		GeneralProcessManufacturing spm = new SmartphoneProcessManufacturing("Iphone process");
		GeneralProcessManufacturing lpm = new LaptopProcessManufacturing("Monster laptop process");
		
		spm.process();
		lpm.process();
	}
}
