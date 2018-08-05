package two_required_props.interfaces_variant;

import two_required_props.Example;
import two_required_props.interfaces_variant.ExampleBuilderInterfaces.FinalBuilderInterf;
import two_required_props.interfaces_variant.ExampleBuilderInterfaces.StarterBuilderInterf;

/**
 * The 'interfaces' variant of the future-proof Step Builder implementation,
 * for the {@link Example} class with 2 required properties.
 * <p>
 * In this variant, we generate a separate interface for each
 * filled required property.
 * This variant has none of the downsides of the
 * {@link two_required_props.ExampleBuilder static factory method variant} -
 * the type of the Builder the customer sees is straightforward,
 * and you can set the required properties multiple times without causing any type issues.
 * The only potential downside is the number of interfaces that are generated -
 * we need a total of 2^m interfaces,
 * where <i>m</i> is the number of required properties the target class has.
 * <p>
 * See {@link ExampleBuilderInterfaces here} if you want to know how those interfaces look like.
 */
public final class ExampleBuilder implements FinalBuilderInterf {
    public static StarterBuilderInterf example() {
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
