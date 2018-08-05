package two_required_props.interfaces_variant;

import two_required_props.Example;

/**
 * The interfaces for providing type-safety in the 'interfaces'
 * future-proof Step Builder variant,
 * for the {@link Example} class with 2 required properties.
 *
 * @see ExampleBuilder
 */
public interface ExampleBuilderInterfaces {
    interface StarterBuilderInterf {
        B_1_Interf first(String first);
        B_2_Interf second(int second);
        StarterBuilderInterf third(boolean third);
        StarterBuilderInterf fourth(char fourth);
    }

    interface B_1_Interf {
        B_1_Interf first(String first);
        FinalBuilderInterf second(int second);
        B_1_Interf third(boolean third);
        B_1_Interf fourth(char fourth);
    }

    interface B_2_Interf {
        FinalBuilderInterf first(String first);
        B_2_Interf second(int second);
        B_2_Interf third(boolean third);
        B_2_Interf fourth(char fourth);
    }

    interface FinalBuilderInterf extends
            B_1_Interf,
            B_2_Interf,
            StarterBuilderInterf {
        FinalBuilderInterf first(String first);
        FinalBuilderInterf second(int second);
        FinalBuilderInterf third(boolean third);
        FinalBuilderInterf fourth(char fourth);
        Example build();
    }
}
