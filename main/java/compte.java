/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.rmi.server.Operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

/**
 *
 * @author Client
 */
public class compte extends javax.swing.JFrame {
    protected int id=1;

    public void setClient(Client clt) {
         this.id=(clt.getId());
    } 
    /**
     * Creates new form compte
     */
    public compte() {
        initComponents();
        chargerComptesDansComboBox(jComboBox1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       

        jLabel1.setText("Veuillez selectionner un compte, afin de pouvoir consulter son solde");

        jButton1.setText("OK");
        System.out.println(this.id);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void chargerComptesDansComboBox(JComboBox<String> comboBox) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
   
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/projet?zeroDateTimeBehavior=CONVERT_TO_NULL";
    conn = DriverManager.getConnection(url, "malak", "");


        // Préparer la requête SQL
        String sql = "SELECT numero FROM comptebancaire WHERE titulaire_id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, this.id);

        // Exécuter la requête et obtenir le résultat
        rs = stmt.executeQuery();

        // Ajouter les numéros de compte au JComboBox
        while (rs.next()) // Tant qu'il y a des comptes
         { 
            comboBox.addItem(rs.getString("numero")); // Ajouter le numéro de compte au JComboBox
            System.out.println("Added account: " + rs.getString("numero"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Fermer les ressources JDBC
        try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
}
    

public int getIdcbFromNumero(String numero) {
    int idcb = -1;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        String url = "jdbc:mysql://localhost:3306/projet?zeroDateTimeBehavior=CONVERT_TO_NULL";
        conn = DriverManager.getConnection(url, "malak", "");

        String sql = "SELECT idcb FROM comptebancaire WHERE numero = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, numero);

        rs = stmt.executeQuery();
        if (rs.next()) {
            idcb = rs.getInt("idcb");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Fermer les ressources JDBC
        try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
    return idcb;
}



private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String numeroCompte = (String) jComboBox1.getSelectedItem();
        int idcb = getIdcbFromNumero(numeroCompte);
        operation operation = new operation();
        operation.setClient(idcb);
        operation.setVisible(true);
        dispose();
}





private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
    e.printStackTrace();
    return;  }

   
    try  {
    String url="jdbc:mysql://localhost:3306/projet?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user= "malak";
    String pass="";
    Connection conn = DriverManager.getConnection(url, user, pass);
      conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: " + e.getSQLState());
        System.out.println("VendorError: " + e.getErrorCode());
    }
    // Détruire l'objet Client
    id = 0;

    // Ouvrir la JFrame connexion.java
    connexion connexionFrame = new connexion();
    connexionFrame.setVisible(true);

    // Fermer la JFrame actuelle
    this.dispose();
}

    
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
            java.util.logging.Logger.getLogger(compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
