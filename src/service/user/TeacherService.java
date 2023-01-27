package service.user;

import data.user.Student;
import data.user.Teacher;
import data.user.User;
import repository.TeacherRepository;

import java.util.List;

public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {

        this.teacherRepository = teacherRepository;
    }

    @Override
    public void write(User user) {

    }

    @Override
    public List<Teacher> read(String path) {
        return null;
    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public void write(Teacher user) {

    }

    @Override
    public User read(Teacher user) {
        return null;
    }

    @Override
    public void write(Student user) {

    }

    @Override
    public User read(Student user) {
        return null;
    }
}
