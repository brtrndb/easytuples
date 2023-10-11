package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 5.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value5<V> {

    /**
     * Get value at 5.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v5();

}
