package controller.group;

import data.group.StudentGroup;
import data.user.Student;
import service.group.StudentGroupService;

public class StudentGroupController implements UserGroupController<StudentGroup, Student>{

    private final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public void sort(StudentGroup group) {
<<<<<<< HEAD
        studentGroupService.sort(group);
=======
>>>>>>> origin/master

    }

    @Override
<<<<<<< HEAD
    public StudentGroup save(int id) {
        return null;
    }


    public StudentGroup readGroup(String path, int groupNumber) {

        studentGroupService.readStudentGroup(path, groupNumber);
    }


    public void save(StudentGroup group) {
        studentGroupService.save(group);
=======
    public StudentGroup findById(int id) {
        return null;
    }

    @Override
    public void save(StudentGroup group) {
>>>>>>> origin/master

    }

    @Override
    public void remove(Student user, StudentGroup group) {
<<<<<<< HEAD
        studentGroupService.removeUser(user, group);
=======
>>>>>>> origin/master

    }

    @Override
    public void sortByFio(StudentGroup group) {
<<<<<<< HEAD
        studentGroupService.sort(group);
=======
>>>>>>> origin/master

    }
}
