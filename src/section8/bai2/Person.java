package section8.bai2;

public class Person {
    private String name;
    private int age;
    private Country country;

    public Person(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
