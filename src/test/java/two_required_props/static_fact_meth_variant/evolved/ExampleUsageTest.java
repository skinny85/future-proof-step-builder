package two_required_props.static_fact_meth_variant.evolved;

import org.junit.Test;
import two_required_props.Example;

import static two_required_props.static_fact_meth_variant.evolved.ExampleBuilder.example;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Usages of the {@link Example} future-proof Builder,
 * in the 'static factory method' variant,
 * with only `second` as a required property -
 * proving that "evolving" the API retains the existing use cases.
 */
public class ExampleUsageTest {
    @Test
    public void test_example_builder() {
        Example example = example()
                .fourth('d')
                .first("abc")
                .first("abc")
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

    @Test
    public void only_second_build() {
        Example example = example()
                .second(1)
                .build();

        assertThat(example).isNotNull();
    }
}
