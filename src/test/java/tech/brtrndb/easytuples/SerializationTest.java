package tech.brtrndb.easytuples;

import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SerializationTest {

    @ParameterizedTest
    @MethodSource("provideTupleAndExpectedJson")
    public void serialization_test(Tuple tuple, String expectedJson) throws JsonProcessingException {
        // Given:
        ObjectMapper mapper = new ObjectMapper();

        // When:
        String json = mapper.writeValueAsString(tuple);

        // Then:
        Assertions.assertThat(json).isEqualTo(expectedJson);
    }

    private static Stream<Arguments> provideTupleAndExpectedJson() {
        return Stream.of(
                Arguments.of(TupleFixtures.SOLO, "[\"v0\"]"),
                Arguments.of(TupleFixtures.DUO, "[\"v0\",true]"),
                Arguments.of(TupleFixtures.TRIO, "[\"v0\",true,12]"),
                Arguments.of(TupleFixtures.QUARTET, "[\"v0\",true,12,42.0]"),
                Arguments.of(TupleFixtures.QUINTET, "[\"v0\",true,12,42.0,\"v4\"]"),
                Arguments.of(TupleFixtures.SEXTET, "[\"v0\",true,12,42.0,\"v4\",\"v5\"]"),
                Arguments.of(TupleFixtures.SEPTET, "[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\"]"),
                Arguments.of(TupleFixtures.OCTET, "[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\"]"),
                Arguments.of(TupleFixtures.NONET, "[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\",\"v8\"]"),
                Arguments.of(TupleFixtures.DECET, "[\"v0\",true,12,42.0,\"v4\",\"v5\",\"v6\",\"v7\",\"v8\",\"v9\"]")
        );
    }

}
