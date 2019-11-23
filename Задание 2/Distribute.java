package lab_11_2;

import lab_11_2.creator.*;
import lab_11_2.figure.Figure;
//Определяет к какую фабрику вызвать в зависимости от значения
public class Distribute {

    public void defineFigure(int number) {
        switch (number) {
            case 1:
                drawFigure(new ConcreteCreatorA());
                break;
            case 2:
                drawFigure(new ConcreteCreatorB());
                break;
            case 3:
                drawFigure(new ConcreteCreatorC());
                break;
            case 4:
                drawFigure(new ConcreteCreatorD());
                break;
            case 5:
                drawFigure(new ConcreteCreatorE());
                break;
            case 6:
                drawFigure(new ConcreteCreatorF());
                break;
            case 7:
                drawFigure(new ConcreteCreatorG());
                break;
        }
    }
    //Отрисовать фигуру 
    public void drawFigure(Creator factory) {
        Figure figure = factory.creatorFigure();
        figure.draw();
    }
}
