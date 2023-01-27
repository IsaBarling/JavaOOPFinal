package data.user;

<<<<<<< HEAD
import java.util.Collections;
import java.util.List;

public class Teacher extends User {
    private String department;
    private List<Integer> groups;

    private String faculty;
    public Teacher(String name, int age, int passport, String faculty) {
        super(name, age, passport);
        this.faculty = faculty;
        this.groups = groups;
    }

    public List<Integer> getGroups() {
        return groups;
    }


    @Override
    public String toString() {
        return String.format("Teacher %s", name);
    }
=======
public class Teacher extends User {

    private String faculty;
    public Teacher(String name, int age, int passport, String faculty) {
        super();
        this.faculty = faculty;
    }

    @Override
    public void write(String path) {

    }

    @Override
    public void read(String path) {

    }

    @Override
    public int compareTo(User o) {
        return 0;
    }


>>>>>>> origin/master
}
