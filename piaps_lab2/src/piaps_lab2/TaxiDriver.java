package piaps_lab2;

public class TaxiDriver implements AbstractPart {

	private String id;
	private String license;
	
	public TaxiDriver() {
		this.id = "DefaultBusDriverID";
	}
	public TaxiDriver(String id) {
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
