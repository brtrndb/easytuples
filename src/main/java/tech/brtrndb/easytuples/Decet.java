package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value9;

public class Decet<A, B, C, D, E, F, G, H, I, J> extends Nonet<A, B, C, D, E, F, G, H, I> implements Value9<J> {

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

  public static <A, B, C, D, E, F, G, H, I, J> Decet<A, B, C, D, E, F, G, H, I, J> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4,
    F v5,
    G v6,
    H v7,
    I v8,
    J v9
  ) {
    return new Decet<>(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
  }

}
