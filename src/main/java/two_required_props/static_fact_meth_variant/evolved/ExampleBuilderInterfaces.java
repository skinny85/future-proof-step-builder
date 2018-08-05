package two_required_props.static_fact_meth_variant.evolved;

import two_required_props.Example;

/**
 * The interfaces for providing type-safety in the 'static factory method'
 * future-proof Step Builder variant,
 * for the "evolved" {@link Example} class with 1 required property.
 *
 * @see ExampleBuilder
 */
public interface ExampleBuilderInterfaces {
    interface BuilderInterf<R> {
        BuilderInterf<R> first(String first);
        R second(int second);
        BuilderInterf<R> third(boolean third);
        BuilderInterf<R> fourth(char fourth);
    }

    interface FinalBuilderInterf extends BuilderInterf<FinalBuilderInterf> {
        FinalBuilderInterf first(String first);
        FinalBuilderInterf third(boolean third);
        FinalBuilderInterf fourth(char fourth);
        Example build();
    }
}
