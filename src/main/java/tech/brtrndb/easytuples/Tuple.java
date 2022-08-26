package tech.brtrndb.easytuples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.Nullable;

public abstract class Tuple {

  protected final Object[] array;
  private final List<Object> list;

  protected Tuple() {
    this.array = new Object[this.size()];
    this.list = Arrays.asList(this.array);
  }

  public Optional<Object> findAt(int index) {
    if ((index < 0) || (this.size() <= index)) {
      return Optional.empty();
    }

    return Optional.ofNullable(this.array[index]);
  }

  public @Nullable Object getAt(int index) throws IndexOutOfBoundsException {
    if ((index < 0) || (this.size() <= index)) {
      throw new IndexOutOfBoundsException("Index position %d out of range: index range is [0-%d]".formatted(index, this.size() - 1));
    }

    return this.array[index];
  }

  public List<Object> toList() {
    return new ArrayList<>(this.list);
  }

  public <V> boolean contains(V value) {
    return this.list.contains(value);
  }

  public <V> boolean containsAll(Collection<V> values) {
    return new HashSet<>(this.list).containsAll(values);
  }

  public abstract int size();

  public abstract <A> Solo<A> toSolo();

  public abstract <A, B> Duo<A, B> toDuo();

  public abstract <A, B, C> Trio<A, B, C> toTrio();

  public abstract <A, B, C, D> Quartet<A, B, C, D> toQuartet();

  public abstract <A, B, C, D, E> Quintet<A, B, C, D, E> toQuintet();

  public abstract <A, B, C, D, E, F> Sextet<A, B, C, D, E, F> toSextet();

  public abstract <A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G> toSeptet();

  public abstract <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H> toOctet();

  public abstract <A, B, C, D, E, F, G, H, I> Nonet<A, B, C, D, E, F, G, H, I> toNonet();

  public abstract <A, B, C, D, E, F, G, H, I, J> Decet<A, B, C, D, E, F, G, H, I, J> toDecet();

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + Arrays.toString(this.array);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if ((o == null) || (this.getClass() != o.getClass())) {
      return false;
    }

    Tuple tuple = (Tuple) o;

    return Arrays.equals(this.array, tuple.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.array);
  }

}
