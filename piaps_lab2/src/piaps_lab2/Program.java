package piaps_lab2;

public class Program {

	public static void main(String[] args) {
		int taxiPassengers = 50;
        int busPassengers = 50;
        int taxi = 5;
        int bus = 5;
        int taxiDrivers = 5;
        int busDrivers = 5;
        int busBuild = 5;
        int taxiBuild = 5;
        
        Director director = new Director(50,50,5,5,5,5,5,5);
        director.getResult();

	}

}
