package Hard;

public class SeaBord {
    private String[][] field;

    public String[][] getField() {
        return field;
    }
    void shoot(int x, int y, String exodus){
        // miss
        if (exodus.equals("m")) field[x][y] = "#";
        // hit
        if (exodus.equals("h")) field[x][y] = "x";
        // destroy
        if (exodus.equals("d")){
            field[x][y] = "x";
            fillWithMisses(x, y);
        }
    }
    void fillWithMisses(int x, int y){
        int i = x;
        int z = y;
        //top
        if (i != 9) field[i + 1][z] = "#";
        if (i != 0) field[i - 1][z] = "#";
        //bottom
        if (z != 9) field[i][z + 1] = "#";
        if (z != 0) field[i][z - 1] = "#";
        //diagonal
        if (i != 9) {
            if (z != 9) field[i + 1][z + 1] = "#";
            if (z != 0) field[i + 1][z - 1] = "#";
        }
        if (i != 0) {
            if (z != 9) field[i - 1][z + 1] = "#";
            if (z != 0) field[i - 1][z - 1] = "#";
        }
        i--;

    }
}
