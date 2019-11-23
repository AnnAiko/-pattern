
package lab_11_2.creator;

import lab_11_2.figure.FigureD;

public class ConcreteCreatorD extends Creator{
    @Override
    public FigureD creatorFigure() {
        this.anOperation();
        return new FigureD();

    }
}
