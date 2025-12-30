package behavioral.iterator;

import behavioral.iterator.Iterator;

/**
 * Collection interface represents an aggregate object
 * that provides an iterator to traverse its elements.
 * <p>
 * This interface is part of the Iterator Design Pattern.
 */
public interface Collection {

    /**
     * Creates and returns an {@link Iterator} for the collection.
     *
     * @return an iterator instance for traversing the collection
     */
    Iterator getIterator();
}
