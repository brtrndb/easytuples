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

  @Override
  public Solo<A> toSolo() {
    return new Solo<>(this.v0);
  }

  @Override
  public Duo<A, ?> toDuo() {
    return new Duo<>(this.v0, null);
  }

  @Override
  public Trio<A, ?, ?> toTrio() {
    return new Trio<>(this.v0, null, null);
  }

  @Override
  public Quartet<A, ?, ?, ?> toQuartet() {
    return new Quartet<>(this.v0, null, null, null);
  }

  @Override
  public Quintet<A, ?, ?, ?, ?> toQuintet() {
    return new Quintet<>(this.v0, null, null, null, null);
  }

  @Override
  public Sextet<A, ?, ?, ?, ?, ?> toSextet() {
    return new Sextet<>(this.v0, null, null, null, null, null);
  }

  @Override
  public Septet<A, ?, ?, ?, ?, ?, ?> toSeptet() {
    return new Septet<>(this.v0, null, null, null, null, null, null);
  }

  @Override
  public Octet<A, ?, ?, ?, ?, ?, ?, ?> toOctet() {
    return new Octet<>(this.v0, null, null, null, null, null, null, null);
  }

  @Override
  public Nonet<A, ?, ?, ?, ?, ?, ?, ?, ?> toNonet() {
    return new Nonet<>(this.v0, null, null, null, null, null, null, null, null);
  }

  @Override
  public Decet<A, ?, ?, ?, ?, ?, ?, ?, ?, ?> toDecet() {
    return new Decet<>(this.v0, null, null, null, null, null, null, null, null, null);
  }

  public static <A> Solo<A> of(
    A v0
  ) {
    return new Solo<>(v0);
  }

}
