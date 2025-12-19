package pieces;

public class Pawn extends Figure {

    boolean canGo2 = true;

    public Pawn(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equalsIgnoreCase("white")){
            this.type = "pawnW";
        }
        else if (this.colour.equalsIgnoreCase("black")){
            this.type = "pawnB";
        }
    }



    public void move(int eRow, int eCol, Figure[][] board){
        board[this.row][this.col] = null;
        this.row = eRow;
        this.col = eCol;
        board[this.row][this.col] = this;
        this.canGo2 = false;
    }

    public boolean isPossibleB(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        if (sRow <= eRow || eRow < sRow-2){
            System.out.println("Can't go there 1");
            return false;
        }
        else if (sRow-1 != eRow && !this.canGo2){
            System.out.println("Can't go there 2");
            return false;
        }
        else if (Math.abs(eCol-sCol) > 1){
            System.out.println("Can't go there 3");
            return false;
        }

        String movement = "";

        if (sCol == eCol){
            movement = "straight";
        }
        else {
            movement = "diagonal";
        }

        boolean isDouble = sRow-2 == eRow;

        if (movement.equals("straight")){
            if (board[eRow][eCol] == null && !isDouble){
                return true;
            }
            else if (board[eRow][eCol] == null && board[eRow+1][eCol] == null && isDouble){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (board[eRow][eCol] == null){
                System.out.println("Can't go there 5");
                return false;
            }
            else if (board[eRow][eCol].getColour().equals("black")){
                System.out.println("Can't go there 6");
                return false;
            }
            else if (board[eRow][eCol].getColour().equals("white")){
                System.out.println("Can go there 2");
                return true;
            }
        }

        System.out.println("Went through");
        return true;

    }


    public boolean isPossibleW(int eRow, int eCol, Figure[][] board){
        String colour = this.colour;
        int sRow = this.row;
        int sCol = this.col;

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if (sRow >= eRow || eRow > sRow+2){
            System.out.println("Can't go there 1");
            return false;
        }
        else if (sRow+1 != eRow && !this.canGo2){
            System.out.println("Can't go there 2");
            return false;
        }
        else if (Math.abs(eCol-sCol) > 1){
            System.out.println("Can't go there 3");
            return false;
        }

        String movement = "";

        if (sCol == eCol){
            movement = "straight";
        }
        else {
            movement = "diagonal";
        }

        boolean isDouble =  sRow+2 == eRow;

        // check if the piece can move to the desired position regarding other pieces
        if (movement.equals("straight")){
            if (board[eRow][eCol] == null && !isDouble){ // check if single-move possible
                return true;
            }
            else if (board[eRow][eCol] == null && board[eRow-1][eCol] == null && isDouble){ // check if double-move possible
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (board[eRow][eCol] == null){
                System.out.println("Can't go there 5");
                return false;
            }
            else if (board[eRow][eCol].getColour().equals("white")){
                System.out.println("Can't go there 6");
                return false;
            }
            else if (board[eRow][eCol].getColour().equals("black")){
                System.out.println("Can go there 2");
                return true;
            }
        }

        System.out.println("went through");
        return true;

    }

}
