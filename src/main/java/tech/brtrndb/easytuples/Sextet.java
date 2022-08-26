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

  @Override
  public Sextet<A, B, C, D, E, F> toSextet() {
    return new Sextet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5);
  }

  @Override
  public Septet<A, B, C, D, E, F, ?> toSeptet() {
    return new Septet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null);
  }

  @Override
  public Octet<A, B, C, D, E, F, ?, ?> toOctet() {
    return new Octet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null);
  }

  @Override
  public Nonet<A, B, C, D, E, F, ?, ?, ?> toNonet() {
    return new Nonet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null, null);
  }

  @Override
  public Decet<A, B, C, D, E, F, ?, ?, ?, ?> toDecet() {
    return new Decet<>(this.v0, this.v1, this.v2, this.v3, this.v4, this.v5, null, null, null, null);
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
