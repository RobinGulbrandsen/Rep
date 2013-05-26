package no.bluebit.objects;

import no.bluebit.pojo.Cab;
import no.bluebit.pojo.Car;

public class Client {
	
	public static void main(String[] args) {
		Car c = new Car("blå", 42, "Lada", false);
		Car c2 = new Car();
		Car c3 = new Car("rød");
		c3.setColor("svart");
		
		Cab taxi = new Cab();
		
	}

}
