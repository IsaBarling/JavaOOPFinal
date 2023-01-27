package controller.group;
<<<<<<< HEAD

import data.group.StudentGroup;
=======
>>>>>>> origin/master
import data.user.Teacher;
import data.group.TeacherGroup;
import service.group.TeacherGroupService;

public class TeacherGroupController implements UserGroupController<TeacherGroup, Teacher> {
    private final TeacherGroupService teacherGroupService;

    public TeacherGroupController(TeacherGroupService teacherGroupService) {
        this.teacherGroupService = teacherGroupService;
    }

    @Override
    public void sort(TeacherGroup group) {
<<<<<<< HEAD
        teacherGroupService.sort(group);
=======
>>>>>>> origin/master

    }

    @Override
<<<<<<< HEAD
    public TeacherGroup save(int id) {
        return null;
    }



    public void save(TeacherGroup group) {
        teacherGroupService.save(group);
=======
    public TeacherGroup findById(int id) {
        return null;
    }

    @Override
    public void save(TeacherGroup group) {
>>>>>>> origin/master

    }

    @Override
<<<<<<< HEAD
    public void remove(Teacher teacher, TeacherGroup group) {
        teacherGroupService.removeUser(teacher, group);

    }

    public TeacherGroup readGroup(String path, String departament) {

        teacherGroupService.readTeacherGroup(path, departament);
    }

    @Override
    public void sortByFio(TeacherGroup group) {
        teacherGroupService.sort(group);
=======
    public void remove(Teacher user, TeacherGroup group) {

    }

    @Override
    public void sortByFio(TeacherGroup group) {
>>>>>>> origin/master

    }
}
