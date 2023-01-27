package data.user;

public class Student extends User implements Comparable<Student> {
<<<<<<< HEAD
    private final int groupNumber;


    public Student(String name, int age, int passport, int groupNumber) {
        super(name, age, passport);
        this.groupNumber = groupNumber;
    }
=======
    private int groupNumber;
    int checkedAge;
>>>>>>> origin/master

    public int getGroupNumber() {

        return groupNumber;
    }

<<<<<<< HEAD
    @Override
    public int compareTo(Student student) {
        if (student.getAge() < this.getAge()) return 1;
        if (student.getAge() > this.getAge()) return -1;
=======
    public void setGroupNumber(int groupNumber) {

        this.groupNumber = groupNumber;
    }

    public int getCheckedAge() {

        return checkedAge;
    }

    public void setCheckedAge(int checkedAge) {

        this.checkedAge = checkedAge;
    }

    public Student(String name, int age, int passport, int groupNumber) {
        super();
        this.groupNumber = groupNumber;
    }



    @Override
    public void write(String path) {

    }

    @Override
    public void read(String path) {

    }

    @Override
    public int compareTo(User o) {
>>>>>>> origin/master
        return 0;
    }

    @Override
<<<<<<< HEAD
    public String toString() {
        return String.format("Student %s", name);
=======
    public int compareTo(Student st) {
        if(this.checkedAge==st.getCheckedAge())
            return 0;
        else if(this.checkedAge>st.getCheckedAge())
            return 1;
        else
            return -1;
>>>>>>> origin/master
    }
}

