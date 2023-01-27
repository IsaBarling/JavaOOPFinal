package service.user;

import data.user.Student;
import data.user.Teacher;
import data.user.User;
import repository.StudentRepository;

import java.util.List;

public class StudentService implements DataService<Student> {


    public StudentService(StudentRepository studentRepository) {

    }

    @Override
    public void write(User user) {

    }

    @Override
    public List<Student> read(String path) {
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

