package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value2;

/**
 * Tuple with three values.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2"}, alphabetic = true)
public class Trio<A, B, C> extends Duo<A, B> implements Value2<C> {

    @Serial
    private static final long serialVersionUID = 4022882046069686578L;

    public static final int SIZE = 3;

    protected final C v2;

    protected Trio(A v0, B v1, C v2) {
        this(SIZE, v0, v1, v2);
    }

    protected Trio(int size, A v0, B v1, C v2) {
        super(size, v0, v1);
        this.v2 = v2;
        this.array[2] = this.v2;
    }

    @Override
    public @Nullable C v2() {
        return this.v2;
    }

    @Override
    public int size() {
        return Trio.SIZE;
    }

    @Override
    public Trio<A, B, C> toTrio() {
        return new Trio<>(this.v0, this.v1, this.v2);
    }

    @Override
    public Quartet<A, B, C, ?> toQuartet() {
        return new Quartet<>(this.v0, this.v1, this.v2, null);
    }

    @Override
    public Quintet<A, B, C, ?, ?> toQuintet() {
        return new Quintet<>(this.v0, this.v1, this.v2, null, null);
    }

    @Override
    public Sextet<A, B, C, ?, ?, ?> toSextet() {
        return new Sextet<>(this.v0, this.v1, this.v2, null, null, null);
    }

    @Override
    public Septet<A, B, C, ?, ?, ?, ?> toSeptet() {
        return new Septet<>(this.v0, this.v1, this.v2, null, null, null, null);
    }

    @Override
    public Octet<A, B, C, ?, ?, ?, ?, ?> toOctet() {
        return new Octet<>(this.v0, this.v1, this.v2, null, null, null, null, null);
    }

    @Override
    public Nonet<A, B, C, ?, ?, ?, ?, ?, ?> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, null, null, null, null, null, null);
    }

    @Override
    public Decet<A, B, C, ?, ?, ?, ?, ?, ?, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, null, null, null, null, null, null, null);
    }

    /**
     * Create a {@link Trio} from values.
     *
     * @param v0
     *         Value at index 0.
     * @param v1
     *         Value at index 1.
     * @param v2
     *         Value at index 2.
     * @param <A>
     * @param <B>
     * @param <C>
     *
     * @return A {@link Trio}.
     */
    @JsonCreator
    public static <A, B, C> Trio<A, B, C> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2
    )
    {
        return new Trio<>(v0, v1, v2);
    }

}
