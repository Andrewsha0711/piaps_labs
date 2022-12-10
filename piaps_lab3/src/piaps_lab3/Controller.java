package piaps_lab3;

import java.util.ArrayList;

public class Controller {
	public Object[] getPlane(ArrayList<Object> resources){
		ArrayList<Object> objects = new ArrayList<Object>();
	 	objects.addAll(resources);
		ArrayList<Object> plane = new ArrayList<Object>();
        AirplaneClass fClass = null, bClass = null, eClass = null;
		int pilots = 0;
		int stewardess = 0;
		for(int i = 0; i < resources.size(); i++) {
			if(resources.get(i) instanceof AirplaneClass) {
				if(resources.get(i) instanceof FirstClass) {
					if(fClass == null) {
						fClass = (FirstClass)resources.get(i);
						objects.remove(resources.get(i));
					}
				}
				if(resources.get(i) instanceof BusinessClass) {
					if(bClass == null) {
						bClass = (BusinessClass)resources.get(i);
						objects.remove(resources.get(i));
					}
				}
				if(resources.get(i) instanceof EconomyClass) {
					if(eClass == null) {
						eClass = (EconomyClass)resources.get(i);
						objects.remove(resources.get(i));
					}
				}
				if(fClass != null && bClass != null && eClass != null) {
					break;
				}
			}
		}
		for(int i = 0; i < resources.size(); i++) {
			if(resources.get(i) instanceof Pilot) {
				if(pilots < 2) {
					plane.add(new Pilot(String.valueOf(pilots)));
					pilots ++;
					objects.remove(resources.get(i));
				}
			}
			if(resources.get(i) instanceof Stewardess) {
				if(stewardess < 6) {
					plane.add(new Stewardess(String.valueOf(stewardess)));
					stewardess ++;
					objects.remove(resources.get(i));
				}
			}
			if(resources.get(i) instanceof Passenger) {
				Passenger person = (Passenger)(resources.get(i));
				if(person.getTicket().equals("FirstClass")) {
					if(fClass != null) {
						if(fClass.getComponents() == null || fClass.getComponents().size() < 10) {
							fClass.addComponent(person);
							objects.remove(resources.get(i));
						}
					}
				}
				if(person.getTicket().equals("BusinessClass")) {
					if(bClass != null) {
						if(bClass.getComponents() == null || bClass.getComponents().size() < 20) {
							bClass.addComponent(person);
							objects.remove(resources.get(i));
						}
					}
				}
				if(person.getTicket().equals("EconomyClass")) {
					if(eClass != null) {
						if(eClass.getComponents() == null || eClass.getComponents().size() < 50) {
							eClass.addComponent(person);
							objects.remove(resources.get(i));
						}
					}
				}
			}
		}
		plane.add(fClass);
		plane.add(bClass);
		plane.add(eClass);
		Object[] result = new Object[2];
		result[0] = plane;
		result[1] = objects;
		return result;
	}
	
}
