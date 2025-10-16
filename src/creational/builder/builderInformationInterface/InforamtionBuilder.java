package creational.builder.builderInformationInterface;

import creational.builder.builderWithInnerClass.Inforamtion;

/**
 * The {@code InforamtionBuilder} interface defines the standard steps
 * for constructing instances of the {@link Inforamtion} class.
 * <p>
 * It follows the Builder Design Pattern, allowing the construction
 * of complex {@code Inforamtion} objects step-by-step using method
 * chaining for improved readability and maintainability.
 * </p>
 *
 * <p>Each method in this interface returns the builder instance itself
 * so the calls can be chained fluently.</p>
 *
 * <p><b>Typical Usage:</b></p>
 * <pre>{@code
 * Inforamtion info = new FullInforamtionBuilder()
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
public interface InforamtionBuilder {

    /**
     * Sets the first name of the person.
     *
     * @param firstName the first name
     * @return the current builder instance
     */
    InforamtionBuilder firstName(String firstName);

    /**
     * Sets the last name of the person.
     *
     * @param lastName the last name
     * @return the current builder instance
     */
    InforamtionBuilder lastName(String lastName);

    /**
     * Sets the email address of the person.
     *
     * @param email the email address
     * @return the current builder instance
     */
    InforamtionBuilder email(String email);

    /**
     * Sets the phone number of the person.
     *
     * @param phoneNumber the phone number
     * @return the current builder instance
     */
    InforamtionBuilder phoneNumber(String phoneNumber);

    /**
     * Sets the city where the person lives.
     *
     * @param city the city name
     * @return the current builder instance
     */
    InforamtionBuilder city(String city);

    /**
     * Sets the country of residence.
     *
     * @param country the country name
     * @return the current builder instance
     */
    InforamtionBuilder country(String country);

    /**
     * Builds and returns the final {@link Information} product instance.
     *
     * @return a fully constructed {@code Inforamtion} object
     */
    Information build();
}
