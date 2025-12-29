package pieces;

public class Horse extends Figure{
    public Horse(String colour, int row, int col) {
        super(colour, row, col);
        if (this.colour.equals("white")){
            this.type = "HrseW";
        }
        else if (this.colour.equals("black")){
            this.type = "HrseB";
        }
    }


    public boolean isPossibleW(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        int difR = Math.abs(eRow-sRow);
        int difC = Math.abs(eCol-sCol);

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if ((difR != 2 || difC != 1) && (difC != 2 || difR != 1)){
            System.out.println("1");
            return false;
        }

        // check if the piece can move to the desired position REGARDING other pieces
        if (board[eRow][eCol] == null || board[eRow][eCol].getColour().equals("black")){
            return true;
        }

        System.out.println("2");
        return false;
    }

    public boolean isPossibleB(int eRow, int eCol, Figure[][] board){
        int sRow = this.row;
        int sCol = this.col;

        int difR = Math.abs(eRow-sRow);
        int difC = Math.abs(eCol-sCol);

        // check if the piece can move to the desired position WITHOUT regarding other pieces
        if (difR != 2 || difC != 1){
            return false;
        }

        // check if the piece can move to the desired position REGARDING other pieces
        if (board[eRow][eCol] == null || board[eRow][eCol].getColour().equals("white")){
            return true;
        }

        return false;
    }







}
