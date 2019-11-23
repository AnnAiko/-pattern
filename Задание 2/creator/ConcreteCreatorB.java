package lab_11_2.creator;

import lab_11_2.figure.FigureB;
//Конкретная фабрика
public class ConcreteCreatorB extends Creator {

    @Override
    public FigureB creatorFigure() {
        this.anOperation();
        return new FigureB();
    }
}
