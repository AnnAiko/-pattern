package lab_11_3;

//Субъект за действиями которого следят наблюдатели
import java.util.ArrayList;

public class Mail {

    private int id;
    private String edition;
    //private Subscriber observer;
    private ArrayList<Observer> sub = new ArrayList<Observer>();

    //Изменить издание
    public void changeEdition(String edition) {
        this.edition = edition;
        //Уведомить наблюдателей
        notifyObservers();
    }

    //Добавить наблюдателя
    public void addObserver(Observer observer) {
        sub.add(observer);

    }

    //Удалить наблюдателя
    public void removeObserver(Observer observer) {
        int index = sub.indexOf(observer);
        sub.remove(index);
    }

    //Уведомить наблюдателей
    private void notifyObservers() {
        for (Observer listener : sub) {
            listener.handleEvent(edition);
        }
    }

}
