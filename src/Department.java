import java.util.ArrayList;
import java.time.LocalDate; // LocalDate sınıfını içe aktarıyoruz
import java.time.Period;

class Department {
    private TeamLeader teamLeader;
    private ArrayList<Person> personnelList;
    private ArrayList<String> assignmentList;

    public Department(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    // Takım liderini değiştirme
    public void changeTeamLeader(TeamLeader newTeamLeader) {
        this.teamLeader = newTeamLeader;
    }

    // Personel ekleme
    public void addPersonnel(Person personnel) {
        this.personnelList.add(personnel);
    }

    // Personel çıkarma
    public void removePersonnel(Person personnel) {
        this.personnelList.remove(personnel);
    }

    // Personel değiştirme
    public void changePersonnel(Person oldPersonnel, Person newPersonnel) {
        int index = this.personnelList.indexOf(oldPersonnel);
        if (index != -1) {
            this.personnelList.set(index, newPersonnel);
        }
    }

    // Görev ekleme
    public void addAssignment(String assignment) {
        this.assignmentList.add(assignment);
    }

    // Görevi tamamlandı olarak işaretleme
    public void markAssignmentAsCompleted(String assignment) {
        this.assignmentList.remove(assignment);
        System.out.println("Assignment completed: " + assignment);
    }
}

class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Yaş hesaplama
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(this.birthDate, currentDate).getYears();
    }
}

class TeamLeader extends Person {
    public TeamLeader(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }
}

class Male extends Person {
    public Male(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    // Emeklilik yaşı hesaplama
    public int calculateRetirementAge() {
        return 65;
    }
}

class Female extends Person {
    public Female(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    // Emeklilik yaşı hesaplama
    public int calculateRetirementAge() {
        return 60;
    }
}
