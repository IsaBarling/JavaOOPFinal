package terminal;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
    private static final String ADD = "/add";
    private static final String DELETE = "/delete";
    private static final String STUDENT = "/student";

    private final ArrayList<String> commands;
    private final String mainCommand;

    public Command(ArrayList<String> commands) {
        this.commands = commands;
        this.mainCommand = commands.get(0);
    }

    public ArrayList<String> getCommands() {
=======
import java.util.Arrays;
import java.util.List;
public class Command {

    private static final String ADD = "/add";
    private static final String DELETE = "/delete";

    private final List<String> commands;
    private final String mainCommand;

    public Command(String input) {
        this.commands = Arrays.stream(input.split(" ")).toList();
        this.mainCommand = commands.get(0);
    }

    public List<String> getCommands() {
>>>>>>> origin/master
        return commands;
    }

    public String getMainCommand() {
        return mainCommand;
    }

    public boolean isAddCommand() {
        return commands.get(0).equals(ADD);
    }

<<<<<<< HEAD

=======
>>>>>>> origin/master
    public boolean isDeleteCommand() {
        return commands.get(0).equals(DELETE);
    }

<<<<<<< HEAD
    public boolean isStudentCommand() {
        return commands.size() > 1 && commands.get(1).equals(STUDENT);
    }

=======
>>>>>>> origin/master
    @Override
    public String toString() {
        return String.join(" ", commands);
    }
}
