package lab_11_2.creator;


import lab_11_2.figure.Figure;
//Общая фабрика
public abstract class Creator {

    public abstract Figure creatorFigure();

    public void anOperation() {
        System.out.println("Фигура появилась: ");
    }
}
