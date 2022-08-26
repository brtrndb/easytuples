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

  @Override
  public Trio<A, B, C> toTrio() {
    return new Trio<>(this.v0, this.v1, this.v2);
  }

  @Override
  public Quartet<A, B, C, ?> toQuartet() {
    return new Quartet<>(this.v0, this.v1, this.v2, null);
  }

  @Override
  public Quintet<A, B, C, ?, ?> toQuintet() {
    return new Quintet<>(this.v0, this.v1, this.v2, null, null);
  }

  @Override
  public Sextet<A, B, C, ?, ?, ?> toSextet() {
    return new Sextet<>(this.v0, this.v1, this.v2, null, null, null);
  }

  @Override
  public Septet<A, B, C, ?, ?, ?, ?> toSeptet() {
    return new Septet<>(this.v0, this.v1, this.v2, null, null, null, null);
  }

  @Override
  public Octet<A, B, C, ?, ?, ?, ?, ?> toOctet() {
    return new Octet<>(this.v0, this.v1, this.v2, null, null, null, null, null);
  }

  @Override
  public Nonet<A, B, C, ?, ?, ?, ?, ?, ?> toNonet() {
    return new Nonet<>(this.v0, this.v1, this.v2, null, null, null, null, null, null);
  }

  @Override
  public Decet<A, B, C, ?, ?, ?, ?, ?, ?, ?> toDecet() {
    return new Decet<>(this.v0, this.v1, this.v2, null, null, null, null, null, null, null);
  }

  public static <A, B, C> Trio<A, B, C> of(
    A v0,
    B v1,
    C v2
  ) {
    return new Trio<>(v0, v1, v2);
  }

}
