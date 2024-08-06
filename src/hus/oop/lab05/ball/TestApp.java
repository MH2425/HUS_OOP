package hus.oop.lab05.ball;

public class TestApp {
    public static void main(String[] args) {
        Ball ball = new Ball(50f, 50f, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
