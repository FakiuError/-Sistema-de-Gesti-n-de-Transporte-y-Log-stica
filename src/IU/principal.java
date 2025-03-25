package IU;
import app.FlotaVehiculos;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class principal extends javax.swing.JFrame {
    private FlotaVehiculos flota;
    public principal(FlotaVehiculos flota) {
        this.flota = flota;
        
        initComponents();
        new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonAñadirV = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonBuscarV = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonCrearR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buttonVerR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona la opción que requieras");

        buttonAñadirV.setBackground(new java.awt.Color(153, 153, 153));
        buttonAñadirV.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonAñadirV.setForeground(new java.awt.Color(255, 255, 255));
        buttonAñadirV.setText("Añadir vehiculo");
        buttonAñadirV.setBorder(null);
        buttonAñadirV.setBorderPainted(false);
        buttonAñadirV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAñadirVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAñadirVMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAñadirVMousePressed(evt);
            }
        });
        buttonAñadirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAñadirVActionPerformed(evt);
            }
        });

        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setAlignmentY(1.0F);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Añadir un nuevo vehiculo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Buscar vehiculos por placa");

        buttonBuscarV.setBackground(new java.awt.Color(153, 153, 153));
        buttonBuscarV.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonBuscarV.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuscarV.setText("Buscar Vehiculo");
        buttonBuscarV.setBorder(null);
        buttonBuscarV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBuscarVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBuscarVMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarVMousePressed(evt);
            }
        });
        buttonBuscarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Crear una nueva ruta");

        buttonCrearR.setBackground(new java.awt.Color(153, 153, 153));
        buttonCrearR.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonCrearR.setForeground(new java.awt.Color(255, 255, 255));
        buttonCrearR.setText("Crear Ruta");
        buttonCrearR.setBorder(null);
        buttonCrearR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCrearRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCrearRMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonCrearRMousePressed(evt);
            }
        });
        buttonCrearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearRActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Visualizar todas las rutas");

        buttonVerR.setBackground(new java.awt.Color(153, 153, 153));
        buttonVerR.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonVerR.setForeground(new java.awt.Color(255, 255, 255));
        buttonVerR.setText("Ver Rutas");
        buttonVerR.setBorder(null);
        buttonVerR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVerRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVerRMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonVerRMousePressed(evt);
            }
        });
        buttonVerR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtPlacaLayout = new javax.swing.GroupLayout(txtPlaca);
        txtPlaca.setLayout(txtPlacaLayout);
        txtPlacaLayout.setHorizontalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buttonAñadirV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(buttonBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCrearR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addComponent(buttonVerR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        txtPlacaLayout.setVerticalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAñadirV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCrearR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonVerR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void SetImageLabel (JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void buttonAñadirVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirVMouseEntered
        buttonAñadirV.setBackground(white);
        buttonAñadirV.setForeground(black);
    }//GEN-LAST:event_buttonAñadirVMouseEntered

    private void buttonAñadirVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirVMouseExited
        buttonAñadirV.setBackground(new Color (153,153,153));
        buttonAñadirV.setForeground(white);
    }//GEN-LAST:event_buttonAñadirVMouseExited

    private void buttonAñadirVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirVMousePressed
        interfaz pantalla = new interfaz(this.flota, this);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAñadirVMousePressed

    private void buttonAñadirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAñadirVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAñadirVActionPerformed

    private void buttonBuscarVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarVMouseEntered
        buttonBuscarV.setBackground(white);
        buttonBuscarV.setForeground(black);
    }//GEN-LAST:event_buttonBuscarVMouseEntered

    private void buttonBuscarVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarVMouseExited
        buttonBuscarV.setBackground(new Color (153,153,153));
        buttonBuscarV.setForeground(white);
    }//GEN-LAST:event_buttonBuscarVMouseExited

    private void buttonBuscarVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarVMousePressed
        buscarV pantalla = new buscarV(this.flota, this);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBuscarVMousePressed

    private void buttonBuscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarVActionPerformed

    private void buttonCrearRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearRMouseEntered
        buttonCrearR.setBackground(white);
        buttonCrearR.setForeground(black);
    }//GEN-LAST:event_buttonCrearRMouseEntered

    private void buttonCrearRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearRMouseExited
        buttonCrearR.setBackground(new Color (153,153,153));
        buttonCrearR.setForeground(white);
    }//GEN-LAST:event_buttonCrearRMouseExited

    private void buttonCrearRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearRMousePressed
        crearR pantalla = new crearR(this.flota, this);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCrearRMousePressed

    private void buttonCrearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCrearRActionPerformed

    private void buttonVerRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVerRMouseEntered
        buttonVerR.setBackground(white);
        buttonVerR.setForeground(black);
    }//GEN-LAST:event_buttonVerRMouseEntered

    private void buttonVerRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVerRMouseExited
        buttonVerR.setBackground(new Color (153,153,153));
        buttonVerR.setForeground(white);
    }//GEN-LAST:event_buttonVerRMouseExited

    private void buttonVerRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVerRMousePressed
        lista pantalla = new lista(this.flota, this);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonVerRMousePressed

    private void buttonVerRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVerRActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAñadirV;
    private javax.swing.JButton buttonBuscarV;
    private javax.swing.JButton buttonCrearR;
    private javax.swing.JButton buttonVerR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lImage;
    private javax.swing.JPanel txtPlaca;
    // End of variables declaration//GEN-END:variables
}
