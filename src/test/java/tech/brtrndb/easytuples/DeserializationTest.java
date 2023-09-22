package tech.brtrndb.easytuples;

import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DeserializationTest {

    @ParameterizedTest
    @MethodSource("provideJsonAndExpectedTuple")
    public void deserialization_test(String json, Tuple expectedTuple) throws JsonProcessingException {
        // Given:
        ObjectMapper mapper = new ObjectMapper();

        // When:
        Tuple tuple = mapper.readValue(json, expectedTuple.getClass());

        // Then:
        Assertions.<Tuple>assertThat(tuple).isEqualTo(expectedTuple);
    }

    private static Stream<Arguments> provideJsonAndExpectedTuple() {
        return Stream.of(
                Arguments.of("[\"v0\"]", TupleFixtures.SOLO),
                Arguments.of("[\"v0\",true]", TupleFixtures.DUO),
                Arguments.of("[\"v0\",true,12]", TupleFixtures.TRIO),
                Arguments.of("[\"v0\",true,12,42.0]", TupleFixtures.QUARTET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\"]", TupleFixtures.QUINTET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\",\"v5\"]", TupleFixtures.SEXTET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\"]", TupleFixtures.SEPTET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\"]", TupleFixtures.OCTET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\",\"v8\"]", TupleFixtures.NONET),
                Arguments.of("[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\",\"v8\",\"v9\"]", TupleFixtures.DECET)
        );
    }

}
