package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value4;

/**
 * Tuple with five values.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4"}, alphabetic = true)
public class Quintet<A, B, C, D, E> extends Quartet<A, B, C, D> implements Value4<E> {

    @Serial
    private static final long serialVersionUID = 6808752956375374251L;

    public static final int SIZE = 5;

    protected final E v4;

    protected Quintet(A v0, B v1, C v2, D v3, E v4) {
        super(v0, v1, v2, v3);
        this.v4 = v4;
        this.array[4] = this.v4;
    }

    @Override
    public @Nullable E v4() {
        return this.v4;
    }

    @Override
    public int size() {
        return Quintet.SIZE;
    }

    @Override
    public Quintet<A, B, C, D, E> toQuintet() {
        return new Quintet<>(this.v0, this.v1, this.v2, this.v3, this.v4);
    }

    @Override
    public Sextet<A, B, C, D, E, ?> toSextet() {
        return new Sextet<>(this.v0, this.v1, this.v2, this.v3, this.v4, null);
    }

    @Override
    public Septet<A, B, C, D, E, ?, ?> toSeptet() {
        return new Septet<>(this.v0, this.v1, this.v2, this.v3, this.v4, null, null);
    }

    @Override
    public Octet<A, B, C, D, E, ?, ?, ?> toOctet() {
        return new Octet<>(this.v0, this.v1, this.v2, this.v3, this.v4, null, null, null);
    }

    @Override
    public Nonet<A, B, C, D, E, ?, ?, ?, ?> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, null, null, null, null);
    }

    @Override
    public Decet<A, B, C, D, E, ?, ?, ?, ?, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, null, null, null, null, null);
    }

    /**
     * Create a {@link Quintet} from values.
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
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     *
     * @return A {@link Quintet}.
     */
    @JsonCreator
    public static <A, B, C, D, E> Quintet<A, B, C, D, E> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4
    )
    {
        return new Quintet<>(v0, v1, v2, v3, v4);
    }

}
