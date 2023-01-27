package data.group;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import data.iterators.GroundStreamIterator;


public class GroupStream implements Iterable<StudentGroup>, Comparable<GroupStream>, Group{
    private List<StudentGroup> groups;

    public GroupStream(List<StudentGroup> groups) {

        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {

        return groups;
    }


    @Override
    public int compareTo(GroupStream o) {

        return Integer.compare(this.groups.size(), o.groups.size());
    }



    public Collection<Object> getUsers() {
        return null;
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        return null;
    }
}
