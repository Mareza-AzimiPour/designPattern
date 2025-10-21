package structural.proxy.staticProxy;

/**
 * Proxy class that controls access to the {@link RealImage} object.
 * <p>
 * Implements lazy initialization — the real image is only loaded from disk
 * when it is actually needed (when {@link #display()} is called).
 * This avoids unnecessary resource usage if the image is never displayed.
 * </p>
 *
 * <p><b>Pattern Role:</b> Proxy</p>
 *
 * <p><b>Behavior:</b> When the client requests {@link #display()}, this proxy checks
 * whether the real image is already created. If not, it loads and caches it for future calls.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>
 *     Image img = new ProxyImage("photo.jpg");
 *     img.display(); // Loads from disk and displays
 *     img.display(); // Uses cached RealImage, no disk loading
 * </pre>
 *
 * @see RealImage
 * @see Image
 */
public class ProxyImage implements Image {

    /**
     * Cached instance of the real image, created only when needed.
     */
    private RealImage realImage;

    /**
     * The filename used for deferred loading of the image.
     */
    private final String fileName;

    /**
     * Constructs a ProxyImage reference with the specified image file name.
     * The image will not be loaded immediately.
     *
     * @param fileName name of the image file to display lazily
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Displays the image, creating the real image if necessary.
     * <p>
     * This method ensures that the heavy loading operation is performed only once.
     * </p>
     */
    @Override
    public void display() {
        if (realImage == null) {

            realImage = new RealImage(fileName); // lazy loading
        }
        realImage.display();
    }
}

