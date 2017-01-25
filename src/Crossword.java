/**
 * Created by zacha on 1/24/2017.
 */
public class Crossword {
    private Square[][] puzzle

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int num = 1;
        for (int r = 0; r < blackSquares.length; r++) {
            for (int c =0; c < blackSquares[0].length; c++) {
                if (blackSquares [r] [c]) {
                    puzzle[r][c] = new Square(true, 0);
                }else{
                    if (toBeLabeled(r, c, blackSquares))
                    {
                        puzzle[r][c] = new Square(false, num);
                        num++;
                    }
                }
                }
            }
        }
    }

