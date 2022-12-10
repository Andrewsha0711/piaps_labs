package piaps_lab3;

import java.util.ArrayList;

public interface Component {
	public String getId();
	public void setId(String value);
	public Component getParent();
	public void setParent(Component component);
	public ArrayList<Object> getComponents();
	public void setComponents(ArrayList<Object> components);
	public void addComponent(Object component);
	public void removeComponent(Object component);
}
