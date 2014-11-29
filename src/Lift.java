/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

import java.util.*;
import java.io.Serializable;
import java.io.*;
import java.util.StringTokenizer; 
import java.io.Serializable;
import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lift extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form Lift
     */
    
     //Fields
   private String originalData = "Lift name : 1RM";	// hold string read from txt file
   private int tokenCount;			// hold number of tokens
   private String liftName;                           //Holds Lifts name
   private String oneRepMax;                          //Holds 1RM
   
       
   /**
		The constructor sets the Lifts's name and 1RM
	*/
	
   public Lift(String liftName, String oneRepMax)
   {
      this.liftName = liftName;
      this.oneRepMax = oneRepMax;
   } 
   
    /**
      Accessors and Mutators
   */

   
   public void setLiftName(String newLiftName)
   {
      liftName = newLiftName;
   }
	
   public String getLiftName()
   {
      return liftName;
   }

   public void set1RM(String new1RM)
   {
      oneRepMax = new1RM;
   }
	
   public String get1RM()
   {
      return oneRepMax;
   }
   
    
      /**
		The toString method returns a string containing the Lift's data.
		@return a refernce to the a string
	*/
	
   public String toString()
   {
      String str;
   	
      str = "l : " + liftName + " : " + oneRepMax;   				
      return str;
   }
   
   ////////////////////////////////////////////////////////
   
    String item = "";
    PR2 liftParent;
    FromText ft;
    public Lift() {
        initComponents();       
    }
    public Lift(String item) {
        initComponents();
        this.item = item;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Change_Btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        displayName = new javax.swing.JLabel();
        displayOneRepMax = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        changeRM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayIncrements = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lift Window");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Lift Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Lift oneRepMax:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Increments:");

        Change_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Change_Btn.setText("Change 1RM");
        Change_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_BtnMouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Return to Main Menu");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        displayName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayName.setForeground(new java.awt.Color(0, 204, 102));
        displayName.setText("jLabel5");

        displayOneRepMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayOneRepMax.setForeground(new java.awt.Color(0, 204, 102));
        displayOneRepMax.setText("jLabel6");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Change this 1RM");

        changeRM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        displayIncrements.setColumns(20);
        displayIncrements.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayIncrements.setForeground(new java.awt.Color(0, 153, 102));
        displayIncrements.setRows(5);
        jScrollPane1.setViewportView(displayIncrements);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changeRM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Change_Btn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(displayName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayOneRepMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(displayName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(displayOneRepMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Change_Btn)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        liftParent.enable(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
       
        displayName.setText(item); //pass item name
        //populate your data and put them here
        DecimalFormat df = new DecimalFormat( "#.##" );
        int in = Integer.parseInt(ft.get1RM_FT(item));
        String increment = "95%  "+df.format(0.95*in)+"\t"+"70%  "+df.format(0.70*in)+"\n90%  "+df.format(0.90*in)+"\t"+"65%  "+df.format(0.65*in)+"\n85%  "+df.format(0.85*in)+"\t"+"60%  "+df.format(0.60*in)+"\n80%  "+df.format(0.80*in)+"\t"+"55%  "+df.format(0.55*in)+"\n75%  "+df.format(0.75*in)+"\t"+"50%  "+df.format(0.50*in);
       
        displayIncrements.setText(increment); //pass increment         
        displayOneRepMax.setText(ft.get1RM_FT(item)); //pass OneRepMax
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.dispose();        
        liftParent.show();
        liftParent.enable(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void Change_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_BtnMouseClicked
        // add your code to change 1RM
        String changeOneRepMax = changeRM.getText();
        int validate = validate1RM(changeOneRepMax);
        if (validate != 1) return;
        for(int i = 0; i < ft.liftData.size(); i++)
        {
            if(ft.liftData.get(i).getLiftName().compareTo(item) == 0)
            {
                ft.liftData.get(i).set1RM(changeOneRepMax);
                break;
            }
        }
        DecimalFormat df = new DecimalFormat( "#.##" );
        int in = Integer.parseInt(changeOneRepMax);
        String increment = "95%  "+df.format(0.95*in)+"\t"+"70%  "+df.format(0.70*in)+"\n90%  "+df.format(0.90*in)+"\t"+"65%  "+df.format(0.65*in)+"\n85%  "+df.format(0.85*in)+"\t"+"60%  "+df.format(0.60*in)+"\n80%  "+df.format(0.80*in)+"\t"+"55%  "+df.format(0.55*in)+"\n75%  "+df.format(0.75*in)+"\t"+"50%  "+df.format(0.50*in);
        displayIncrements.setText(increment); //pass increment         
        displayOneRepMax.setText(ft.get1RM_FT(item)); //pass OneRepMax
        ft.toTextFile();
    }//GEN-LAST:event_Change_BtnMouseClicked

    public static Integer validate1RM(String text1RM) {
        String errorMessage = "1RM must be a whole nummber between 0 and 3000.  Please Correct this entry and try again.";
        int int1RM;
        try {
            int RM1 = Integer.parseInt(text1RM);
            int1RM = RM1;
            } catch (NumberFormatException e) {
                invalidInput(errorMessage);
                return 0;
            }
        if (int1RM < 0 || int1RM > 3000) {
            invalidInput(errorMessage); 
            return 0;
        } else return 1;
    }
        
    public static void invalidInput(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Lift().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Btn;
    private javax.swing.JTextField changeRM;
    private javax.swing.JTextArea displayIncrements;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayOneRepMax;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
