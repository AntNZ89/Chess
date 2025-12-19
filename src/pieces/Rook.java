package pieces;

public class Rook extends Figure{

    public Rook(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equalsIgnoreCase("white")){
            this.type = "rookW";
        }
        else if (this.colour.equalsIgnoreCase("black")){
            this.type = "rookB";
        }
    }


    public boolean isPossibleW(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if (sRow != eRow && sCol != eCol){
            System.out.println("That's simply not possible");
            return false;
        }




        return true;

    }




}
