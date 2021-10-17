package Average;

class ToTable {
    int[] data;
    int x,y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }
    int[][] resize(){
        int[][] resized = new int[x][y];
        int z = 0;
        for (int i = 0; i < x; i++){
            for (int o = 0; o < y; o++){
                resized[i][o] = data[z];
                z++;
            }
        }
        return resized;
    }
}

class ToLine{
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    int[] resize() {
        int z = 0;
        for (int i = 0; i < data.length; i++){
            for (int o = 0; o < data[i].length; o++){
                z++;
            }
        }
        int [] resized = new int[z];
        z = 0;
        for (int i = 0; i < data.length; i++){
            for (int o = 0; o < data[i].length; o++){
                resized[z] = data[i][o];
                z++;
            }
        }
        return resized;
    }
}
