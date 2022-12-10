package piaps_lab2;

public class Bus implements AbstractPart{
	String id;
	private static int defaultCapacity = 30;
	private int capacity;

	public Bus() {
		this.id = "DefaultBusID";
		this.capacity = defaultCapacity;
	}

	public Bus(int value) {
		this.id = "DefaultBusID";
		this.capacity = value;
	}
	public Bus(String id, int value) {
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
