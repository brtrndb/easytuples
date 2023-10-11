package tech.brtrndb.easytuples.accessor;

import org.jetbrains.annotations.Nullable;

/**
 * Interface for tuples with value at position 8.
 *
 * @param <V>
 *
 * @author Bertrand B.
 */
public interface Value8<V> {

    /**
     * Get value at 8.
     *
     * @return The value, may be {@code null}.
     */
    @Nullable V v8();

}
