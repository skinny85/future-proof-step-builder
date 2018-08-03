package two_required_props;

import two_required_props.ExampleBuilderInterfaces.FinalBuilderInterf;
import two_required_props.ExampleBuilderInterfaces.BuilderInterf;

/**
 * This is where the magic happens.
 * The Builder has a private constructor,
 * and can only be instantiated through the {@link #example} static factory method.
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
