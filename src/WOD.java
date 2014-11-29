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
import java.net.HttpURLConnection;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WOD extends javax.swing.JFrame {

    /**
     * Creates new form WOD
     */
       //Fields
   private String originalData = "WOD name : hour : minutes : seconds";	// hold string read from txt file
   private int tokenCount;										// hold number of tokens
   private String wodName;    //Holds WOD name
   private String hour;                               //Holds Hour value
   private String min;                               //Holds minute value
   private String sec;                               //Holds second value 
   private String con;                                //holds content value
   private String notes;                               //Holds notes value
   private String url;                                  // Holds url value
       
   /**
		The constructor sets the WOD;s name and hour, minute, second, content, notes, and URL datas
	*/
	
   public WOD(String wodName, String hour, String min, String sec, String con, String notes, String url)
   {
      this.wodName = wodName;
      this.hour = hour;
      this.min = min;
      this.sec = sec;
      this.con = con;
      this.notes = notes;
      this.url = url;
   } 
   
    /**
      Accessors and Mutators
   */

   
   public void setWodName(String newWodName)
   {
      wodName = newWodName;
   }
	
   public String getWodName()
   {
      return wodName;
   }

   public void setHour(String newHour)
   {
      hour = newHour;
   }
	
   public String getHour()
   {
      return hour;
   }
   
   public void setMin(String newMin)
   {
      min = newMin;
   }
	
   public String getMin()
   {
      return min;
   }
   
   public void setSec(String newSec)
   {
      sec = newSec;
   }
	
   public String getSec()
   {
      return sec;
   }
   
   public void setCon(String newCon)
   {
       con = newCon;
   }
   
   public String getCon()
   {
       return con;
   }
   
   public void setNotes(String newNotes)
   {
       notes = newNotes;
   }
   
   public String getNotes()
   {
       return notes;
   }
   
   public void setUrl(String newUrl)
   {
       url = newUrl;
   }
   
   public String getUrl()
   {
       return url;
   }
      /**
		The toString method returns a string containing the Lift's data.
		@return a refernce to the a string
	*/
	
   public String toString()
   {
      String str;
   	
      str = "w : " + getWodName() + " : " + hour + " : " + min + " : " + sec + " : " + con + " : " + notes + " : " + url;   				
      return str;
   }
    //////////////////////////////////
    
    String item = "";
    PR2 wodParent;
    FromText ft;
    public WOD() {
        initComponents();
    }
    public WOD(String item) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateNote_Btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        wodShowName = new javax.swing.JLabel();
        wodHour = new javax.swing.JLabel();
        wodMinute = new javax.swing.JLabel();
        wodSecond = new javax.swing.JLabel();
        wodNote = new javax.swing.JLabel();
        wodURL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wodContent = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateNote = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updateHour = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        updateMinute = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        updateSecond = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("WOD Window");
        setMaximumSize(new java.awt.Dimension(2147483647, 2047483047));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("WOD Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Hour:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Minute:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Second:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Content:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Note:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("URL:");

        updateNote_Btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNote_Btn.setText("Update note");
        updateNote_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNote_BtnMouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Return to Main Menu");
        jButton3.setAlignmentY(0.0F);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        wodShowName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodShowName.setForeground(new java.awt.Color(0, 204, 102));
        wodShowName.setText("jLabel8");

        wodHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodHour.setForeground(new java.awt.Color(0, 204, 102));
        wodHour.setText("jLabel9");

        wodMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodMinute.setForeground(new java.awt.Color(0, 204, 102));
        wodMinute.setText("jLabel10");

        wodSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodSecond.setForeground(new java.awt.Color(0, 204, 102));
        wodSecond.setText("jLabel11");

        wodNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodNote.setForeground(new java.awt.Color(0, 204, 102));
        wodNote.setText("jLabel13");

        wodURL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodURL.setForeground(new java.awt.Color(0, 204, 102));
        wodURL.setText("jLabel14");
        wodURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wodURLMouseClicked(evt);
            }
        });

        wodContent.setColumns(20);
        wodContent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wodContent.setForeground(new java.awt.Color(0, 204, 102));
        wodContent.setLineWrap(true);
        wodContent.setRows(3);
        jScrollPane1.setViewportView(wodContent);

        updateNote.setColumns(20);
        updateNote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNote.setRows(5);
        jScrollPane3.setViewportView(updateNote);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Note");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("New Hour");

        updateHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("New Minute");

        updateMinute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("New Second");

        updateSecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wodHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodMinute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wodShowName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateNote_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {updateHour, updateMinute, updateSecond});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(wodShowName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(wodHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(wodMinute))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(wodSecond))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(wodNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wodURL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel12)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(updateHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(updateMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(updateSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNote_Btn))
                .addGap(49, 49, 49)
                .addComponent(jButton3)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {wodHour, wodMinute, wodNote, wodSecond, wodShowName, wodURL});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        wodParent.enable(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
   
        wodShowName.setText(item);
        wodHour.setText(ft.getHourFT(item)); //pass wod hour 
        wodMinute.setText(ft.getMinFT(item)); //pass wod minute
        wodSecond.setText(ft.getSecFT(item)); //pass wod second
        wodContent.setText(ft.getDescription(item)); //pass wod content
        wodNote.setText(ft.getNotesFT(item)); //pass wod note
        wodURL.setText(ft.getUrlFT(item)); //pass wod url
    }//GEN-LAST:event_formWindowOpened

    private void updateNote_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNote_BtnMouseClicked
        // add your code here to update note
        String note = updateNote.getText();
        String newhour = updateHour.getText();
        String newminute = updateMinute.getText();
        String newsecond = updateSecond.getText();
        int validate = validateWOD(note, newhour, newminute, newsecond);
        if (validate != 1) return;
        for(int i = 0; i < ft.wodData.size(); i++)
        {
            if(ft.wodData.get(i).getWodName().compareTo(item) == 0)
            {
                ft.wodData.get(i).setHour(newhour);
                ft.wodData.get(i).setMin(newminute);
                ft.wodData.get(i).setSec(newsecond);
                ft.wodData.get(i).setNotes(note);
                break;
            }
        }       
        wodHour.setText(newhour); //pass wod hour 
        wodMinute.setText(newminute); //pass wod minute
        wodSecond.setText(newsecond); //pass wod second
        
        wodNote.setText(note); //pass wod note
        ft.toTextFile();
    }//GEN-LAST:event_updateNote_BtnMouseClicked

    public static Integer validateWOD(String note, String hour, String min, String sec) {
        String error1 = "Notes cannot contain the following reserved characters:  Colons (:), Quotation Marks (\").\n";
        String error2 = "Hours must be a whole number between 00-12.\n";
        String error3 = "Minutes must be a whole number between 00-59.\n";
        String error4 = "Seconds must be a whole number between 00-59.\n";
        String errorOutput = "Please correct the following errors and try again: \n";
        int intHour, intMin, intSec;
        if (!hour.equals("")) {
            try {
                intHour = Integer.parseInt(hour);
                if (intHour < 0 || intHour > 12) {
                    errorOutput = errorOutput + error2;}
                } catch (NumberFormatException e) {
                    errorOutput = errorOutput + error2;
                }
        }
        if (!min.equals("")) {
            try {
                intMin = Integer.parseInt(min);
                if (intMin < 0 || intMin > 59) {
                    errorOutput = errorOutput + error3;}
            } catch (NumberFormatException e) {
                errorOutput = errorOutput + error3;}
        }
        if (!sec.equals("")) {
            try {
                intSec = Integer.parseInt(sec);
                if (intSec < 0 || intSec > 59) {
                    errorOutput = errorOutput + error4;}
            } catch (NumberFormatException e) {
                errorOutput = errorOutput + error4;}
        }
        for(int i = 0; i < note.length(); i++) {
            char c = note.charAt(i);
            if(c == ':' || c =='"') {
                errorOutput = errorOutput + error1;}
        }
        if (!errorOutput.equals("Please correct the following errors and try again: \n")) {
            invalidInput(errorOutput);
            return 0;}
        else return 1;
    }
    
    public static void invalidInput(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

        

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        wodParent.show();
        wodParent.enable(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void wodURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wodURLMouseClicked
        try {
         //Set your page url in this string. For eg, I m using URL for Google Search engine
         String WODurl = "http://" + wodURL.getText();
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(WODurl));
         }
        catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }


        
        // TODO add your handling code here:
    }//GEN-LAST:event_wodURLMouseClicked

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
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WOD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField updateHour;
    private javax.swing.JTextField updateMinute;
    private javax.swing.JTextArea updateNote;
    private javax.swing.JButton updateNote_Btn;
    private javax.swing.JTextField updateSecond;
    private javax.swing.JTextArea wodContent;
    private javax.swing.JLabel wodHour;
    private javax.swing.JLabel wodMinute;
    private javax.swing.JLabel wodNote;
    private javax.swing.JLabel wodSecond;
    private javax.swing.JLabel wodShowName;
    private javax.swing.JLabel wodURL;
    // End of variables declaration//GEN-END:variables
}
