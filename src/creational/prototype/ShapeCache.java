package creational.prototype;

import java.util.Hashtable;

/**
 * The {@code ShapeCache} class acts as a centralized registry (cache)
 * for storing and retrieving preloaded {@link Shape} objects.
 * <p>
 * This class is part of the <b>Prototype Design Pattern</b>
 * and demonstrates how objects can be cloned instead of created
 * via the {@code new} keyword each time.
 * </p>
 *
 * <p><b>Pattern Role:</b> Prototype Registry / Cache</p>
 *
 * <p>
 * The static {@link #loadCache()} method initializes the cache
 * with a small collection of concrete shapes
 * (e.g., {@code Circle}, {@code Square}, {@code Rectangle}),
 * each assigned a unique ID.
 * </p>
 *
 * <p>
 * Clients can retrieve a cloned copy of any cached shape
 * using {@link #getShape(String)}, ensuring that any modification
 * to the returned object does not affect the cached original.
 * </p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * ShapeCache.loadCache();
 * Shape clonedShape = ShapeCache.getShape("2");
 * System.out.println("Shape : " + clonedShape.getType());
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-17
 */
public class ShapeCache {

    /**
     * Internal map used to store shape prototypes.
     * Each shape is accessible by its unique identifier.
     */
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * Returns a cloned copy of the {@link Shape} associated
     * with the specified ID from the internal cache.
     * <p>
     * The method uses the {@link Shape#clone()} implementation
     * defined in the {@code Shape} class to perform shallow cloning.
     * </p>
     *
     * @param shapeId the unique identifier of the desired shape
     * @return a new cloned {@code Shape} instance corresponding to the given ID,
     * or {@code null} if no shape with such ID exists
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * Loads the initial shape cache by creating and storing
     * predefined {@link Shape} objects such as {@code Circle},
     * {@code Square}, and {@code Rectangle}.
     * <p>
     * Each shape instance is assigned a unique identifier
     * and placed into the internal {@code Hashtable}.
     * </p>
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
