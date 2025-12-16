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



    public static void move(String start, String end, Figure[][] board){
        int sRow = start.charAt(0)-'1'+1;
        int sCol = start.charAt(1)-'1'+1;
        int eRow = end.charAt(0)-'1'+1;
        int eCol = end.charAt(1)-'1'+1;
        board[eRow][eCol] = board[sRow][sCol];
        board[sRow][sCol] = null;
    }


    public static boolean isPossible(String start, String end, Figure[][] board) {

        int sRow = start.charAt(0)-'1'+1;
        int sCol = start.charAt(1)-'1'+1;
        int eRow = end.charAt(0)-'1'+1;
        int eCol = end.charAt(1)-'1'+1;
        String colour = board[sRow][sCol].getColour();

        if (colour.equals("white")){

            // check if the piece can even move to the desired position without regarding other pieces
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

            // check if the piece can even move to the desired position dependent on other pieces
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
