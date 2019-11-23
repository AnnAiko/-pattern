package lab_11_4;

//Состояние - сдано на проверку
public class giveCheckState implements State {

    private static final String NAME = "сдано на проверку";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        task.setCurrentState(new CheckState());
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("Нельзя сдавать чистый лист");
        task.setCurrentState(new PerformState());
    }
}
