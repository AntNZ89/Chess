package pieces;

public class Pawn extends Figure {

    boolean canGo2;

    public Pawn(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equals("white")){
            this.type = "pawnW";
        }
        else {
            this.type = "pawnB";
        }
        this.canGo2 = true;
    }

    public boolean getCanGo2(){
        return this.canGo2;
    }

    public void setCanGo2False(){
        this.canGo2 = false;
    }


    public void move(int eRow, int eCol, Figure[][] board){
        board[this.row][this.col] = null;
        this.row = eRow;
        this.col = eCol;
        board[this.row][this.col] = this;
        this.canGo2 = false;
    }


    public boolean isPossible(int eRow, int eCol, Figure[][] board) {

        String colour = this.colour;
        int sRow = this.row;
        int sCol = this.col;

        if (colour.equals("white")){

            // check if the piece can move to the desired position WITHOUT regarding other pieces
            if (sRow >= eRow){
                return false;
            }
            else if (sRow+1 != eRow && !this.canGo2){
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
                if (board[eRow][eCol] == null && !canGo2){
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

            if (canGo2 && board[eRow-1][eCol] != null){
                return false;
            }

        }

        return true;

    }

}
