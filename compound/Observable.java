import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable (QuackObservable duck) {
		this.duck = duck;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();

		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}

	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}

}
