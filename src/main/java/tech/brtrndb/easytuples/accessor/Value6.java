package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 6.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value6<V> {

    /**
     * Get value at 6.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v6();

}
