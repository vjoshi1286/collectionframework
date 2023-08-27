import java.util.AbstractSet;
import java.util.Iterator;

public class ArraySet<E> extends AbstractSet<E> {
    public static final int DEFAULT_CAPACITY = 100;
    private final E[] elements;
    private int size;

    public ArraySet() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(final E element) {
        for (int i = 0; i < size; i++) {
            final E elem = elements[i];
            if (elem.equals(element)) {
                return false;
            }
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean contains(final Object element) {
        for (int i = 0; i < size; i++) {
            final E elem = elements[i];
            if (elem.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public int size() {
        return size;
    }


}
