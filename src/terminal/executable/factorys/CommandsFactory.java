package terminal.executable.factorys;

import service.user.StudentUserService;
import terminal.Command;

public class CommandsFactory {
    private final StudentUserService studentUserService;

    public CommandsFactory(StudentUserService studentUserService) {
        this.studentUserService = studentUserService;
    }

    public CommandUserExecutableFactory createCommandFactory(Command command){
        if(command.isAddCommand()){
            return new CreateUserExecutableFactory(studentUserService);
        } else if (command.isDeleteCommand()){
            return new DeleteUserExecutableFactory(studentUserService);
        } else return new NoneCommandUserExecutableFactory();
    }
}
