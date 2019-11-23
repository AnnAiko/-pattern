package lab_11_2.creator;

import lab_11_2.figure.FigureC;

public class ConcreteCreatorC extends Creator {

    @Override
    public FigureC creatorFigure() {
        this.anOperation();
        return new FigureC();

    }
}
