package tech.brtrndb.easytuples;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.jetbrains.annotations.Nullable;

public abstract class Tuple implements Iterable<Object>, Comparable<Tuple>, Serializable {

    @Serial
    private static final long serialVersionUID = -6874999003175259494L;

    protected final Object[]     array;
    private final   List<Object> list;

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
    public void forEach(Consumer<? super Object> action) {
        this.list.forEach(action);
    }

    @Override
    public Spliterator<Object> spliterator() {
        return this.list.spliterator();
    }

    @Override
    public Iterator<Object> iterator() {
        return this.list.iterator();
    }

    public Stream<Object> stream() {
        return this.list.stream();
    }

    @Override
    public int compareTo(Tuple t) {
        int length = this.array.length;
        Object[] otherValues = t.array;
        int otherValuesLength = otherValues.length;

        for (int i = 0; (i < length) && (i < otherValuesLength); i++) {
            Comparable<Object> current = (Comparable<Object>) this.array[i];
            Object otherCurrent = otherValues[i];

            int comparison = current.compareTo(otherCurrent);
            if (comparison != 0) {
                return comparison;
            }
        }

        return Integer.compare(length, otherValuesLength);
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
