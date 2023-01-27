package controller.user;

<<<<<<< HEAD
import data.user.User;
import java.util.List;

public interface UserController <E extends User> {

    void write(E user);

    List<E> read(String path);

    void save(E entity);

    void delete(E entity);



=======
import controller.Controller;
import data.user.User;

public interface UserController <E extends User, I> extends Controller<E, I> {


    default E findByLastName(String LastName) {
        return null;
    }
>>>>>>> origin/master
}
