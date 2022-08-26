package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value2;

public class Trio<A, B, C> extends Duo<A, B> implements Value2<C> {

  public static final int SIZE = 3;

  protected final C v2;

  protected Trio(A v0, B v1, C v2) {
    super(v0, v1);
    this.v2 = v2;
    this.array[2] = this.v2;
  }

  @Override
  public @Nullable C v2() {
    return this.v2;
  }

  @Override
  public int size() {
    return Trio.SIZE;
  }

  public static <A, B, C> Trio<A, B, C> of(
    A v0,
    B v1,
    C v2
  ) {
    return new Trio<>(v0, v1, v2);
  }

}
