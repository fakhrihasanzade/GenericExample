package entity;

public class TeacherEntity extends PersonEntity{

    private int id;
    private int salary;
    private String teach;

    public TeacherEntity(String fullname, int age, int id, int salary, String teach) {
        super(fullname, age);
        this.id = id;
        this.salary = salary;
        this.teach = teach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id=" + id +
                ", salary=" + salary +
                ", teach='" + teach + '\'' +
                '}';
    }
}
