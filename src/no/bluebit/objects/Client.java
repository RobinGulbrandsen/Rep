package no.bluebit.objects;

import no.bluebit.pojo.Cab;
import no.bluebit.pojo.Car;

public class Client {
	
	public static void main(String[] args) {
		Car c = new Car("bl�", 42, "Lada", false);
		Car c2 = new Car();
		Car c3 = new Car("r�d");
		c3.setColor("svart");
		
		Cab taxi = new Cab();
		
	}

}
