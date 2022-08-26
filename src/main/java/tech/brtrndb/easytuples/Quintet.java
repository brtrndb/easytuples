package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value4;

public class Quintet<A, B, C, D, E> extends Quartet<A, B, C, D> implements Value4<E> {

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

  public static <A, B, C, D, E> Quintet<A, B, C, D, E> of(
    A v0,
    B v1,
    C v2,
    D v3,
    E v4
  ) {
    return new Quintet<>(v0, v1, v2, v3, v4);
  }

}
