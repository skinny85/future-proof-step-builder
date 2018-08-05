package two_required_props.evolved;

import two_required_props.Example;
import two_required_props.evolved.ExampleBuilderInterfaces.BuilderInterf;
import two_required_props.evolved.ExampleBuilderInterfaces.FinalBuilderInterf;

/**
 * Equivalent of {@link two_required_props.ExampleBuilder},
 * but with `first` now optional.
 */
public final class ExampleBuilder implements FinalBuilderInterf {
    public static
    BuilderInterf<
            FinalBuilderInterf
    > example() {
        return new ExampleBuilder();
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
