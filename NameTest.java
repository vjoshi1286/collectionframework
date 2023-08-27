import java.util.HashSet;
import java.util.TreeSet;

public class NameTest {
    public static void main(String[] args) {

        var arrayListBasedSet = new ArrayListBasedSet<>();
        arrayListBasedSet.add(new Name("same"));
        System.out.println("ArrayListBasedSet=> " + arrayListBasedSet.contains(new Name("same")));

        var hashSet = new HashSet<>();
        hashSet.add(new Name("same"));
        System.out.println("HashSet without hashCode()=> " + hashSet.contains(new Name("same")));

        var arraySet = new ArraySet<>();
        arraySet.add(new Name("same"));
        System.out.println("ArraySet=> " + arraySet.contains(new Name("same")));

        var treeSet = new TreeSet<>();
        treeSet.add(new Name("same"));
        System.out.println("TreeSet=> " + treeSet.contains(new Name("same")));

        var identityHashSet = new IdentityHashSet<Name>();
        identityHashSet.add(new Name("same"));
        System.out.println("IdentityHashSet=> " + identityHashSet.contains(new Name("same")));

    }

}
