package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value8;

public class Nonet<A, B, C, D, E, F, G, H, I> extends Octet<A, B, C, D, E, F, G, H> implements Value8<I> {

  public static final int SIZE = 9;

  protected final I v8;

  protected Nonet(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8) {
    super(v0, v1, v2, v3, v4, v5, v6, v7);
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

  public static <A, B, C, D, E, F, G, H, I> Nonet<A, B, C, D, E, F, G, H, I> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4,
    F v5,
    G v6,
    H v7,
    I v8
  ) {
    return new Nonet<>(v0, v1, v2, v3, v4, v5, v6, v7, v8);
  }

}
