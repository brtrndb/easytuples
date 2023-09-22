package tech.brtrndb.easytuples;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ConversionTest {

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedSolo")
    public void convert_tuple_to_solo(Tuple tuple, Solo<?> expected) {
        // Given:
        // When:
        Solo<?> solo = tuple.toSolo();

        // Then:
        Assertions.<Solo<?>>assertThat(solo).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedDuo")
    public void convert_tuple_to_duo(Tuple tuple, Duo<?, ?> expected) {
        // Given:
        // When:
        Duo<?, ?> duo = tuple.toDuo();

        // Then:
        Assertions.<Duo<?, ?>>assertThat(duo).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedTrio")
    public void convert_tuple_to_trio(Tuple tuple, Trio<?, ?, ?> expected) {
        // Given:
        // When:
        Trio<?, ?, ?> trio = tuple.toTrio();

        // Then:
        Assertions.<Trio<?, ?, ?>>assertThat(trio).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedQuartet")
    public void convert_tuple_to_quartet(Tuple tuple, Quartet<?, ?, ?, ?> expected) {
        // Given:
        // When:
        Quartet<?, ?, ?, ?> quartet = tuple.toQuartet();

        // Then:
        Assertions.<Quartet<?, ?, ?, ?>>assertThat(quartet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedQuintet")
    public void convert_tuple_to_quintet(Tuple tuple, Quintet<?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Quintet<?, ?, ?, ?, ?> quintet = tuple.toQuintet();

        // Then:
        Assertions.<Quintet<?, ?, ?, ?, ?>>assertThat(quintet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedSextet")
    public void convert_tuple_to_sextet(Tuple tuple, Sextet<?, ?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Sextet<?, ?, ?, ?, ?, ?> sextet = tuple.toSextet();

        // Then:
        Assertions.<Sextet<?, ?, ?, ?, ?, ?>>assertThat(sextet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedSeptet")
    public void convert_tuple_to_septet(Tuple tuple, Septet<?, ?, ?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Septet<?, ?, ?, ?, ?, ?, ?> septet = tuple.toSeptet();

        // Then:
        Assertions.<Septet<?, ?, ?, ?, ?, ?, ?>>assertThat(septet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedOctet")
    public void convert_tuple_to_octet(Tuple tuple, Octet<?, ?, ?, ?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Octet<?, ?, ?, ?, ?, ?, ?, ?> octet = tuple.toOctet();

        // Then:
        Assertions.<Octet<?, ?, ?, ?, ?, ?, ?, ?>>assertThat(octet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedNonet")
    public void convert_tuple_to_nonet(Tuple tuple, Nonet<?, ?, ?, ?, ?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Nonet<?, ?, ?, ?, ?, ?, ?, ?, ?> nonet = tuple.toNonet();

        // Then:
        Assertions.<Nonet<?, ?, ?, ?, ?, ?, ?, ?, ?>>assertThat(nonet).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedDecet")
    public void convert_tuple_to_decet(Tuple tuple, Decet<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> expected) {
        // Given:
        // When:
        Decet<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> decet = tuple.toDecet();

        // Then:
        Assertions.<Decet<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>>assertThat(decet).isEqualTo(expected);
    }

    private static Stream<Arguments> provideTupleAndExpectedSolo() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.SOLO),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.SOLO)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedDuo() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Duo.of("v0", null)),
                Arguments.of(TupleFixtures.DUO, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.DUO),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.DUO)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedTrio() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Trio.of("v0", null, null)),
                Arguments.of(TupleFixtures.DUO, Trio.of("v0", true, null)),
                Arguments.of(TupleFixtures.TRIO, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.TRIO),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.TRIO)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedQuartet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Quartet.of("v0", null, null, null)),
                Arguments.of(TupleFixtures.DUO, Quartet.of("v0", true, null, null)),
                Arguments.of(TupleFixtures.TRIO, Quartet.of("v0", true, 12, null)),
                Arguments.of(TupleFixtures.QUARTET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.QUARTET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.QUARTET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedQuintet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Quintet.of("v0", null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Quintet.of("v0", true, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Quintet.of("v0", true, 12, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Quintet.of("v0", true, 12, 42.0d, null)),
                Arguments.of(TupleFixtures.QUINTET, TupleFixtures.QUINTET),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.QUINTET),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.QUINTET),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.QUINTET),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.QUINTET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.QUINTET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedSextet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Sextet.of("v0", null, null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Sextet.of("v0", true, null, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Sextet.of("v0", true, 12, null, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Sextet.of("v0", true, 12, 42.0d, null, null)),
                Arguments.of(TupleFixtures.QUINTET, Sextet.of("v0", true, 12, 42.0d, "v4", null)),
                Arguments.of(TupleFixtures.SEXTET, TupleFixtures.SEXTET),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SEXTET),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SEXTET),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.SEXTET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.SEXTET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedSeptet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Septet.of("v0", null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Septet.of("v0", true, null, null, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Septet.of("v0", true, 12, null, null, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Septet.of("v0", true, 12, 42.0d, null, null, null)),
                Arguments.of(TupleFixtures.QUINTET, Septet.of("v0", true, 12, 42.0d, "v4", null, null)),
                Arguments.of(TupleFixtures.SEXTET, Septet.of("v0", true, 12, 42.0d, "v4", "v5", null)),
                Arguments.of(TupleFixtures.SEPTET, TupleFixtures.SEPTET),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.SEPTET),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.SEPTET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.SEPTET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedOctet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Octet.of("v0", null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Octet.of("v0", true, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Octet.of("v0", true, 12, null, null, null, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Octet.of("v0", true, 12, 42.0d, null, null, null, null)),
                Arguments.of(TupleFixtures.QUINTET, Octet.of("v0", true, 12, 42.0d, "v4", null, null, null)),
                Arguments.of(TupleFixtures.SEXTET, Octet.of("v0", true, 12, 42.0d, "v4", "v5", null, null)),
                Arguments.of(TupleFixtures.SEPTET, Octet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", null)),
                Arguments.of(TupleFixtures.OCTET, TupleFixtures.OCTET),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.OCTET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.OCTET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedNonet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Nonet.of("v0", null, null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Nonet.of("v0", true, null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Nonet.of("v0", true, 12, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Nonet.of("v0", true, 12, 42.0d, null, null, null, null, null)),
                Arguments.of(TupleFixtures.QUINTET, Nonet.of("v0", true, 12, 42.0d, "v4", null, null, null, null)),
                Arguments.of(TupleFixtures.SEXTET, Nonet.of("v0", true, 12, 42.0d, "v4", "v5", null, null, null)),
                Arguments.of(TupleFixtures.SEPTET, Nonet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", null, null)),
                Arguments.of(TupleFixtures.OCTET, Nonet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7", null)),
                Arguments.of(TupleFixtures.NONET, TupleFixtures.NONET),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.NONET)
        );
    }

    private static Stream<Arguments> provideTupleAndExpectedDecet() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, Decet.of("v0", null, null, null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.DUO, Decet.of("v0", true, null, null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.TRIO, Decet.of("v0", true, 12, null, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.QUARTET, Decet.of("v0", true, 12, 42.0d, null, null, null, null, null, null)),
                Arguments.of(TupleFixtures.QUINTET, Decet.of("v0", true, 12, 42.0d, "v4", null, null, null, null, null)),
                Arguments.of(TupleFixtures.SEXTET, Decet.of("v0", true, 12, 42.0d, "v4", "v5", null, null, null, null)),
                Arguments.of(TupleFixtures.SEPTET, Decet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", null, null, null)),
                Arguments.of(TupleFixtures.OCTET, Decet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7", null, null)),
                Arguments.of(TupleFixtures.NONET, Decet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7", "v8", null)),
                Arguments.of(TupleFixtures.DECET, TupleFixtures.DECET)
        );
    }

}
