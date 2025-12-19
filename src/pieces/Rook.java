package pieces;

public class Rook extends Figure{

    public Rook(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equalsIgnoreCase("white")){
            this.type = "RookW";
        }
        else if (this.colour.equalsIgnoreCase("black")){
            this.type = "RookB";
        }
    }






}
