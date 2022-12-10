package piaps_lab2;

import java.util.ArrayList;

public class TaxiBuilder extends AbstractBuilder {
	public void addPart(AbstractProduct destination, String instruction) {
		if(instruction == "Taxi") {
			int number = this.findCollection(destination, "Taxi");
			if(number != -1) {
				// Автобус привязан
			}
			else {
				// Создание коллекции с единственным автобусом
				ArrayList<AbstractPart> taxi = new ArrayList<AbstractPart>();
				taxi.add(new Taxi());
				super.addTypeOfParts(destination, taxi);
			}
		}
		if(instruction == "TaxiPassenger") {
			Passenger passenger = new Passenger("TaxiTicket");
			int carExists = this.findCollection(destination, "Taxi");
			if(carExists == -1) {
				// Такси не существует
			}
			else {
				Taxi taxi = (Taxi)destination.getParts(carExists).get(0);
				if(taxi.getCapacity() == 0) {
					// Такси заполнено
				}
				else {
					int number = this.findCollection(destination, "Passenger");
					if(number != -1) {
						// Коллекция уже создана
						super.addPart(destination, passenger, number);
						taxi.setCapacity(taxi.getCapacity() - 1);
					}
					else {
						// Создание коллекции с добавлением
						ArrayList<AbstractPart> passengers = new ArrayList<AbstractPart>();
						passengers.add(passenger);
						super.addTypeOfParts(destination, passengers);
						taxi.setCapacity(taxi.getCapacity() - 1);
					}
				}
			}
		}
		if(instruction == "TaxiDriver") {
			int number = this.findCollection(destination, "TaxiDriver");
			if(number != -1) {
				// Водитель привязан
			}
			else {
				// Создание коллекции с единственным автобусом
				ArrayList<AbstractPart> driver = new ArrayList<AbstractPart>();
				driver.add(new TaxiDriver());
				super.addTypeOfParts(destination, driver);
			}
		}
	}
}
