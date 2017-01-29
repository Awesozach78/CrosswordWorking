/**
 * Created by zacha on 1/24/2017.
 */
public class Crossword extends toBeLabeled {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];

        int num = 1;

        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                if (toBeLabeled(r, c, blackSquares)) {
                    puzzle[r][c] = new Square(false, num);
                    num++;
                } else
                    puzzle[r][c] = new Square(blackSquares[r][c], 0);
            }
        }
    }
}
