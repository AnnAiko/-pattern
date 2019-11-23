package lab_11_4;

//Меняет свое состояние в зависимости от состояния объекта
public class Task {

    private State currentState = new IssuedState();

    public void makeTask() {
        System.out.println("Что-то делает. Задание " + currentState.getName());
        currentState.makeTask(this);
    }

    public void notMakeTask() {
        System.out.println("Ничего не делает. Задание " + currentState.getName());
        currentState.notMakeTask(this);
    }

    public State getCurrentState() {
        //System.out.println(currentState.getClass().getSimpleName());
        return currentState;
    }

    public void setCurrentState(State state) {
        System.out.println("Состояние изменено");
        this.currentState = state;
    }
}
