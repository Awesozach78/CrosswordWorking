/**
 * Created by zacha on 1/24/2017.
 */
public class toBeLabeled {
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        return !blackSquares[r][c] &&
                (r == 0 || blackSquares[r-1][c] || c == 0 || blackSquares[r][c-1]);
    }
}
