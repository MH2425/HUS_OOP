package hus.oop.lab05.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0f, 0f, 1, 1, 45);
        System.out.println(ball);

        System.out.println("x = " + ball.getX());
        System.out.println("y = " + ball.getY());
        System.out.println("xDelta = " + ball.getXDelta());
        System.out.println("yDelta = " + ball.getYDelta());
        System.out.println();

        ball.setX(1f);
        ball.setY(1f);
        ball.setRadius(2);
        ball.setXDelta(2);
        ball.setYDelta(2);
        System.out.println(ball);
        System.out.println();

        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        System.out.println(ball);
        ball.reflectVertical();
        System.out.println(ball);
    }
}
