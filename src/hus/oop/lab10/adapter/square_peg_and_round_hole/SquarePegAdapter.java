package hus.oop.lab10.adapter.square_peg_and_round_hole;

// An adapter class lets you fit square pegs into round holes.
// It extends the RoundPeg class to let the adapter objects act as round pegs
public class SquarePegAdapter extends RoundPeg {
    protected SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
