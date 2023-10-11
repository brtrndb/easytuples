package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value9;

/**
 * Tuple with ten values.
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
 * @param <J>
 *
 * @author Bertrand B.
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"}, alphabetic = true)
public class Decet<A, B, C, D, E, F, G, H, I, J> extends Nonet<A, B, C, D, E, F, G, H, I> implements Value9<J> {

    @Serial
    private static final long serialVersionUID = 5670757969845921728L;

    public static final int SIZE = 10;

    protected final J v9;

    protected Decet(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8, J v9) {
        super(v0, v1, v2, v3, v4, v5, v6, v7, v8);
        this.v9 = v9;
        this.array[9] = this.v9;
    }

    @Override
    public @Nullable J v9() {
        return this.v9;
    }

    @Override
    public int size() {
        return Decet.SIZE;
    }

    @Override
    public Decet<A, B, C, D, E, F, G, H, I, J> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7, this.v8, this.v9);
    }

    /**
     * Create a {@link Decet} from values.
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
     * @param v9
     *         Value at index 9.
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     * @param <I>
     * @param <J>
     *
     * @return A {@link Decet}.
     */
    @JsonCreator
    public static <A, B, C, D, E, F, G, H, I, J> Decet<A, B, C, D, E, F, G, H, I, J> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4,
            @JsonProperty("v5") F v5,
            @JsonProperty("v6") G v6,
            @JsonProperty("v7") H v7,
            @JsonProperty("v8") I v8,
            @JsonProperty("v9") J v9
    )
    {
        return new Decet<>(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

}
