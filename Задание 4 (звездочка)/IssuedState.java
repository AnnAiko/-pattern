package lab_11_4;

//Состояние - задание выдано
public class IssuedState implements State {

    private static final String NAME = "выдано";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        task.setCurrentState(new PerformState());
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("Садись делай");
    }
}
