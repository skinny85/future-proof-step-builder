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
 * This variant does not have the same downside as the
 * {@link two_required_props.static_fact_meth_variant.ExampleBuilder 'static factory method' variant} -
 * the type of the Builder the customer sees is straightforward.
 * The only potential downside is the number of interfaces that are generated -
 * we need a total of 2^m interfaces,
 * where <i>m</i> is the number of required properties the target class has.
 * <p>
 * See {@link ExampleBuilderInterfaces} if you want to know what those interfaces look like.
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
