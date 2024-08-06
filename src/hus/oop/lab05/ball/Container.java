package hus.oop.lab05.ball;

public class Container {
    private int x1, y1, x2, y2;
    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    public boolean collidesWith(Ball ball) {
        int xDiffLeft = (int) ball.getX() - this.x1;
        int xDiffRight = this.x2 - (int) ball.getX();
        int yDiffAbove = (int) (Math.abs(ball.getY()) - Math.abs(this.y1));
        int yDiffUnder = (int) (Math.abs(this.y2) - Math.abs(ball.getY()));
        if (xDiffLeft <= ball.getRadius() || xDiffRight <= ball.getRadius()) {
            ball.reflectHorizontal();
            return true;
        } else if (yDiffUnder <= ball.getRadius() || yDiffAbove <= ball.getRadius()) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Container at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}
