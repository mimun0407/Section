package section5.bai1.trungtamjava;

public class Laptop {
    private int id;
    private String LaptopName;
    private String LaptopDescription;
    private String LaptopType;

    public Laptop() {
    }

    public Laptop(int id, String laptopName, String laptopType, String laptopDescription) {
        this.id = id;
        LaptopName = laptopName;
        LaptopType = laptopType;
        LaptopDescription = laptopDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLaptopName() {
        return LaptopName;
    }

    public void setLaptopName(String laptopName) {
        LaptopName = laptopName;
    }

    public String getLaptopDescription() {
        return LaptopDescription;
    }

    public void setLaptopDescription(String laptopDescription) {
        LaptopDescription = laptopDescription;
    }

    public String getLaptopType() {
        return LaptopType;
    }

    public void setLaptopType(String laptopType) {
        LaptopType = laptopType;
    }
}
