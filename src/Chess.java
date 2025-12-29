import pieces.*;

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
    Boolean pickStart = true;
    Boolean canMove = false;
    private int startR = -1;
    private int startC = -1;
    private int endR = -1;
    private int endC = -1;
    Figure[][] board = initialize();
    boolean isStarted = false;

    private final Label turn = new Label();
    private final Button bStart = new Button();

    private final Button field0A = new Button();
    private final Button field0B = new Button();
    private final Button field0C = new Button();
    private final Button field0D = new Button();
    private final Button field0E = new Button();
    private final Button field0F = new Button();
    private final Button field0G = new Button();
    private final Button field0H = new Button();
    private final Button field1A = new Button();
    private final Button field1B = new Button();
    private final Button field1C = new Button();
    private final Button field1D = new Button();
    private final Button field1E = new Button();
    private final Button field1F = new Button();
    private final Button field1G = new Button();
    private final Button field1H = new Button();
    private final Button field2A = new Button();
    private final Button field2B = new Button();
    private final Button field2C = new Button();
    private final Button field2D = new Button();
    private final Button field2E = new Button();
    private final Button field2F = new Button();
    private final Button field2G = new Button();
    private final Button field2H = new Button();
    private final Button field3A = new Button();
    private final Button field3B = new Button();
    private final Button field3C = new Button();
    private final Button field3D = new Button();
    private final Button field3E = new Button();
    private final Button field3F = new Button();
    private final Button field3G = new Button();
    private final Button field3H = new Button();
    private final Button field4A = new Button();
    private final Button field4B = new Button();
    private final Button field4C = new Button();
    private final Button field4D = new Button();
    private final Button field4E = new Button();
    private final Button field4F = new Button();
    private final Button field4G = new Button();
    private final Button field4H = new Button();
    private final Button field5A = new Button();
    private final Button field5B = new Button();
    private final Button field5C = new Button();
    private final Button field5D = new Button();
    private final Button field5E = new Button();
    private final Button field5F = new Button();
    private final Button field5G = new Button();
    private final Button field5H = new Button();
    private final Button field6A = new Button();
    private final Button field6B = new Button();
    private final Button field6C = new Button();
    private final Button field6D = new Button();
    private final Button field6E = new Button();
    private final Button field6F = new Button();
    private final Button field6G = new Button();
    private final Button field6H = new Button();
    private final Button field7A = new Button();
    private final Button field7B = new Button();
    private final Button field7C = new Button();
    private final Button field7D = new Button();
    private final Button field7E = new Button();
    private final Button field7F = new Button();
    private final Button field7G = new Button();
    private final Button field7H = new Button();
    // end attributes

    public Chess() {
        // Frame init
        super();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) { dispose(); }
        });
        int frameWidth = 800;
        int frameHeight = 400;
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


        bStart.setBounds(16, 80, 80, 24);
        bStart.setFont(new Font("Dialog", Font.PLAIN, 11));
        bStart.setLabel("start");
        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bstart_ActionPerformed(evt);
            }
        });
        cp.add(bStart);

        turn.setBounds(16, 10, 80, 24);
        turn.setFont(new Font("Dialog", Font.BOLD, 24));
        turn.setText("WHITE");
        turn.setForeground(Color.WHITE);
        turn.setBackground(Color.GRAY);
        cp.add(turn);

        // cinema

        field0A.setBounds(180, 80, 60, 24);
        field0A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field0A_Action(e);
            }
        });
        field0A.setBackground(Color.WHITE);
        cp.add(field0A);

        field0B.setBounds(240, 80, 60, 24);
        field0B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0B_Action(e);
            }
        });
        field0B.setBackground(Color.PINK);
        cp.add(field0B);

        field0C.setBounds(300, 80, 60, 24);
        field0C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0C_Action(e);
            }
        });
        field0C.setBackground(Color.WHITE);
        cp.add(field0C);
        
        field0D.setBounds(360, 80, 60, 24);
        field0D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0D_Action(e);
            }
        });
        field0D.setBackground(Color.PINK);
        cp.add(field0D);

        field0E.setBounds(420, 80, 60, 24);
        field0E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0E_Action(e);
            }
        });
        field0E.setBackground(Color.WHITE);
        cp.add(field0E);
        
        field0F.setBounds(480, 80, 60, 24);
        field0F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0F_Action(e);
            }
        });
        field0F.setBackground(Color.PINK);
        cp.add(field0F);
        
        field0G.setBounds(540, 80, 60, 24);
        field0G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0G_Action(e);
            }
        });
        field0G.setBackground(Color.WHITE);
        cp.add(field0G);
        
        field0H.setBounds(600, 80, 60, 24);
        field0H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field0H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field0H_Action(e);
            }
        });
        field0H.setBackground(Color.PINK);
        cp.add(field0H);
        
        field1A.setBounds(180, 104, 60, 24);
        field1A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1A_Action(e);
            }
        });
        field1A.setBackground(Color.PINK);
        cp.add(field1A);
        
        field1B.setBounds(240, 104, 60, 24);
        field1B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1B_Action(e);
            }
        });
        field1B.setBackground(Color.WHITE);
        cp.add(field1B);
        
        field1C.setBounds(300, 104, 60, 24);
        field1C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1C_Action(e);
            }
        });
        field1C.setBackground(Color.PINK);
        cp.add(field1C);
        
        field1D.setBounds(360, 104, 60, 24);
        field1D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1D_Action(e);
            }
        });
        field1D.setBackground(Color.WHITE);
        cp.add(field1D);
        
        field1E.setBounds(420, 104, 60, 24);
        field1E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1E_Action(e);
            }
        });
        field1E.setBackground(Color.PINK);
        cp.add(field1E);
        
        field1F.setBounds(480, 104, 60, 24);
        field1F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1F_Action(e);
            }
        });
        field1F.setBackground(Color.WHITE);
        cp.add(field1F);
        
        field1G.setBounds(540, 104, 60, 24);
        field1G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1G_Action(e);
            }
        });
        field1G.setBackground(Color.PINK);
        cp.add(field1G);
        
        field1H.setBounds(600, 104, 60, 24);
        field1H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field1H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field1H_Action(e);
            }
        });
        field1H.setBackground(Color.WHITE);
        cp.add(field1H);
        
        field2A.setBounds(180, 128, 60, 24);
        field2A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2A_Action(e);
            }
        });
        field2A.setBackground(Color.WHITE);
        cp.add(field2A);

        field2B.setBounds(240, 128, 60, 24);
        field2B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2B_Action(e);
            }
        });
        field2B.setBackground(Color.PINK);
        cp.add(field2B);

        field2C.setBounds(300, 128, 60, 24);
        field2C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2C_Action(e);
            }
        });
        field2C.setBackground(Color.WHITE);
        cp.add(field2C);

        field2D.setBounds(360, 128, 60, 24);
        field2D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2D_Action(e);
            }
        });
        field2D.setBackground(Color.PINK);
        cp.add(field2D);

        field2E.setBounds(420, 128, 60, 24);
        field2E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2E_Action(e);
            }
        });
        field2E.setBackground(Color.WHITE);
        cp.add(field2E);
        
        field2F.setBounds(480, 128, 60, 24);
        field2F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2F_Action(e);
            }
        });
        field2F.setBackground(Color.PINK);
        cp.add(field2F);
        
        field2G.setBounds(540, 128, 60, 24);
        field2G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2G_Action(e);
            }
        });
        field2G.setBackground(Color.WHITE);
        cp.add(field2G);
        
        field2H.setBounds(600, 128, 60, 24);
        field2H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field2H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field2H_Action(e);
            }
        });
        field2H.setBackground(Color.PINK);
        cp.add(field2H);

        field3A.setBounds(180, 152, 60, 24);
        field3A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3A_Action(e);
            }
        });
        field3A.setBackground(Color.PINK);
        cp.add(field3A);

        field3B.setBounds(240, 152, 60, 24);
        field3B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3B_Action(e);
            }
        });
        field3B.setBackground(Color.WHITE);
        cp.add(field3B);
        
        field3C.setBounds(300, 152, 60, 24);
        field3C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3C_Action(e);
            }
        });
        field3C.setBackground(Color.PINK);
        cp.add(field3C);
        
        field3D.setBounds(360, 152, 60, 24);
        field3D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3D_Action(e);
            }
        });
        field3D.setBackground(Color.WHITE);
        cp.add(field3D);
        
        field3E.setBounds(420, 152, 60, 24);
        field3E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3E_Action(e);
            }
        });
        field3E.setBackground(Color.PINK);
        cp.add(field3E);
        
        field3F.setBounds(480, 152, 60, 24);
        field3F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3F_Action(e);
            }
        });
        field3F.setBackground(Color.WHITE);
        cp.add(field3F);
        
        field3G.setBounds(540, 152, 60, 24);
        field3G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3G_Action(e);
            }
        });
        field3G.setBackground(Color.PINK);
        cp.add(field3G);
        
        field3H.setBounds(600, 152, 60, 24);
        field3H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field3H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field3H_Action(e);
            }
        });
        field3H.setBackground(Color.WHITE);
        cp.add(field3H);

        field4A.setBounds(180, 176, 60, 24);
        field4A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4A_Action(e);
            }
        });
        field4A.setBackground(Color.WHITE);
        cp.add(field4A);

        field4B.setBounds(240, 176, 60, 24);
        field4B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4B_Action(e);
            }
        });
        field4B.setBackground(Color.PINK);
        cp.add(field4B);

        field4C.setBounds(300, 176, 60, 24);
        field4C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4C_Action(e);
            }
        });
        field4C.setBackground(Color.WHITE);
        cp.add(field4C);

        field4D.setBounds(360, 176, 60, 24);
        field4D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4D_Action(e);
            }
        });
        field4D.setBackground(Color.PINK);
        cp.add(field4D);

        field4E.setBounds(420, 176, 60, 24);
        field4E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4E_Action(e);
            }
        });
        field4E.setBackground(Color.WHITE);
        cp.add(field4E);

        field4F.setBounds(480, 176, 60, 24);
        field4F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4F_Action(e);
            }
        });
        field4F.setBackground(Color.PINK);
        cp.add(field4F);

        field4G.setBounds(540, 176, 60, 24);
        field4G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4G_Action(e);
            }
        });
        field4G.setBackground(Color.WHITE);
        cp.add(field4G);

        field4H.setBounds(600, 176, 60, 24);
        field4H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field4H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field4H_Action(e);
            }
        });
        field4H.setBackground(Color.PINK);
        cp.add(field4H);

        field5A.setBounds(180, 200, 60, 24);
        field5A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5A_Action(e);
            }
        });
        field5A.setBackground(Color.PINK);
        cp.add(field5A);

        field5B.setBounds(240, 200, 60, 24);
        field5B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5B_Action(e);
            }
        });
        field5B.setBackground(Color.WHITE);
        cp.add(field5B);

        field5C.setBounds(300, 200, 60, 24);
        field5C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5C_Action(e);
            }
        });
        field5C.setBackground(Color.PINK);
        cp.add(field5C);

        field5D.setBounds(360, 200, 60, 24);
        field5D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5D_Action(e);
            }
        });
        field5D.setBackground(Color.WHITE);
        cp.add(field5D);

        field5E.setBounds(420, 200, 60, 24);
        field5E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5E_Action(e);
            }
        });
        field5E.setBackground(Color.PINK);
        cp.add(field5E);

        field5F.setBounds(480, 200, 60, 24);
        field5F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5F_Action(e);
            }
        });
        field5F.setBackground(Color.WHITE);
        cp.add(field5F);

        field5G.setBounds(540, 200, 60, 24);
        field5G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5G_Action(e);
            }
        });
        field5G.setBackground(Color.PINK);
        cp.add(field5G);

        field5H.setBounds(600, 200, 60, 24);
        field5H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field5H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field5H_Action(e);
            }
        });
        field5H.setBackground(Color.WHITE);
        cp.add(field5H);

        field6A.setBounds(180, 224, 60, 24);
        field6A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6A_Action(e);
            }
        });
        field6A.setBackground(Color.WHITE);
        cp.add(field6A);

        field6B.setBounds(240, 224, 60, 24);
        field6B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6B_Action(e);
            }
        });
        field6B.setBackground(Color.PINK);
        cp.add(field6B);

        field6C.setBounds(300, 224, 60, 24);
        field6C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6C_Action(e);
            }
        });
        field6C.setBackground(Color.WHITE);
        cp.add(field6C);

        field6D.setBounds(360, 224, 60, 24);
        field6D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6D_Action(e);
            }
        });
        field6D.setBackground(Color.PINK);
        cp.add(field6D);

        field6E.setBounds(420, 224, 60, 24);
        field6E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6E_Action(e);
            }
        });
        field6E.setBackground(Color.WHITE);
        cp.add(field6E);

        field6F.setBounds(480, 224, 60, 24);
        field6F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6F_Action(e);
            }
        });
        field6F.setBackground(Color.PINK);
        cp.add(field6F);

        field6G.setBounds(540, 224, 60, 24);
        field6G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6G_Action(e);
            }
        });
        field6G.setBackground(Color.WHITE);
        cp.add(field6G);

        field6H.setBounds(600, 224, 60, 24);
        field6H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field6H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field6H_Action(e);
            }
        });
        field6H.setBackground(Color.PINK);
        cp.add(field6H);

        field7A.setBounds(180, 248, 60, 24);
        field7A.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7A_Action(e);
            }
        });
        field7A.setBackground(Color.PINK);
        cp.add(field7A);

        field7B.setBounds(240, 248, 60, 24);
        field7B.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7B_Action(e);
            }
        });
        field7B.setBackground(Color.WHITE);
        cp.add(field7B);

        field7C.setBounds(300, 248, 60, 24);
        field7C.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7C_Action(e);
            }
        });
        field7C.setBackground(Color.PINK);
        cp.add(field7C);
        
        field7D.setBounds(360, 248, 60, 24);
        field7D.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7D_Action(e);
            }
        });
        field7D.setBackground(Color.WHITE);
        cp.add(field7D);

        field7E.setBounds(420, 248, 60, 24);
        field7E.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7E_Action(e);
            }
        });
        field7E.setBackground(Color.PINK);
        cp.add(field7E);

        field7F.setBounds(480, 248, 60, 24);
        field7F.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7F_Action(e);
            }
        });
        field7F.setBackground(Color.WHITE);
        cp.add(field7F);

        field7G.setBounds(540, 248, 60, 24);
        field7G.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7G_Action(e);
            }
        });
        field7G.setBackground(Color.PINK);
        cp.add(field7G);

        field7H.setBounds(600, 248, 60, 24);
        field7H.setFont(new Font("Dialog", Font.PLAIN, 11));
        field7H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field7H_Action(e);
            }
        });
        field7H.setBackground(Color.WHITE);
        cp.add(field7H);
        
        // end components

        setVisible(true);
    }

    private void field7H_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 7;
            pickStart = false;
            field7H.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7G_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 6;
            pickStart = false;
            field7G.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7F_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 5;
            pickStart = false;
            field7F.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7E_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 4;
            pickStart = false;
            field7E.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7D_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 3;
            pickStart = false;
            field7D.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7C_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 2;
            pickStart = false;
            field7C.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7B_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 1;
            pickStart = false;
            field7B.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field7A_Action(ActionEvent e) {
        if (pickStart){
            startR = 7;
            startC = 0;
            pickStart = false;
            field7A.setForeground(Color.RED);
        }
        else {
            endR = 7;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6H_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 7;
            pickStart = false;
            field6H.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6G_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 6;
            pickStart = false;
            field6G.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6F_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 5;
            pickStart = false;
            field6F.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6E_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 4;
            pickStart = false;
            field6E.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6D_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 3;
            pickStart = false;
            field6D.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6C_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 2;
            pickStart = false;
            field6C.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6B_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 1;
            pickStart = false;
            field6B.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field6A_Action(ActionEvent e) {
        if (pickStart){
            startR = 6;
            startC = 0;
            pickStart = false;
            field6A.setForeground(Color.RED);
        }
        else {
            endR = 6;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5H_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 7;
            pickStart = false;
            field5H.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5G_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 6;
            pickStart = false;
            field5G.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5F_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 5;
            pickStart = false;
            field5F.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5E_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 4;
            pickStart = false;
            field5E.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5D_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 3;
            pickStart = false;
            field5D.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5C_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 2;
            pickStart = false;
            field5C.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5B_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 1;
            pickStart = false;
            field5B.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field5A_Action(ActionEvent e) {
        if (pickStart){
            startR = 5;
            startC = 0;
            pickStart = false;
            field5A.setForeground(Color.RED);
        }
        else {
            endR = 5;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4H_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 7;
            pickStart = false;
            field4H.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4G_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 6;
            pickStart = false;
            field4G.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4F_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 5;
            pickStart = false;
            field4F.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4E_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 4;
            pickStart = false;
            field4E.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4D_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 3;
            pickStart = false;
            field4D.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4C_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 2;
            pickStart = false;
            field4C.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4B_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 1;
            pickStart = false;
            field4B.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field4A_Action(ActionEvent e) {
        if (pickStart){
            startR = 4;
            startC = 0;
            pickStart = false;
            field4A.setForeground(Color.RED);
        }
        else {
            endR = 4;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3H_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 7;
            pickStart = false;
            field3H.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3G_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 6;
            pickStart = false;
            field3G.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3F_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 5;
            pickStart = false;
            field3F.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3E_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 4;
            pickStart = false;
            field3E.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3D_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 3;
            pickStart = false;
            field3D.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3C_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 2;
            pickStart = false;
            field3C.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3B_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 1;
            pickStart = false;
            field3B.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field3A_Action(ActionEvent e) {
        if (pickStart){
            startR = 3;
            startC = 0;
            pickStart = false;
            field3A.setForeground(Color.RED);
        }
        else {
            endR = 3;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2H_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 7;
            pickStart = false;
            field2H.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2G_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 6;
            pickStart = false;
            field2G.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2F_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 5;
            pickStart = false;
            field2F.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2E_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 4;
            pickStart = false;
            field2E.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2D_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 3;
            pickStart = false;
            field2D.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2C_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 2;
            pickStart = false;
            field2C.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2B_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 1;
            pickStart = false;
            field2B.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field2A_Action(ActionEvent e) {
        if (pickStart){
            startR = 2;
            startC = 0;
            pickStart = false;
            field2A.setForeground(Color.RED);
        }
        else {
            endR = 2;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1H_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 7;
            pickStart = false;
            field1H.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1G_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 6;
            pickStart = false;
            field1G.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1F_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 5;
            pickStart = false;
            field1F.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1E_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 4;
            pickStart = false;
            field1E.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1D_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 3;
            pickStart = false;
            field1D.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1C_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 2;
            pickStart = false;
            field1C.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1B_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 1;
            pickStart = false;
            field1B.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field1A_Action(ActionEvent e) {
        if (pickStart){
            startR = 1;
            startC = 0;
            pickStart = false;
            field1A.setForeground(Color.RED);
            field1A.setForeground(Color.RED);
        }
        else {
            endR = 1;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0H_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 7;
            pickStart = false;
            field0H.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 7;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0G_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 6;
            pickStart = false;
            field0G.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 6;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0F_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 5;
            pickStart = false;
            field0F.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 5;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0E_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 4;
            pickStart = false;
            field0E.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 4;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0D_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 3;
            pickStart = false;
            field0D.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 3;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0C_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 2;
            pickStart = false;
            field0C.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 2;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0B_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 1;
            pickStart = false;
            field0B.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 1;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    private void field0A_Action(ActionEvent e) {
        if (pickStart){
            startR = 0;
            startC = 0;
            pickStart = false;
            field0A.setForeground(Color.RED);
        }
        else {
            endR = 0;
            endC = 0;
            canMove = true;
            bmove_ActionPerformed();
        }
    }

    // start methods

    public static void main(String[] args) {
        new Chess();
    } // end of main

    public void bmove_ActionPerformed() {
        if (!isStarted){
            System.out.println("You need to start the game.");
            return;
        }

        if (!canMove){
            System.out.println("Finish on deciding your move.");
            return;
        }

        if (board[startR][startC] == null){ // check if there is a piece at start-coordinates
            System.out.println("There's no piece there.");
            return;
        }
        else if (startR > 7 || startR < 0 || endR > 7 || endR < 0){ // check if row-coordinates are out of bounds
            System.out.println("You can't move outside of the chessboard.");
            return;
        }
        else if (startC > 7 || startC < 0 || endC > 7 || endC < 0){ // check if col-coordinates are out of bounds
            System.out.println("You can't move outside of the chessboard.");
            return;
        }

        Figure figure = board[startR][startC];
        canMove = true;

        if (figure instanceof Pawn pawn){ // check if selected piece is a pawn
            if (pawn.getType().equals("pawnW") && pawn.isPossibleW(endR, endC, board) && turn.getText().equals("WHITE")){
                pawn.move(endR, endC, board);
                turn.setText("BLACK");
            }
            else if (pawn.getType().equals("pawnB") && pawn.isPossibleB(endR, endC, board) && turn.getText().equals("BLACK")){
                pawn.move(endR, endC, board);
                turn.setText("WHITE");
            }
        }
        else if (figure instanceof Rook rook){
            if (rook.getType().equals("rookW") && rook.isPossible(endR, endC, board) && turn.getText().equals("WHITE")){
                rook.move(endR, endC, board);
                turn.setText("BLACK");
            }
            else if (rook.getType().equals("rookB") && rook.isPossible(endR, endC, board) && turn.getText().equals("BLACK")){
                rook.move(endR, endC, board);
                turn.setText("WHITE");
            }
        }
        else if (figure instanceof Bishop bishop){
            if (bishop.getType().equals("BishW") && bishop.isPossible(endR, endC, board) && turn.getText().equals("WHITE")){
                bishop.move(endR, endC, board);
                turn.setText("BLACK");
            }
            else if (bishop.getType().equals("BishB") && bishop.isPossible(endR, endC, board) && turn.getText().equals("BLACK")){
                bishop.move(endR, endC, board);
                turn.setText("WHITE");
            }
        }
        else if (figure instanceof Horse horse){
            if (horse.getType().equals("HrseW") && horse.isPossibleW(endR, endC, board) && turn.getText().equals("WHITE")){
                horse.move(endR, endC, board);
                turn.setText("BLACK");
            }
            else if (horse.getType().equals("HrseB") && horse.isPossibleB(endR, endC, board) && turn.getText().equals("BLACK")){
                horse.move(endR, endC, board);
                turn.setText("WHITE");
            }
        }

        // set text for buttons

        reset();
        initButtons(board);
        startR = -1;
        startC = -1;
        pickStart = true;

        System.out.println(printBoard(board));
    } // end of bmove_ActionPerformed

    public void bstart_ActionPerformed(ActionEvent evt){
        isStarted = true;
        System.out.println(printBoard(board));
        bStart.setVisible(false);
        initButtons(board);
    }

    private void initButtons(Figure[][] board){
        if (board[0][0] == null){
            field0A.setLabel("_____");
        }
        else {
            field0A.setLabel(board[0][0].getType());
        }

        if (board[0][1] == null){
            field0B.setLabel("_____");
        }
        else {
            field0B.setLabel(board[0][1].getType());
        }

        if (board[0][2] == null){
            field0C.setLabel("_____");
        }
        else {
            field0C.setLabel(board[0][2].getType());
        }

        if (board[0][3] == null){
            field0D.setLabel("_____");
        }
        else {
            field0D.setLabel(board[0][3].getType());
        }

        if (board[0][4] == null){
            field0E.setLabel("_____");
        }
        else {
            field0E.setLabel(board[0][4].getType());
        }

        if (board[0][5] == null){
            field0F.setLabel("_____");
        }
        else {
            field0F.setLabel(board[0][5].getType());
        }

        if (board[0][6] == null){
            field0G.setLabel("_____");
        }
        else {
            field0G.setLabel(board[0][6].getType());
        }

        if (board[0][7] == null){
            field0H.setLabel("_____");
        }
        else {
            field0H.setLabel(board[0][7].getType());
        }

        if (board[1][0] == null){
            field1A.setLabel("_____");
        }
        else {
            field1A.setLabel(board[1][0].getType());
        }

        if (board[1][1] == null){
            field1B.setLabel("_____");
        }
        else {
            field1B.setLabel(board[1][1].getType());
        }

        if (board[1][2] == null){
            field1C.setLabel("_____");
        }
        else {
            field1C.setLabel(board[1][2].getType());
        }

        if (board[1][3] == null){
            field1D.setLabel("_____");
        }
        else {
            field1D.setLabel(board[1][3].getType());
        }
        if (board[1][4] == null){
            field1E.setLabel("_____");
        }
        else {
            field1E.setLabel(board[1][4].getType());
        }

        if (board[1][5] == null){
            field1F.setLabel("_____");
        }
        else {
            field1F.setLabel(board[1][5].getType());
        }

        if (board[1][6] == null){
            field1G.setLabel("_____");
        }
        else {
            field1G.setLabel(board[1][6].getType());
        }

        if (board[1][7] == null){
            field1H.setLabel("_____");
        }
        else {
            field1H.setLabel(board[1][7].getType());
        }

        if (board[2][0] == null){
            field2A.setLabel("_____");
        }
        else {
            field2A.setLabel(board[2][0].getType());
        }

        if (board[2][1] == null){
            field2B.setLabel("_____");
        }
        else {
            field2B.setLabel(board[2][1].getType());
        }

        if (board[2][2] == null){
            field2C.setLabel("_____");
        }
        else {
            field2C.setLabel(board[2][2].getType());
        }

        if (board[2][3] == null){
            field2D.setLabel("_____");
        }
        else {
            field2D.setLabel(board[2][3].getType());
        }

        if (board[2][4] == null){
            field2E.setLabel("_____");
        }
        else {
            field2E.setLabel(board[2][4].getType());
        }

        if (board[2][5] == null){
            field2F.setLabel("_____");
        }
        else {
            field2F.setLabel(board[2][5].getType());
        }

        if (board[2][6] == null){
            field2G.setLabel("_____");
        }
        else {
            field2G.setLabel(board[2][6].getType());
        }

        if (board[2][7] == null){
            field2H.setLabel("_____");
        }
        else {
            field2H.setLabel(board[2][7].getType());
        }

        if (board[3][0] == null){
            field3A.setLabel("_____");
        }
        else {
            field3A.setLabel(board[3][0].getType());
        }

        if (board[3][1] == null){
            field3B.setLabel("_____");
        }
        else {
            field3B.setLabel(board[3][1].getType());
        }

        if (board[3][2] == null){
            field3C.setLabel("_____");
        }
        else {
            field3C.setLabel(board[3][2].getType());
        }

        if (board[3][3] == null){
            field3D.setLabel("_____");
        }
        else {
            field3D.setLabel(board[3][3].getType());
        }

        if (board[3][4] == null){
            field3E.setLabel("_____");
        }
        else {
            field3E.setLabel(board[3][4].getType());
        }

        if (board[3][5] == null){
            field3F.setLabel("_____");
        }
        else {
            field3F.setLabel(board[3][5].getType());
        }

        if (board[3][6] == null){
            field3G.setLabel("_____");
        }
        else {
            field3G.setLabel(board[3][6].getType());
        }

        if (board[3][7] == null){
            field3H.setLabel("_____");
        }
        else {
            field3H.setLabel(board[3][7].getType());
        }

        if (board[4][0] == null){
            field4A.setLabel("_____");
        }
        else {
            field4A.setLabel(board[4][0].getType());
        }

        if (board[4][1] == null){
            field4B.setLabel("_____");
        }
        else {
            field4B.setLabel(board[4][1].getType());
        }

        if (board[4][2] == null){
            field4C.setLabel("_____");
        }
        else {
            field4C.setLabel(board[4][2].getType());
        }

        if (board[4][3] == null){
            field4D.setLabel("_____");
        }
        else {
            field4D.setLabel(board[4][3].getType());
        }

        if (board[4][4] == null){
            field4E.setLabel("_____");
        }
        else {
            field4E.setLabel(board[4][4].getType());
        }

        if (board[4][5] == null){
            field4F.setLabel("_____");
        }
        else {
            field4F.setLabel(board[4][5].getType());
        }

        if (board[4][6] == null){
            field4G.setLabel("_____");
        }
        else {
            field4G.setLabel(board[4][6].getType());
        }

        if (board[4][7] == null){
            field4H.setLabel("_____");
        }
        else {
            field4H.setLabel(board[4][7].getType());
        }

        if (board[5][0] == null){
            field5A.setLabel("_____");
        }
        else {
            field5A.setLabel(board[5][0].getType());
        }

        if (board[5][1] == null){
            field5B.setLabel("_____");
        }
        else {
            field5B.setLabel(board[5][1].getType());
        }

        if (board[5][2] == null){
            field5C.setLabel("_____");
        }
        else {
            field5C.setLabel(board[5][2].getType());
        }

        if (board[5][3] == null){
            field5D.setLabel("_____");
        }
        else {
            field5D.setLabel(board[5][3].getType());
        }

        if (board[5][4] == null){
            field5E.setLabel("_____");
        }
        else {
            field5E.setLabel(board[5][4].getType());
        }

        if (board[5][5] == null){
            field5F.setLabel("_____");
        }
        else {
            field5F.setLabel(board[5][5].getType());
        }

        if (board[5][6] == null){
            field5G.setLabel("_____");
        }
        else {
            field5G.setLabel(board[5][6].getType());
        }

        if (board[5][7] == null){
            field5H.setLabel("_____");
        }
        else {
            field5H.setLabel(board[5][7].getType());
        }

        if (board[6][0] == null){
            field6A.setLabel("_____");
        }
        else {
            field6A.setLabel(board[6][0].getType());
        }

        if (board[6][1] == null){
            field6B.setLabel("_____");
        }
        else {
            field6B.setLabel(board[6][1].getType());
        }

        if (board[6][2] == null){
            field6C.setLabel("_____");
        }
        else {
            field6C.setLabel(board[6][2].getType());
        }

        if (board[6][3] == null){
            field6D.setLabel("_____");
        }
        else {
            field6D.setLabel(board[6][3].getType());
        }

        if (board[6][4] == null){
            field6E.setLabel("_____");
        }
        else {
            field6E.setLabel(board[6][4].getType());
        }

        if (board[6][5] == null){
            field6F.setLabel("_____");
        }
        else {
            field6F.setLabel(board[6][5].getType());
        }

        if (board[6][6] == null){
            field6G.setLabel("_____");
        }
        else {
            field6G.setLabel(board[6][6].getType());
        }

        if (board[6][7] == null){
            field6H.setLabel("_____");
        }
        else {
            field6H.setLabel(board[6][7].getType());
        }

        if (board[7][0] == null){
            field7A.setLabel("_____");
        }
        else {
            field7A.setLabel(board[7][0].getType());
        }

        if (board[7][1] == null){
            field7B.setLabel("_____");
        }
        else {
            field7B.setLabel(board[7][1].getType());
        }

        if (board[7][2] == null){
            field7C.setLabel("_____");
        }
        else {
            field7C.setLabel(board[7][2].getType());
        }

        if (board[7][3] == null){
            field7D.setLabel("_____");
        }
        else {
            field7D.setLabel(board[7][3].getType());
        }

        if (board[7][4] == null){
            field7E.setLabel("_____");
        }
        else {
            field7E.setLabel(board[7][4].getType());
        }

        if (board[7][5] == null){
            field7F.setLabel("_____");
        }
        else {
            field7F.setLabel(board[7][5].getType());
        }

        if (board[7][6] == null){
            field7G.setLabel("_____");
        }
        else {
            field7G.setLabel(board[7][6].getType());
        }

        if (board[7][7] == null){
            field7H.setLabel("_____");
        }
        else {
            field7H.setLabel(board[7][7].getType());
        }

    }

    public static Figure[][] initialize(){
        Figure[][] board = new Figure[8][8];
        initPawns(board);
        initRooks(board);
        initBishops(board);
        initHorses(board);
        return board;
    }

    private static void initHorses(Figure[][] board){
        Horse horseW1 = new Horse("white", 7, 2);
        Horse horseW2 = new Horse("white", 7, 5);
        board[horseW1.getRow()][horseW1.getCol()] = horseW1;
        board[horseW2.getRow()][horseW2.getCol()] = horseW2;
        Horse horseB1 = new Horse("black", 0, 2);
        Horse horseB2 = new Horse("black", 0, 5);
        board[horseB1.getRow()][horseB1.getCol()] = horseB1;
        board[horseB2.getRow()][horseB2.getCol()] = horseB2;
    }

    private static void initBishops(Figure[][] board){
        Bishop bishopW1 = new Bishop("white", 7, 1);
        Bishop bishopW2 = new Bishop("white", 7, 6);
        board[bishopW1.getRow()][bishopW1.getCol()] = bishopW1;
        board[bishopW2.getRow()][bishopW2.getCol()] = bishopW2;
        Bishop bishopB1 = new Bishop("black", 0, 1);
        Bishop bishopB2 = new Bishop("black", 0, 6);
        board[bishopB1.getRow()][bishopB1.getCol()] = bishopB1;
        board[bishopB2.getRow()][bishopB2.getCol()] = bishopB2;
    }

    private static void initRooks(Figure[][] board){
        Rook rookW1 = new Rook("white", 7, 0);
        Rook rookW2 = new Rook("white", 7, 7);
        board[rookW1.getRow()][rookW1.getCol()] = rookW1;
        board[rookW2.getRow()][rookW2.getCol()] = rookW2;
        Rook rookB1 = new Rook("black", 0, 0);
        Rook rookB2 = new Rook("black", 0, 7);
        board[rookB1.getRow()][rookB1.getCol()] = rookB1;
        board[rookB2.getRow()][rookB2.getCol()] = rookB2;
    }

    private static void initPawns(Figure[][] board){
        Pawn pawnW1 = new Pawn("white", 6, 0);
        Pawn pawnW2 = new Pawn("white", 6, 1);
        Pawn pawnW3 = new Pawn("white", 6, 2);
        Pawn pawnW4 = new Pawn("white", 6, 3);
        Pawn pawnW5 = new Pawn("white", 6, 4);
        Pawn pawnW6 = new Pawn("white", 6, 5);
        Pawn pawnW7 = new Pawn("white", 6, 6);
        Pawn pawnW8 = new Pawn("white", 6, 7);
        board[pawnW1.getRow()][pawnW1.getCol()] = pawnW1;
        board[pawnW2.getRow()][pawnW2.getCol()] = pawnW2;
        board[pawnW3.getRow()][pawnW3.getCol()] = pawnW3;
        board[pawnW4.getRow()][pawnW4.getCol()] = pawnW4;
        board[pawnW5.getRow()][pawnW5.getCol()] = pawnW5;
        board[pawnW6.getRow()][pawnW6.getCol()] = pawnW6;
        board[pawnW7.getRow()][pawnW7.getCol()] = pawnW7;
        board[pawnW8.getRow()][pawnW8.getCol()] = pawnW8;
        Pawn pawnB1 = new Pawn("black", 1, 0);
        Pawn pawnB2 = new Pawn("black", 1, 1);
        Pawn pawnB3 = new Pawn("black", 1, 2);
        Pawn pawnB4 = new Pawn("black", 1, 3);
        Pawn pawnB5 = new Pawn("black", 1, 4);
        Pawn pawnB6 = new Pawn("black", 1, 5);
        Pawn pawnB7 = new Pawn("black", 1, 6);
        Pawn pawnB8 = new Pawn("black", 1, 7);
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
        for (int i = 0 ; i < 8 ; i++){
            s += "  " + i + "   ";
        }
        s += "\n";
        for (int i = 0 ; i < board.length ; i++){
            s += i + " ";
            for (int j = 0 ; j < board[0].length ; j++){
                if (board[i][j] == null){
                    s += "_____";
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

    public void reset(){
        field0A.setForeground(Color.BLACK);
        field0B.setForeground(Color.BLACK);
        field0C.setForeground(Color.BLACK);
        field0D.setForeground(Color.BLACK);
        field0E.setForeground(Color.BLACK);
        field0F.setForeground(Color.BLACK);
        field0G.setForeground(Color.BLACK);
        field0H.setForeground(Color.BLACK);
        field1A.setForeground(Color.BLACK);
        field1B.setForeground(Color.BLACK);
        field1C.setForeground(Color.BLACK);
        field1D.setForeground(Color.BLACK);
        field1E.setForeground(Color.BLACK);
        field1F.setForeground(Color.BLACK);
        field1G.setForeground(Color.BLACK);
        field1H.setForeground(Color.BLACK);
        field2A.setForeground(Color.BLACK);
        field2B.setForeground(Color.BLACK);
        field2C.setForeground(Color.BLACK);
        field2D.setForeground(Color.BLACK);
        field2E.setForeground(Color.BLACK);
        field2F.setForeground(Color.BLACK);
        field2G.setForeground(Color.BLACK);
        field2H.setForeground(Color.BLACK);
        field3A.setForeground(Color.BLACK);
        field3B.setForeground(Color.BLACK);
        field3C.setForeground(Color.BLACK);
        field3D.setForeground(Color.BLACK);
        field3E.setForeground(Color.BLACK);
        field3F.setForeground(Color.BLACK);
        field3G.setForeground(Color.BLACK);
        field3H.setForeground(Color.BLACK);
        field4A.setForeground(Color.BLACK);
        field4B.setForeground(Color.BLACK);
        field4C.setForeground(Color.BLACK);
        field4D.setForeground(Color.BLACK);
        field4E.setForeground(Color.BLACK);
        field4F.setForeground(Color.BLACK);
        field4G.setForeground(Color.BLACK);
        field4H.setForeground(Color.BLACK);
        field5A.setForeground(Color.BLACK);
        field5B.setForeground(Color.BLACK);
        field5C.setForeground(Color.BLACK);
        field5D.setForeground(Color.BLACK);
        field5E.setForeground(Color.BLACK);
        field5F.setForeground(Color.BLACK);
        field5G.setForeground(Color.BLACK);
        field5F.setForeground(Color.BLACK);
        field6A.setForeground(Color.BLACK);
        field6B.setForeground(Color.BLACK);
        field6C.setForeground(Color.BLACK);
        field6D.setForeground(Color.BLACK);
        field6E.setForeground(Color.BLACK);
        field6F.setForeground(Color.BLACK);
        field6G.setForeground(Color.BLACK);
        field6H.setForeground(Color.BLACK);
        field7A.setForeground(Color.BLACK);
        field7B.setForeground(Color.BLACK);
        field7C.setForeground(Color.BLACK);
        field7D.setForeground(Color.BLACK);
        field7E.setForeground(Color.BLACK);
        field7F.setForeground(Color.BLACK);
        field7G.setForeground(Color.BLACK);
        field7H.setForeground(Color.BLACK);
    }

    // end methods
} // end of class Chess
