
public class Main {


    public static void main(String[] args) {
        Person father = new PersonBuilder()
                .setName("Alexey")
                .setSurname("Ivanov")
                .setAge(26)
                .setAddress("Krasnoyarsk")
                .build();
        System.out.println(father);

        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Ivanova")
                .setAge(23)
                .build();
        System.out.println(mom);

        Person son = new PersonBuilder()
                .setName("Mark")
                .setSurname("Ivanov")
                .build();
        System.out.println(son);

        try {
        Person person = new PersonBuilder()
                .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person person = new PersonBuilder()
                    .setName("Alexandr")
                    .setSurname("Volkov")
                    .setAge(-200)
                    .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
