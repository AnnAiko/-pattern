package lab_11_2;

public class Lab_11_2 {

    public static void main(String[] args) {
        Distribute distribute = new Distribute();
        int random = 0;
        //Сгенерировать случайное число
        for (int i = 0; i < 4; i++) {
            random = 1 + (int) (Math.random() * 7);
            distribute.defineFigure(random);
        }
    }
}
