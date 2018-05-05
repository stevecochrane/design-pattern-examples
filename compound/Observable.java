import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

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
		Iterator iterator = observers.iterator();

		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
