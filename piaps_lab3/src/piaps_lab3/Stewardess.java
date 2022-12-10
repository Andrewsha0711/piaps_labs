package piaps_lab3;

public class Stewardess implements Primitive{
	private String id;
	private Component parent;
	
	public Stewardess() {
		this.id = "DefaultPilotId";
	}
	public Stewardess(String id) {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stewardess " + this.id;
	}

}
