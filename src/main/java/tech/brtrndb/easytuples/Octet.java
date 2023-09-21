package tech.brtrndb.easytuples;

import java.io.Serial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.Nullable;

import tech.brtrndb.easytuples.accessor.Value7;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder(value = {"v0", "v1", "v2", "v3", "v4", "v5", "v6", "v7"}, alphabetic = true)
public class Octet<A, B, C, D, E, F, G, H> extends Septet<A, B, C, D, E, F, G> implements Value7<H> {

    @Serial
    private static final long serialVersionUID = 7825874475063539448L;

    public static final int SIZE = 8;

    protected final H v7;

    protected Octet(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7) {
        super(v0, v1, v2, v3, v4, v5, v6);
        this.v7 = v7;
        this.array[7] = this.v7;
    }

    @Override
    public @Nullable H v7() {
        return this.v7;
    }

    @Override
    public int size() {
        return Octet.SIZE;
    }

    @Override
    public Octet<A, B, C, D, E, F, G, H> toOctet() {
        return new Octet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7);
    }

    @Override
    public Nonet<A, B, C, D, E, F, G, H, ?> toNonet() {
        return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7, null);
    }

    @Override
    public Decet<A, B, C, D, E, F, G, H, ?, ?> toDecet() {
        return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, this.v6, this.v7, null, null);
    }

    @JsonCreator
    public static <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H> of(
            @JsonProperty("v0") A v0,
            @JsonProperty("v1") B v1,
            @JsonProperty("v2") C v2,
            @JsonProperty("v3") D v3,
            @JsonProperty("v4") E v4,
            @JsonProperty("v5") F v5,
            @JsonProperty("v6") G v6,
            @JsonProperty("v7") H v7
    )
    {
        return new Octet<>(v0, v1, v2, v3, v4, v5, v6, v7);
    }

}
