package two_required_props;

import org.junit.Test;

import static two_required_props.ExampleBuilder.example;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Usages of the {@link Example} class with `first` and `second`
 * as required properties.
 */
public class ExampleUsageTest {
    @Test
    public void test_example_builder() {
        Example example = example()
                .fourth('c')
                .first("xyz")
                .second(-2)
                .third(true)
                .build();

        assertThat(example).isNotNull();

        assertThat(example.first).isEqualTo("xyz");
        assertThat(example.second).isEqualTo(-2);
        assertThat(example.third).isEqualTo(true);
        assertThat(example.fourth).isEqualTo('c');
    }

    @Test
    public void first_second_build() {
        Example example = example()
                .first("")
                .second(1)
                .build();

        assertThat(example).isNotNull();
    }

    @Test
    public void second_first_build() {
        Example example = example()
                .second(1)
                .first("")
                .build();

        assertThat(example).isNotNull();
    }

    @Test
    public void third_first_second_build() {
        Example example = example()
                .third(true)
                .first("")
                .second(1)
                .build();

        assertThat(example).isNotNull();
    }

    @Test
    public void first_third_second_build() {
        Example example = example()
                .first("")
                .third(true)
                .second(1)
                .build();

        assertThat(example).isNotNull();
    }

    @Test
    public void first_second_third_build() {
        Example example = example()
                .first("")
                .second(1)
                .third(true)
                .build();

        assertThat(example).isNotNull();
    }
}
