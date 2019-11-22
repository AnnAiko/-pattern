package lab_11_3;
//Интерфейс наблюдателя которым пользуется издатель для отправки оповещения 
public interface Observer {
    void handleEvent(String event);
}
