package hus.oop.lab04.exercises_on_composition.myrectangle_and_mypoint_classes;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int mySqrt(int x) { // compute the square root of x
        //using binary search
        if (x < 2)
            return x;

        int fromIdx = 1;
        int toIdx = x;

        while (fromIdx <= toIdx) {
            int midIdx = fromIdx + (toIdx - fromIdx) / 2;
            if (midIdx == x / midIdx)
                return midIdx;
            else if (midIdx > x / midIdx)
                toIdx = midIdx - 1;
            else
                fromIdx = midIdx + 1;
        }

        return toIdx;
    }

    public double distance(int x, int y) {
        return mySqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return mySqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
    }

    public double distance() {
        return mySqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
