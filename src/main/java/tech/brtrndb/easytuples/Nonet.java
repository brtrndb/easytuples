package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value8;

/**
 * Tuple with nine values.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 * @param <F>
 * @param <G>
 * @param <H>
 * @param <I>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"}, alphabetic = true)
public class Nonet<A, B, C, D, E, F, G, H, I> extends Octet<A, B, C, D, E, F, G, H> implements Value8<I> {

    @Serial
    private static final long serialVersionUID = 1558205834210982665L;

    public static final int SIZE = 9;

    protected final I v8;

    protected Nonet(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8) {
        this(SIZE, v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }

    protected Nonet(int size, A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8) {
        super(size, v0, v1, v2, v3, v4, v5, v6, v7);
        this.v8 = v8;
        this.array[8] = this.v8;
    }

    @Override
    public @Nullable I v8() {
        return this.v8;
    }

    @Override
    public int size() {
        return Nonet.SIZE;
    }

    @Override
    public Nonet<A, B, C, D, E, F, G, H, I> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7, this.v8);
    }

    @Override
    public Decet<A, B, C, D, E, F, G, H, I, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7, this.v8, null);
    }

    /**
     * Create a {@link Nonet} from values.
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
     * @param v7
     *         Value at index 7.
     * @param v8
     *         Value at index 8.
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     * @param <I>
     *
     * @return A {@link Nonet}.
     */
    @JsonCreator
    public static <A, B, C, D, E, F, G, H, I> Nonet<A, B, C, D, E, F, G, H, I> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4,
            @JsonProperty("v5") F v5,
            @JsonProperty("v6") G v6,
            @JsonProperty("v7") H v7,
            @JsonProperty("v8") I v8
    )
    {
        return new Nonet<>(v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }

}
