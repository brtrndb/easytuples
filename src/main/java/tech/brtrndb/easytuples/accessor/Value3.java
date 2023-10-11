package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 3.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value3<V> {

    /**
     * Get value at 3.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v3();

}
