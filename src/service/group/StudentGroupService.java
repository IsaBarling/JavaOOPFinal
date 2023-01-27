package service.group;

import data.group.StudentGroup;
import repository.GroupRepository;

public class StudentGroupService extends DataUserGroupService {


    protected StudentGroupService(GroupRepository groupRepository) {
        super(groupRepository);
    }

    public StudentGroup readStudentGroup(String path, int groupNumber) {
        return null;
    }
}

