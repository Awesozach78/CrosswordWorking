/**
 * Created by Zachary on 1/24/2017.
 */
public class Crossword extends toBeLabeled {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        int rows= blackSquares.length;
        int cols= blackSquares[0].length; 
        puzzle = new Square[rows][cols];
        
        int label = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (toBeLabeled(r, c, blackSquares)) {
                    puzzle[r][c] = new Square(false, label++);
                } else {
                    puzzle[r][c] = new Square(blackSquares[r][c], 0);
            }
        }
    }
}
