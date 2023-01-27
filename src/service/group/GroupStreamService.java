package service.group;

import data.comparators.UserGroupComparator;
import data.group.Group;
import data.group.GroupStream;
import repository.GroupRepository;
import service.group.DataGroupService;

import java.util.Comparator;

public class GroupStreamService extends DataGroupService {

    public GroupStreamService(GroupRepository groupRepository) {

        super(groupRepository);
    }

    @Override
    public void sort(Group groupStreams) {
        ((GroupStream) (groupStreams)).getGroups().sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }
}
