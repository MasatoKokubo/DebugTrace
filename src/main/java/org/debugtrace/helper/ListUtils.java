// ListUtils.java
// (C) 2015 Masato Kokubo

package org.debugtrace.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Has utility methods for List.
 *
 * @since 3.0.0
 * @author Masato Kokubo
 */
public interface ListUtils {
    /**
     * Returns an unmodifiable List containing the elements.
     *
     * @param <E> the element type
     * @param elements an array of elements
     * @return a List
     */
    @SuppressWarnings("unchecked")
    public static <E> List<E> of(E... elements) {
        List<E> list = new ArrayList<>(elements.length);
        for (E element : elements)
            list.add(element);
        return Collections.unmodifiableList(list);
    }
}
