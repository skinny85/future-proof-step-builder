package three_required_props.static_fact_meth_variant;

import three_required_props.User;

public interface UserBuilderInterfaces {
    interface BuilderInterf<R1, R2, R3> {
        R1 email(String email);
        BuilderInterf<R1, R2, R3> username(String username);
        R2 firstName(String firstName);
        R3 lastName(String lastName);
        BuilderInterf<R1, R2, R3> displayName(String displayName);
    }

    interface FinalBuilderInterf extends BuilderInterf<
            FinalBuilderInterf, FinalBuilderInterf, FinalBuilderInterf> {
        FinalBuilderInterf email(String email);
        FinalBuilderInterf username(String username);
        FinalBuilderInterf firstName(String firstName);
        FinalBuilderInterf lastName(String lastName);
        FinalBuilderInterf displayName(String displayName);
        User build();
    }
}
