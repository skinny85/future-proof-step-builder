package two_required_props.evolved;

import two_required_props.Example;

/**
 * Equivalent of {@link two_required_props.ExampleBuilderInterfaces},
 * but with `first` now optional.
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
