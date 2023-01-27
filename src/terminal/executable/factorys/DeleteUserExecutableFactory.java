package terminal.executable.factorys;

import data.user.Student;
import data.user.User;
import service.user.StudentUserService;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.DeleteStudentExecutable;
import terminal.executable.executables.NoneCommandExecutable;

public class DeleteUserExecutableFactory implements CommandUserExecutableFactory{
    private StudentUserService studentUserService;

    public DeleteUserExecutableFactory(StudentUserService studentUserService) {
        this.studentUserService = studentUserService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new DeleteStudentExecutable(studentUserService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
