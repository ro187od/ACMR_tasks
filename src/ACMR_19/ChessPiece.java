package ACMR_19;

public abstract class ChessPiece {
    protected Position position;

    public ChessPiece(Position position) {
        this.position = position;
    }
    public boolean canIGoThisWay(){
        return false;
    }
}
