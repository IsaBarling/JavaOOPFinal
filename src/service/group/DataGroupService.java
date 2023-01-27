package service.group;

import data.group.Group;
import data.group.StudentGroup;
<<<<<<< HEAD
import data.group.TeacherGroup;
=======
>>>>>>> origin/master
import repository.GroupRepository;

public abstract class DataGroupService {

    private final GroupRepository groupRepository;

    protected DataGroupService(GroupRepository groupRepository) {
<<<<<<< HEAD

=======
>>>>>>> origin/master
        this.groupRepository = groupRepository;
    }

    public abstract void sort(Group group);

<<<<<<< HEAD
    public void save(TeacherGroup group) {

        groupRepository.save((TeacherGroup) group);
    }


=======
    public void save(StudentGroup group) {
        groupRepository.save((StudentGroup) group);
    }

    public Group findById(int id) {
        return groupRepository.findById(id);
    }
>>>>>>> origin/master
}
