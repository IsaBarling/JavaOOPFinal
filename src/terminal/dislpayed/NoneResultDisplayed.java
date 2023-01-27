package terminal.dislpayed;

public class NoneResultDisplayed implements ResultDisplayed {
    @Override
    public void display() {
        System.out.println("Неверный ввод команды или данных студента");

    }
}
