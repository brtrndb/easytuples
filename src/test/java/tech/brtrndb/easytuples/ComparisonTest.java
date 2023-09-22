package tech.brtrndb.easytuples;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ComparisonTest {

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedComparisonResult")
    public void compare_tuple0_to_tuple1(Tuple tuple0, Tuple tuple1, int expectedComparisonResult) {
        // Given:
        // When:
        int result = tuple0.compareTo(tuple1);

        // Then:
        Assertions.assertThat(result).isEqualTo(expectedComparisonResult);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedComparisonResult")
    public void compare_tuple1_to_tuple0(Tuple tuple0, Tuple tuple1, int expectedComparisonResult) {
        // Given:
        // When:
        int result = tuple1.compareTo(tuple0);

        // Then:
        Assertions.assertThat(result).isEqualTo(-expectedComparisonResult);
    }

    private static Stream<Arguments> provideTupleAndExpectedComparisonResult() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.SOLO, 0),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.DUO, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.TRIO, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.QUARTET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.QUINTET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.SEXTET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.DUO, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.DUO, 0),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.TRIO, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.QUARTET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.QUINTET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.SEXTET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.TRIO, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.TRIO, 0),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.QUARTET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.QUINTET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.SEXTET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.QUARTET, 0),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.QUINTET, -1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.SEXTET, -1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.QUINTET, 0),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.SEXTET, -1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.QUINTET, 1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.SEXTET, 0),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.SEPTET, -1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.QUINTET, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SEXTET, 1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SEPTET, 0),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.OCTET, -1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.QUINTET, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SEXTET, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SEPTET, 1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.OCTET, 0),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.NONET, -1),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.NONET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.QUINTET, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.SEXTET, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.SEPTET, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.OCTET, 1),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.NONET, 0),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.DECET, -1),

                Arguments.of(TupleFixtures.DECET, TupleFixtures.SOLO, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.DUO, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.TRIO, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.QUARTET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.QUINTET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.SEXTET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.SEPTET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.OCTET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.NONET, 1),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.DECET, 0)
        );
    }

}
