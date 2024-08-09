package entity;

public class StudentEntity extends PersonEntity{

    private int id;
    private String speciality;
    private int gpa;

    public StudentEntity(String fullname, int age, int id, String speciality, int gpa) {
        super(fullname, age);
        this.id = id;
        this.speciality = speciality;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", speciality='" + speciality + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
