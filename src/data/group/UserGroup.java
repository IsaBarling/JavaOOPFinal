package data.group;

import data.user.User;
import data.iterators.UserGroupIterator;

import java.util.Iterator;
import java.util.List;

public abstract class UserGroup implements Group, Iterable<User> {

    private final List<User> users;

    public UserGroup(List<User> users) {

        this.users = (List<User>) users;
    }

    public List<User> getUsers() {

        return (List<User>) users;
    }

    @Override
    public Iterator<User> iterator() {

        return new UserGroupIterator(this);
    }
}
