/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */ import java.sql.*;
import javax.swing.JOptionPane;

public class quiz extends javax.swing.JFrame {
 Connection con=null;
 Statement stmt=null;
 ResultSet rs=null;
 String rt_ans="",ex_opt="",aud_a="",aud_b="",aud_c="",aud_d="";
 String ex_ad=null;
 String q[]={"5000","10k","20k","40k","80k","160k","320k","640k","1250k","25l","50l","1cr","3cr","5cr","7cr"};
 String p[]={"0","10,000","3,20,000","1 crore","5 crore","7 crore"};
 int i=0,c=1,pad=0;
 
    /**
     * Creates new form quiz
     */
    public quiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ca = new javax.swing.JButton();
        cb = new javax.swing.JButton();
        cc = new javax.swing.JButton();
        cd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cap = new javax.swing.JButton();
        l50 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        ea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tqp = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tq = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAUN BANEGA CROREPATI");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });

        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });

        jLabel2.setText("A");

        jLabel3.setText("C");

        jLabel4.setText("B");

        jLabel5.setText("D");

        jLabel6.setText("Q");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("lifelines"));

        cap.setText("AUDIENCE POLL");
        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });

        l50.setText("50:50");
        l50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l50ActionPerformed(evt);
            }
        });

        x2.setText("DOUBLE DIP (X2)");
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });

        ea.setText("EXPERT ADVICE");
        ea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(x2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ea)
                .addContainerGap())
        );

        jLabel1.setText("THIS QUESTION FOR:");

        tqp.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N

        jButton5.setText("QUIT");

        jButton6.setText("CHECK PROGRESS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tq.setColumns(20);
        tq.setRows(5);
        jScrollPane1.setViewportView(tq);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cc, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cd, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(tqp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tqp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
question();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        // TODO add your handling code here:
        if (rt_ans.equalsIgnoreCase("a"))
        { 
            JOptionPane.showMessageDialog(rootPane, "Correct Answer");
            if (i<q.length)
            {   
                i++;
                if (i==2 || i==7 || i==12 || i==14 || i==15)
                    pad++;
                question();
            }
        }
        else
        { JOptionPane.showMessageDialog(rootPane, "wrong Answer ....BETTER LUCK NEXT TIME...YOU WON Rs. "+p[pad]);
            dispose();
        }
    }//GEN-LAST:event_caActionPerformed
    
    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
        if (rt_ans.equalsIgnoreCase("b"))
           { 
            JOptionPane.showMessageDialog(rootPane, "Correct Answer");
            if (i<q.length)
            {   
                i++;
                if (i==2 || i==7 || i==12 || i==14 || i==15)
                    pad++;
                question();
            }
        }
        else
        {
          JOptionPane.showMessageDialog(rootPane,"wrong Answer ....BETTER LUCK NEXT TIME...YOU WON Rs. "+p[pad]);
          dispose();
          }
    }//GEN-LAST:event_cbActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        // TODO add your handling code here:
       if (rt_ans.equalsIgnoreCase("c"))
           { 
            JOptionPane.showMessageDialog(rootPane, "Correct Answer");
            if (i<q.length )
            {   
                i++;
                if (i==2 || i==7 || i==12 || i==14 || i==15)
                    pad++;
                question();
            }
        }
        else
       {
           JOptionPane.showMessageDialog(rootPane, "wrong Answer ....BETTER LUCK NEXT TIME...YOU WON Rs. "+p[pad]);
       
       dispose();   
       }
    }//GEN-LAST:event_ccActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
        // TODO add your handling code here:
        if (rt_ans.equalsIgnoreCase("d"))
           { 
            JOptionPane.showMessageDialog(rootPane, "Correct Answer");
            if (i<q.length)
            {   
                i++;
                if (i==2 || i==7 || i==12 || i==14 || i==15)
                    pad++;
                question();
            }
        }
        else
        {  
           JOptionPane.showMessageDialog(rootPane,"wrong Answer ....BETTER LUCK NEXT TIME...YOU WON Rs. "+p[pad]);
           dispose();
           
        }
    }//GEN-LAST:event_cdActionPerformed

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"A : \t"+ aud_a+"\n B : \t"+ aud_b+"\n C : \t"+ aud_c+"\n D : \t"+aud_d );
        cap.setEnabled(false);
    }//GEN-LAST:event_capActionPerformed

    private void l50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l50ActionPerformed
        // TODO add your handling code here:
        x2.setVisible(false);
        if (!(rt_ans.equalsIgnoreCase("a") || ex_opt.equalsIgnoreCase("a")))
            ca.setVisible(false);
         if (!(rt_ans.equalsIgnoreCase("b") || ex_opt.equalsIgnoreCase("b")))
            cb.setVisible(false);
         if (!(rt_ans.equalsIgnoreCase("c") || ex_opt.equalsIgnoreCase("c")))
            cc.setVisible(false);
         if (!(rt_ans.equalsIgnoreCase("d") || ex_opt.equalsIgnoreCase("d")))
            cd.setVisible(false);
         l50.setEnabled(false);
    }//GEN-LAST:event_l50ActionPerformed

    private void eaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, ex_ad);
        ea.setEnabled(false);
    }//GEN-LAST:event_eaActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        // TODO add your handling code here:
        l50.setVisible(false);
        x2.setEnabled(false);
        
        
    }//GEN-LAST:event_x2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    void question()
    {
        try
        {   tq.setEditable(false);
            ca.setVisible(true);
            cb.setVisible(true);
            cc.setVisible(true);
            cd.setVisible(true);
            x2.setVisible(true);
            l50.setVisible(true);
            tqp.setText(""+q[i]);
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","root","");
            stmt=con.createStatement();
            int no=1+(int) (Math.random()*10);
            
            String query1="Select * from q"+q[i]+" where qno=";
            rs=stmt.executeQuery(query1+no);
            if(rs.next())
            {
                String q=rs.getString("ques");
                String o_a=rs.getString("opt_a");
                String o_b=rs.getString("opt_b");
                String o_c=rs.getString("opt_c");
                String o_d=rs.getString("opt_d");
                rt_ans=rs.getString("rt_opt");
                ex_opt=rs.getString("ex_opt50");
                aud_a=rs.getString("aud_a");
                aud_b=rs.getString("aud_b");
                aud_c=rs.getString("aud_c");
                aud_d=rs.getString("aud_d");
                ex_ad=rs.getString("ex_ad");
                tq.setText(q);
                ca.setText(o_a);
                cb.setText(o_b);
                cc.setText(o_c);
                cd.setText(o_d);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ca;
    private javax.swing.JButton cap;
    private javax.swing.JButton cb;
    private javax.swing.JButton cc;
    private javax.swing.JButton cd;
    private javax.swing.JButton ea;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton l50;
    private javax.swing.JTextArea tq;
    private javax.swing.JLabel tqp;
    private javax.swing.JButton x2;
    // End of variables declaration//GEN-END:variables
}
