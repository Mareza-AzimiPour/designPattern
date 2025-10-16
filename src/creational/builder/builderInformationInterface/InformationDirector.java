package creational.builder.builderInformationInterface;

/**
 * The {@code InformationDirector} class encapsulates the construction
 * process of complex {@link Information} objects using a chosen
 * {@link InforamtionBuilder} implementation.
 * <p>
 * Acting as the <em>Director</em> in the Builder Design Pattern,
 * this class defines standardized build sequences for creating
 * different versions of an {@code Information} product—such as a
 * full or minimal representation—without exposing the construction
 * logic to the client.
 * </p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * // Using FullInformationBuiledr
 * InformationDirector director =
 *         new InformationDirector(new FullInformationBuiledr());
 * Information full = director.constructFullVersion();
 *
 * // Using MinimalInformationBuilder
 * director = new InformationDirector(new MinimalInformationBuilder());
 * Information minimal = director.constructMinimalVersion();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class InformationDirector {

    /**
     * The builder responsible for constructing {@link Information} instances.
     */
    private final InforamtionBuilder builder;

    /**
     * Constructs an {@code InformationDirector} with the specified builder.
     *
     * @param builder the builder instance to delegate construction tasks to
     */
    public InformationDirector(InforamtionBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs and returns a fully populated {@link Information} object
     * using the configured {@link InforamtionBuilder}.
     *
     * @return the fully constructed {@code Information} instance
     */
    public Information constructFullVersion() {
        return builder
                .firstName("Mohammadreza")
                .lastName("Azimipour")
                .email("mreza@example.com")
                .phoneNumber("+98 912******9")
                .city("Tehran")
                .country("Iran")
                .build();
    }

    /**
     * Constructs and returns a simplified {@link Information} object
     * using only essential fields.
     *
     * @return the minimally constructed {@code Information} instance
     */
    public Information constructMinimalVersion() {
        return builder
                .firstName("Ali")
                .email("ali@gmail.com")
                .build();
    }
}
