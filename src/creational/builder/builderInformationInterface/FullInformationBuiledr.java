package creational.builder.builderInformationInterface;

/**
 * The {@code FullInformationBuiledr} class is a concrete implementation of
 * the {@link InforamtionBuilder} interface that builds a complete
 * {@link Information} object.
 * <p>
 * This builder supports setting all available fields of the
 * {@code Information} class, producing a fully populated product instance.
 * </p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * InforamtionBuilder builder = new FullInformationBuiledr();
 * Information info = builder
 *       .firstName("Mohammadreza")
 *       .lastName("Azimipour")
 *       .email("mreza@example.com")
 *       .phoneNumber("+98 912 345 6789")
 *       .city("Tehran")
 *       .country("Iran")
 *       .build();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class FullInformationBuiledr implements InforamtionBuilder {

    /**
     * The product being constructed.
     */
    private Information info;

    /**
     * Creates a new {@code FullInformationBuiledr} instance and
     * initializes a fresh {@link Information} object as the build target.
     */
    public FullInformationBuiledr() {
        this.info = new Information();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder firstName(String firstName) {
        info.setFirstName(firstName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder lastName(String lastName) {
        info.setLastName(lastName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder email(String email) {
        info.setEmail(email);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder phoneNumber(String phoneNumber) {
        info.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder city(String city) {
        info.setCity(city);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InforamtionBuilder country(String country) {
        info.setCountry(country);
        return this;
    }

    /**
     * Finalizes the construction process and returns the built
     * {@link Information} object.
     *
     * @return a fully constructed {@code Information} instance
     */
    @Override
    public Information build() {
        return info;
    }
}
