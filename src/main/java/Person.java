public class Person {
    private final String name;
    private final String surname;
    private int age = 0;
    private String city = "default";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(PersonBuilder builder) {
        name = builder.getName();
        surname = builder.getSurname();
        age = builder.getAge();
        if(builder.getAddress() != null) {
            city = builder.getAddress();
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    /**
     * Возраст человека может быть неизвестен, в этом случае метод должен вернуть false, иначе - true
     * @return взраст объекта известен - true, иначе - false.
     */
    boolean hasAge() {
        return age != 0;
    }
    /**
     * Если город проживания известен  должен вернуть true, иначе - false
     * @return город проживания известен - true, иначе - false
     */
    boolean hasAddress() {
        return city.equals("default");
    }
    /**
     * Если возраст человека известен, то с момента создания объекта он может быть
     * изменён только увеличением на единицу при каждом вызове метода.
     * @return сообщение об изменении или не изменении возраста объекта.
     */
    String happyBirthday() {
        String resultMsg;
        if(age != 0) {
            age++;
            resultMsg = "Your age = " + age + ".";
        } else {
            resultMsg = "Your age is not known";
        }
        return resultMsg;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
