package Ventanas;

import Libreria.LibreriaSyscol;

//Diego Aaron Figueroa Campos
public class Solicitud extends javax.swing.JFrame {

    public Solicitud() {
        initComponents();
        setLocationRelativeTo(null);
        LibreriaSyscol lb = new LibreriaSyscol();
        String rutaImagenSolicitud = "/Imagenes/Solicitud.png";
        lb.ajustarImagen(rutaImagenSolicitud, lblImagenSolicitud);
        this.repaint();
        lb.restringirFechas(jdcFechaVisita);
        lb.validarSoloLetras(txtNombre);
        lb.validarSoloNumeros(txtTelefono);
        lb.evitarPegar(txtNombre);
        lb.evitarPegar(txtTelefono);
        String fecha = lb.obtenerFecha(jdcFechaVisita);
        System.out.println(fecha);
    }
    
    public void validarCampos(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFechaVisita = new javax.swing.JLabel();
        lblHoraVisita = new javax.swing.JLabel();
        jdcFechaVisita = new com.toedter.calendar.JDateChooser();
        txtHoraVisita = new javax.swing.JFormattedTextField();
        lblImagenSolicitud = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNombre.setText("Nombre completo");

        lblTelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTelefono.setText("Número de telefono");

        lblFechaVisita.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblFechaVisita.setText("Fecha de visita");

        lblHoraVisita.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblHoraVisita.setText("Hora de visita");

        jdcFechaVisita.setDateFormatString("dd/MM/yyyy");
        jdcFechaVisita.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        try {
            txtHoraVisita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraVisita.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lblDomicilio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDomicilio.setText("Domicilio completo");

        txtDomicilio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDomicilio.setPreferredSize(new java.awt.Dimension(4, 30));
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDomicilio)
                        .addGap(25, 25, 25)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblFechaVisita)
                                    .addComponent(lblHoraVisita))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jdcFechaVisita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHoraVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(lblImagenSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraVisita)
                            .addComponent(txtHoraVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioKeyTyped

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jdcFechaVisita;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblFechaVisita;
    private javax.swing.JLabel lblHoraVisita;
    private javax.swing.JLabel lblImagenSolicitud;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JFormattedTextField txtHoraVisita;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
