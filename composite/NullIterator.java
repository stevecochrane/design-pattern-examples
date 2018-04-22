import java.util.Iterator;

public class NullIterator implements <MenuComponent> {

	public Object next() {
		return null;
	}

	public boolean hasNext() {
		return false;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
