import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

	ArrayList<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();

		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();

		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	public void notifyObservers() {}

}
