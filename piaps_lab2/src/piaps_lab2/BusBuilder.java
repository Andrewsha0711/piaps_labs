package piaps_lab2;

import java.util.ArrayList;

public class BusBuilder extends AbstractBuilder {
	// Добавление определенной части
	
	public void addPart(AbstractProduct destination, String instruction) {
		if(instruction == "Bus") {
			int number = this.findCollection(destination, "Bus");
			if(number != -1) {
				// Автобус привязан
			}
			else {
				// Создание коллекции с единственным автобусом
				ArrayList<AbstractPart> bus = new ArrayList<AbstractPart>();
				bus.add(new Bus());
				super.addTypeOfParts(destination, bus);
			}
		}
		if(instruction == "BusPassenger") {
			Passenger passenger = new Passenger("BusTicket");
			int busExists = this.findCollection(destination, "Bus");
			if(busExists == -1) {
				// Автобус не существует
			}
			else {
				Bus bus = (Bus)destination.getParts(busExists).get(0);
				if(bus.getCapacity() == 0) {
					// Автобус заполнен
				}
				else {
					int number = this.findCollection(destination, "Passenger");
					if(number != -1) {
						// Коллекция уже создана
						super.addPart(destination, passenger, number);
						bus.setCapacity(bus.getCapacity() - 1);
					}
					else {
						// Создание коллекции с добавлением
						ArrayList<AbstractPart> passengers = new ArrayList<AbstractPart>();
						passengers.add(passenger);
						super.addTypeOfParts(destination, passengers);
						bus.setCapacity(bus.getCapacity() - 1);
					}
				}
			}
		}
		if(instruction == "BusDriver") {
			int number = this.findCollection(destination, "BusDriver");
			if(number != -1) {
				// Водитель привязан
			}
			else {
				// Создание коллекции с единственным автобусом
				ArrayList<AbstractPart> driver = new ArrayList<AbstractPart>();
				driver.add(new BusDriver());
				super.addTypeOfParts(destination, driver);
			}
		}
	}
}
