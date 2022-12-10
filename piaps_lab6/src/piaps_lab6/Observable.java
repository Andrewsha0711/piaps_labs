package piaps_lab6;

public interface Observable {
	public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
