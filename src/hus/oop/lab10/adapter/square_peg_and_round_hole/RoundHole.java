package hus.oop.lab10.adapter.square_peg_and_round_hole;

public class RoundHole {
    protected int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
