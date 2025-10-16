package creational.builder.builderWithInnerClass;

/**
 * The {@code Inforamtion} class represents a set of personal and contact information
 * about an individual such as name, email, phone number, and address.
 * <p>
 * Objects of this class are created using the {@link InforamtionBuilder},
 * which follows the Builder Design Pattern. This approach allows the creation of immutable
 * and well-structured instances by chaining builder methods.
 * </p>
 *
 * <p><b>Example usage:</b></p>
 * <pre>{@code
 * Inforamtion info = Inforamtion.InforamtionBuilder.anInforamtion()
 *     .firstName("Mohammadreza")
 *     .lastName("Azimipour")
 *     .email("mreza@example.com")
 *     .phoneNumber("+98 9-----89")
 *     .city("Tehran")
 *     .country("Iran")
 *     .build();
 * }</pre>
 *
 * <p><b>Design Pattern:</b> Builder (Inner Static Builder)</p>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class Inforamtion {
    //package-private
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String nationalCode;
    String address;
    String city;
    String state;
    String zipCode;
    String country;

    /**
     * Private constructor that accepts a builder instance.
     * It initializes the {@code Inforamtion} instance with values from the builder.
     *
     * @param inforamtionBuilder the builder object containing information data
     */
    private Inforamtion(InforamtionBuilder inforamtionBuilder) {
        this.firstName = inforamtionBuilder.firstName;
        this.lastName = inforamtionBuilder.lastName;
        this.email = inforamtionBuilder.email;
        this.phoneNumber = inforamtionBuilder.phoneNumber;
        this.nationalCode = inforamtionBuilder.nationalCode;
        this.address = inforamtionBuilder.address;
        this.city = inforamtionBuilder.city;
        this.state = inforamtionBuilder.state;
        this.zipCode = inforamtionBuilder.zipCode;
        this.country = inforamtionBuilder.country;
    }


    /**
     * The {@code InforamtionBuilder} class is used to create instances of
     * {@link Inforamtion} in a flexible and readable way.
     * <p>
     * It supports method chaining so that each setter method returns
     * the same builder instance for further setting.
     * </p>
     */
    public static final class InforamtionBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String nationalCode;
        private String address;
        private String city;
        private String state;
        private String zipCode;
        private String country;

        /**
         * Private constructor to prevent direct instantiation.
         * Use {@link #anInforamtion()} to get a builder instance.
         */
        private InforamtionBuilder() {
        }

        /**
         * Factory method to create a new instance of {@code InforamtionBuilder}.
         *
         * @return a new builder instance
         */
        public static InforamtionBuilder anInforamtion() {
            return new InforamtionBuilder();
        }

        /**
         * Sets the first name.
         *
         * @param firstName the first name of the person
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the last name.
         *
         * @param lastName the last name of the person
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the email address.
         *
         * @param email the email address of the person
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the phone number.
         *
         * @param phoneNumber the person's contact phone number
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets the national code.
         *
         * @param nationalCode the national identification code
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder nationalCode(String nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        /**
         * Sets the home address.
         *
         * @param address the address of the person
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Sets the city name.
         *
         * @param city the name of the city
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Sets the state or province.
         *
         * @param state the name of the state or province
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the postal or ZIP code.
         *
         * @param zipCode the postal code
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Sets the country name.
         *
         * @param country the country name
         * @return the same builder instance for method chaining
         */
        public InforamtionBuilder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Builds and returns a new {@link Inforamtion} instance
         * with the values supplied to this builder.
         *
         * @return a new immutable {@code Inforamtion} instance
         */
        public Inforamtion build() {
            return new Inforamtion(this);
        }
    }
}
