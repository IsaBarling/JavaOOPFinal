package service.user;

import data.user.Student;
import data.user.Teacher;
import data.user.User;

import java.util.List;

public interface DataService <E extends User> {
    void write (User user);
    List<E> read(String path);

    User read (User user);

    void write(Teacher user);

    User read(Teacher user);

    void write(Student user);

    User read(Student user);
}
