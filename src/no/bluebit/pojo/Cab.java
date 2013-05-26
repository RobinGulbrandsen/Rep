package no.bluebit.pojo;

public class Cab extends Taxi implements ICab {

	private boolean isFree;

	public Cab() {
		super();
		setTaken(false);
	}

	public Cab(String color, int regNr, String brand, boolean hasEngine,
			boolean isFree) {
		//super(color, regNr, brand, hasEngine);
		setTaken(isFree);
	}

	public void setTaken(boolean isFree) {
		this.isFree = isFree;
	}

	public boolean isFree() {
		return isFree;
	}

	@Override
	public int getMoneyFromMe() {
		System.out.println("take my money!");
		return 0;
	}

	@Override
	public boolean gotMoney() {
		// TODO Auto-generated method stub
		return false;
	}
}
