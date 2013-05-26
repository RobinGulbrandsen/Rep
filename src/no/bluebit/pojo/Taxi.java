package no.bluebit.pojo;

public abstract class Taxi extends Car {

	public abstract boolean gotMoney();
	
	public void isRunning() {
		System.out.println("I am driving!");
	}
}
