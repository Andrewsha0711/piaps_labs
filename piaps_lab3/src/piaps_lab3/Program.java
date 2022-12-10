package piaps_lab3;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Object> parts = new ArrayList<Object>();
		for(int i = 0; i<3; i++) {
			parts.add(new FirstClass());
			parts.add(new BusinessClass());
			parts.add(new EconomyClass());
		}
		for(int i = 0; i<6; i++) {
			parts.add(new Pilot());
		}
		for(int i = 0; i<18; i++) {
			parts.add(new Stewardess());
		}
		for(int i = 0; i<500; i++) {
			parts.add(new Passenger("pass-" + String.valueOf(i),50,"EconomyClass"));
		}
		Object[] result = new Controller().getPlane(parts);
		ArrayList<Object> plane = (ArrayList<Object>)result[0];
		for(int i = 0; i<plane.size(); i++) {
			if(plane.get(i) instanceof Composite) {
				((Composite)plane.get(i)).removeComponent("pass-4");
			}
		}
		System.out.println(result[0]);
		System.out.println("Нераспределенные объекты");
		System.out.println(result[1]);
	}

}
