package three_required_props.interfaces_variant;

import three_required_props.User;
import three_required_props.interfaces_variant.UserBuilderInterfaces.FinalBuilderInterf;
import three_required_props.interfaces_variant.UserBuilderInterfaces.StarterBuilderInterf;

public final class UserBuilder implements FinalBuilderInterf {
    public static StarterBuilderInterf user() {
        return new UserBuilder();
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
