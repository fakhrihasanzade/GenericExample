package serviceimpl;

import entity.StudentEntity;
import service.UnicService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements UnicService<StudentEntity> {

    static List<StudentEntity> students = new ArrayList<>();

    static {
        students.add(new StudentEntity("Fexri Hesenzade", 26, 1, "ComputerS", 95));
        students.add(new StudentEntity("Cesaret Hesenzade", 25, 2, "Management", 95));
        students.add(new StudentEntity("Qulamov Vusal", 20, 3, "celling", 51));
        students.add(new StudentEntity("Isayeva Gulyanaq", 36, 4, "Beauty", 95));
    }


    @Override
    public List<StudentEntity> getAll() {
        return students;
    }

    @Override
    public StudentEntity getById(int id) {
        for (StudentEntity st : students) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
    }

    @Override
    public void add(StudentEntity object) {
        students.add(object);
    }

    @Override
    public void update(int id, int gpa) {
        for (StudentEntity st : students) {
            if (st.getId() == id) {
                st.setGpa(gpa);
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (StudentEntity st : students) {
            if (st.getId() == id) {
                students.remove(st);
            }
        }
    }
}
