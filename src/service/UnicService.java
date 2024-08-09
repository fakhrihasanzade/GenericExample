package service;

import java.util.List;

public interface UnicService<T> {


    List<T> getAll();
    T getById(int id);
    void add(T object);
    void update(int id,int gpa);
    void deleteById(int id);

}
