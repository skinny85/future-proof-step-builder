package two_required_props;

/**
 * This is the example class that we will be constructing with our Builders.
 * It has a total of 4 properties, 2 of which
 * ({@link #first} and {@link #second})
 * are required.
 *
 * Check out the two_required_props.ExampleUsageTest tests class for examples
 * of how is the Builder used.
 *
 * Later, we will see how this class evolves when we change {@link #first}
 * from required to optional - see {@link two_required_props.evolved.Example}.
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
