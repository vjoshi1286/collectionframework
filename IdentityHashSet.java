import java.util.AbstractSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

public class IdentityHashSet<E> extends AbstractSet<E> {

    private static final Object DUMMY = new Object();
    private final IdentityHashMap<E, Object> identityHashMap;

    public IdentityHashSet() {
        this.identityHashMap = new IdentityHashMap<>();
    }

    @Override
    public boolean add(final E element) {
        identityHashMap.put(element, DUMMY);
        return true;
    }

    @Override
    public boolean contains(final Object element) {
        return identityHashMap.containsKey((E) element);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation not implemented");
    }

    @Override
    public int size() {
        return identityHashMap.size();
    }
}
