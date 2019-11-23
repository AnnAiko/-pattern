package lab_11_4;

//Соятояние - Проверено
public class CheckState implements State {

    private static final String NAME = "проверено";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        System.out.println("Все правильно. Молодец!!");
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("У тебя ошибки, переделай");
        task.setCurrentState(new PerformState());
    }
}
