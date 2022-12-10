package piaps_lab6;

import java.util.ArrayList;

public class GroupObserver implements Observer, Observable{
	private String status;
	private ArrayList<Observer> observers;
	
	public GroupObserver() {
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		if(object instanceof String[]) {
			String[] info = (String[])object;
			if(info != null) {
				if(info.length == 2) {
					if(info[0] != null && info[1] == null) {
						this.status = "Успеваемость группы " + info[0].toString() + " не заполнена";
					}
				}
			}
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
			this.observers.get(i).update(status);
		}
	}
	
}
