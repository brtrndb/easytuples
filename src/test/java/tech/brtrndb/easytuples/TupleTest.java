package tech.brtrndb.easytuples;

import java.util.Optional;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import tech.brtrndb.easytuples.fixture.TupleFixtures;

public class TupleTest {

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void find_value_at_position(Tuple tuple) {
        // Given:
        int size = tuple.size();

        // When:
        // Then:
        for (int i = 0; i < size; i++) {
            int at = i;
            Assertions.assertThatCode(() -> tuple.findAt(at))
                    .doesNotThrowAnyException();
        }
    }

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void find_value_at_negative_position_throws(Tuple tuple) {
        // Given:
        // When:
        Optional<?> optional = tuple.findAt(-1);

        // Then:
        Assertions.assertThat(optional).isEmpty();
    }

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void find_value_at_bigger_position_throws(Tuple tuple) {
        // Given:
        // When:
        Optional<?> optional = tuple.findAt(tuple.size());

        // Then:
        Assertions.assertThat(optional).isEmpty();
    }

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void get_value_at_position(Tuple tuple) {
        // Given:
        int size = tuple.size();

        // When:
        // Then:
        for (int i = 0; i < size; i++) {
            int at = i;
            Assertions.assertThatCode(() -> tuple.getAt(at))
                    .doesNotThrowAnyException();
        }
    }

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void get_value_at_negative_position_throws(Tuple tuple) {
        // Given:
        // When:
        // Then:
        Assertions.assertThatThrownBy(() -> tuple.getAt(-1))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

    @ParameterizedTest
    @MethodSource("tech.brtrndb.easytuples.fixture.TupleFixtures#provideTuple")
    public void get_value_at_bigger_position_throws(Tuple tuple) {
        // Given:
        // When:
        // Then:
        Assertions.assertThatThrownBy(() -> tuple.getAt(tuple.size()))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void contains_value() {
        // Given:
        String value = "value";
        Tuple tuple = Trio.of(12, "value", true);

        // When:
        boolean contains = tuple.contains(value);

        // Then:
        Assertions.assertThat(contains).isTrue();
    }

    @Test
    public void does_not_contain_value() {
        // Given:
        String value = "value";
        Tuple tuple = Trio.of(12, new Object(), true);

        // When:
        boolean contains = tuple.contains(value);

        // Then:
        Assertions.assertThat(contains).isFalse();
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedSize")
    public void expect_correct_size(Tuple tuple, int expectedSize) {
        // Given:
        // When:
        int size = tuple.size();

        // Then:
        Assertions.assertThat(size).isEqualTo(expectedSize);
    }

    @Test
    public void equals_is_reflexive() {
        // Given:
        Tuple tuple = Trio.of(12, true, "value");

        // When:
        boolean equals = tuple.equals(tuple);

        // Then:
        Assertions.assertThat(equals).isTrue();
    }

    @Test
    public void equals_is_symmetric() {
        // Given:
        Tuple tuple0 = Trio.of(12, true, "value");
        Tuple tuple1 = Trio.of(12, true, "value");

        // When:
        boolean equals0 = tuple0.equals(tuple1);
        boolean equals1 = tuple1.equals(tuple0);

        // Then:
        Assertions.assertThat(equals0).isEqualTo(equals1);
    }

    @Test
    public void equals_is_transitive() {
        // Given:
        Tuple tuple0 = Trio.of(12, true, "value");
        Tuple tuple1 = Trio.of(12, true, "value");
        Tuple tuple2 = Trio.of(12, true, "value");

        // When:
        boolean equals0 = tuple0.equals(tuple1);
        boolean equals1 = tuple1.equals(tuple2);
        boolean equals2 = tuple0.equals(tuple2);

        // Then:
        Assertions.assertThat(equals0).isEqualTo(equals1);
        Assertions.assertThat(equals1).isEqualTo(equals2);
    }

    @Test
    public void equals_with_null() {
        // Given:
        Tuple tuple = Trio.of(12, true, "value");

        // When:
        boolean equals = tuple.equals(null);

        // Then:
        Assertions.assertThat(equals).isFalse();
    }

    private static Stream<Arguments> provideTupleAndExpectedSize() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.DUO, 2),
                Arguments.of(TupleFixtures.TRIO, 3),
                Arguments.of(TupleFixtures.QUARTET, 4),
                Arguments.of(TupleFixtures.QUINTET, 5),
                Arguments.of(TupleFixtures.SEXTET, 6),
                Arguments.of(TupleFixtures.SEPTET, 7),
                Arguments.of(TupleFixtures.OCTET, 8),
                Arguments.of(TupleFixtures.NONET, 9),
                Arguments.of(TupleFixtures.DECET, 10)
        );
    }

}
