package behavioral.iterator;

/**
 * Iterator interface defines methods for traversing through
 * a collection without exposing its internal structure.
 */
public interface Iterator {

    /**
     * Returns {@code true} if the collection has more elements.
     *
     * @return {@code true} if there are more elements to iterate over
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return next element as {@link Object}
     */
    Object next();
}
