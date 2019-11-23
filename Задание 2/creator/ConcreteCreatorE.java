package lab_11_2.creator;
//Конкретная фабрика

import lab_11_2.figure.FigureE;

public class ConcreteCreatorE extends Creator {

    @Override
    public FigureE creatorFigure() {
        this.anOperation();
        return new FigureE();
    }
}
