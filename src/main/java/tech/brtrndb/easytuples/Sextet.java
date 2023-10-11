package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value5;

/**
 * Tuple with six values.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 * @param <F>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4", "v5"}, alphabetic = true)
public class Sextet<A, B, C, D, E, F> extends Quintet<A, B, C, D, E> implements Value5<F> {

    @Serial
    private static final long serialVersionUID = -3300384166077398772L;

    public static final int SIZE = 6;

    protected final F v5;

    protected Sextet(A v0, B v1, C v2, D v3, E v4, F v5) {
        super(v0, v1, v2, v3, v4);
        this.v5 = v5;
        this.array[5] = this.v5;
    }

    @Override
    public @Nullable F v5() {
        return this.v5;
    }

    @Override
    public int size() {
        return Sextet.SIZE;
    }

    @Override
    public Sextet<A, B, C, D, E, F> toSextet() {
        return new Sextet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5);
    }

    @Override
    public Septet<A, B, C, D, E, F, ?> toSeptet() {
        return new Septet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null);
    }

    @Override
    public Octet<A, B, C, D, E, F, ?, ?> toOctet() {
        return new Octet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null);
    }

    @Override
    public Nonet<A, B, C, D, E, F, ?, ?, ?> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null, null);
    }

    @Override
    public Decet<A, B, C, D, E, F, ?, ?, ?, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null, null, null);
    }

    /**
     * Create a {@link Sextet} from values.
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
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     *
     * @return A {@link Sextet}.
     */
    @JsonCreator
    public static <A, B, C, D, E, F> Sextet<A, B, C, D, E, F> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4,
            @JsonProperty("v5") F v5
    )
    {
        return new Sextet<>(v0, v1, v2, v3, v4, v5);
    }

}
