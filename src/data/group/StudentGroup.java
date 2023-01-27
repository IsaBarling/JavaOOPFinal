package data.group;

import java.util.List;

import data.user.Student;
import data.user.Teacher;
import data.user.User;

public class StudentGroup extends UserGroup implements Comparable<StudentGroup> {
    private final Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;


    public StudentGroup(Teacher teacher, List<User> studentList, int groupNumber) {
        super(studentList);


        this.teacher = teacher;

        this.groupNumber = groupNumber;
    }



    public void StudentGroupNumber(int number)
    {
        this.groupNumber = number;
    }



    public List<Student> getStudentList() {
        return studentList;
    }


    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }

    public void remove() {
    }
}

