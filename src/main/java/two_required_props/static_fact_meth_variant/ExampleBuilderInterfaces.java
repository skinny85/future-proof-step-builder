package two_required_props.static_fact_meth_variant;

import two_required_props.Example;

/**
 * The interfaces for providing type-safety in the 'static factory method'
 * future-proof Step Builder variant,
 * for the {@link Example} class with 2 required properties.
 *
 * @see ExampleBuilder
 */
public interface ExampleBuilderInterfaces {
    interface BuilderInterf<R1, R2> {
        R1 first(String first);
        R2 second(int second);
        BuilderInterf<R1, R2> third(boolean third);
        BuilderInterf<R1, R2> fourth(char fourth);
    }

    interface FinalBuilderInterf extends BuilderInterf<FinalBuilderInterf, FinalBuilderInterf> {
        FinalBuilderInterf third(boolean third);
        FinalBuilderInterf fourth(char fourth);
        Example build();
    }
}
