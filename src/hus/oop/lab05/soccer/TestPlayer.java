package hus.oop.lab05.soccer;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player(8, 1, 1);
        Ball ball = new Ball(1, 1, 0);
        player.move(2, 2);
//        System.out.println(player);
        System.out.println(ball);
        if (player.near(ball)) {
            player.kick(ball);
        } else {
            player.move(3, 4);
        }
//        System.out.println(player);
        System.out.println(ball);
    }
}
