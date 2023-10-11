package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 2.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value2<V> {

    /**
     * Get value at 2.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v2();

}
