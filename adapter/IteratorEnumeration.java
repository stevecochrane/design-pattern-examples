import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {

	Iterator<?> iterator;

	public IteratorEnumeration(Iterator<?> iteration) {
		this.iterator = iterator;
	}

	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	public Object nextElement() {
		return iterator.next();
	}

}
