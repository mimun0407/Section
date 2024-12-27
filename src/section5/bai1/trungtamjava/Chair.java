package section5.bai1.trungtamjava;

public class Chair {
    private int id;
    private String chairName;
    private String chairType;

    public Chair(int id, String chairName, String chairType) {
        this.id = id;
        this.chairName = chairName;
        this.chairType = chairType;
    }

    public Chair() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChairType() {
        return chairType;
    }

    public void setChairType(String chairType) {
        this.chairType = chairType;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }
}
