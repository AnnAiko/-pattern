package lab_11_3;

public class Lab_11_3 {

    public static void main(String[] args) {
        Mail mail = new Mail();
        //Добавить объекты в список наблюдателей
        Subscriber observer1 = new Subscriber();
        Subscriber2 observer2 = new Subscriber2();
        mail.addObserver(observer1);
        mail.addObserver(observer2);
        System.out.println("На почте появились издания:");
        System.out.println("1) 1001 совет и секрет");
        System.out.println("2) Мир фантастики");
        System.out.println("3) АБВГД - сказки, игры и уроки");
        mail.changeEdition("1001 совет и секрет");
        mail.changeEdition("Мир фантастики");
        mail.changeEdition("АБВГД - сказки, игры и уроки");
        //Mail mail2 = new Mail(2, "АБВГД - сказки, игры и уроки");

    }

}
