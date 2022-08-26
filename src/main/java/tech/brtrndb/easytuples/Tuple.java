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
