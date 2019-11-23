package lab_11_2.creator;

import lab_11_2.figure.*;

//Конкретная фабрика
public class ConcreteCreatorA extends Creator {

    @Override
    public FigureA creatorFigure() {
        this.anOperation();
        return new FigureA();

    }
}
