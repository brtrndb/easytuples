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

  @Override
  public Quartet<A, B, C, D> toQuartet() {
    return new Quartet<>(this.v0, this.v1, this.v2, this.v3);
  }

  @Override
  public Quintet<A, B, C, D, ?> toQuintet() {
    return new Quintet<>(this.v0, this.v1, this.v2, this.v3, null);
  }

  @Override
  public Sextet<A, B, C, D, ?, ?> toSextet() {
    return new Sextet<>(this.v0, this.v1, this.v2, this.v3, null, null);
  }

  @Override
  public Septet<A, B, C, D, ?, ?, ?> toSeptet() {
    return new Septet<>(this.v0, this.v1, this.v2, this.v3, null, null, null);
  }

  @Override
  public Octet<A, B, C, D, ?, ?, ?, ?> toOctet() {
    return new Octet<>(this.v0, this.v1, this.v2, this.v3, null, null, null, null);
  }

  @Override
  public Nonet<A, B, C, D, ?, ?, ?, ?, ?> toNonet() {
    return new Nonet<>(this.v0, this.v1, this.v2, this.v3, null, null, null, null, null);
  }

  @Override
  public Decet<A, B, C, D, ?, ?, ?, ?, ?, ?> toDecet() {
    return new Decet<>(this.v0, this.v1, this.v2, this.v3, null, null, null, null, null, null);
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
