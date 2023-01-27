package terminal.executable.executables;

import data.user.Student;
import service.user.StudentUserService;

public class DeleteStudentExecutable implements CommandExecutable {
    private final StudentUserService studentUserService;
    private final Student student;

    public DeleteStudentExecutable(StudentUserService studentUserService, Student student) {
        this.studentUserService = studentUserService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentUserService.deleteUser(student);
        System.out.println(studentUserService.getUsersList());
    }
}
