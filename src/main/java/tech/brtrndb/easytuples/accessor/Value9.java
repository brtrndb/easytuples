package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 9.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value9<V> {

    /**
     * Get value at 9.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v9();

}
