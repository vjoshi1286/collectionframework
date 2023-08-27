import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasedSet<E> extends AbstractSet<E> {
    private final ArrayList<E> arrayList;

    public ArrayListBasedSet() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public boolean add(E element) {
        if (contains(element)) {
            return false;
        }
        arrayList.add(element);
        return true;
    }

    @Override
    public boolean contains(final Object element) {
        for (final E e : arrayList) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation not implemented");
    }

    @Override
    public int size() {
        return arrayList.size();
    }

}
