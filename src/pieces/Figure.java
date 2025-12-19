package pieces;

public abstract class Figure {

    protected String type;
    protected String colour;
    protected int row;
    protected int col;

    public Figure(String colour, int row, int col){
        this.colour = colour;
        this.row = row;
        this.col = col;
    }

    public void move(int eRow, int eCol, Figure[][] board){
        board[this.row][this.col] = null;
        this.row = eRow;
        this.col = eCol;
        board[this.row][this.col] = this;
    }

    public String getColour(){
        return this.colour;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public String getType(){
        return this.type;
    }


}
