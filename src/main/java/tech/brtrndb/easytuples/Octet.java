package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value7;

public class Octet<A, B, C, D, E, F, G, H> extends Septet<A, B, C, D, E, F, G> implements Value7<H> {

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

  public static <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4,
    F v5,
    G v6,
    H v7
  ) {
    return new Octet<>(v0, v1, v2, v3, v4, v5, v6, v7);
  }

}
