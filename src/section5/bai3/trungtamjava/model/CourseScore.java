package section5.bai3.trungtamjava.model;

import section5.bai2.Student;

import java.util.Scanner;

public class CourseScore {
    private int id;
    private int score;
    private String name;
    public CourseScore (){

    }
    public CourseScore(int id, int score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public CourseScore input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id CourseScore ");
        int id = scanner.nextInt();
        System.out.println("nhập tên CourseScore ");
        String name = scanner.next();
        System.out.println("nhập score");
        int score = scanner.nextInt();
        this.setId(id);
        this.setScore(score);
        this.setName(name);
        return new CourseScore(id, score, name);
    }
    public void info(CourseScore courseScore) {
        System.out.println("id cua ban la: "+courseScore.id);
        System.out.println("Score cua ban la: "+courseScore.score);
        System.out.println("ten cua ban la:" +courseScore.name);
        if (score <= 5){
            System.out.println("hs Yeu");
        }
        else if (score < 7){
            System.out.println("hs Tb");
        }
        else if (score < 8){
            System.out.println("hs Kha");
        }
        else if (score < 9){
            System.out.println("hs Gio");
        }
        else {
            System.out.println(
                    "hs Xuat sac"
            );
        }

    }
}
