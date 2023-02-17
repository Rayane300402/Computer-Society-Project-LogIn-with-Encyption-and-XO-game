

package computersocietyproj.Game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewJFrameGame extends javax.swing.JFrame {

    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    String[] buttons = new String[9];
    boolean isFull=false;
    boolean xWins = false, oWins = false;
    /** Creates new form NewJFrameGame */
    public NewJFrameGame() {
        initComponents();
    }
    private void gameScore(){
        playerxxx.setText(String.valueOf(xCount));
         playerooo.setText(String.valueOf(oCount));
    }
    private void Choose_a_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
  
        public void checkWinner() {
            isFull=false;
        String b1=txtbtn1.getText();
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText();
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        String[] buttons = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
        
		//check X win conditions
		if(b1==("X")&& b2==("X")&&b3==("X") ) {
			xWins = xWins();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
		}
		if(b4==("X")&& b5==("X")&&b6==("X")){ 
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b7==("X")&& b8==("X")&&b9==("X")){ 
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b1==("X")&& b4==("X")&&b7==("X")){
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b2==("X")&& b5==("X")&&b8==("X")){
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b3==("X")&& b6==("X")&&b9==("X")){
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b1==("X")&& b5==("X")&&b9==("X")){
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		if(b3==("X")&& b5==("X")&&b7==("X")){
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
			xWins = xWins();
		}
		//check O win conditions
		if(b1==("O")&& b2==("O")&&b3==("O")){
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b4==("O")&& b5==("O")&&b6==("O")){
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b7==("O")&& b8==("O")&&b9==("O")){
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b1==("O")&& b4==("O")&&b7==("O")){
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b2==("O")&& b5==("O")&&b8==("O")){
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b3==("O")&& b6==("O")&&b9==("O")){
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b1==("O")&& b5==("O")&&b9==("O")){
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
			oWins = oWins();
		}
		if(b3==("O")&& b5==("O")&&b7==("O")){
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
			oWins = oWins();
		}
                isFull = isBoardFull(buttons);
                if(xWins == false && oWins == false && isFull == true){
                  JOptionPane.showMessageDialog(this,"Tied","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);  
                }
	}
	public boolean isBoardFull(String[] buttons){
            isFull=true;
           for (int i = 0; i < 9; i++) {
               if(buttons[i] == "")     
               isFull = false;
            }
            return isFull;
        }
	public boolean xWins() {
		JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            return true;
	}
	public boolean oWins() {
		JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            return true;
	}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerxxx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 128, 140));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE GAME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 51, 51));
        txtexit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        txtexit.setForeground(new java.awt.Color(255, 255, 255));
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(0, 102, 102));
        txtreset.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        txtreset.setForeground(new java.awt.Color(255, 255, 255));
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray));

        playerxxx.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(0, 102, 255));
        playerxxx.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        playerxxx.setText("xxxxxxxx");

        playero.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        playero.setForeground(new java.awt.Color(0, 51, 51));
        playero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        playero.setText("PLAYER O:  ");

        playerx.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        playerx.setForeground(new java.awt.Color(0, 51, 51));
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        playerx.setText("PLAYER X:  ");

        playerooo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(0, 102, 255));
        playerooo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        playerooo.setText("xxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxxx)
                    .addComponent(playerx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerooo)
                    .addComponent(playero))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
    txtbtn2.setText(startGame);
    if (startGame.equalsIgnoreCase("X")){
        txtbtn2.setForeground(Color.RED);
    }
    else{
         txtbtn2.setForeground(Color.BLACK);
    }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
     txtbtn3.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn3.setForeground(Color.RED);
        }
        else{
          txtbtn3.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
  txtbtn1.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn1.setForeground(Color.RED);
        }
        else{
          txtbtn1.setForeground(Color.BLACK);
        }
    Choose_a_player();
    checkWinner();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
      txtbtn5.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn5.setForeground(Color.RED);
        }
        else{
          txtbtn5.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
       txtbtn6.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn6.setForeground(Color.RED);
        }
        else{
          txtbtn6.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
     txtbtn4.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn4.setForeground(Color.RED);
        }
        else{
          txtbtn4.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
       txtbtn8.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn8.setForeground(Color.RED);
        }
        else{
          txtbtn8.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
       JFrame frame=new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        txtbtn7.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn7.setForeground(Color.RED);
        }
        else{
          txtbtn7.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
txtbtn9.setText(startGame);
    if(startGame.equalsIgnoreCase("X")){
          txtbtn9.setForeground(Color.RED);
        }
        else{
          txtbtn9.setForeground(Color.BLACK);
        }
    Choose_a_player();
        checkWinner();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
     txtbtn1.setText("");
     txtbtn2.setText("");
     txtbtn3.setText("");
     txtbtn4.setText("");
     txtbtn5.setText("");
     txtbtn6.setText("");
     txtbtn7.setText("");
     txtbtn8.setText("");
     txtbtn9.setText("");
     txtbtn1.setBackground(Color.LIGHT_GRAY);
     txtbtn2.setBackground(Color.LIGHT_GRAY);
     txtbtn3.setBackground(Color.LIGHT_GRAY);
     txtbtn4.setBackground(Color.LIGHT_GRAY);
     txtbtn5.setBackground(Color.LIGHT_GRAY);
     txtbtn6.setBackground(Color.LIGHT_GRAY);
     txtbtn7.setBackground(Color.LIGHT_GRAY);
     txtbtn8.setBackground(Color.LIGHT_GRAY);
     txtbtn9.setBackground(Color.LIGHT_GRAY);
     isFull=false;
     xWins = false; oWins = false;
      
    }//GEN-LAST:event_txtresetActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables

}
