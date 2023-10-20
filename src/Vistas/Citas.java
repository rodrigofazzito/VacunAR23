/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_A_Datos.CitaVacunaData;
import Acceso_A_Datos.CiudadanoData;
import Acceso_A_Datos.Conexion;
import Acceso_A_Datos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Vacuna;
import java.awt.Color;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;


/**
 *
 * @author Rodrigo Fazzito
 */
public class Citas extends javax.swing.JInternalFrame {
    private Connection con = null;
     Ciudadano ciu ;
     CitaVacunaData citaData;
     CitaVacunacion cita;
     CiudadanoData ciuData;
     VacunaData vacData;
     Vacuna vacuna;
     DefaultListModel modelo =  new DefaultListModel();

  
    
    public Citas() {
        initComponents();
        con = Conexion.getConexion();
        ciuData = new CiudadanoData();
        ciu = new Ciudadano();
        vacuna = new Vacuna();
        vacData = new VacunaData();
        citaData = new CitaVacunaData();
        cita = new CitaVacunacion();
        ArmarLista();
        cargarCombo();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboVacuna = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jCargarCita = new javax.swing.JButton();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jBannerPaciente = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        jSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jTvacunatorio = new javax.swing.JTextField();
        jNota = new javax.swing.JLabel();

        setResizable(true);
        setAlignmentX(200.0F);
        setAlignmentY(40.0F);
        setPreferredSize(new java.awt.Dimension(880, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(180, 0, 0));
        jLabel1.setText("DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, 57));

        jTdni.setBackground(new java.awt.Color(255, 255, 255));
        jTdni.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jTdni.setForeground(new java.awt.Color(180, 0, 0));
        jTdni.setCaretColor(new java.awt.Color(255, 255, 255));
        jTdni.setNextFocusableComponent(jCargarCita);
        jTdni.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTdni.setSelectionColor(new java.awt.Color(180, 0, 0));
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdniKeyPressed(evt);
            }
        });
        jPanel1.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 228, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vacuna:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 84, 33));

        jComboVacuna.setBackground(new java.awt.Color(255, 255, 255));
        jComboVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboVacuna.setForeground(new java.awt.Color(180, 0, 0));
        jComboVacuna.setNextFocusableComponent(jX);
        jComboVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboVacunaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 175, 33));

        jCheckBox2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(180, 0, 0));
        jCheckBox2.setText("Pcte. de Riesgo ");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        jList2.setBackground(new java.awt.Color(255, 255, 255));
        jList2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jList2.setForeground(new java.awt.Color(180, 0, 0));
        jScrollPane1.setViewportView(jList2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 280, 220));

        jCargarCita.setBackground(new java.awt.Color(255, 255, 255));
        jCargarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jCargarCita.setToolTipText("Buscar");
        jCargarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(jCargarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 60, 60));

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPanel1.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jBannerPaciente.setBackground(new java.awt.Color(180, 0, 0));
        jBannerPaciente.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBannerPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jBannerPaciente.setText(" Citas");
        jBannerPaciente.setOpaque(true);
        jBannerPaciente.setPreferredSize(new java.awt.Dimension(167, 47));
        jBannerPaciente.setRequestFocusEnabled(false);
        jPanel1.add(jBannerPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 780, 50));

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
        jPanel1.add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 50));

        jFondoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPanel1.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 450, 130));

        jCalendar.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar.setForeground(new java.awt.Color(0, 0, 0));
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(180, 0, 0));
        jCalendar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCalendar.setSundayForeground(new java.awt.Color(255, 102, 102));
        jCalendar.setTodayButtonVisible(true);
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.setWeekdayForeground(new java.awt.Color(255, 255, 153));
        jPanel1.add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 240));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(180, 0, 0));
        jLabel5.setText("Seleccione hora");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jSpinner.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"07:15", "07:30", "07:45", "08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00"}));
        jSpinner.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.black));
        jPanel1.add(jSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 120, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(180, 0, 0));
        jLabel4.setText("Vacunatorio: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTvacunatorio.setBackground(new java.awt.Color(255, 255, 255));
        jTvacunatorio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTvacunatorio.setForeground(new java.awt.Color(0, 0, 0));
        jTvacunatorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTvacunatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 0, 0)));
        jPanel1.add(jTvacunatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 290, 40));

        jNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jNota.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVacunaActionPerformed

    private void jXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseClicked

        // Boton Cerrar
        System.exit(0);
    }//GEN-LAST:event_jXMouseClicked

    private void jXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseEntered
        // Efecto de posicion

        jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);
    }//GEN-LAST:event_jXMouseEntered

    private void jXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseExited
        // Tremarcado de boton X

        jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jXMouseExited

    private void jCargarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarCitaActionPerformed
        
        ciuData.buscarCiudadano(Integer.parseInt(jTdni.getText()));
        cita.setCentroVacuna(jTvacunatorio.getText());
        cita.setCiudadano(ciu);
        cita.setDosis(+1);
        cita.setVacuna((Vacuna)jComboVacuna.getSelectedItem());
        ciu.setNota(JOptionPane.showInputDialog("Escriba su nota"));
        java.util.Date fecha = jCalendar.getDate();
        LocalDate Fech = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        cita.setFechaColoca(Fech);
        cita.setHoraCita(String.valueOf(jSpinner.getValue()));
        citaData.GuardarCita(cita);
        JOptionPane.showMessageDialog(null, "La cita se cargo correctamente");
        limpiarCampos();
        
    }//GEN-LAST:event_jCargarCitaActionPerformed

    private void jTdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyPressed
        // buscar con tecla enter
        List <CitaVacunacion> citas = citaData.listaCitas();
        int dosis = 0;
        for(CitaVacunacion cit : citas){
            dosis = cit.getDosis();
        }
        char c = (char) evt.getKeyCode();
        if (c == evt.VK_ENTER) {
           ciu = ciuData.buscarCiudadano(Integer.parseInt(jTdni.getText()));
           citaData.obtenerCita(Integer.parseInt(jTdni.getText()));
           if(dosis >= 1){
               modelo.addElement(dosis+" dosis");
               if(dosis == 3){
                   jCargarCita.setEnabled(false);
               }
           }else{
               modelo.addElement("Sin primera dosis");
           }
           modelo.addElement(ciu.getNombreComp());
           modelo.addElement(ciu.getEmail());
           modelo.addElement(ciu.getCelular());
           if(ciu.isEsencial() == true){
               modelo.addElement("Persona escencial");
               jNota.setText("Dar turno proximo");
           }else{
               jNota.setText("Turno a mes siguiente");
           }
        }
    }//GEN-LAST:event_jTdniKeyPressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected() == true){
           setFecha();
        }else if(jCheckBox2.isSelected() == false){
            setFechaMenos();
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerPaciente;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JButton jCargarCita;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<Vacuna> jComboVacuna;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList2;
    private javax.swing.JLabel jNota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTvacunatorio;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables
 public void ArmarLista(){
       
       jList2.setModel(modelo);
   }
   public void setFecha(){
       Calendar c = Calendar.getInstance();
       c.setTime(jCalendar.getDate());
       c.add(Calendar.MONTH, 2);
       jCalendar.setDate(c.getTime());
       
   }
   public void setFechaMenos(){
       Calendar c = Calendar.getInstance();
       c.setTime(jCalendar.getDate());
       c.add(Calendar.MONTH,-2);
       jCalendar.setDate(c.getTime());
   }
   public void cargarCombo(){
       DefaultComboBoxModel<Vacuna> comboBoxModel = new DefaultComboBoxModel<>();
       List <Vacuna> vacunas= vacData.listaVacunas();
       for(Vacuna vac : vacunas){
           comboBoxModel.addElement(vac);
       }
       jComboVacuna.setModel(comboBoxModel);
   }
   public void limpiarCampos(){
       Calendar c = Calendar.getInstance(Locale.getDefault());
       jCalendar.setDate(c.getTime());
       jCheckBox2.setEnabled(false);
       jTdni.setText("");
       modelo.clear();
       jTvacunatorio.setText("");
       jComboVacuna.setSelectedIndex(0);
   }
   
    
}
