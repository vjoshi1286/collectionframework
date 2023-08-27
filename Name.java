public class Name implements Comparable<Name> {
    private final String siteName;

    public Name(final String siteName) {
        this.siteName = siteName;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Name
               && ((Name) obj).siteName.equals(this.siteName);
    }

    @Override
    public int hashCode() {
        return siteName.hashCode();
    }

    @Override
    public int compareTo(final Name o) {
        return this.siteName.compareTo(o.siteName);
    } //0
}
