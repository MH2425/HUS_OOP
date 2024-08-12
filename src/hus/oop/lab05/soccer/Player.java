package hus.oop.lab05.soccer;

public class Player {
    private int number;
    private float x, y, z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public Boolean near(Ball ball) {
        float xDiff = this.x - ball.getX();
        float yDiff = this.y - ball.getY();
        float zDiff = this.z - ball.getZ();
        float distance = (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
        return distance < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(-ball.getX(), -ball.getY(), -ball.getZ());
    }
}
