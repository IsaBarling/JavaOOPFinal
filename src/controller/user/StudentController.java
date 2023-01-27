package controller.user;

import data.user.Student;
<<<<<<< HEAD
import service.user.StudentUserService;

import java.util.List;

public class StudentController  implements UserController<Student> {

    private final StudentUserService studentService;

    public StudentController(StudentUserService studentService) {
=======
import service.user.StudentService;

public class StudentController  implements UserController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
>>>>>>> origin/master

        this.studentService = studentService;
    }


    @Override
<<<<<<< HEAD
    public void write(Student student) {
        studentService.write(student);
    }

    @Override
    public List<Student> read(String path) {
        return studentService.read(path);
    }

    @Override
    public void save(Student entity) {
        studentService.saveUser(entity);

    }

    @Override
    public void delete(Student entity) {
        studentService.deleteUser(entity);

=======
    public Student create(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
        return UserController.super.findByLastName(LastName);
>>>>>>> origin/master
    }
}
