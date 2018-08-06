package two_required_props.static_fact_meth_variant;

import two_required_props.Example;
import two_required_props.static_fact_meth_variant.ExampleBuilderInterfaces.FinalBuilderInterf;
import two_required_props.static_fact_meth_variant.ExampleBuilderInterfaces.BuilderInterf;

/**
 * The 'static factory method' variant of the future-proof Step Builder implementation,
 * for the {@link Example} class with 2 required properties.
 * <p>
 * In this variant, we generate only 2 interfaces,
 * regardless of how many required properties does the target class have
 * (see {@link ExampleBuilderInterfaces} if you want to know what those interfaces look like).
 * However, that frugality comes with one downside:
 * the return type of the static factory method
 * ({@link #example} below) is quite opaque,
 * and gets more complicated as the number of required properties of the target class grows.
 * This type is not hidden in any way -
 * it's directly accessible by the clients of this Builder class.
 *
 * @see two_required_props.interfaces_variant.ExampleBuilder
 */
public final class ExampleBuilder implements FinalBuilderInterf {
    /**
     * This is where the type safety actually comes from -
     * it's all encoded in the return type of this method.
     */
    @SuppressWarnings("unchecked")
    public static
    <
            T_1 extends BuilderInterf<T_1, FinalBuilderInterf>,
            T_2 extends BuilderInterf<FinalBuilderInterf, T_2>,
            T extends BuilderInterf<T_1, T_2>
    > T example() {
        return (T) new ExampleBuilder();
    }

    private String first;
    private int second;
    private boolean third;
    private char fourth;

    private ExampleBuilder() {
    }

    @Override
    public FinalBuilderInterf first(String first) {
        this.first = first;
        return this;
    }

    @Override
    public FinalBuilderInterf second(int second) {
        this.second = second;
        return this;
    }

    @Override
    public FinalBuilderInterf third(boolean third) {
        this.third = third;
        return this;
    }

    @Override
    public FinalBuilderInterf fourth(char fourth) {
        this.fourth = fourth;
        return this;
    }

    @Override
    public Example build() {
        return new Example(first, second, third, fourth);
    }
}
