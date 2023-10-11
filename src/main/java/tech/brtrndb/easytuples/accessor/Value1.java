package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 1.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value1<V> {

    /**
     * Get value at 1.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v1();

}
