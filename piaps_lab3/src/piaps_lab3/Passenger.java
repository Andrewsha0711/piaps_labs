package piaps_lab3;

public class Passenger implements Primitive{
	private String id;
	private double bag;
	private String ticket;
	private Component parent;
	
	public Passenger() {
		this.id = "DefaultPassengerId";
		this.bag = 0;
	}
	public Passenger(String id, int bag, String ticket) {
		this.id = id;
		this.bag = bag;
		this.ticket = ticket;
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

	@Override
	public Component getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	@Override
	public void setParent(Component component) {
		// TODO Auto-generated method stub
		this.parent = component;
	}
	public double getBag() {
		return this.bag;
	}
	public String getTicket() {
		return this.ticket;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Passenger " + this.id + " bag: " + this.bag;
	}
}
