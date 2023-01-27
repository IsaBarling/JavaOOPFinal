package controller.group;

import data.group.GroupStream;
import service.group.GroupStreamService;

public class GroupStreamController implements GroupController<GroupStream> {
    private final GroupStreamService groupStreamService;

    public GroupStreamController(GroupStreamService groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

    @Override
    public void sort(GroupStream group) {

    }

    @Override
<<<<<<< HEAD
    public GroupStream save(int id) {
        return null;
    }


=======
    public GroupStream findById(int id) {
        return null;
    }

    @Override
    public void save(GroupStream group) {

    }
>>>>>>> origin/master
}
