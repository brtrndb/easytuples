package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value3;

public class Quartet<A, B, C, D> extends Trio<A, B, C> implements Value3<D> {

  public static final int SIZE = 4;

  protected final D v3;

  protected Quartet(A v0, B v1, C v2, D v3) {
    super(v0, v1, v2);
    this.v3 = v3;
    this.array[3] = this.v3;
  }

  @Override
  public @Nullable D v3() {
    return this.v3;
  }

  @Override
  public int size() {
    return Quartet.SIZE;
  }

  public static <A, B, C, D> Quartet<A, B, C, D> of(
    A v0,
    B v1,
    C v2,
    D v3
  ) {
    return new Quartet<>(v0, v1, v2, v3);
  }

}
