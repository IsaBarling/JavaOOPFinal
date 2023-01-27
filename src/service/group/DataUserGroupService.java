package service.group;

import data.comparators.UserComparator;
import data.group.Group;
import data.group.UserGroup;
import data.user.User;
import repository.GroupRepository;

public abstract class DataUserGroupService extends DataGroupService {

    protected DataUserGroupService(GroupRepository groupRepository) {

        super(groupRepository);
    }

    public void removeUser(User student, UserGroup userGroup) {
        while (userGroup.iterator().hasNext()) {
            if (userGroup.iterator().next().equals(student)) {
                userGroup.iterator().remove();
            }
        }
    }

    @Override
    public void sort(Group userGroup) {

        ((UserGroup) (userGroup)).getUsers().sort(new UserComparator());
    }

}
