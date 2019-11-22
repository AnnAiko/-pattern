package lab_11_3;

//Конкретный наблюдатель
public class Subscriber implements Observer {

    private String edition = "1001 совет и секрет";
    Mail mail;

    //Обновить состояние на действие субъекта
    @Override
    public void handleEvent(String newEdition) {
        if (newEdition.equals(edition)) {
            System.out.println("Subscriber1 получил издание " + edition);

        }
    }
}
