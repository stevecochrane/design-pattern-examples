import java.util.Observer;

public interface QuackObservable {

	public void registerObserver(Observer observer);
	public void notifyObservers();

}
