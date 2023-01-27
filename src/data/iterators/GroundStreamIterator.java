package data.iterators;

import data.group.StudentGroup;
import data.group.GroupStream;

import java.util.Iterator;
import java.util.List;


public class GroundStreamIterator implements Iterator<StudentGroup> {

    private int cursor;
    private final GroupStream groundStream;
    private final List<StudentGroup> studentGroups;

    public GroundStreamIterator(int cursor, GroupStream groundStream, List<StudentGroup> studentGroups) {
        this.cursor = cursor;
        this.groundStream = groundStream;
        this.studentGroups = studentGroups;
    }

    public GroundStreamIterator(GroupStream groundStream, List<StudentGroup> studentGroups) {
        this.groundStream = groundStream;

        this.studentGroups = studentGroups;
    }


    @Override
    public boolean hasNext() {

        return cursor < studentGroups.size();
    }

    @Override
    public StudentGroup next() {

        return studentGroups.get(cursor++);
    }

    @Override
    public void remove() {

        studentGroups.remove(cursor);
    }
}
