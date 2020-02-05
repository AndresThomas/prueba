package basededatos;

import java.util.Date;

/**
 *
 * @author Thomas
 */
public class Clock extends javax.swing.JFrame {

    conexion con = new conexion();
    int h, m, s, cs;
    int option = 0;
    

    public void initClock() {
        
        System.out.println("Horas:"+new Date());
        
    }

    private void stop() {
        System.out.println("Horas:"+new Date());
        //String tiempo = "2 horas"; //etiquetaTiempo.getText();
        //System.out.println("La insercion tardó:" + tiempo);
    }

    public Clock() {
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

        jLabel1 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cLocal = new javax.swing.JButton();
        cDiana = new javax.swing.JButton();
        cLeo = new javax.swing.JButton();
        cGabi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel1.setText("Cronometro");

        etiquetaTiempo.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("100");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.setText("10,000");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("25,000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("100,000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cLocal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cLocal.setText("Local");
        cLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLocalActionPerformed(evt);
            }
        });

        cDiana.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cDiana.setText("Diana");
        cDiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDianaActionPerformed(evt);
            }
        });

        cLeo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cLeo.setText("Leo");
        cLeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLeoActionPerformed(evt);
            }
        });

        cGabi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cGabi.setText("Gabi");
        cGabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGabiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cLeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cDiana, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cGabi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(etiquetaTiempo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(etiquetaTiempo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cGabi)
                        .addGap(38, 38, 38)
                        .addComponent(cLocal)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cDiana)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cLeo)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarDatos(int option,int num){
        switch(option){
            case 1:{
                con.conectarGabi();
                break;}
            case 2:{
                con.conectar();
                break;
            }
            case 3:{
                con.conectarDiana();
                break;
            }
            case 4:{
                con.conectarLeo();
                break;
            }
        }
        switch(num){
            case 1:{
                con.enviar100(option);
                break;
            }
            case 2:{
                con.enviar10000(option);
                break;
            }
            case 3:{
                con.enviar25000(option);
                break;
            }
            case 4:{
                con.enviar100000(option);
                break;
            }
        }
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initClock();
        enviarDatos(option,1);
        stop();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        initClock();
        enviarDatos(option,2);
        stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        initClock();
        enviarDatos(option,3);
        stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        initClock();
        enviarDatos(option,4);
        stop();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cDianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDianaActionPerformed
        con.conectarDiana();
        option = 3;
        System.out.println("estado diana:"+con.status());
    }//GEN-LAST:event_cDianaActionPerformed

    private void cGabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGabiActionPerformed
        con.conectarGabi();
        option = 1;
        System.out.println("estdo gabi:"+con.status());
    }//GEN-LAST:event_cGabiActionPerformed

    private void cLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLocalActionPerformed
        con.conectar();
        option = 2;
        System.out.println("estado local:"+con.status());
    }//GEN-LAST:event_cLocalActionPerformed

    private void cLeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLeoActionPerformed
        con.conectarLeo();
        option = 4;
        System.out.println("estado Leo:"+con.status());
    }//GEN-LAST:event_cLeoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cDiana;
    private javax.swing.JButton cGabi;
    private javax.swing.JButton cLeo;
    private javax.swing.JButton cLocal;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}