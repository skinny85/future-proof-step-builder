package two_required_props.interfaces_variant.evolved;

import two_required_props.Example;

/**
 * The interfaces for providing type-safety in the 'interfaces'
 * future-proof Step Builder variant,
 * for the "evolved" {@link Example} class with 1 required property.
 *
 * @see ExampleBuilder
 */
public interface ExampleBuilderInterfaces {
    interface StarterBuilderInterf {
        StarterBuilderInterf first(String first);
        FinalBuilderInterf second(int second);
        StarterBuilderInterf third(boolean third);
        StarterBuilderInterf fourth(char fourth);
    }

    interface FinalBuilderInterf extends
            StarterBuilderInterf {
        FinalBuilderInterf first(String first);
        FinalBuilderInterf second(int second);
        FinalBuilderInterf third(boolean third);
        FinalBuilderInterf fourth(char fourth);
        Example build();
    }
}
