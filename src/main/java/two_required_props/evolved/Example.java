package two_required_props.evolved;

/**
 * This is the continuation of the {@link two_required_props.Example} example -
 * now, we are changing the class to make {@link #first} no longer required,
 * but optional. The other properties remain the same
 * ({@link #second} is still required, {@link #third} and {@link #fourth} are still optional).
 */
public final class Example {
    public final String first;
    public final int second;
    public final boolean third;
    public final char fourth;

    public Example(String first, int second, boolean third, char fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
}
