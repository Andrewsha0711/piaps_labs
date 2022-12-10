package piaps_lab3;

import java.util.ArrayList;

public abstract class Composite implements Component {
    private String id;
	private Component parent;
	private ArrayList<Object> components;

	public Composite() {
		this.id = "DefaultId";
	}

	public Composite(String idValue) {
		this.id = idValue;
	}

	public Composite(ArrayList<Object> components) {
		this.id = "DefaultId";
		this.components = components;
	}

	public Composite(String idValue, ArrayList<Object> components) {
		this.id = idValue;
		this.components = components;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public Component getParent() {
		return this.parent;
	}

	public void setParent(Component component) {
		this.parent = component;
	}

	public ArrayList<Object> getComponents() {
		return this.components;
	}

	public void setComponents(ArrayList<Object> components) {
		this.components = components;
	}

	public void addComponent(Object component) {
		if (this.components == null) {
			this.components = new ArrayList<Object>();
		}
		if (component instanceof Component) {
			this.components.add((Component) component);
			((Component)(this.components.get(this.components.indexOf(component)))).setParent(this);
			//((Component) component).setParent(this);
		} else {
			this.components.add((Primitive) component);
			((Primitive)(this.components.get(this.components.indexOf(component)))).setParent(this);
			//((Primitive) component).setParent(this);
		}
	}

	public void removeComponent(Object component) {
		if (this.components != null) {
			for (int i = 0; i < this.components.size(); i++) {
				if (this.components.get(i).equals(component)) {
					if (this.components.get(i) instanceof Primitive) {
						this.components.remove(i);
					}
					if (this.components.get(i) instanceof Component) {
						Component comp = (Component) this.components.get(i);
						for (int j = 0; j < comp.getComponents().size(); j++) {
							comp.removeComponent(comp.getComponents().get(j));
						}
					}
				}
			}
		}
	}

	public void removeComponent(String id) {
		if (this.components != null) {
			for (int i = 0; i < this.components.size(); i++) {
				if (this.components.get(i) instanceof Primitive) {
					Primitive pr = (Primitive) this.components.get(i);
					if (pr.getId().equals(id)) {
						this.components.remove(i);
					}
				}
				if (this.components.get(i) instanceof Component) {
					Component comp = (Component) this.components.get(i);
					if (comp.getId().equals(id)) {
						for (int j = 0; j < comp.getComponents().size(); j++) {
							comp.removeComponent(comp.getComponents().get(j));
						}
					}
				}
			}
		}
	}

	public String toString() {
		String info = this.getClass().getSimpleName() + " " + this.id + "\n ";
		if (this.components != null) {
			info += this.components.toString();
		}
		return info;
	}
}
