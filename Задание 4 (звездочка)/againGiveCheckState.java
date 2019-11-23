package lab_11_4;

//Состояние - переснадо на проверку
public class againGiveCheckState implements State {

    private static final String NAME = "пересдано на проверку";

    public String getName() {
        return NAME;
    }

    @Override
    public void makeTask(Task task) {
        System.out.println("Хорошо. Сдал со второй попытки");
    }

    @Override
    public void notMakeTask(Task task) {
        System.out.println("Зачем сдаешь туже самую работу");
    }
}
