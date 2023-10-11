package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value6;

/**
 * Tuple with seven values.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 * @param <F>
 * @param <G>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4", "v5", "v6"}, alphabetic = true)
public class Septet<A, B, C, D, E, F, G> extends Sextet<A, B, C, D, E, F> implements Value6<G> {

    @Serial
    private static final long serialVersionUID = -5781545937014357915L;

    public static final int SIZE = 7;

    protected final G v6;

    protected Septet(A v0, B v1, C v2, D v3, E v4, F v5, G v6) {
        super(v0, v1, v2, v3, v4, v5);
        this.v6 = v6;
        this.array[6] = this.v6;
    }

    @Override
    public @Nullable G v6() {
        return this.v6;
    }

    @Override
    public int size() {
        return Septet.SIZE;
    }

    @Override
    public Septet<A, B, C, D, E, F, G> toSeptet() {
        return new Septet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6);
    }

    @Override
    public Octet<A, B, C, D, E, F, G, ?> toOctet() {
        return new Octet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, null);
    }

    @Override
    public Nonet<A, B, C, D, E, F, G, ?, ?> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, null, null);
    }

    @Override
    public Decet<A, B, C, D, E, F, G, ?, ?, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, null, null, null);
    }

    /**
     * Create a {@link Septet} from values.
     *
     * @param v0
     *         Value at index 0.
     * @param v1
     *         Value at index 1.
     * @param v2
     *         Value at index 2.
     * @param v3
     *         Value at index 3.
     * @param v4
     *         Value at index 4.
     * @param v5
     *         Value at index 5.
     * @param v6
     *         Value at index 6.
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     *
     * @return A {@link Septet}.
     */
    @JsonCreator
    public static <A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4,
            @JsonProperty("v5") F v5,
            @JsonProperty("v6") G v6
    )
    {
        return new Septet<>(v0, v1, v2, v3, v4, v5, v6);
    }

}
