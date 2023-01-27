package data.user;

public abstract class User  {

<<<<<<< HEAD
    protected final String name;
    protected final int age;
    protected final int passport;

    protected User(String name, int age, int passport){
        this.name = name;
        this.age = age;
        this.passport = passport;
    }
=======
    private String name;
    private int age;
    private int passport;
>>>>>>> origin/master

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public int getPassport() {

        return passport;
    }

<<<<<<< HEAD
    @Override
    public abstract String toString();

=======
    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setPassport(int passport) {

        this.passport = passport;
    }



    public User() {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public abstract void write(String path);

    public abstract void read(String path);

    public int compare(User o1, User o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        
        if( name1 == name2)
        {   return 0;}
        else if (name1 == null) 
        {
            return -1;
        }
        if (name2 == null) 
        {
            return 1;
        }
        else  
        {
            return name1.compareTo(name2);
        }                  

    }

    public abstract int compareTo(User o);
>>>>>>> origin/master
}
