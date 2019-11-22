package lab_11_3;

public class Subscriber2 implements Observer {

    private String edition = "Мир фантастики";
    Mail mail;

    //Обновить состояние на действие субъекта
    @Override
    public void handleEvent(String newEdition) {
        if (newEdition.equals(edition)) {
            System.out.println("Subscriber2 получил издание " + edition);

        }
    }
}
