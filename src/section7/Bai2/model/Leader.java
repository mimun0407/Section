package section7.Bai2.model;

public class Leader extends Person {
    private int teamSize;
    public Leader(){}

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    public Leader(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    @Override
    public void info(){
        super.info();
    System.out.println("Team Size: " + this.teamSize);}
}
