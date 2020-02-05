package basededatos;

import java.sql.*;
import javax.swing.JOptionPane;
import basededatos.conexion;

public class registroAlumno extends javax.swing.JFrame {

    String nombreAlumno = "";
    String ciudadAlumno = "";
    String idAlumno = "";
    int idUsuario = 0;
    conexion conn = new conexion();

    public registroAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        idName = new javax.swing.JTextField();
        guardarLeo = new javax.swing.JButton();
        guardarGabi = new javax.swing.JButton();
        guardarDiana = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de alumnos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("ID Ciudad");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jToggleButton1.setText("Guardar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("ID Alumno");

        guardarLeo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        guardarLeo.setText("Guardar L");
        guardarLeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarLeoActionPerformed(evt);
            }
        });

        guardarGabi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        guardarGabi.setText("Guardar G");
        guardarGabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarGabiActionPerformed(evt);
            }
        });

        guardarDiana.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        guardarDiana.setText("Guardar D");
        guardarDiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDianaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("ID Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardarDiana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarGabi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarLeo)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idUser)
                    .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(idName)
                    .addComponent(name))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarLeo)
                    .addComponent(jToggleButton1)
                    .addComponent(guardarGabi)
                    .addComponent(guardarDiana)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (!name.getText().isEmpty() && !city.getText().isEmpty() && !idName.getText().isEmpty() && !idUser.getText().isEmpty()) {
            nombreAlumno = name.getText();
            ciudadAlumno = city.getText();
            idAlumno = idName.getText();
            idUsuario = Integer.parseInt(idUser.getText());
            conn.conectar();
            conn.enviarDatos(idAlumno, nombreAlumno, ciudadAlumno);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los datos");
        }
        if (conn.status()) {
            System.out.println("Conectado");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void guardarLeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarLeoActionPerformed
        if (!name.getText().isEmpty() && !city.getText().isEmpty() && !idName.getText().isEmpty() && !idUser.getText().isEmpty()) {
            nombreAlumno = name.getText();
            ciudadAlumno = city.getText();
            idAlumno = idName.getText();
            idUsuario = Integer.parseInt(idUser.getText());
            conn.conectarLeo();
            conn.enviarDatosLeo(idAlumno, nombreAlumno, idAlumno, idUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los datos");
        }
        if (conn.status()) {
            System.out.println("Conectado con Leo");
        }
    }//GEN-LAST:event_guardarLeoActionPerformed

    private void guardarGabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGabiActionPerformed
        if (!name.getText().isEmpty() && !city.getText().isEmpty() && !idName.getText().isEmpty() && !idUser.getText().isEmpty()) {
            nombreAlumno = name.getText();
            ciudadAlumno = city.getText();
            idAlumno = idName.getText();
            idUsuario = Integer.parseInt(idUser.getText());
            conn.conectarGabi();
            conn.enviarDatosGabi(idAlumno, nombreAlumno, idAlumno, idUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los datos");
        }
        if (conn.status()) {
            System.out.println("Conectado con Gabi");
        }
    }//GEN-LAST:event_guardarGabiActionPerformed

    private void guardarDianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDianaActionPerformed
        if (!name.getText().isEmpty() && !city.getText().isEmpty() && !idName.getText().isEmpty() && !idUser.getText().isEmpty()) {
            nombreAlumno = name.getText();
            ciudadAlumno = city.getText();
            idAlumno = idName.getText();
            idUsuario = Integer.parseInt(idUser.getText());
            System.out.println("daots a");
            conn.conectarDiana();
            conn.enviarDatosDiana(idAlumno, nombreAlumno, idAlumno, idUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los datos");
        }
        if (conn.status()) {
            System.out.println("Conectado con Diana");
        }
    }//GEN-LAST:event_guardarDianaActionPerformed

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
            java.util.logging.Logger.getLogger(registroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroAlumno().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JButton guardarDiana;
    private javax.swing.JButton guardarGabi;
    private javax.swing.JButton guardarLeo;
    private javax.swing.JTextField idName;
    private javax.swing.JTextField idUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

}
