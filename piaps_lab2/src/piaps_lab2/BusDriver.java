package piaps_lab2;

public class BusDriver implements AbstractPart {
	private String id;
	private String license;
	
	public BusDriver() {
		this.id = "DefaultBusDriverID";
	}
	public BusDriver(String id) {
		this.id = id;
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
