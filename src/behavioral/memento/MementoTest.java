package behavioral.memento;

/**
 * MementoTest demonstrates the usage of the Memento Design Pattern.
 *
 * <p>
 * This class plays the role of the <b>Client</b>, showing how
 * the caretaker saves and restores the state of the originator
 * without breaking encapsulation.
 * </p>
 */
public class MementoTest {

    /**
     * Application entry point illustrating save and undo behavior.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        FileCareTaker fileCareTaker = new FileCareTaker();
        FileWriterUtils fileWriterUtils = new FileWriterUtils("data.txt");

        fileWriterUtils.write(
                "first set of data :\nPayman\nMareza\nVahid\n"
        );
        System.out.println(fileWriterUtils + "\n\n");

        fileCareTaker.save(fileWriterUtils);

        fileWriterUtils.write(
                "Second message of data:\nOmid\n"
        );
        System.out.println(fileWriterUtils + "\n\n");

        fileCareTaker.undo(fileWriterUtils);
        System.out.println(fileWriterUtils + "\n\n");
    }
}
