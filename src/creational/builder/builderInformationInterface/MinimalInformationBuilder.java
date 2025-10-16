package creational.builder.builderInformationInterface;

import creational.builder.builderWithInnerClass.Inforamtion;

/**
 * The {@code MinimalInformationBuilder} class is a concrete implementation of
 * the {@link InforamtionBuilder} interface that constructs a simplified
 * {@link Information} object containing only the essential fields.
 * <p>
 * This builder intentionally ignores optional attributes such as
 * {@code phoneNumber}, {@code city}, and {@code country}, making it suitable
 * for minimalist configurations where only core user data is required.
 * </p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * InforamtionBuilder builder = new MinimalInformationBuilder();
 * Information info = builder
 *       .firstName("Mohammadreza")
 *       .lastName("Azimipour")
 *       .email("mreza@example.com")
 *       .build();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class MinimalInformationBuilder implements InforamtionBuilder {

    /**
     * The {@link Information} product being built.
     */
    private Information info;

    /**
     * Creates a new {@code MinimalInformationBuilder} and initializes an
     * empty {@link Information} object to populate.
     */
    public MinimalInformationBuilder() {
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
     * Ignored in this minimal builder implementation.
     * <p>No operation is performed for this call.</p>
     *
     * @param phoneNumber ignored
     * @return the current builder instance
     */
    @Override
    public InforamtionBuilder phoneNumber(String phoneNumber) {
        return this;
    }

    /**
     * Ignored in this minimal builder implementation.
     * <p>No operation is performed for this call.</p>
     *
     * @param city ignored
     * @return the current builder instance
     */
    @Override
    public InforamtionBuilder city(String city) {
        return this;
    }

    /**
     * Ignored in this minimal builder implementation.
     * <p>No operation is performed for this call.</p>
     *
     * @param country ignored
     * @return the current builder instance
     */
    @Override
    public InforamtionBuilder country(String country) {
        return this;
    }

    /**
     * Finalizes and returns the constructed {@link Information} object.
     *
     * @return a partially populated {@code Information} instance containing
     * only the minimal required fields
     */
    @Override
    public Information build() {
        return info;
    }
}
