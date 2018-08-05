package two_required_props;

/**
 * These interfaces provide the type-safety -
 * the fact that you cannot call {@link FinalBuilderInterf#build}
 * before calling {@link BuilderInterf#first} <b>and</b>
 * {@link BuilderInterf#second}.
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
