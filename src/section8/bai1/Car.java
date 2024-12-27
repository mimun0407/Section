package section8.bai1;

public class Car {
    private int id;
    private String CarName;
    private String CarType;
    private Person person;

    public Car() {
    }

    public Car(int id, String carName, String carType, Person person) {
        this.id = id;
        CarName = carName;
        CarType = carType;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
