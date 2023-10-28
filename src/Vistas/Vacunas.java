package Vistas;

import Acceso_A_Datos.LaboratorioData;
import Acceso_A_Datos.VacunaData;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Vacunas extends javax.swing.JInternalFrame {
    
 private DefaultTableModel modelo=new DefaultTableModel(){
        
    public boolean isCellEditable(int f, int c) {
        return false;
 }
 };
 
    public Vacunas() {
        initComponents();
        armarCabecera();
        cargarComboBox();
        comboBoxMedidas();
        ((JTextFieldDateEditor)(jdcFechaVencimiento.getDateEditor())).setEditable(false); // Deshabilitar edición de fecha , solo deja que el usuario seleccione en el calendario
    inicializarBotones();
    jdcFechaVencimiento.setMinSelectableDate(new java.util.Date());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaVacuna = new javax.swing.JTable();
        jbGuardarVacuna = new javax.swing.JButton();
        jBannerVacuna = new javax.swing.JLabel();
        jMedida = new javax.swing.JLabel();
        jVencimiento = new javax.swing.JLabel();
        jNSerie = new javax.swing.JLabel();
        jLaboratorio = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jtNroSerie = new javax.swing.JTextField();
        jdcFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jcMedida = new javax.swing.JComboBox<>();
        jMarca = new javax.swing.JLabel();
        jcbListaLaboratorio = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();
        jbModificarVacuna = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setAlignmentX(200.0F);
        setAlignmentY(40.0F);
        setPreferredSize(new java.awt.Dimension(880, 590));

        jPBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPBackground.setForeground(new java.awt.Color(180, 0, 0));
        jPBackground.setAlignmentX(200.0F);
        jPBackground.setAlignmentY(40.0F);
        jPBackground.setPreferredSize(new java.awt.Dimension(880, 590));
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablaVacuna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 0, 0)));
        jtablaVacuna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtablaVacuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NroDeSerie", "Marca", "medida", "fechadeVencimiento"
            }
        ));
        jtablaVacuna.setGridColor(new java.awt.Color(180, 0, 0));
        jtablaVacuna.setOpaque(false);
        jtablaVacuna.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jScrollPane1.setViewportView(jtablaVacuna);

        jPBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 850, 90));

        jbGuardarVacuna.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jbGuardarVacuna.setToolTipText("Guardar");
        jbGuardarVacuna.setBorder(null);
        jbGuardarVacuna.setOpaque(false);
        jbGuardarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarVacunaActionPerformed(evt);
            }
        });
        jPBackground.add(jbGuardarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 60, 60));

        jBannerVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jBannerVacuna.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBannerVacuna.setForeground(new java.awt.Color(255, 255, 255));
        jBannerVacuna.setText("  Vacunas");
        jBannerVacuna.setOpaque(true);
        jPBackground.add(jBannerVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 780, 50));

        jMedida.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMedida.setForeground(new java.awt.Color(180, 0, 0));
        jMedida.setText("Medida:");
        jPBackground.add(jMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 80, 40));

        jVencimiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jVencimiento.setForeground(new java.awt.Color(180, 0, 0));
        jVencimiento.setText("Vto:");
        jPBackground.add(jVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 50, 40));

        jNSerie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jNSerie.setForeground(new java.awt.Color(180, 0, 0));
        jNSerie.setText("Nro Serie:");
        jPBackground.add(jNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, 40));

        jLaboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLaboratorio.setForeground(new java.awt.Color(180, 0, 0));
        jLaboratorio.setText("Laboratorio:");
        jPBackground.add(jLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 40));

        jtMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, new java.awt.Color(0, 0, 0)));
        jtMarca.setDisabledTextColor(new java.awt.Color(180, 0, 0));
        jtMarca.setOpaque(false);
        jtMarca.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtMarca.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMarcaKeyTyped(evt);
            }
        });
        jPBackground.add(jtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 230, 40));

        jtNroSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtNroSerie.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.black));
        jtNroSerie.setOpaque(false);
        jtNroSerie.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtNroSerie.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtNroSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNroSerieKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNroSerieKeyTyped(evt);
            }
        });
        jPBackground.add(jtNroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 240, 40));

        jdcFechaVencimiento.setBackground(java.awt.Color.white);
        jdcFechaVencimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true));
        jdcFechaVencimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jdcFechaVencimiento.setMaxSelectableDate(new java.util.Date(1730260881000L));
        jdcFechaVencimiento.setOpaque(false);
        jPBackground.add(jdcFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 170, 40));

        jX.setBackground(new java.awt.Color(180, 0, 0));
        jX.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jX.setForeground(new java.awt.Color(255, 255, 255));
        jX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jX.setText("X");
        jX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jX.setOpaque(true);
        jX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jXMouseExited(evt);
            }
        });
        jPBackground.add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 50));

        jFondoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPBackground.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 450, 120));

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPBackground.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jcMedida.setBackground(new java.awt.Color(255, 255, 255));
        jcMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcMedida.setForeground(new java.awt.Color(180, 0, 0));
        jcMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.3", "0.5", "0.9" }));
        jcMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 12), new java.awt.Color(180, 0, 0))); // NOI18N
        jcMedida.setOpaque(false);
        jPBackground.add(jcMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 60, 40));

        jMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMarca.setForeground(new java.awt.Color(180, 0, 0));
        jMarca.setText("Marca:");
        jPBackground.add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, 40));

        jcbListaLaboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbListaLaboratorio.setBorder(null);
        jPBackground.add(jcbListaLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, 40));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/eliminar-50.png"))); // NOI18N
        jbLimpiar.setToolTipText("Limpiar");
        jbLimpiar.setBorder(null);
        jbLimpiar.setOpaque(false);
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPBackground.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 50, 60));

        jbModificarVacuna.setBackground(new java.awt.Color(255, 255, 255));
        jbModificarVacuna.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Modificar50.png"))); // NOI18N
        jbModificarVacuna.setToolTipText("Modificar");
        jbModificarVacuna.setBorder(null);
        jbModificarVacuna.setOpaque(false);
        jbModificarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarVacunaActionPerformed(evt);
            }
        });
        jPBackground.add(jbModificarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 60, 60));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/buscar-50.png"))); // NOI18N
        jbBuscar.setToolTipText("Buscar");
        jbBuscar.setBorder(null);
        jbBuscar.setOpaque(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPBackground.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseClicked
                                             
        // Boton Cerrar
        this.dispose();
    }//GEN-LAST:event_jXMouseClicked

    private void jXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseEntered
           // Efecto de posicion
           jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));
        
        
    }//GEN-LAST:event_jXMouseEntered

    private void jXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseExited
               // Tremarcado de boton X
               jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jXMouseExited

    private void jbGuardarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarVacunaActionPerformed
       try {
    Vacuna vacu = new Vacuna();
    String num = jtNroSerie.getText().trim();// Eliminar espacios en blanco

    if (jtMarca.getText().isEmpty() || num.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se deben dejar campos vacíos");
    
    } else if (num.length() != 11 || !num.matches("\\d{11}")) {// El método matches verifica si una cadena completa coincide con una expresión regular. 
                    ///////////////////////////////////////////dentro de ella ingreso el string "\\d{11}" que verifica que la cadena contenga 11 dígitos numéricos.
        JOptionPane.showMessageDialog(null, "Ingrese un número de serie válido (debe tener 11 caracteres numéricos)");
    
    } else {
        VacunaData v = new VacunaData();
        // usamos el metodo existenumero de serie 
        if (v.existeNumeroSerie(Long.parseLong(num))) {
            JOptionPane.showMessageDialog(null, "El número de serie ya existe en la base de datos");
        
        } else {
            if (jdcFechaVencimiento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "seleccióne una fecha  en el calendario");
            } else {
                if (jtMarca.getText().length()<30) {
                     vacu.setMarca(jtMarca.getText());
                }else{
                  JOptionPane.showMessageDialog(null, "ingrese una marca menos de 15 caracter");
                  return;
                }
               
                String medidaSeleccionada = (String) jcMedida.getSelectedItem();
                double medida = Double.parseDouble(medidaSeleccionada);
                vacu.setMedida(medida);
                java.util.Date fecha = jdcFechaVencimiento.getDate();
                LocalDate Fech = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                vacu.setFechaCaduca(Fech);
                vacu.setColocada(false);
                vacu.setNumSerie(Long.parseLong(num));
                Laboratorio laboratorioSeleccionado = (Laboratorio) jcbListaLaboratorio.getSelectedItem();
                vacu.setLaboratorio(laboratorioSeleccionado);
                v.GuardarVacuna(vacu);
                Limpiar();
                JOptionPane.showMessageDialog(null, "Vacuna cargada con éxito!");
                // Agregar la nueva vacuna al modelo de la tabla
                DefaultTableModel modelo = (DefaultTableModel) jtablaVacuna.getModel();
                modelo.addRow(new Object[]{vacu.getNumSerie(), vacu.getMarca(), vacu.getMedida(), vacu.getFechaCaduca()});
            }
        }
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Error al entrar en vacuna: " + e.getMessage());
}

    }//GEN-LAST:event_jbGuardarVacunaActionPerformed

    private void jtNroSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNroSerieKeyTyped
        char c = evt.getKeyChar();
   if (!Character.isDigit(c) ) {
    evt.consume();}
    }//GEN-LAST:event_jtNroSerieKeyTyped

    private void jtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyTyped
        char c = evt.getKeyChar();
   if (Character.isDigit(c) ) {
    evt.consume();}
    }//GEN-LAST:event_jtMarcaKeyTyped

    private void jbModificarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarVacunaActionPerformed
  if (jtMarca.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"No se puede modificar, hay campos vacíos");
             
             }else{ String numSerieTexto = jtNroSerie.getText().trim();
              
                 if (numSerieTexto.length() == 11) {
        try {
           
            Long numSerie = Long.parseLong(numSerieTexto);

            VacunaData v = new VacunaData();
            Vacuna vacuna = v.buscarVacuna(numSerie);

            if (vacuna != null) {
                
                // Actualiza los atributos de la vacuna con los nuevos valores
                if (jtMarca.getText().length()<30) {
                    vacuna.setMarca(jtMarca.getText());
                }else{
                  JOptionPane.showMessageDialog(null, "ingrese una marca menos de 15 caracter");
                  return;
                }
                
                String medidaSeleccionada = (String) jcMedida.getSelectedItem();
                double medida = Double.parseDouble(medidaSeleccionada);
                vacuna.setMedida(medida);
                java.util.Date fecha = jdcFechaVencimiento.getDate();
                if (fecha==null) {
                  JOptionPane.showMessageDialog(null, "selecciones una fecha en calendario");
                }else{LocalDate Fech = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                vacuna.setFechaCaduca(Fech);
                Laboratorio laboratorio = (Laboratorio) jcbListaLaboratorio.getSelectedItem();
                vacuna.setLaboratorio(laboratorio);

                // Llama al método modificarVacuna para actualizar la vacuna en la base de datos
                v.modificarVacuna(vacuna);

                // Actualiza los valores de los JComboBox
                jcMedida.setSelectedItem(String.valueOf(vacuna.getMedida()));
                jcbListaLaboratorio.setSelectedItem(vacuna.getLaboratorio());

                JOptionPane.showMessageDialog(null, "Vacuna modificada con éxito.");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una vacuna con ese número de serie.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número de serie debe ser un valor numérico válido.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un número de serie válido (debe tener 11 caracteres numéricos).");
    }

         activarOdesactivarBotonGuardarOModificar();}
    
                                                   
    }//GEN-LAST:event_jbModificarVacunaActionPerformed

    private void jtNroSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNroSerieKeyReleased
        activarOdesactivarBotonGuardarOModificar();
    }//GEN-LAST:event_jtNroSerieKeyReleased

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
            jtMarca.setText("");  // Limpiar campo de texto
    jtNroSerie.setText("");  // Limpiar campo de texto
    jdcFechaVencimiento.setDate(null);  // Limpiar campo de fecha

    // Restablecer JComboBox a su valor predeterminado
    jcMedida.setSelectedItem("0.3");  // Valor predeterminado
    jcbListaLaboratorio.setSelectedIndex(0);  // Seleccione el primer elemento

    // Limpia la tabla si también estás mostrando datos en una tabla
    DefaultTableModel modelo = (DefaultTableModel) jtablaVacuna.getModel();
    modelo.setRowCount(0);  // Eliminar todas las filas de la tabla
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
      String numSerieTexto = jtNroSerie.getText().trim();

    if (numSerieTexto.length() == 11) {
        try {
            Long numSerie = Long.parseLong(numSerieTexto);

            VacunaData v = new VacunaData();
            Vacuna vacuna = v.buscarVacuna(numSerie);

            if (vacuna != null) {
                // Se encontró una vacuna con el número de serie proporcionado
                jtMarca.setText(vacuna.getMarca());
                jcMedida.setSelectedItem(String.valueOf(vacuna.getMedida()));

                // Busca el laboratorio correspondiente en el ComboBox
                for (int i = 0; i < jcbListaLaboratorio.getItemCount(); i++) {
                    Laboratorio laboratorio = jcbListaLaboratorio.getItemAt(i);
                    if (laboratorio.getIdLaboratorio() == vacuna.getLaboratorio().getIdLaboratorio()) {
                        jcbListaLaboratorio.setSelectedItem(laboratorio);
                        break;
                    }
                }

                jdcFechaVencimiento.setDate(Date.valueOf(vacuna.getFechaCaduca()));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una vacuna con ese número de serie.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número de serie debe ser un valor numérico válido.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un número de serie válido (debe tener 11 caracteres numéricos).");
    }

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLaboratorio;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jMedida;
    private javax.swing.JLabel jNSerie;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jVencimiento;
    private javax.swing.JLabel jX;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardarVacuna;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarVacuna;
    private javax.swing.JComboBox<String> jcMedida;
    private javax.swing.JComboBox<Laboratorio> jcbListaLaboratorio;
    private com.toedter.calendar.JDateChooser jdcFechaVencimiento;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNroSerie;
    private javax.swing.JTable jtablaVacuna;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("NroDeSerie");
        modelo.addColumn("Marca");
        modelo.addColumn("Medida");
        modelo.addColumn("fechadeVencimiento");
        jtablaVacuna.setModel(modelo);
        jtablaVacuna.setDefaultEditor(Object.class, null);
    }
    private void cargarComboBox() {
    LaboratorioData labData=new LaboratorioData();
   
    List<Laboratorio>laboratorios=labData.listaLaboratorio();
    DefaultComboBoxModel<Laboratorio> comboBoxModel = new DefaultComboBoxModel<>();
      
        for (Laboratorio lab : laboratorios) {
            comboBoxModel.addElement(lab);
        }
        jcbListaLaboratorio.setModel(comboBoxModel);
}
    
   private void Limpiar(){
          jtMarca.setText("");
           jcMedida.setSelectedIndex(0);
           jtNroSerie.setText("");
           jcbListaLaboratorio.setSelectedIndex(0);
            jdcFechaVencimiento.setDate(null);
          
   }
private void comboBoxMedidas() {
    String[] medidas = {"0.3", "0.5", "0.9"};
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

    for (String medida : medidas) {
        comboBoxModel.addElement(medida);
    }

    jcMedida.setModel(comboBoxModel);
}

private void inicializarBotones(){
jbGuardarVacuna.setEnabled(false);
jbModificarVacuna.setEnabled(false);
}
private void activarOdesactivarBotonGuardarOModificar() {
    try {
        VacunaData vac =new VacunaData();
            String nserie = jtNroSerie.getText();
            if (nserie.isEmpty()) {
                jbGuardarVacuna.setEnabled(false);
                jbModificarVacuna.setEnabled(false);
            } else {
                Long serie = Long.parseLong(nserie);
                Vacuna vacuna = vac.buscarVacuna(serie);
                if (vacuna != null) {
                    // vacuna encontrada, desactivamos el botón Guardar y activamos el botón Modificar
                    jbGuardarVacuna.setEnabled(false);
                    jbModificarVacuna.setEnabled(true);
                } else {
                    // No se encontró vacuna, activamos el botón Guardar y desactivamos el botón Modificar
                    jbGuardarVacuna.setEnabled(true);
                    jbModificarVacuna.setEnabled(false);
                }
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Ingrese un nro de serie valido");
        }
    }
}

