package creational.prototype;

/**
 * The {@code Shape} class represents the abstract prototype
 * in the <b>Prototype Design Pattern</b>.
 * <p>
 * This class implements {@link Cloneable} so that its concrete
 * subclasses can create object copies without using the
 * {@code new} keyword directly. Each subclass must define its
 * own drawing behavior through the {@link #draw()} method.
 * </p>
 *
 * <p><b>Pattern Role:</b> Prototype (Abstract Class)</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Shape cachedShape = ShapeCache.getShape("1");
 * cachedShape.draw();
 * }</pre>
 *
 * <p>
 * The {@link #clone()} method performs a shallow copy using
 * {@code super.clone()} and returns a cloned {@code Shape}
 * instance.
 * </p>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-17
 */
public abstract class Shape implements Cloneable {

    /**
     * Unique identifier used to reference a shape instance in the cache.
     */
    private String id;

    /**
     * String value representing the type of the shape (e.g., Circle, Square).
     */
    protected String type;

    /**
     * Draws the shape.
     * <p>
     * Concrete subclasses must override this method to
     * provide their specific rendering logic.
     * </p>
     */
    abstract void draw();

    /**
     * Returns the unique identifier of this shape.
     *
     * @return the shape's identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for this shape.
     *
     * @param id the identifier to assign
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the type of this shape.
     *
     * @return the shape type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type for this shape.
     *
     * @param type the shape type to assign
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Creates and returns a shallow copy of this {@code Shape} instance.
     * <p>
     * This method uses {@link Object#clone()} under the hood. If the
     * cloning process fails, the method prints the stack trace and
     * returns {@code null}.
     * </p>
     *
     * @return a cloned {@code Shape} object, or {@code null} if cloning fails
     */
    @Override
    protected Object clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
