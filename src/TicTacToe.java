/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rakes
 */
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TicTacToe extends javax.swing.JFrame {
    
    private String StartGame="X";
    private int xCount=0;
    private int oCount=0;
    boolean checker;
    

    
    public TicTacToe() {
        initComponents();  
    }
    
    private void gameScore(){
        jLabelPlayerX.setText(String.valueOf(xCount));
        jLabelPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
       if(StartGame.equalsIgnoreCase("X")){
           StartGame="O";
       }
       else{
           StartGame="X";
       }
    }
    
    public boolean checkDraw() {
    return !(btnTic1.getText().isEmpty() || btnTic2.getText().isEmpty() || btnTic3.getText().isEmpty() || 
             btnTic4.getText().isEmpty() || btnTic5.getText().isEmpty() || btnTic6.getText().isEmpty() || 
             btnTic7.getText().isEmpty() || btnTic8.getText().isEmpty() || btnTic9.getText().isEmpty());
}
    
    private void winGame(){
        
        String b1 = btnTic1.getText();
        String b2 = btnTic2.getText();
        String b3 = btnTic3.getText();
        String b4 = btnTic4.getText();
        String b5 = btnTic5.getText();
        String b6 = btnTic6.getText();
        String b7 = btnTic7.getText();
        String b8 = btnTic8.getText();
        String b9 = btnTic9.getText();
        
        //for X
        
        if(b1.equals("X") && b2.equals("X") && b3.equals("X") ){
            btnTic1.setEnabled(true);
            btnTic2.setEnabled(true);
            btnTic3.setEnabled(true);
            btnTic1.setBackground(Color.ORANGE);
            btnTic2.setBackground(Color.ORANGE);
            btnTic3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        
        else if(b4==("X") && b5==("X") && b6=="X"){
            btnTic4.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic6.setEnabled(true);
            btnTic4.setBackground(Color.cyan);
            btnTic5.setBackground(Color.cyan);
            btnTic6.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        
        else if(b7==("X") && b8==("X") && b9=="X"){
            btnTic7.setEnabled(true);
            btnTic8.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic7.setBackground(Color.green);
            btnTic8.setBackground(Color.green);
            btnTic9.setBackground(Color.green);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            xCount++;
            gameScore();
        }
        
        else if(b1==("X") && b5==("X") && b9=="X"){
            btnTic1.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic1.setBackground(Color.magenta);
            btnTic5.setBackground(Color.magenta);
            btnTic9.setBackground(Color.magenta);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            xCount++;
            gameScore();
        }
        
        else if(b3==("X") && b6==("X") && b9=="X"){
            btnTic3.setEnabled(true);
            btnTic6.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic3.setBackground(Color.pink);
            btnTic6.setBackground(Color.pink);
            btnTic9.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            xCount++;
            gameScore();
        }
        
        else if(b3==("X") && b5==("X") && b7=="X"){
            btnTic3.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic7.setEnabled(true);
            btnTic3.setBackground(Color.orange);
            btnTic5.setBackground(Color.orange);
            btnTic7.setBackground(Color.orange);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);           
            xCount++;
            gameScore();
        }
        
        else if(b2==("X") && b5==("X") && b8=="X"){
            btnTic2.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic8.setEnabled(true);
            btnTic2.setBackground(Color.pink);
            btnTic5.setBackground(Color.pink);
            btnTic8.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            xCount++;
            gameScore();
        }
        
        else if(b1==("X") && b4==("X") && b7=="X"){
            btnTic1.setEnabled(true);
            btnTic4.setEnabled(true);
            btnTic7.setEnabled(true);
            btnTic1.setBackground(Color.cyan);
            btnTic4.setBackground(Color.cyan);
            btnTic7.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            xCount++;
            gameScore();
        }    
            
        //for O    
            
        else if(b1==("O") && b2==("O") && b3=="O"){
            btnTic1.setEnabled(true);
            btnTic2.setEnabled(true);
            btnTic3.setEnabled(true);
            btnTic1.setBackground(Color.cyan);
            btnTic2.setBackground(Color.cyan);
            btnTic3.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b4==("O") && b5==("O") && b6=="O"){
            btnTic4.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic6.setEnabled(true);
            btnTic4.setBackground(Color.orange);
            btnTic5.setBackground(Color.orange);
            btnTic6.setBackground(Color.orange);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b7==("O") && b8==("O") && b9=="O"){
            btnTic7.setEnabled(true);
            btnTic8.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic7.setBackground(Color.magenta);
            btnTic8.setBackground(Color.magenta);
            btnTic9.setBackground(Color.magenta);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b1==("O") && b4==("O") && b7=="O"){
            btnTic1.setEnabled(true);
            btnTic4.setEnabled(true);
            btnTic7.setEnabled(true);
            btnTic1.setBackground(Color.cyan);
            btnTic4.setBackground(Color.cyan);
            btnTic7.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b2==("O") && b5==("O") && b8=="O"){
            btnTic2.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic8.setEnabled(true);
            btnTic2.setBackground(Color.pink);
            btnTic5.setBackground(Color.pink);
            btnTic8.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b3==("O") && b6==("O") && b9=="O"){
            btnTic3.setEnabled(true);
            btnTic6.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic3.setBackground(Color.orange);
            btnTic6.setBackground(Color.orange);
            btnTic9.setBackground(Color.orange);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b1==("O") && b5==("O") && b9=="O"){
            btnTic1.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic9.setEnabled(true);
            btnTic1.setBackground(Color.magenta);
            btnTic5.setBackground(Color.magenta);
            btnTic9.setBackground(Color.magenta);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if(b3==("O") && b5==("O") && b7=="O"){
            btnTic3.setEnabled(true);
            btnTic5.setEnabled(true);
            btnTic7.setEnabled(true);
            btnTic3.setBackground(Color.cyan);
            btnTic5.setBackground(Color.cyan);
            btnTic7.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);            
            oCount++;
            gameScore();    
        }
        
        else if (checkDraw()) {
        JOptionPane.showMessageDialog(this, "Draw", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
        gameScore();
    }
    }    
            
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTic2 = new javax.swing.JButton();
        btnTic3 = new javax.swing.JButton();
        btnTic4 = new javax.swing.JButton();
        btnTic7 = new javax.swing.JButton();
        btnTic6 = new javax.swing.JButton();
        btnTic1 = new javax.swing.JButton();
        btnTic8 = new javax.swing.JButton();
        btnTic9 = new javax.swing.JButton();
        btnTic5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabelPlayerX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPlayerO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnTic2.setBackground(new java.awt.Color(255, 255, 255));
        btnTic2.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic2.setForeground(new java.awt.Color(0, 0, 0));
        btnTic2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic2ActionPerformed(evt);
            }
        });

        btnTic3.setBackground(new java.awt.Color(255, 255, 255));
        btnTic3.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic3.setForeground(new java.awt.Color(0, 0, 0));
        btnTic3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic3ActionPerformed(evt);
            }
        });

        btnTic4.setBackground(new java.awt.Color(255, 255, 255));
        btnTic4.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic4.setForeground(new java.awt.Color(0, 0, 0));
        btnTic4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic4ActionPerformed(evt);
            }
        });

        btnTic7.setBackground(new java.awt.Color(255, 255, 255));
        btnTic7.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic7.setForeground(new java.awt.Color(0, 0, 0));
        btnTic7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic7ActionPerformed(evt);
            }
        });

        btnTic6.setBackground(new java.awt.Color(255, 255, 255));
        btnTic6.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic6.setForeground(new java.awt.Color(0, 0, 0));
        btnTic6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic6ActionPerformed(evt);
            }
        });

        btnTic1.setBackground(new java.awt.Color(255, 255, 255));
        btnTic1.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic1.setForeground(new java.awt.Color(0, 0, 0));
        btnTic1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic1ActionPerformed(evt);
            }
        });

        btnTic8.setBackground(new java.awt.Color(255, 255, 255));
        btnTic8.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic8.setForeground(new java.awt.Color(0, 0, 0));
        btnTic8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic8ActionPerformed(evt);
            }
        });

        btnTic9.setBackground(new java.awt.Color(255, 255, 255));
        btnTic9.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic9.setForeground(new java.awt.Color(0, 0, 0));
        btnTic9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic9ActionPerformed(evt);
            }
        });

        btnTic5.setBackground(new java.awt.Color(255, 255, 255));
        btnTic5.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        btnTic5.setForeground(new java.awt.Color(0, 0, 0));
        btnTic5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setForeground(new java.awt.Color(0, 255, 0));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNewGame.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        btnNewGame.setText("NEW GAME");
        btnNewGame.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setForeground(new java.awt.Color(0, 255, 0));

        jLabelPlayerX.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabelPlayerX.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerX.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        jLabelPlayerX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelPlayerX.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Player O:");

        jLabelPlayerO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabelPlayerO.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerO.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
        jLabelPlayerO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelPlayerO.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Player X:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jLabelPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 255, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TIC-TAC-TOE GAME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic-Tac-Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true);
        
//        jLabelPlayerX.setText("0");
//        jLabelPlayerO.setText("0");

        xCount = 0;  // Reset player X's score
        oCount = 0;  // Reset player O's score

    jLabelPlayerX.setText(String.valueOf(xCount));
    jLabelPlayerO.setText(String.valueOf(oCount));
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.LIGHT_GRAY);
        btnTic2.setBackground(Color.LIGHT_GRAY);
        btnTic3.setBackground(Color.LIGHT_GRAY);
        btnTic4.setBackground(Color.LIGHT_GRAY);
        btnTic5.setBackground(Color.LIGHT_GRAY);
        btnTic6.setBackground(Color.LIGHT_GRAY);
        btnTic7.setBackground(Color.LIGHT_GRAY);
        btnTic8.setBackground(Color.LIGHT_GRAY);
        btnTic9.setBackground(Color.LIGHT_GRAY);
        
        StartGame = "X";  // Ensure "X" starts the new game
        checker = false;  // Reset the turn checker
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic1ActionPerformed

            btnTic1.setText((StartGame));
            btnTic1.setEnabled(false);
            if(StartGame.equalsIgnoreCase("X")){
                checker=false;
            }
            else{
                checker=true;
            }
            choose_a_Player();
            winGame();
           
        
    }//GEN-LAST:event_btnTic1ActionPerformed

    private void btnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic2ActionPerformed
        btnTic2.setText((StartGame));
        btnTic2.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic2ActionPerformed

    private void btnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic3ActionPerformed
        btnTic3.setText((StartGame));
        btnTic3.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic3ActionPerformed

    private void btnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic4ActionPerformed
        btnTic4.setText((StartGame));
        btnTic4.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic4ActionPerformed

    private void btnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic5ActionPerformed
        btnTic5.setText((StartGame));
        btnTic5.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic5ActionPerformed

    private void btnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic6ActionPerformed
        btnTic6.setText((StartGame));
        btnTic6.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic6ActionPerformed

    private void btnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic7ActionPerformed
        btnTic7.setText((StartGame));
        btnTic7.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic7ActionPerformed

    private void btnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic8ActionPerformed
        btnTic8.setText((StartGame));
        btnTic8.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic8ActionPerformed

    private void btnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic9ActionPerformed
        btnTic9.setText((StartGame));
        btnTic9.setEnabled(false);
        if(StartGame.equalsIgnoreCase("X")){
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winGame();
    }//GEN-LAST:event_btnTic9ActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        btnTic1.setText("");
        btnTic1.setBackground(Color.white);
        btnTic1.setEnabled(true);

        btnTic2.setText("");
        btnTic2.setBackground(Color.white);
        btnTic2.setEnabled(true);

        

        btnTic3.setText("");
        btnTic3.setBackground(Color.white);
        btnTic3.setEnabled(true);

        

        btnTic4.setText("");
        btnTic4.setBackground(Color.white);
        btnTic4.setEnabled(true);

        

        btnTic5.setText("");
        btnTic5.setBackground(Color.white);
        btnTic5.setEnabled(true);

        
        
        btnTic6.setText("");
        btnTic6.setBackground(Color.white);
        btnTic6.setEnabled(true);

       

        btnTic7.setText("");
        btnTic7.setBackground(Color.white);
        btnTic7.setEnabled(true);

        

        btnTic8.setText("");
        btnTic8.setBackground(Color.white);
        btnTic8.setEnabled(true);

      

        btnTic9.setText("");
        btnTic9.setBackground(Color.white);
        btnTic9.setEnabled(true);
        
        StartGame = "X";  // Ensure "X" starts the new game
        checker = false;  // Reset the turn checker

      
        
    }//GEN-LAST:event_btnNewGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

   
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTic1;
    private javax.swing.JButton btnTic2;
    private javax.swing.JButton btnTic3;
    private javax.swing.JButton btnTic4;
    private javax.swing.JButton btnTic5;
    private javax.swing.JButton btnTic6;
    private javax.swing.JButton btnTic7;
    private javax.swing.JButton btnTic8;
    private javax.swing.JButton btnTic9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelPlayerO;
    private javax.swing.JLabel jLabelPlayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}

