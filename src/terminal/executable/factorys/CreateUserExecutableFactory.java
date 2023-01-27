package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import service.user.StudentUserService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.CreateStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class CreateUserExecutableFactory implements CommandUserExecutableFactory{
    private final StudentUserService studentUserService;

    public CreateUserExecutableFactory(StudentUserService studentUserService) {
        this.studentUserService = studentUserService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new CreateStudentExecutable(studentUserService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
