package piaps_lab2;

import java.util.ArrayList;

public class Director {
	private int taxiPassengersCount;
	private int busPassengersCount;
	private int taxiCount;
	private int busCount;
	private int taxiDriversCount;
	private int busDriversCount;
	private ArrayList<BusBuilder> busBuilders;
	private ArrayList<TaxiBuilder> taxiBuilders;
	
	public Director(int taxiPassengers, 
			        int busPassengers,
			        int taxi,
			        int bus,
			        int taxiDrivers,
			        int busDrivers,
			        int busBuild,
			        int taxiBuild) 
	{
		this.taxiPassengersCount = taxiPassengers;
		this.busPassengersCount = busPassengers;
		this.taxiCount = taxi;
		this.busCount = bus;
		this.taxiDriversCount = taxiDrivers;
		this.busDriversCount = busDrivers;
		this.busBuilders = new ArrayList<BusBuilder>();
		this.taxiBuilders = new ArrayList<TaxiBuilder>();
		// Создание нужного количества строителей
		for(int i = 0; i < busBuild; i++) {
			this.busBuilders.add(new BusBuilder());
		}
		for(int i = 0; i < taxiBuild; i++) {
			this.taxiBuilders.add(new TaxiBuilder());
		}
	}
	
	public ArrayList<AbstractProduct> getBusProducts() {
		ArrayList<AbstractProduct> busProducts = new ArrayList<AbstractProduct>();
		for(int i = 0; i < this.busCount; i++) {
			busProducts.add(new AbstractProduct());
		}
		BusBuilder builder = this.busBuilders.get(0);
		for(int i = 0; i < busProducts.size(); i++) {
			if(this.busCount != 0) {
				builder.addPart(busProducts.get(i), "Bus");
				this.busCount--;
			}
			if(this.busDriversCount != 0) {
				builder.addPart(busProducts.get(i), "BusDriver");
				this.busDriversCount --;
			}
			for(int j = 0; j < 30; j++) {
				if(this.busPassengersCount != 0) {
					builder.addPart(busProducts.get(i), "BusPassenger");
					this.busPassengersCount --;
				}
			}
		}
		return busProducts;
	}
	public ArrayList<AbstractProduct> getTaxiProducts() {
		ArrayList<AbstractProduct> products = new ArrayList<AbstractProduct>();
		for(int i = 0; i < this.taxiCount; i++) {
			products.add(new AbstractProduct());
		}
		TaxiBuilder builder = this.taxiBuilders.get(0);
		for(int i = 0; i < products.size(); i++) {
			if(this.taxiCount != 0) {
				builder.addPart(products.get(i), "Taxi");
				this.taxiCount--;
			}
			if(this.taxiDriversCount != 0) {
				builder.addPart(products.get(i), "TaxiDriver");
				this.taxiDriversCount --;
			}
			for(int j = 0; j < 4; j++) {
				if(this.taxiPassengersCount != 0) {
					builder.addPart(products.get(i), "TaxiPassenger");
					this.taxiPassengersCount --;
				}
			}
		}
		return products;
	}
	public void getResult() {
		ArrayList<AbstractProduct> products = this.getBusProducts();
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getInfo());
		}
		products = this.getTaxiProducts();
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getInfo());
		}
	}

}
