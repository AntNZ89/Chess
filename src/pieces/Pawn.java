package pieces;

public class Pawn extends Figure {

    public Pawn(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equals("white")){
            this.type = "pawnW";
        }
        else {
            this.type = "pawnB";
        }
    }


    public void move(int eRow, int eCol, Figure[][] board){
        board[this.row][this.col] = null;
        this.row = eRow;
        this.col = eCol;
        board[this.row][this.col] = this;
    }


    public static boolean isPossible(int sRow, int sCol, int eRow, int eCol, Figure[][] board) {

        String colour = board[sRow][sCol].getColour();

        if (colour.equals("white")){

            // check if the piece can move to the desired position WITHOUT regarding other pieces
            if (sRow >= eRow){
                return false;
            }
            else if (sRow+1 != eRow){
                return false;
            }
            else if (Math.abs(eCol-sCol) > 1){
                return false;
            }

            String movement = "";

            if (sCol == eCol){
                movement = "straight";
            }
            else {
                movement = "diagonal";
            }

            // check if the piece can move to the desired position regarding other pieces
            if (movement.equals("straight")){
                if (board[eRow][eCol] == null){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (board[eRow][eCol] == null){
                    return false;
                }
                else if (board[eRow][eCol].getColour().equals("white")){
                    return false;
                }
                else if (board[eRow][eCol].getColour().equals("black")){
                    return true;
                }
            }

        }

        return true;

    }

}
