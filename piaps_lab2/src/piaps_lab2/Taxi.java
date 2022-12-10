package piaps_lab2;

public class Taxi implements AbstractPart {
	String id;
	private static int defaultCapacity = 4;
	private int capacity;

	public Taxi() {
		this.id = "DefaultBusID";
		this.capacity = defaultCapacity;
	}

	public Taxi(int value) {
		this.id = "DefaultBusID";
		this.capacity = value;
	}
	public Taxi(String id, int value) {
		this.id = id;
		this.capacity = value;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public void setCapacity(int value) {
		this.capacity = value;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(String value) {
		// TODO Auto-generated method stub
		this.id = value;
		
	}
}
