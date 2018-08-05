package two_required_props.evolved;

import org.junit.Test;
import two_required_props.Example;

import static two_required_props.evolved.ExampleBuilder.example;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Proof that the evolved class
 * (with a required property changed to optional)
 * still fulfills all of the old use-cases.
 */
public class ExampleUsageTest {
    @Test
    public void test_example_builder() {
        Example example = example()
                .fourth('d')
                .first("pqr")
                .second(-3)
                .third(true)
                .build();

        assertThat(example).isNotNull();

        assertThat(example.first).isEqualTo("pqr");
        assertThat(example.second).isEqualTo(-3);
        assertThat(example.third).isEqualTo(true);
        assertThat(example.fourth).isEqualTo('d');
    }

    @Test
    public void first_second_build() {
        // given:
        Example example = example()
                .first("")
                .second(1)
                .build();

        // then:
        assertThat(example).isNotNull();
    }

    @Test
    public void second_first_build() {
        // given:
        Example example = example()
                .second(1)
                .first("")
                .build();

        // then:
        assertThat(example).isNotNull();
    }

    @Test
    public void third_first_second_build() {
        // given:
        Example example = example()
                .third(true)
                .first("")
                .second(1)
                .build();

        // then:
        assertThat(example).isNotNull();
    }

    @Test
    public void first_third_second_build() {
        // given:
        Example example = example()
                .first("")
                .third(true)
                .second(1)
                .build();

        // then:
        assertThat(example).isNotNull();
    }

    @Test
    public void first_second_third_build() {
        // given:
        Example example = example()
                .first("")
                .second(1)
                .third(true)
                .build();

        // then:
        assertThat(example).isNotNull();
    }

    @Test
    public void only_second_build() {
        // given:
        Example example = example()
                .second(1)
                .build();

        // then:
        assertThat(example).isNotNull();
    }
}
