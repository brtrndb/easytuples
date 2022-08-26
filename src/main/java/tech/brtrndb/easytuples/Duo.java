package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value1;

public class Duo<A, B> extends Solo<A> implements Value1<B> {

  public static final int SIZE = 2;

  protected final B v1;

  protected Duo(A v0, B v1) {
    super(v0);
    this.v1 = v1;
    this.array[1] = this.v1;
  }

  @Override
  public @Nullable B v1() {
    return this.v1;
  }

  @Override
  public int size() {
    return Duo.SIZE;
  }

  public static <A, B> Duo<A, B> of(
    A v0,
    B v1
  ) {
    return new Duo<>(v0, v1);
  }

}
