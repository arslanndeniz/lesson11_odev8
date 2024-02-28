import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Örnek kullanım
        TeamLeader teamLeader = new TeamLeader("John", "Doe", LocalDate.of(1980, 5, 15));
        Department department = new Department(teamLeader);

        Person person1 = new Male("Mike", "Smith", LocalDate.of(1990, 8, 20));
        Person person2 = new Female("Emily", "Johnson", LocalDate.of(1985, 3, 10));

        department.addPersonnel(person1);
        department.addPersonnel(person2);

        System.out.println("Age of Mike: " + person1.calculateAge());
        System.out.println("Age of Emily: " + person2.calculateAge());

        System.out.println("Retirement age for Mike: " + ((Male) person1).calculateRetirementAge());
        System.out.println("Retirement age for Emily: " + ((Female) person2).calculateRetirementAge());
    }
}