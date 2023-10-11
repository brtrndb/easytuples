package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 0.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value0<V> {

    /**
     * Get value at 0.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v0();

}
