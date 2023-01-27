package terminal.executable.executables;

import data.user.Student;
import service.user.StudentUserService;

public class CreateStudentExecutable implements CommandExecutable{

    private final StudentUserService studentUserService;
    private final Student student;

    public CreateStudentExecutable(StudentUserService studentUserService, Student student) {
        this.studentUserService = studentUserService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentUserService.saveUser(student);
        System.out.println(studentUserService.getUsersList());
    }
}
