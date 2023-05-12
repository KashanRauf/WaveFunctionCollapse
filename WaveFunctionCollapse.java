import java.util.Random;

public class WaveFunctionCollapse {

    private static final int TILES = 5;
    private int x;
    private int y;
    private short[][] tileSet;

    public WaveFunctionCollapse(int x, int y) {
        this.x = x;
        this.y = y;
        this.tileSet = new short[x][y];

        Random r = new Random();

        tileSet[r.nextInt(x)][r.nextInt(y)] = (short) r.nextInt(TILES);
    }

    public WaveFunctionCollapse() {
        this(5, 5);
    }
}