package tech.brtrndb.easytuples;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

import tech.brtrndb.easytuples.Decet;
import tech.brtrndb.easytuples.Duo;
import tech.brtrndb.easytuples.Nonet;
import tech.brtrndb.easytuples.Octet;
import tech.brtrndb.easytuples.Quartet;
import tech.brtrndb.easytuples.Quintet;
import tech.brtrndb.easytuples.Septet;
import tech.brtrndb.easytuples.Sextet;
import tech.brtrndb.easytuples.Solo;
import tech.brtrndb.easytuples.Trio;

public final class TupleFixtures {

    public static final Solo<String>                                                                            SOLO    = Solo.of("v0");
    public static final Duo<String, Boolean>                                                                    DUO     = Duo.of("v0", true);
    public static final Trio<String, Boolean, Integer>                                                          TRIO    = Trio.of("v0", true, 12);
    public static final Quartet<String, Boolean, Integer, Double>                                               QUARTET = Quartet.of("v0", true, 12, 42.0d);
    public static final Quintet<String, Boolean, Integer, Double, String>                                       QUINTET = Quintet.of("v0", true, 12, 42.0d, "v4");
    public static final Sextet<String, Boolean, Integer, Double, String, String>                                SEXTET  = Sextet.of("v0", true, 12, 42.0d, "v4", "v5");
    public static final Septet<String, Boolean, Integer, Double, String, String, String>                        SEPTET  = Septet.of("v0", true, 12, 42.0d, "v4", "v5", "v6");
    public static final Octet<String, Boolean, Integer, Double, String, String, String, String>                 OCTET   = Octet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7");
    public static final Nonet<String, Boolean, Integer, Double, String, String, String, String, String>         NONET   = Nonet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7", "v8");
    public static final Decet<String, Boolean, Integer, Double, String, String, String, String, String, String> DECET   = Decet.of("v0", true, 12, 42.0d, "v4", "v5", "v6", "v7", "v8", "v9");

    public static Stream<Arguments> provideTuple() {
        return Stream.of(
                Arguments.of(SOLO),
                Arguments.of(DUO),
                Arguments.of(TRIO),
                Arguments.of(QUARTET),
                Arguments.of(QUINTET),
                Arguments.of(SEXTET),
                Arguments.of(SEPTET),
                Arguments.of(OCTET),
                Arguments.of(NONET),
                Arguments.of(DECET)
        );
    }

}
