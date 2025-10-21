package structural.proxy.staticProxy;

/**
 * Common interface representing an image resource in the Proxy Design Pattern.
 * <p>
 * Both {@link RealImage} (the real object) and {@link ProxyImage} (the proxy)
 * implement this interface to ensure a consistent API for clients.
 * </p>
 *
 * <p><b>Pattern Role:</b> Subject</p>
 *
 * @author Mohammad Reza
 */
public interface Image {

    /**
     * Displays the image on the screen.
     * <p>
     * In case of {@link RealImage}, it directly performs the display.
     * In case of {@link ProxyImage}, the real image may be lazily loaded
     * before being displayed.
     * </p>
     */
    void display();
}
