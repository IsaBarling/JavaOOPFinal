<<<<<<< HEAD
import service.user.StudentUserService;
import terminal.TerminalReader;
import terminal.displayed.StudentMenu;

import terminal.executable.factorys.LoggingCommandExecutableFactory;


public class Main {
    public static void main(String[] args) {
        StudentMenu.displayMenu();
        TerminalReader.getInstance(new LoggingCommandExecutableFactory(new StudentUserService())).listenToCommands();
=======
public class Main {
    public static void main(String[] args) {
        //reads();
        //writes();
        System.out.println("Hi");
>>>>>>> origin/master
    }
}