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
 * However, that frugality comes with some downsides:
 * <ol>
 *     <li>
 *         The type returned from the static factory method
 *         ({@link #example} below) is quite opaque,
 *         and gets more complicated as the number of required properties of the target class grows.
 *         This type is not hidden in any way -
 *         it's directly accessible by the clients of this Builder class.
 *     </li>
 *     <li>
 *         If you set a required property twice before
 *         setting all of the required properties
 *         (so, something like <code>ExampleBuilder.example().second(1).second(2)</code>),
 *         the type you get at the end of that expression will be <code>Object</code>.
 *         This is quite surprising and unexpected behavior for the clients of this class,
 *         especially since setting a required property multiple times after providing all of the required properties,
 *         and providing an optional property multiple times,
 *         work without problems.
 *     </li>
 * </ol>
 * Because of these downsides, you may want to look at the
 * {@link two_required_props.interfaces_variant.ExampleBuilder interfaces variant}.
 */
public final class ExampleBuilder implements FinalBuilderInterf {
    /**
     * This is where the type safety actually comes from -
     * it's all encoded in the return type of this method.
     */
    @SuppressWarnings("unchecked")
    public static
    BuilderInterf<
        BuilderInterf<?, FinalBuilderInterf>,
        BuilderInterf<FinalBuilderInterf, ?>
    > example() {
        return (BuilderInterf) new ExampleBuilder();
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
