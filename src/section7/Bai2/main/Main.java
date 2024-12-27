package section7.Bai2.main;

import section7.Bai2.model.Developer;
import section7.Bai2.model.Leader;
import section7.Bai2.model.Tester;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Developer> developersArr = new ArrayList<>();
    static ArrayList<Tester> testersArr = new ArrayList<>();
    static ArrayList<Leader> leadersArr = new ArrayList<>();

    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("---------------This is Menu Select to control---------------");
            System.out.println("1. Developer");
            System.out.println("2. Tester");
            System.out.println("3. Leader");
            System.out.println("4. Exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    DevController();
                    break;
                case 2:
                    TesterController();
                    break;
                case 3:
                    LeaderController();
                case 4:
                    check = false;
                    break;
            }
        }
    }

    private static void LeaderController() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("select to control |Leader|");
            System.out.println("1. Add Leader");
            System.out.println("2. Find all leaders");
            System.out.println("3, Leader who has members >10");
            System.out.println("4. Bonus");
            System.out.println("5. Exit");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    AddLeader();
                    break;
                case 2:
                    AllLeader();
                    break;
                case 3:
                    CheckLead();
                    break;
                case 4:
                    Bonus();
                case 5:
                    check = false;
            }
        }
    }

    private static void Bonus() {
        System.out.println("Bonus");
        int salary=10000000;
        for (Leader element : leadersArr) {
            if (element.getTeamSize() > 10) {
                System.out.println(element.getName() + "has the salary" + (salary + salary / 2));
            }
            else {
                System.out.println(element.getName() + "has the salary" + (salary + salary / 10));
            }
        }
    }

    private static void CheckLead() {
        System.out.println("Leader who has members >10 is: ");
        leadersArr.stream().filter(leader -> leader.getTeamSize()>10).forEach(Leader::info);
    }

    private static void AllLeader() {
        leadersArr.forEach(Leader::info);
    }

    private static void AddLeader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the leader you would like to add");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Leader Id");
            int id = scanner.nextInt();
            System.out.println("Enter Leader name");
            String name = scanner.next();
            System.out.println("Enter Leader age");
            int age = scanner.nextInt();
            System.out.println("Team number");
            int team = scanner.nextInt();
            Leader leader = new Leader(id, name, age, team);
            leadersArr.add(leader);
        }
    }

    private static void TesterController() {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println("Select to control |Tester|");
            System.out.println("1 Add Tester ");
            System.out.println("2 FindAll Tester ");
            System.out.println("3 exit ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    AddTester();
                    break;
                case 2:
                    findAllTester();
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

    private static void AddTester() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number to add tester");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Tester Id");
            int id = scanner.nextInt();
            System.out.println("Enter Tester name");
            String name = scanner.next();
            System.out.println("Enter Tester age");
            int age = scanner.nextInt();
            System.out.println("Enter Tester tool");
            String tool = scanner.next();
            Tester tester = new Tester(id, name, age, tool);
            testersArr.add(tester);
        }
        testersArr.forEach(Tester::info);
    }

    private static void findAllTester() {
        developersArr.forEach(Developer::info);
    }


    public static void DevController() {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println("Select to control |Developer|");
            System.out.println("1 Add Developer");
            System.out.println("2 Programing language search");
            System.out.println("3 All Developers");
            System.out.println("4 exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    addDeveloper();
                    break;
                case 2:
                    findProgram();
                    break;
                case 3:
                    SearchAllDevelopers();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }

    }

    public static void addDeveloper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Developer number");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Developer Id");
            int id = scanner.nextInt();
            System.out.println("Enter Developer name");
            String name = scanner.next();
            System.out.println("Enter Developer age");
            int age = scanner.nextInt();
            System.out.println("Enter Developer program language");
            String programLanguage = scanner.next();
            Developer developer = new Developer(id, name, age, programLanguage);
            developersArr.add(developer);
        }
        developersArr.forEach(Developer::info);
    }

    public static void SearchAllDevelopers() {
        developersArr.forEach(Developer::info);
    }

    public static void findProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Program Language name");
        String program = scanner.next();
        developersArr.stream().filter(developer -> developer
                        .getProgramLanguage()
                        .equals(program))
                .forEach(Developer::info);
    }
}
