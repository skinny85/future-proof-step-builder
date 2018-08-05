package two_required_props;

/**
 * This is the example class that we will be constructing with our Builders.
 * It has a total of 4 properties.
 * <p>
 * At first, 2 of them ({@link #first} and {@link #second})
 * will be required. Later, we will change things up,
 * and simulate "evolving" the API by changing {@link #first}
 * from required to optional, and see our Builders retain backwards compatibility.
 * <p>
 * There are 2 future-proof Step Builder variants:
 * the {@link two_required_props.ExampleBuilder static factory method variant},
 * and the {@link two_required_props.interfaces_variant.ExampleBuilder interfaces variant}.
 * Both achieve type-safety
 * (you cannot build the instance before providing all of the required properties),
 * and do so with a single Builder instance
 * (there is no copying involved when setting the properties,
 * so no memory usage penalty for using these over regular, unsafe, Builders)
 * while allowing you to evolve the API by changing properties from required to optional -
 * they just vary in the trade-offs they make.
 * See the respective Builders for the details of these trade-offs.
 * <p>
 * Check out the test folder for examples of using the various Builders.
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
