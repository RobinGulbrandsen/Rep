package no.bluebit.pojo;

public class Car {

	private String color;
	private int regNr;
	private String brand;
	private boolean hasEngine;
	
	public Car() {
		this("unknown", 0, "unknown", false);
	}
	
	public Car(String color) {
		this(color, 0, "unknown", false);
	}
	
	public Car(int regNr) {
		this.regNr = regNr;
	}
	
	public Car(String color, int regNr, String brand, boolean hasEngine) {
		setColor(color);
		setRegNr(regNr);
		setBrand(brand);
		setHasEngine(hasEngine);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setRegNr(int regNr) {
		if(regNr > 0) {
			this.regNr = regNr;
		} else {
			this.regNr = 0;
		}
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getRegNr() {
		return regNr;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public boolean hasEngine() {
		return hasEngine;
	}
	
	
	
	
}
