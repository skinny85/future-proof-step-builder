package three_required_props.interfaces_variant;

import org.junit.Test;
import three_required_props.User;

import static org.assertj.core.api.Assertions.assertThat;
import static three_required_props.interfaces_variant.UserBuilder.user;

public class UserUsageTest {
    @Test
    public void user_builder_sets_all_of_the_fields() {
        User user = user()
                .email("nobody@example.com")
                .username("john_doe")
                .firstName("John")
                .lastName("Doe")
                .displayName("john-doe")
                .build();

        assertThat(user).isNotNull();

        assertThat(user.email).isEqualTo("nobody@example.com");
        assertThat(user.username).isEqualTo("john_doe");
        assertThat(user.firstName).isEqualTo("John");
        assertThat(user.lastName).isEqualTo("Doe");
        assertThat(user.displayName).isEqualTo("john-doe");
    }
}
