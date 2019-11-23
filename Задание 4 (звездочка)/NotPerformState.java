package lab_11_4;

//Состояние - не выполнено
public class NotPerformState implements State {

    private static final String NAME = "не выполнено";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        task.setCurrentState(new PerformState());
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("С каждым разом у тебя все больше долгов");
    }
}
