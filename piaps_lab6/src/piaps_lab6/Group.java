package piaps_lab6;

import java.util.ArrayList;

public class Group implements Observable{
	public String[] info;
	private ArrayList<Observer> observers;
	
	public Group(String groupId) {
		super();
		this.info = new String[2];
		this.info[0] = groupId;
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.observers.size(); i++) {
			this.observers.get(i).update(info);
		}
	}
}
