
package lab_11_2.figure;

public class FigureD implements Figure{
    
    private int figure[][] = {
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

    @Override
    public void draw() {
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure.length; j++) {
                System.out.print(figure[i][j] + " ");
            }
            System.out.println();
        }
    }
}
