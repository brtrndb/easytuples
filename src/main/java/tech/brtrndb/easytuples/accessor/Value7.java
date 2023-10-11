package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 7.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value7<V> {

    /**
     * Get value at 7.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v7();

}
