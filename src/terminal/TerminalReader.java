package terminal;

<<<<<<< HEAD
import terminal.executable.executables.CommandExecutable;
import terminal.executable.factorys.CommandExecutableFactory;
=======
import terminal.executable.CommandExecutableFactory;
import terminal.executable.LoggingCommandExecutableFactory;
>>>>>>> origin/master

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

<<<<<<< HEAD
    public static TerminalReader getInstance(CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandExecutableFactory);
=======
    public static TerminalReader getInstance(CommandParser commandParser,
                                             CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
>>>>>>> origin/master
        }
        return terminalReader;
    }

<<<<<<< HEAD
    private TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = new CommandParser();
=======
    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
>>>>>>> origin/master
        this.commandExecutableFactory = commandExecutableFactory;
    }


    public void listenToCommands() {
        Scanner scan = new Scanner(System.in);
        while (true) {
<<<<<<< HEAD
            System.out.print("Ввод: ");
            String input = scan.nextLine();
            Command command = commandParser.parseCommand(input);

            CommandExecutable commandExecutable = commandExecutableFactory.create(command);
            commandExecutable.execute();
=======
            String input = scan.nextLine();
            Command command = commandParser.parseCommand(input);

            commandExecutableFactory.create(command);
>>>>>>> origin/master
        }
    }
}
