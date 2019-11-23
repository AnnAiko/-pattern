package lab_11_2.creator;

import lab_11_2.figure.FigureG;

public class ConcreteCreatorG extends Creator {

    @Override
    public FigureG creatorFigure() {
        this.anOperation();
        return new FigureG();
    }

}
