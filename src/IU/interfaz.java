package IU;

import app.Motocicleta;
import app.Camion;
import app.Vehiculo;
import app.FlotaVehiculos;
import app.Coche;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class interfaz extends javax.swing.JFrame {
    public FlotaVehiculos flota;
    public JFrame principal;
    public interfaz(FlotaVehiculos flota, JFrame principal) {
        this.flota = flota;
        this.principal = principal;
        initComponents();
        SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        boxTipoV = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonAñadir = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        buttonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        txtMatricula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(153, 153, 153));
        txtMatricula.setText("Ingrese por favor la placa del vehiculo");
        txtMatricula.setBorder(null);
        txtMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMatriculaMousePressed(evt);
            }
        });
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        boxTipoV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxTipoV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coche", "Camion", "Motocicleta" }));
        boxTipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoVActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Integración de vehiculos");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Digite la placa del vehiculo");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Seleccione el tipo de vehiculo");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentY(1.0F);

        buttonAñadir.setBackground(new java.awt.Color(153, 153, 153));
        buttonAñadir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        buttonAñadir.setText("Añadir vehiculo");
        buttonAñadir.setBorder(null);
        buttonAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAñadirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAñadirMousePressed(evt);
            }
        });
        buttonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAñadirActionPerformed(evt);
            }
        });

        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Digite el consumo por kilometro");

        txtConsumo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConsumo.setForeground(new java.awt.Color(153, 153, 153));
        txtConsumo.setText("Ejemplo: 1 si consume 1 litro por kilometro");
        txtConsumo.setBorder(null);
        txtConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConsumoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConsumoMousePressed(evt);
            }
        });
        txtConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumoActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentY(1.0F);

        buttonAtras.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        buttonAtras.setText("<");
        buttonAtras.setBorder(null);
        buttonAtras.setBorderPainted(false);
        buttonAtras.setContentAreaFilled(false);
        buttonAtras.setDefaultCapable(false);
        buttonAtras.setFocusPainted(false);
        buttonAtras.setVerifyInputWhenFocusTarget(false);
        buttonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAtrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAtrasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout txtPlacaLayout = new javax.swing.GroupLayout(txtPlaca);
        txtPlaca.setLayout(txtPlacaLayout);
        txtPlacaLayout.setHorizontalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(txtMatricula)
                            .addComponent(boxTipoV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(buttonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConsumo)
                            .addComponent(jSeparator2))
                        .addGap(200, 200, 200)
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        txtPlacaLayout.setVerticalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(buttonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
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
    
    private void buttonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAñadirActionPerformed

    private void buttonAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirMouseEntered
        buttonAñadir.setBackground(white);
        buttonAñadir.setForeground(black);
    }//GEN-LAST:event_buttonAñadirMouseEntered

    private void buttonAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirMouseExited
        buttonAñadir.setBackground(new Color (153,153,153));
        buttonAñadir.setForeground(white);
    }//GEN-LAST:event_buttonAñadirMouseExited

    private void boxTipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoVActionPerformed
        switch (boxTipoV.getSelectedIndex()) {
            case 0:
                System.out.println("Elegido carro");
                SetImageLabel(lImage, "src/img/coche.jpg");
                break;
            case 1:
                System.out.println("Elegido camion");
                SetImageLabel(lImage, "src/img/camion.jpg");
                break;
            default:
                System.out.println("Elegido moto");
                SetImageLabel(lImage, "src/img/motocicleta.jpg");
                break;
        }
    }//GEN-LAST:event_boxTipoVActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoActionPerformed

    private void txtConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsumoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoMouseEntered

    private void txtConsumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsumoMousePressed
        if (txtConsumo.getText().equals("Ejemplo: 1 si consume 1 litro por kilometro")) {
            txtConsumo.setText("");
            txtConsumo.setForeground(new Color(0,0,0));
        }
        if (txtMatricula.getText().isEmpty()) {
            txtMatricula.setText("Ingrese por favor la placa del vehiculo");
            txtMatricula.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtConsumoMousePressed

    private void txtMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaMousePressed
        if (txtMatricula.getText().equals("Ingrese por favor la placa del vehiculo")) {
            txtMatricula.setText("");
            txtMatricula.setForeground(new Color(0,0,0));
        }
        if (txtConsumo.getText().isEmpty()) {
            txtConsumo.setText("Ejemplo: 1 si consume 1 litro por kilometro");
            txtConsumo.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtMatriculaMousePressed

    private void buttonAñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAñadirMousePressed

        String matricula = txtMatricula.getText();
        double consumo = Double.parseDouble(txtConsumo.getText());
        if (boxTipoV.getSelectedIndex() == 0) {
            Vehiculo nuevoVehiculo = new Coche(matricula, consumo);
            System.out.println(nuevoVehiculo);
            flota.agregarVehiculo(nuevoVehiculo);
        } else if (boxTipoV.getSelectedIndex() == 1) {
            Vehiculo nuevoVehiculo = new Camion(matricula, consumo);
            System.out.println(nuevoVehiculo);
            flota.agregarVehiculo(nuevoVehiculo);
        } else {
            Vehiculo nuevoVehiculo = new Motocicleta(matricula, consumo);
            System.out.println(nuevoVehiculo);
            flota.agregarVehiculo(nuevoVehiculo);
        }
        
        
        flota.mostrarVehiculos();
        JOptionPane.showMessageDialog(this, "Vehículo agregado correctamente.");
        txtConsumo.setText("Ejemplo: 1 si consume 1 litro por kilometro");
        txtConsumo.setForeground(new Color (153, 153, 153));
        txtMatricula.setText("Ingrese por favor la placa del vehiculo");
        txtMatricula.setForeground(new Color (153, 153, 153));
        
    }//GEN-LAST:event_buttonAñadirMousePressed

    private void buttonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMouseEntered
        buttonAtras.setForeground(new Color (153, 153, 153));
    }//GEN-LAST:event_buttonAtrasMouseEntered

    private void buttonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMouseExited
        buttonAtras.setForeground(black);
    }//GEN-LAST:event_buttonAtrasMouseExited

    private void buttonAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMousePressed
        this.principal.setVisible(true);
        this.dispose();
        this.principal.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_buttonAtrasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoV;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lImage;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPanel txtPlaca;
    // End of variables declaration//GEN-END:variables
}
