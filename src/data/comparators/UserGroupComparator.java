package data.comparators;

import data.group.GroupStream;
import data.group.UserGroup;

import java.util.Comparator;


public class UserGroupComparator implements Comparator<GroupStream>{


    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        return Integer.compare(o1.getUsers().size(), o2.getUsers().size());
    }
}
