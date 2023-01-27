package terminal.executable.factorys;

import data.user.User;
import service.user.StudentUserService;
import terminal.Command;
import terminal.executable.executables.*;
import terminal.executable.formers.UserFormer;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private final UserFormerFactory userFormerFactory;
    private final CommandsFactory commandsFactory;
    protected final StudentUserService studentUserService;

    public CommandExecutableFactoryImpl(StudentUserService studentUserService) {
        this.studentUserService = studentUserService;
        this.userFormerFactory = new UserFormerFactory();
        this.commandsFactory = new CommandsFactory(studentUserService);
    }

    @Override
    public CommandExecutable create(Command command) {
        UserFormer userFormer = userFormerFactory.createUserFormer(command);
        User user = userFormer.createUser();

        if (user != null) {
           CommandUserExecutableFactory commandUserExecutableFactory = commandsFactory.createCommandFactory(command);
           return commandUserExecutableFactory.createCommandExecutable(user);
        } else return new NoneCommandExecutable();
    }
}
