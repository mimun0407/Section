package section7.Bai2.model;

public class Tester extends Person {
    private String testTools;

    public Tester(int id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }

    public Tester(String testTools) {
        this.testTools = testTools;
    }

    public String getTestTools() {
        return testTools;
    }

    public void setTestTools(String testTools) {
        this.testTools = testTools;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("TestTools: " + this.testTools);
    }
}
