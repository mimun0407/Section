package section5.bai2;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        Teacher teacher=new Teacher();
        student.input();
        teacher.input();
        student.info(student);
        teacher.info(teacher);
    }
}
