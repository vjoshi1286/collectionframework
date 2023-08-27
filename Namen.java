import java.util.HashSet;
import java.util.IdentityHashMap;

public class Namen {
    public int id;

    @Override
    public boolean equals(final Object o) {
        return o instanceof Namen && (((Namen) o).id == id);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(final String[] array) {
        final IdentityHashMap<Namen, String> identityMap = new IdentityHashMap<>();

        Namen a = new Namen(); //100
        a.id = 7;

        Namen b = new Namen(); //200
        b.id = 8;

        identityMap.put(a, "test"); //100
        identityMap.put(b, "test");//200

        a.id = 9;
        identityMap.put(a, "test"); // 100

        System.out.println(identityMap);
        System.out.println(identityMap.size());


        final HashSet<Namen> hashSet = new HashSet<>();

        Namen a1 = new Namen();
        a1.id = 7;

        Namen b1 = new Namen();
        b1.id = 8;

        hashSet.add(a1);
        hashSet.add(b1);

        a1.id = 9;
        hashSet.add(a1);
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
