package tech.brtrndb.easytuples;

import org.jetbrains.annotations.Nullable;
import tech.brtrndb.easytuples.accessor.Value0;

public class Solo<A> extends Tuple implements Value0<A> {

  public static final int SIZE = 1;

  protected final A v0;

  protected Solo(A v0) {
    super();
    this.v0 = v0;
    this.array[0] = this.v0;
  }

  @Override
  public @Nullable A v0() {
    return this.v0;
  }

  @Override
  public int size() {
    return Solo.SIZE;
  }

  public static <A> Solo<A> of(
    A v0
  ) {
    return new Solo<>(v0);
  }

}
