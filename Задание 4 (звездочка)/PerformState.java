package lab_11_4;

//Состояние - Выполнено
public class PerformState implements State {

    private static final String NAME = "выполнено";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        task.setCurrentState(new CheckState());

        /*if (task.getCurrentState().equals(new IssuedState())) {
            task.setCurrentState(new CheckState());
        } else if (task.getCurrentState().equals(new CheckState())) {
            System.out.println("Делай. У тебя все получится");
            task.setCurrentState(new againGiveCheckState());
        }*/
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("Ты ничего не сделал");
    }

}
