package three_required_props;

import static java.util.Objects.requireNonNull;

/**
 * An example target class with 3 required properties
 * ({@link #email}, {@link #firstName}, {@link #lastName}).
 * It has an {@link three_required_props.interfaces_variant.UserBuilder 'interfaces' builder}
 * and a {@link three_required_props.static_fact_meth_variant.UserBuilder 'static factory method' builder}.
 *
 * @see two_required_props.Example
 */
public final class User {
    public final String email, username, firstName, lastName, displayName;

    public User(String email, String username, String firstName, String lastName,
            String displayName) {
        this.email = requireNonNull(email);
        this.username = username == null ? email : username;
        this.firstName = requireNonNull(firstName);
        this.lastName = requireNonNull(lastName);
        this.displayName = displayName == null
                ? firstName + " " + lastName
                : displayName;
    }
}
