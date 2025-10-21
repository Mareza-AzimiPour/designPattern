package structural.proxy.staticProxy;

/**
 * Represents the real object that performs the actual image loading and displaying operations.
 * <p>
 * This class simulates a resource-intensive operation by "loading"
 * the image from disk upon creation. Once loaded, the image can be displayed immediately.
 * </p>
 *
 * <p><b>Pattern Role:</b> RealSubject</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>
 *     Image img = new RealImage("photo.jpg");
 *     img.display();
 *     // Output:
 *     // Loading photo.jpg
 *     // Displaying photo.jpg
 * </pre>
 *
 * @see Image
 * @see ProxyImage
 */
public class RealImage implements Image {

    /**
     * The file name of the image to be loaded from disk.
     */
    private final String fileName;

    /**
     * Creates a new RealImage instance and performs the loading operation.
     *
     * @param fileName name of the image file to be loaded
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * Displays the image on the screen.
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    /**
     * Simulates a heavy operation of loading image data from disk.
     *
     * @param fileName the image file to load
     */
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

