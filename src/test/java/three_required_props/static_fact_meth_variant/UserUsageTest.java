package three_required_props.static_fact_meth_variant;

import org.junit.Test;
import three_required_props.User;

import static org.assertj.core.api.Assertions.assertThat;
import static three_required_props.static_fact_meth_variant.UserBuilder.user;

public class UserUsageTest {
    @Test
    public void user_builder_sets_all_of_the_fields() {
        User user = user()
                .lastName("Doe")
                .lastName("Doe")
                .email("nobody@example.com")
                .lastName("Doe")
                .username("john_doe")
                .lastName("Doe")
                .firstName("John")
                .displayName("john-doe")
                .lastName("Doe")
                .build();

        assertThat(user).isNotNull();

        assertThat(user.email).isEqualTo("nobody@example.com");
        assertThat(user.username).isEqualTo("john_doe");
        assertThat(user.firstName).isEqualTo("John");
        assertThat(user.lastName).isEqualTo("Doe");
        assertThat(user.displayName).isEqualTo("john-doe");
    }
}
