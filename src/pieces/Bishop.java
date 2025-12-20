package pieces;

public class Bishop extends Figure{
    public Bishop(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equals("white")){
            this.type = "BishW";
        }
        else if (this.colour.equals("black")){
            this.type = "BishB";
        }
    }

    public boolean isPossible(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if ((sRow == eRow && sCol != eCol) || (sRow != eRow && sCol == eCol)){
            System.out.println("Can't go there 1");
            return false;
        }

        // find out the direction that the rook wants to go
        String movement = "";

        if (eRow > sRow && eCol > sCol){
            movement = "BOTTOM_RIGHT";
        }
        else if (eRow > sRow && eCol < sCol){
            movement = "BOTTOM_LEFT";
        }
        else if (eRow < sRow && eCol > sCol){
            movement = "UP_RIGHT";
        }
        else if (eRow < sRow && eCol < sCol){
            movement = "UP_LFET";
        }

        // check if the piece can move to the desired position REGARDING other pieces
        if (movement.equals("BOTTOM_RIGHT")){
            int i = 1;
            while (sRow+i < 8 && sCol+i < 8){
                if (board[sRow+i][sCol+i] != null){
                    return false;
                }
                i++;
            }
        }
        else if (movement.equals("BOTTOM_LEFT")){
            int i = 1;
            while (sRow+i < 8 && sCol-i >= 0){
                if (board[sRow+i][sRow-i] != null){
                    return false;
                }
                i++;
            }
        }
        else if (movement.equals("UP_RIGHT")){
            int i = 1;
            while (sRow-i >= 0 && sCol+i < 8){
                if (board[sRow-i][sCol+i] != null){
                    return false;
                }
                i++;
            }
        }
        else if (movement.equals("UP_LEFT")){
            int i = 1;
            while (sRow-i >= 0 && sCol-i >= 0){
                if (board[sRow-i][sCol-i] != null){
                    return false;
                }
                i++;
            }
        }



        System.out.println("went through");
        return true;

    }





}
