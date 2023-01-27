package repository;

<<<<<<< HEAD
import data.group.Group;

public class GroupRepository implements Repository<Group> {
=======
import data.group.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer> {
>>>>>>> origin/master

    @Override
    public void save(Group entity) {

    }

    @Override
    public void delete(Group entity) {

    }

}