package section7.Bai2.model;

public class Developer extends Person {
    private String programLanguage;
    public Developer(){

    }

    public Developer(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public Developer(int id, String name, int age, String programLanguage) {
        super(id, name, age);
        this.programLanguage = programLanguage;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Program Language: " + this.programLanguage);
    }

}
