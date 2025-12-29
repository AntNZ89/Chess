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


    public boolean isPossible(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if ((sRow != eRow && sCol != eCol) || (sRow == eRow && sCol == eCol)){
            System.out.println("You can't go there");
            return false;
        }

        String direction = "";

        // find out the direction that the rook wants to go
        if (eCol > sCol){
            direction = "RIGHT";
        }
        else if (eCol < sCol){
            direction = "LEFT";
        }
        else if (eRow > sRow){
            direction = "DOWN";
        }
        else if (eRow < sRow){
            direction = "UP";
        }

        // check if the piece can move to the desired position REGARDING other pieces
        if (direction.equals("RIGHT")){
            for (int i = sCol+1 ; i < eCol ; i++){
                if (board[sRow][i] != null){
                    System.out.println("You can't go there");
                    return false;
                }
            }
        }
        else if (direction.equals("LEFT")){
            for (int i = sCol-1 ; i > eCol ; i--){
                if (board[sRow][i] != null){
                    System.out.println("You can't go there");
                    return false;
                }
            }
        }
        else if (direction.equals("DOWN")){
            for (int i = sRow+1 ; i < eRow ; i++){
                if (board[i][sCol] != null){
                    System.out.println("You can't go there");
                    return false;
                }
            }
        }
        else if (direction.equals("UP")){
            for (int i = sRow-1 ; i > eRow ; i--){
                if (board[i][sCol] != null){
                    System.out.println("You can't go there");
                    return false;
                }
            }
        }

        return true;

    }

}
