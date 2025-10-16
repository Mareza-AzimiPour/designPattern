package creational.builder.builderWithInnerClass;

public class BuilerTest {

    public static void main(String[] args) {
        Inforamtion info = Inforamtion.InforamtionBuilder.anInforamtion()
                .firstName("Mohammadreza")
                .lastName("Azimipour")
                .email("mreza@example.com")
                .phoneNumber("+98 912 **** 589")
                .nationalCode("1234567890")
                .address("Tehran, Andishe Street")
                .city("Tehran")
                .state("Tehran Province")
                .zipCode("14777")
                .country("Iran")
                .build();


        System.out.println("Full Name: " + info.firstName + " " + info.lastName);
        System.out.println("Email: " + info.email);
        System.out.println("Phone: " + info.phoneNumber);
        System.out.println("City: " + info.city + ", " + info.country);
    }
}
