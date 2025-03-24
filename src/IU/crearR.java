package IU;

import app.FlotaVehiculos;
import app.Vehiculo;
import java.awt.Color;
import static java.awt.Color.*;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import app.Ruta;

public class crearR extends javax.swing.JFrame {
    public JFrame principal;
    public FlotaVehiculos flota;
    public String ciudadO;
    public String ciudadD;
    public double recorrido;
    public double costoP;
    
    public crearR(FlotaVehiculos flota, JFrame principal) {
        this.flota = flota;
        this.principal = principal;
        initComponents();
        cargarComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCiudadD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonCrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRecorrido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        buttonAtras = new javax.swing.JButton();
        txtCiudadO = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtPeajes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxVehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        txtCiudadD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCiudadD.setForeground(new java.awt.Color(153, 153, 153));
        txtCiudadD.setText("Ingrese a la ciudad a la que se dirige");
        txtCiudadD.setBorder(null);
        txtCiudadD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCiudadDMousePressed(evt);
            }
        });
        txtCiudadD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Creación de Rutas");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Digite la Ciudad Destino ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Digite la Ciudad de Origen");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentY(1.0F);

        buttonCrear.setBackground(new java.awt.Color(153, 153, 153));
        buttonCrear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonCrear.setForeground(new java.awt.Color(255, 255, 255));
        buttonCrear.setText("Crear Ruta");
        buttonCrear.setBorder(null);
        buttonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonCrearMousePressed(evt);
            }
        });
        buttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Digite la Distancia del Recorrido");

        txtRecorrido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtRecorrido.setForeground(new java.awt.Color(153, 153, 153));
        txtRecorrido.setText("Ejemplo: 1 si consume 1 litro por kilometro");
        txtRecorrido.setBorder(null);
        txtRecorrido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRecorridoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRecorridoMousePressed(evt);
            }
        });
        txtRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecorridoActionPerformed(evt);
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

        txtCiudadO.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCiudadO.setForeground(new java.awt.Color(153, 153, 153));
        txtCiudadO.setText("Ingrese la ciudad desde donde sale");
        txtCiudadO.setBorder(null);
        txtCiudadO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCiudadOMousePressed(evt);
            }
        });
        txtCiudadO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadOActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAlignmentY(1.0F);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setAlignmentY(1.0F);

        txtPeajes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPeajes.setForeground(new java.awt.Color(153, 153, 153));
        txtPeajes.setText("Ingrese el valor de los peajes");
        txtPeajes.setBorder(null);
        txtPeajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPeajesMousePressed(evt);
            }
        });
        txtPeajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeajesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Digite el costo de los peajes ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Indique el Vehiculo que Desea Asignar a la Ruta");

        boxVehiculo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxVehiculoActionPerformed(evt);
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
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCiudadD)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRecorrido, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(txtCiudadO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                        .addComponent(jSeparator4)
                                        .addComponent(txtPeajes))
                                    .addComponent(boxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtPlacaLayout.setVerticalGroup(
            txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCiudadO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudadD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargarComboBox() {
        boxVehiculo.removeAllItems(); 
        List<String> tipos = flota.obtenerTiposVehiculos();
        for (String tipo : tipos) {
            boxVehiculo.addItem(tipo);
        }
    }
    
    private void txtCiudadDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCiudadDMousePressed
        if (txtCiudadD.getText().equals("Ingrese a la ciudad a la que se dirige")) {
            txtCiudadD.setText("");
            txtCiudadD.setForeground(new Color(0,0,0));
        }
        if (txtRecorrido.getText().isEmpty()) {
            txtRecorrido.setText("Ejemplo: 1 si consume 1 litro por kilometro");
            txtRecorrido.setForeground(new Color (153, 153, 153));
        } 
        if (txtCiudadO.getText().isEmpty()) {
            txtCiudadO.setText("Ingrese la ciudad desde donde sale");
            txtCiudadO.setForeground(new Color (153, 153, 153));
        }
        if (txtPeajes.getText().isEmpty()) {
            txtPeajes.setText("Ingrese el valor de los peajes");
            txtPeajes.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtCiudadDMousePressed

    private void txtCiudadDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadDActionPerformed

    private void buttonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearMouseEntered
        buttonCrear.setBackground(white);
        buttonCrear.setForeground(black);
    }//GEN-LAST:event_buttonCrearMouseEntered

    private void buttonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearMouseExited
        buttonCrear.setBackground(new Color (153,153,153));
        buttonCrear.setForeground(white);
    }//GEN-LAST:event_buttonCrearMouseExited

    private void buttonCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearMousePressed
        if (txtPeajes.getText().equals("Ingrese el valor de los peajes") ||
            txtCiudadD.getText().equals("Ingrese a la ciudad a la que se dirige") || 
            txtCiudadO.getText().equals("Ingrese la ciudad desde donde sale") || 
            txtRecorrido.getText().equals("Ejemplo: 1 si consume 1 litro por kilometro")) {
            JOptionPane.showMessageDialog(this, "Por favor asegurese de igresar todos los datos correctamente");  
        } else {
            String seleccionado = (String) boxVehiculo.getSelectedItem();
            if (seleccionado != null) {
                String matricula = seleccionado.split(" - ")[1];
                Vehiculo v = flota.buscarVehiculo(matricula);
                if (v != null) {
                    recorrido = Double.parseDouble(txtRecorrido.getText());
                    costoP = Double.parseDouble(txtPeajes.getText());
                    ciudadO = txtCiudadO.getText();
                    ciudadD = txtCiudadD.getText();
                    Ruta nuevaRuta = new Ruta(recorrido, costoP, ciudadO, ciudadD);
                    v.setRuta(nuevaRuta);
                } else {
                    JOptionPane.showMessageDialog(this, "Vehículo no encontrado.");
                }
            }
            
            
            JOptionPane.showMessageDialog(this, "Ruta creada correctamente");  
        }      
    }//GEN-LAST:event_buttonCrearMousePressed

    private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCrearActionPerformed

    private void txtRecorridoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecorridoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecorridoMouseEntered

    private void txtRecorridoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecorridoMousePressed
        if (txtRecorrido.getText().equals("Ejemplo: 1 si consume 1 litro por kilometro")) {
            txtRecorrido.setText("");
            txtRecorrido.setForeground(new Color(0,0,0));
        }
        if (txtCiudadD.getText().isEmpty()) {
            txtCiudadD.setText("Ingrese a la ciudad a la que se dirige");
            txtCiudadD.setForeground(new Color (153, 153, 153));
        } 
        if (txtCiudadO.getText().isEmpty()) {
            txtCiudadO.setText("Ingrese la ciudad desde donde sale");
            txtCiudadO.setForeground(new Color (153, 153, 153));
        }
        if (txtPeajes.getText().isEmpty()) {
            txtPeajes.setText("Ingrese el valor de los peajes");
            txtPeajes.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtRecorridoMousePressed

    private void txtRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecorridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecorridoActionPerformed

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

    private void txtCiudadOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCiudadOMousePressed
        if (txtCiudadO.getText().equals("Ingrese la ciudad desde donde sale")) {
            txtCiudadO.setText("");
            txtCiudadO.setForeground(new Color(0,0,0));
        }
        if (txtRecorrido.getText().isEmpty()) {
            txtRecorrido.setText("Ejemplo: 1 si consume 1 litro por kilometro");
            txtRecorrido.setForeground(new Color (153, 153, 153));
        } 
        if (txtCiudadD.getText().isEmpty()) {
            txtCiudadD.setText("Ingrese a la ciudad a la que se dirige");
            txtCiudadD.setForeground(new Color (153, 153, 153));
        }
        if (txtPeajes.getText().isEmpty()) {
            txtPeajes.setText("Ingrese el valor de los peajes");
            txtPeajes.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtCiudadOMousePressed

    private void txtCiudadOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadOActionPerformed

    private void txtPeajesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPeajesMousePressed
        if (txtPeajes.getText().equals("Ingrese el valor de los peajes")) {
            txtPeajes.setText("");
            txtPeajes.setForeground(new Color(0,0,0));
        }
        if (txtRecorrido.getText().isEmpty()) {
            txtRecorrido.setText("Ejemplo: 1 si consume 1 litro por kilometro");
            txtRecorrido.setForeground(new Color (153, 153, 153));
        } 
        if (txtCiudadD.getText().isEmpty()) {
            txtCiudadD.setText("Ingrese a la ciudad a la que se dirige");
            txtCiudadD.setForeground(new Color (153, 153, 153));
        }
        if (txtCiudadO.getText().isEmpty()) {
            txtCiudadO.setText("Ingrese la ciudad desde donde sale");
            txtCiudadO.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_txtPeajesMousePressed

    private void txtPeajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeajesActionPerformed

    private void boxVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxVehiculoActionPerformed
        
    }//GEN-LAST:event_boxVehiculoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxVehiculo;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCiudadD;
    private javax.swing.JTextField txtCiudadO;
    private javax.swing.JTextField txtPeajes;
    private javax.swing.JPanel txtPlaca;
    private javax.swing.JTextField txtRecorrido;
    // End of variables declaration//GEN-END:variables
}
