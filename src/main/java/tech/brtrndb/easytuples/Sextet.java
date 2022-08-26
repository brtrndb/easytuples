package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value5;

public class Sextet<A, B, C, D, E, F> extends Quintet<A, B, C, D, E> implements Value5<F> {

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

  public static <A, B, C, D, E, F> Sextet<A, B, C, D, E, F> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4,
    F v5
  ) {
    return new Sextet<>(v0, v1, v2, v3, v4, v5);
  }

}
