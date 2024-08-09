package serviceimpl;

import entity.TeacherEntity;
import service.UnicService;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements UnicService<TeacherEntity> {

    static List<TeacherEntity> teachers = new ArrayList<>();

    static {
        teachers.add(new TeacherEntity("Fexri Hesenzade", 26, 1, 4000, "Math"));
        teachers.add(new TeacherEntity("Azer Hesenov", 70, 2, 4000, "Math"));
        teachers.add(new TeacherEntity("Ersad Muradov", 50, 3, 1000, "History"));
    }

    @Override
    public List<TeacherEntity> getAll() {
        return teachers;
    }

    @Override
    public TeacherEntity getById(int id) {

        for (TeacherEntity t : teachers) {
            if (t.getId() == id) {
                return t;
            }
        }

        return null;
    }

    @Override
    public void add(TeacherEntity object) {
        teachers.add(object);
    }

    @Override
    public void update(int id, int gpa) {
        for (TeacherEntity t : teachers) {
            if (t.getId() == id) {
                t.setSalary(gpa);
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (TeacherEntity t : teachers) {
            if (t.getId() == id) {
               teachers.remove(t);
            }
        }
    }
}
