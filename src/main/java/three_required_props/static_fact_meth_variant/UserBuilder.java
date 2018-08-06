package three_required_props.static_fact_meth_variant;

import three_required_props.User;
import three_required_props.static_fact_meth_variant.UserBuilderInterfaces.BuilderInterf;
import three_required_props.static_fact_meth_variant.UserBuilderInterfaces.FinalBuilderInterf;

public final class UserBuilder implements FinalBuilderInterf {
    @SuppressWarnings("unchecked")
    public static
    <
            T_1_2 extends BuilderInterf<T_1_2, T_1_2, FinalBuilderInterf>,
            T_1_3 extends BuilderInterf<T_1_3, FinalBuilderInterf, T_1_3>,
            T_2_3 extends BuilderInterf<FinalBuilderInterf, T_2_3, T_2_3>,
            T_1 extends BuilderInterf<T_1, T_1_2, T_1_3>,
            T_2 extends BuilderInterf<T_1_2, T_2, T_2_3>,
            T_3 extends BuilderInterf<T_1_3, T_2_3, T_3>,
            T extends BuilderInterf<T_1, T_2, T_3>
    > T user() {
        return (T) new UserBuilder();
    }

    private String email, username, firstName, lastName, displayName;

    private UserBuilder() {
    }

    @Override
    public FinalBuilderInterf email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public FinalBuilderInterf username(String username) {
        this.username = username;
        return this;
    }

    @Override
    public FinalBuilderInterf firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public FinalBuilderInterf lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public FinalBuilderInterf displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public User build() {
        return new User(email, username, firstName, lastName, displayName);
    }
}
