import pieces.Figure;
import pieces.Pawn;
import pieces.Rook;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * Chess
 *
 * @version 1.0 from 16/12/2025
 * @antND
 */

public class Chess extends Frame {
    // start attributes
    private Button bmove = new Button();
    private Button bStart = new Button();
    private Label lchoosepiece = new Label();
    private Label lmoveto = new Label();

    private Label row = new Label();
    private Label col = new Label();

    private Label turn = new Label();

    private TextField startC = new TextField();
    private TextField endC = new TextField();

    private TextField startR = new TextField();
    private TextField endR = new TextField();
    private Label colour = new Label();
    Figure[][] board = initialize();
    boolean isStarted = false;
    // end attributes

    public Chess() {
        // Frame init
        super();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) { dispose(); }
        });
        int frameWidth = 312;
        int frameHeight = 280;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Chess");
        setResizable(false);
        Panel cp = new Panel(null);
        add(cp);
        // start components
        bmove.setBounds(104, 168, 80, 24);
        bmove.setFont(new Font("Dialog", Font.PLAIN, 11));
        bmove.setLabel("move");
        bmove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bmove_ActionPerformed(evt);
            }
        });
        cp.add(bmove);

        bStart.setBounds(104, 200, 80, 24);
        bStart.setFont(new Font("Dialog", Font.PLAIN, 11));
        bStart.setLabel("start");
        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bstart_ActionPerformed(evt);
            }
        });
        cp.add(bStart);

        lchoosepiece.setBounds(16, 40, 80, 24);
        lchoosepiece.setFont(new Font("Dialog", Font.PLAIN, 11));
        lchoosepiece.setText("choose piece:");
        cp.add(lchoosepiece);

        turn.setBounds(16, 10, 80, 24);
        turn.setFont(new Font("Dialog", Font.PLAIN, 14));
        turn.setText("WHITE");
        cp.add(turn);

        lmoveto.setBounds(16, 80, 80, 24);
        lmoveto.setFont(new Font("Dialog", Font.PLAIN, 11));
        lmoveto.setText("move to:");
        cp.add(lmoveto);

        row.setBounds(120, 15, 80, 24);
        row.setFont(new Font("Dialog", Font.PLAIN, 11));
        row.setText("Row");
        cp.add(row);

        col.setBounds(220, 15, 80, 24);
        col.setFont(new Font("Dialog", Font.PLAIN, 11));
        col.setText("Col");
        cp.add(col);

        startR.setBounds(120, 40, 80, 24);
        startR.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(startR);

        startC.setBounds(220, 40, 80, 24);
        startC.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(startC);

        endR.setBounds(120, 80, 80, 24);
        endR.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(endR);

        endC.setBounds(220, 80, 80, 24);
        endC.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(endC);


        colour.setBounds(16, 8, 80, 24);
        colour.setFont(new Font("Dialog", Font.PLAIN, 11));
        colour.setText("");
        cp.add(colour);
        // end components

        setVisible(true);
    } // end of public Chess

    // start methods

    public static void main(String[] args) {
        new Chess();
    } // end of main

    public void bmove_ActionPerformed(ActionEvent evt) {
        if (!isStarted){
            System.out.println("You need to start the game.");
            return;
        }

        if (startR.getText().length() != 1 || startC.getText().length() != 1
            || endR.getText().length() != 1 || endC.getText().length() != 1){ // check for invalid input
            System.out.println("Invalid input, only one digit per field");
            return;
        }

        if (!Character.isDigit(startR.getText().charAt(0)) || !Character.isDigit(startC.getText().charAt(0))
            || !Character.isDigit(endR.getText().charAt(0)) || !Character.isDigit(endC.getText().charAt(0))){ // check for invalid input
            System.out.println("Invalid input, use digits");
            return;
        }

        int sRow = startR.getText().charAt(0)-'1'+1;
        int sCol = startC.getText().charAt(0)-'1'+1;
        int eRow = endR.getText().charAt(0)-'1'+1;
        int eCol = endC.getText().charAt(0)-'1'+1;


        if (board[sRow][sCol] == null){ // check if there is a piece at start-coordinates
            System.out.println("There's no piece there.");
            return;
        }
        else if (sRow > 7 || sRow < 0 || eRow > 7 || eRow < 0){ // check if row-coordinates are out of bounds
            System.out.println("You can't move outside of the chessboard.");
            return;
        }
        else if (sCol > 7 || sCol < 0 || eCol > 7 || eCol < 0){ // check if col-coordinates are out of bounds
            System.out.println("You can't move outside of the chessboard.");
            return;
        }

        String type = board[sRow][sCol].getType(); // get the type of piece that's used

        if (type.equals("pawnW") || type.equals("pawnB")){ // check if selected piece is a pawn
            Pawn pawn = (Pawn)board[sRow][sCol];
            if (type.equals("pawnW") && pawn.isPossibleW(eRow, eCol, board) && turn.getText().equals("WHITE")){
                pawn.move(eRow, eCol, board);
                turn.setText("BLACK");
            }
            else if (type.equals("pawnB") && pawn.isPossibleB(eRow, eCol, board) && turn.getText().equals("BLACK")){
                pawn.move(eRow, eCol, board);
                turn.setText("WHITE");
            }
        }

        System.out.println(printBoard(board));
    } // end of bmove_ActionPerformed

    public void bstart_ActionPerformed(ActionEvent evz){
        if (isStarted){
            System.out.println("You already started the game, idiot.");
            return;
        }
        isStarted = true;
        System.out.println(printBoard(board));
        bStart.setVisible(false);
    }


    public static Figure[][] initialize(){
        Figure[][] board = new Figure[8][8];
        initPawns(board);
        initRooks(board);
        return board;
    }

    private static void initRooks(Figure[][] board){
        Rook rookW1 = new Rook("white", 1, 0);
        Rook rookW2 = new Rook("white", 1, 7);
        board[rookW1.getRow()][rookW1.getCol()] = rookW1;
        board[rookW2.getRow()][rookW2.getCol()] = rookW2;
        Rook rookB1 = new Rook("black", 6, 0);
        Rook rookB2 = new Rook("black", 6, 7);
        board[rookB1.getRow()][rookB1.getCol()] = rookB1;
        board[rookB2.getRow()][rookB2.getCol()] = rookB2;
    }

    private static void initPawns(Figure[][] board){
        Pawn pawnW1 = new Pawn("white", 0, 0);
        Pawn pawnW2 = new Pawn("white", 0, 1);
        Pawn pawnW3 = new Pawn("white", 0, 2);
        Pawn pawnW4 = new Pawn("white", 0, 3);
        Pawn pawnW5 = new Pawn("white", 0, 4);
        Pawn pawnW6 = new Pawn("white", 0, 5);
        Pawn pawnW7 = new Pawn("white", 0, 6);
        Pawn pawnW8 = new Pawn("white", 0, 7);
        board[pawnW1.getRow()][pawnW1.getCol()] = pawnW1;
        board[pawnW2.getRow()][pawnW2.getCol()] = pawnW2;
        board[pawnW3.getRow()][pawnW3.getCol()] = pawnW3;
        board[pawnW4.getRow()][pawnW4.getCol()] = pawnW4;
        board[pawnW5.getRow()][pawnW5.getCol()] = pawnW5;
        board[pawnW6.getRow()][pawnW6.getCol()] = pawnW6;
        board[pawnW7.getRow()][pawnW7.getCol()] = pawnW7;
        board[pawnW8.getRow()][pawnW8.getCol()] = pawnW8;
        Pawn pawnB1 = new Pawn("black", 7, 0);
        Pawn pawnB2 = new Pawn("black", 7, 1);
        Pawn pawnB3 = new Pawn("black", 7, 2);
        Pawn pawnB4 = new Pawn("black", 7, 3);
        Pawn pawnB5 = new Pawn("black", 7, 4);
        Pawn pawnB6 = new Pawn("black", 7, 5);
        Pawn pawnB7 = new Pawn("black", 7, 6);
        Pawn pawnB8 = new Pawn("black", 7, 7);
        board[pawnB1.getRow()][pawnB1.getCol()] = pawnB1;
        board[pawnB2.getRow()][pawnB2.getCol()] = pawnB2;
        board[pawnB3.getRow()][pawnB3.getCol()] = pawnB3;
        board[pawnB4.getRow()][pawnB4.getCol()] = pawnB4;
        board[pawnB5.getRow()][pawnB5.getCol()] = pawnB5;
        board[pawnB6.getRow()][pawnB6.getCol()] = pawnB6;
        board[pawnB7.getRow()][pawnB7.getCol()] = pawnB7;
        board[pawnB8.getRow()][pawnB8.getCol()] = pawnB8;
    }

    public static String printBoard(Figure[][] board){
        String s = "\n";
        for (int i = 0 ; i < board.length ; i++){
            for (int j = 0 ; j < board[0].length ; j++){
                if (board[i][j] == null){
                    s += "empty";
                }
                else {
                    s += board[i][j].getType();
                }
                s += " ";
            }
            s += "\n";
        }
        return s;
    }



    // end methods
} // end of class Chess
