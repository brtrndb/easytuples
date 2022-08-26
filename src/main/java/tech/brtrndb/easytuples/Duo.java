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

  @Override
  public Duo<A, B> toDuo() {
    return new Duo<>(this.v0, this.v1);
  }

  @Override
  public Trio<A, B, ?> toTrio() {
    return new Trio<>(this.v0, this.v1, null);
  }

  @Override
  public Quartet<A, B, ?, ?> toQuartet() {
    return new Quartet<>(this.v0, this.v1, null, null);
  }

  @Override
  public Quintet<A, B, ?, ?, ?> toQuintet() {
    return new Quintet<>(this.v0, this.v1, null, null, null);
  }

  @Override
  public Sextet<A, B, ?, ?, ?, ?> toSextet() {
    return new Sextet<>(this.v0, this.v1, null, null, null, null);
  }

  @Override
  public Septet<A, B, ?, ?, ?, ?, ?> toSeptet() {
    return new Septet<>(this.v0, this.v1, null, null, null, null, null);
  }

  @Override
  public Octet<A, B, ?, ?, ?, ?, ?, ?> toOctet() {
    return new Octet<>(this.v0, this.v1, null, null, null, null, null, null);
  }

  @Override
  public Nonet<A, B, ?, ?, ?, ?, ?, ?, ?> toNonet() {
    return new Nonet<>(this.v0, this.v1, null, null, null, null, null, null, null);
  }

  @Override
  public Decet<A, B, ?, ?, ?, ?, ?, ?, ?, ?> toDecet() {
    return new Decet<>(this.v0, this.v1, null, null, null, null, null, null, null, null);
  }

  public static <A, B> Duo<A, B> of(
    A v0,
    B v1
  ) {
    return new Duo<>(v0, v1);
  }

}
