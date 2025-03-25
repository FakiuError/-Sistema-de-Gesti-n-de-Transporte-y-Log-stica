package IU;
import app.FlotaVehiculos;
import app.Viaje;
import java.awt.Color;
import static java.awt.Color.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class lista extends javax.swing.JFrame {
    public JFrame principal;
    public FlotaVehiculos flota;
    public DefaultListModel modeloLista = new DefaultListModel();
    public lista(FlotaVehiculos flota, JFrame principal) {
        this.flota = flota;
        this.principal = principal;
        initComponents();
        listaRutas.setModel(modeloLista);
        modeloLista.removeAllElements();
        List<Viaje> viajes = flota.obtenerTodasLasRutas();
        cargarRutas(viajes);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonDescargar = new javax.swing.JButton();
        buttonAtras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRutas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Sistema de Gestión de Transporte y Logística");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Rutas");

        buttonDescargar.setBackground(new java.awt.Color(153, 153, 153));
        buttonDescargar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonDescargar.setForeground(new java.awt.Color(255, 255, 255));
        buttonDescargar.setText("Descargar archivo");
        buttonDescargar.setBorder(null);
        buttonDescargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDescargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDescargarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonDescargarMousePressed(evt);
            }
        });
        buttonDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDescargarActionPerformed(evt);
            }
        });

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

        listaRutas.setBorder(null);
        listaRutas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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
            .addGroup(txtPlacaLayout.createSequentialGroup()
                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(txtPlacaLayout.createSequentialGroup()
                        .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(buttonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addGroup(txtPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtPlacaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPlacaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo)
                .addGap(56, 56, 56)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void cargarRutas(List<Viaje> viajes) {
        modeloLista.clear();
        viajes.sort((v1, v2) -> v1.getFecha().compareTo(v2.getFecha()));
        for (Viaje viaje : viajes) {
            modeloLista.addElement("Vehículo: " + viaje.getVehiculo().getMatricula() +
                    " | Ruta: " + viaje.getRuta().toString() +
                    " | Fecha: " + viaje.getFecha());
        }
    }
    
    public void guardarViajesEnArchivo(List<Viaje> viajes) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Viajes.txt"))) {
        for (Viaje viaje : viajes) {
            writer.write("Vehículo: " + viaje.getVehiculo().getMatricula() + 
                         " | Ruta: " + viaje.getRuta().toString() + 
                         " | Fecha: " + viaje.getFecha());
            writer.newLine();
        }
        writer.flush();
        System.out.println("Archivo 'Viajes.txt' guardado correctamente.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    private void buttonDescargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDescargarMouseEntered
        buttonDescargar.setBackground(white);
        buttonDescargar.setForeground(black);
    }//GEN-LAST:event_buttonDescargarMouseEntered

    private void buttonDescargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDescargarMouseExited
        buttonDescargar.setBackground(new Color (153,153,153));
        buttonDescargar.setForeground(white);
    }//GEN-LAST:event_buttonDescargarMouseExited

    private void buttonDescargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDescargarMousePressed
         guardarViajesEnArchivo(flota.obtenerTodasLasRutas());
        JOptionPane.showMessageDialog(this, "Archivo 'Viajes.txt' guardado correctamente.");
    }//GEN-LAST:event_buttonDescargarMousePressed

    private void buttonDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDescargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDescargarActionPerformed

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
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonDescargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JList<String> listaRutas;
    private javax.swing.JPanel txtPlaca;
    // End of variables declaration//GEN-END:variables
}
