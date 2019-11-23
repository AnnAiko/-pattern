
package lab_11_2.creator;

import lab_11_2.figure.FigureF;

public class ConcreteCreatorF extends Creator{
    
    @Override
    public FigureF creatorFigure() {
        this.anOperation();
        return new FigureF();

    }
}
