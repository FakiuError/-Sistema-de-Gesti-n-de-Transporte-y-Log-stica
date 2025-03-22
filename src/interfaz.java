
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alejo
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        boxTipoV = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonAñadir = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Ingrese por favor la placa del vehiculo");
        jTextField1.setBorder(null);

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
        });
        buttonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAñadirActionPerformed(evt);
            }
        });

        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout txtPlacaLayout = new javax.swing.GroupLayout(txtPlaca);
        txtPlaca.setLayout(txtPlacaLayout);
        txtPlacaLayout.setHorizontalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(boxTipoV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(buttonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200)
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        txtPlacaLayout.setVerticalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(buttonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void SetImageLabel (JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(262, 262, Image.SCALE_DEFAULT));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoV;
    private javax.swing.JButton buttonAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lImage;
    private javax.swing.JPanel txtPlaca;
    // End of variables declaration//GEN-END:variables
}
