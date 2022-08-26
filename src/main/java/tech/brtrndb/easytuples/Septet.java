package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value6;

public class Septet<A, B, C, D, E, F, G> extends Sextet<A, B, C, D, E, F> implements Value6<G> {

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

  public static <A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4,
    F v5,
    G v6
  ) {
    return new Septet<>(v0, v1, v2, v3, v4, v5, v6);
  }

}
