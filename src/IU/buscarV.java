package IU;
import app.Motocicleta;
import app.Camion;
import app.Vehiculo;
import app.FlotaVehiculos;
import app.Coche;
import app.Ruta;
import app.Viaje;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
public class buscarV extends javax.swing.JFrame {
    public FlotaVehiculos flota;
    public JFrame principal;
    public DefaultListModel modeloLista = new DefaultListModel();
    
    public buscarV(FlotaVehiculos flota, JFrame principal) {
        this.flota = flota;
        this.principal = principal;
        initComponents();
        new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
        buttonEliminar.setVisible(false);
        labelViajes.setVisible(false);
        listaRutas.setModel(modeloLista);
        listaRutas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonBuscar = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();
        buttonAtras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelInfo = new javax.swing.JLabel();
        buttonEliminar = new javax.swing.JButton();
        labelViajes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRutas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        txtMatricula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(153, 153, 153));
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar Vehiculos por placa");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite la placa del vehiculo");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentY(1.0F);

        buttonBuscar.setBackground(new java.awt.Color(153, 153, 153));
        buttonBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuscar.setText("Buscar Vehiculo");
        buttonBuscar.setBorder(null);
        buttonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarMousePressed(evt);
            }
        });
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        labelInfo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        buttonEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setText("ELIMINAR");
        buttonEliminar.setBorder(null);
        buttonEliminar.setBorderPainted(false);
        buttonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonEliminarMousePressed(evt);
            }
        });

        labelViajes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        labelViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelViajes.setText("Lista de viajes");

        listaRutas.setBorder(null);
        listaRutas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        listaRutas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaRutas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(listaRutas);

        javax.swing.GroupLayout txtPlacaLayout = new javax.swing.GroupLayout(txtPlaca);
        txtPlaca.setLayout(txtPlacaLayout);
        txtPlacaLayout.setHorizontalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtPlacaLayout.createSequentialGroup()
                                        .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)))
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGap(369, 369, 369)
                                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
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
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelInfo)
                            .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelViajes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
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
   
    
    private void buttonAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMousePressed
        this.principal.setVisible(true);
        this.dispose();
        this.principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonAtrasMousePressed

    private void buttonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMouseExited
        buttonAtras.setForeground(black);
    }//GEN-LAST:event_buttonAtrasMouseExited

    private void buttonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMouseEntered
        buttonAtras.setForeground(new Color (153, 153, 153));
    }//GEN-LAST:event_buttonAtrasMouseEntered

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMousePressed
        if (flota.buscarVehiculo(txtMatricula.getText()) == null) {
            JOptionPane.showMessageDialog(this, "No se encuentra el vehiculo");  
            buttonEliminar.setVisible(false);
            labelViajes.setVisible(false);
            new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
        }
        else {
            labelInfo.setText(flota.tipo + " | Matricula: " + flota.matricula + ", Consumo:" + flota.consumo + " litros por kilometro.");
            buttonEliminar.setVisible(true);
            labelViajes.setVisible(true);
            if ("Motocicleta".equals(flota.tipo)) {
                new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/Motocicleta.jpg");
            } else if (flota.tipo == "Coche") {
                new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/Coche.jpg");
            } else {
                new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/Camion.jpg");
            }
            
            listaRutas.setVisible(true);
            modeloLista.removeAllElements();
            Vehiculo miVehiculo = flota.buscarVehiculo(txtMatricula.getText());
            for (Viaje viaje : miVehiculo.getHistorialViajes()) {
                modeloLista.addElement(viaje.getRuta().toString() + ", Costo: $" + viaje.getRuta().calcularCosto(miVehiculo) + " COP - " + viaje.getFecha().toString());
            }
        } 
    }//GEN-LAST:event_buttonBuscarMousePressed

    private void buttonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseExited
        buttonBuscar.setBackground(new Color (153,153,153));
        buttonBuscar.setForeground(white);
    }//GEN-LAST:event_buttonBuscarMouseExited

    private void buttonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseEntered
        buttonBuscar.setBackground(white);
        buttonBuscar.setForeground(black);
    }//GEN-LAST:event_buttonBuscarMouseEntered

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaMousePressed
        if (txtMatricula.getText().equals("Ingrese por favor la placa del vehiculo")) {
            txtMatricula.setText("");
            txtMatricula.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_txtMatriculaMousePressed

    private void buttonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseEntered
        buttonEliminar.setBackground(white);
        buttonEliminar.setForeground(black);
    }//GEN-LAST:event_buttonEliminarMouseEntered

    private void buttonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseExited
        buttonEliminar.setBackground(new Color (255, 51, 51));
        buttonEliminar.setForeground(white);
    }//GEN-LAST:event_buttonEliminarMouseExited

    private void buttonEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMousePressed
        flota.eliminarVehiculo(txtMatricula.getText());
        JOptionPane.showMessageDialog(this, "Vehículo eliminado correctamente.");        
        txtMatricula.setText("Ingrese por favor la placa del vehiculo");
        new interfaz(this.flota, this).SetImageLabel(lImage, "src/img/logo_nuevo.jpg");
        buttonEliminar.setVisible(false);
        labelViajes.setVisible(false);
        labelInfo.setVisible(false);
        listaRutas.setVisible(false);
    }//GEN-LAST:event_buttonEliminarMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lImage;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelViajes;
    private javax.swing.JList<String> listaRutas;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPanel txtPlaca;
    // End of variables declaration//GEN-END:variables
}
