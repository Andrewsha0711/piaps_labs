package piaps_lab2;

public class Passenger implements AbstractPart {
	private String id;
	private String ticket;

	public Passenger(String ticket) {
		this.id = "DefaultPassengerID";
		this.ticket = ticket;
	}

	public Passenger(String id, String ticket) {
		this.id = id;
		this.ticket = ticket;
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String value) {
		this.ticket = value;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String value) {
		// TODO Auto-generated method stub

	}

}
