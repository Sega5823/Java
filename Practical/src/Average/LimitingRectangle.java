package Average;

public class LimitingRectangle {
    private int[][] points;
    int min[] = new int[2];
    int max[] = new int[2];

    public LimitingRectangle(int[][] points) {
        this.points = points;
        minMax();
    }

    private void minMax(){
        //int[] min = new int[1];
        min[0] = points[0][0];
        min[1] = points[0][1];
        //int[] max = new int[1];
        max[0] = points[0][0];
        max[1] = points[0][1];
        for (int[] point : points) {
            if (min[0] > point[0]) min[0] = point[0];
            if (min[1] > point[1]) min[1] = point[1];
            if (max[0] < point[0]) max[0] = point[0];
            if (max[1] < point[1]) max[1] = point[1];
        }
    }

    int getWidth() {
        return max[0]-min[0];
    }

    int getHeight() {
        return max[1]-min[1];
    }

    String getBorders() {
        return min[1] + ", " + max[1] + ", " + min[0] + ", " + max[0];
    }
}
