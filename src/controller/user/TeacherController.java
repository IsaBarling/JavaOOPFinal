package controller.user;

import data.user.Teacher;
<<<<<<< HEAD
import service.user.TeacherUserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherUserService teacherService;

    public TeacherController(TeacherUserService teacherService) {

        this.teacherService = teacherService;
    }


    @Override
    public void write(Teacher teacher) {
        teacherService.write(teacher);
    }

    @Override
    public List<Teacher> read(String path) {
        return teacherService.read(path);
    }

    @Override
    public void save(Teacher entity) {
        teacherService.saveUser(entity);

    }

    @Override
    public void delete(Teacher entity) {
        teacherService.deleteUser(entity);

=======
import service.user.TeacherService;

public class TeacherController implements UserController<Teacher, Integer>{
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return UserController.super.findByLastName(LastName);
>>>>>>> origin/master
    }
}
