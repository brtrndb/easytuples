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

    protected Tuple(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Tuple size must be greater than 0.");
        }

        this.array = new Object[size];
        this.list = Arrays.asList(this.array);
    }

    /**
     * Find for a value at a specified position.
     *
     * @param index
     *         The index in the tuple.
     *
     * @return An {@link Optional} containing the object, empty if {@code index} is out of range, or if the object is {@code null}.
     */
    public Optional<Object> findAt(int index) {
        if ((index < 0) || (this.size() <= index)) {
            return Optional.empty();
        }

        return Optional.ofNullable(this.array[index]);
    }

    /**
     * Get the value at specified position.
     *
     * @param index
     *         The index in the tuple.
     *
     * @return The value, may be {@code null}.
     *
     * @throws IndexOutOfBoundsException
     *         if {@code index} is negative or greater than the tuple's size.
     */
    public @Nullable Object getAt(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (this.size() <= index)) {
            throw new IndexOutOfBoundsException("Index position %d out of range: index range is [0-%d]".formatted(index, this.size() - 1));
        }

        return this.array[index];
    }

    /**
     * Convert the tuple into a {@link List} containing values in the same order as in the tuple.
     *
     * @return The list.
     */
    public List<Object> toList() {
        return new ArrayList<>(this.list);
    }

    /**
     * Check if the tuple contains the provided value.
     *
     * @param value
     *         The value to check.
     * @param <V>
     *
     * @return {@code true} if the value is in the tuple, {@code false} otherwise.
     */
    public <V> boolean contains(V value) {
        return this.list.contains(value);
    }

    /**
     * Check if the current tuple contains all
     *
     * @param values
     *         The values to check.
     * @param <V>
     *
     * @return {@code true} if all values are in the tuple, {@code false} otherwise.
     */
    public <V> boolean containsAll(Collection<V> values) {
        return new HashSet<>(this.list).containsAll(values);
    }

    /**
     * Get the size of the tuple.
     *
     * @return The tuple's size.
     */
    public abstract int size();

    /**
     * Convert the tuple into a {@link Solo}.
     *
     * @param <A>
     *
     * @return A {@link Solo}.
     */
    public abstract <A> Solo<A> toSolo();

    /**
     * Convert the tuple into a {@link Duo}.
     *
     * @param <A>
     * @param <B>
     *
     * @return A {@link Duo}.
     */
    public abstract <A, B> Duo<A, B> toDuo();

    /**
     * Convert the tuple into a {@link Trio}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     *
     * @return A {@link Trio}.
     */
    public abstract <A, B, C> Trio<A, B, C> toTrio();

    /**
     * Convert the tuple into a {@link Quartet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     *
     * @return A {@link Quartet}.
     */
    public abstract <A, B, C, D> Quartet<A, B, C, D> toQuartet();

    /**
     * Convert the tuple into a {@link Quintet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     *
     * @return A {@link Quintet}.
     */
    public abstract <A, B, C, D, E> Quintet<A, B, C, D, E> toQuintet();

    /**
     * Convert the tuple into a {@link Sextet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     *
     * @return A {@link Sextet}.
     */
    public abstract <A, B, C, D, E, F> Sextet<A, B, C, D, E, F> toSextet();

    /**
     * Convert the tuple into a {@link Septet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     *
     * @return A {@link Septet}.
     */
    public abstract <A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G> toSeptet();

    /**
     * Convert the tuple into a {@link Octet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     *
     * @return A {@link Octet}.
     */
    public abstract <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H> toOctet();

    /**
     * Convert the tuple into a {@link Nonet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     * @param <I>
     *
     * @return A {@link Nonet}.
     */
    public abstract <A, B, C, D, E, F, G, H, I> Nonet<A, B, C, D, E, F, G, H, I> toNonet();

    /**
     * Convert the tuple into a {@link Decet}.
     *
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     * @param <I>
     * @param <J>
     *
     * @return A {@link Decet}.
     */
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
