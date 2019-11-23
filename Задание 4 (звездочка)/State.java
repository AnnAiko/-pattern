package lab_11_4;

//Итерфейс сотояний
public interface State {

    String getName();

    public void makeTask(Task task);

    public void notMakeTask(Task task);

}
