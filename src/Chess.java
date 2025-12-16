import pieces.Figure;
import pieces.Pawn;

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
    private TextField start = new TextField();
    private TextField end = new TextField();
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
        lmoveto.setBounds(16, 80, 80, 24);
        lmoveto.setFont(new Font("Dialog", Font.PLAIN, 11));
        lmoveto.setText("move to:");
        cp.add(lmoveto);
        start.setBounds(120, 40, 80, 24);
        start.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(start);
        end.setBounds(120, 80, 80, 24);
        end.setFont(new Font("Dialog", Font.PLAIN, 11));
        end.setText("");
        cp.add(end);
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

        String startCords = start.getText();
        String endCords = end.getText();
        int sRow = startCords.charAt(0)-'1'+1;
        int sCol = startCords.charAt(1)-'1'+1;
        int eRow = endCords.charAt(0)-'1'+1;
        int eCol = endCords.charAt(1)-'1'+1;

        if (startCords.length() != 2 || !Character.isDigit(startCords.charAt(0)) || !Character.isDigit(startCords.charAt(1))){ // check invalid input (start)
            System.out.println("Invalid input.");
            return;
        }
        else if (endCords.length() != 2 || !Character.isDigit(endCords.charAt(0)) || !Character.isDigit(endCords.charAt(1))){ // check invalid input (end)
            System.out.println("Invalid input.");
            return;
        }
        else if (board[sRow][sCol] == null){ // check if there is a piece at start-coordinates
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

        String type = board[sRow][sCol].getType();

        if (type.equals("pawnW") || type.equals("pawnB")){ // check if selected piece is a pawn
            Pawn pawn = (Pawn)board[sRow][sCol];
            if (Pawn.isPossible(sRow, sCol, eRow, eCol, board)){
                pawn.move(eRow, eCol,board);
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
        Figure[][] arr = new Figure[8][8];
        initPawns(arr);
        return arr;
    }

    private static void initPawns(Figure[][] arr){
        Pawn pawnW1 = new Pawn("white", 0, 0);
        Pawn pawnW2 = new Pawn("white", 0, 1);
        Pawn pawnW3 = new Pawn("white", 0, 2);
        Pawn pawnW4 = new Pawn("white", 0, 3);
        Pawn pawnW5 = new Pawn("white", 0, 4);
        Pawn pawnW6 = new Pawn("white", 0, 5);
        Pawn pawnW7 = new Pawn("white", 0, 6);
        Pawn pawnW8 = new Pawn("white", 0, 7);
        arr[pawnW1.getRow()][pawnW1.getCol()] = pawnW1;
        arr[pawnW2.getRow()][pawnW2.getCol()] = pawnW2;
        arr[pawnW3.getRow()][pawnW3.getCol()] = pawnW3;
        arr[pawnW4.getRow()][pawnW4.getCol()] = pawnW4;
        arr[pawnW5.getRow()][pawnW5.getCol()] = pawnW5;
        arr[pawnW6.getRow()][pawnW6.getCol()] = pawnW6;
        arr[pawnW7.getRow()][pawnW7.getCol()] = pawnW7;
        arr[pawnW8.getRow()][pawnW8.getCol()] = pawnW8;
        Pawn pawnB1 = new Pawn("black", 7, 0);
        Pawn pawnB2 = new Pawn("black", 7, 1);
        Pawn pawnB3 = new Pawn("black", 7, 2);
        Pawn pawnB4 = new Pawn("black", 7, 3);
        Pawn pawnB5 = new Pawn("black", 7, 4);
        Pawn pawnB6 = new Pawn("black", 7, 5);
        Pawn pawnB7 = new Pawn("black", 7, 6);
        Pawn pawnB8 = new Pawn("black", 7, 7);
        arr[pawnB1.getRow()][pawnB1.getCol()] = pawnB1;
        arr[pawnB2.getRow()][pawnB2.getCol()] = pawnB2;
        arr[pawnB3.getRow()][pawnB3.getCol()] = pawnB3;
        arr[pawnB4.getRow()][pawnB4.getCol()] = pawnB4;
        arr[pawnB5.getRow()][pawnB5.getCol()] = pawnB5;
        arr[pawnB6.getRow()][pawnB6.getCol()] = pawnB6;
        arr[pawnB7.getRow()][pawnB7.getCol()] = pawnB7;
        arr[pawnB8.getRow()][pawnB8.getCol()] = pawnB8;
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