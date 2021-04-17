public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if(name == null || surname == null) {
            throw new IllegalArgumentException("please enter name and surname of the object");
        } else if(age < 0) {
            throw new IllegalArgumentException("please enter the correct age of the object");
        }
        return new Person(this);
    }
}
