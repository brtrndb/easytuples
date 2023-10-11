package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 4.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value4<V> {

    /**
     * Get value at 4.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v4();

}
