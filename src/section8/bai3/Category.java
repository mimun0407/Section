package section8.bai3;

public class Category {
    private String name;
    private int id;

    public Category() {
    }

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void info() {
        System.out.println("Category name"+ getName());
        System.out.println("Category id"+getId());
    }
}
