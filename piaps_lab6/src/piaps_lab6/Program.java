package piaps_lab6;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Group group1 = new Group("ПИН-32");
		Group group2 = new Group("ПИН-33");
		Group group3 = new Group("ПИН-34");
		group3.info[1] = "Овчинников - 2";
		
		GroupObserver obs1 = new GroupObserver();
		GroupObserver obs2 = new GroupObserver();
		GroupObserver obs3 = new GroupObserver();
		group1.registerObserver(obs1);
		group2.registerObserver(obs2);
		group3.registerObserver(obs3);
		
		group1.notifyObservers();
		group2.notifyObservers();
		group3.notifyObservers();
		
		Faculty faculty = new Faculty();
		
		obs1.registerObserver(faculty);
		obs2.registerObserver(faculty);
		obs3.registerObserver(faculty);
		
		obs1.notifyObservers();
		obs2.notifyObservers();
		obs3.notifyObservers();
		
		System.out.println(faculty.info);
		
		group2.removeObserver(obs2);
		
	}

}
