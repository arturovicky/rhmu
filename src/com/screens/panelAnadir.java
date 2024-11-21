/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.screens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author artur
 */
public class panelAnadir extends javax.swing.JPanel {
        String url = "jdbc:sqlite:C:\\Users\\artur\\Documents\\NetBeansProjects\\rhproyec\\src\\db_data\\data.db";
        Connection conn;
    /**
     * Creates new form panelTodo
     */
    public panelAnadir() {
        initComponents();
    }
    private void anadir(String nombres, String apellidoP ,String apellidoM, String area, String num, String nss, String correo, float sueldo, String rfc, String horario, int num_horas, String curp, String sexo ,String supervisor){
        
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO trabajador (nombres, apellidoP, apellidoM, area, horario, numero_horas, sueldo, rfc, correo, num, nss, curp, sexo, supervisor) VALUES (?,?,?,?,?,?,?,?,?,?,?, ?,?,?)");
            stmt.setString(1, nombres);
            stmt.setString(2, apellidoP);
            stmt.setString(3, apellidoM);
            stmt.setString(4, area);
            stmt.setString(5, horario);
            stmt.setInt(6, num_horas);
            stmt.setFloat(7, sueldo);
            stmt.setString(8, rfc);
            stmt.setString(9, correo);
            stmt.setString(10, num);
            stmt.setString(11, nss);
            stmt.setString(12, curp);
            stmt.setString(13, sexo);
            stmt.setString(14, supervisor);
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage(), "Error",0);
        }finally{
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error "+e.getMessage(), "Error",0);
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aceptarButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        apellidoPLabel = new javax.swing.JLabel();
        apellidoMLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        nssLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        rfcLabel = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        sueldoLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        horasLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidoM = new javax.swing.JTextField();
        apellidoP = new javax.swing.JTextField();
        nss = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        rfc = new javax.swing.JTextField();
        numeroTel = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        horas = new javax.swing.JTextField();
        horario = new javax.swing.JComboBox<>();
        curpLabel = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        iconrhmu = new javax.swing.JLabel();
        motivo = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        sexoLabel = new javax.swing.JLabel();
        supervisorLabel = new javax.swing.JLabel();
        supervisor = new javax.swing.JTextField();
        area = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(35, 35, 35));
        setPreferredSize(new java.awt.Dimension(1546, 876));

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1546, 876));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptarButton.setBackground(new java.awt.Color(35, 81, 146));
        aceptarButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        aceptarButton.setForeground(new java.awt.Color(255, 255, 255));
        aceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 680, 150, 50));

        nombreLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre/s");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 50));

        apellidoPLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        apellidoPLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoPLabel.setText("Apellido Paterno");
        jPanel1.add(apellidoPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        apellidoMLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        apellidoMLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoMLabel.setText("Apellido Materno");
        jPanel1.add(apellidoMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        areaLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        areaLabel.setForeground(new java.awt.Color(255, 255, 255));
        areaLabel.setText("Area");
        jPanel1.add(areaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        nssLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nssLabel.setForeground(new java.awt.Color(255, 255, 255));
        nssLabel.setText("NSS");
        nssLabel.setToolTipText("Numero De Seguro Social");
        jPanel1.add(nssLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        correoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        correoLabel.setForeground(new java.awt.Color(255, 255, 255));
        correoLabel.setText("CORREO ELECTRONICO");
        jPanel1.add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        rfcLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rfcLabel.setForeground(new java.awt.Color(255, 255, 255));
        rfcLabel.setText("RFC");
        jPanel1.add(rfcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        num.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 255));
        num.setText("NUM. TEL");
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        sueldoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        sueldoLabel.setForeground(new java.awt.Color(255, 255, 255));
        sueldoLabel.setText("SUELDO");
        jPanel1.add(sueldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        horarioLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        horarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        horarioLabel.setText("HORARIO");
        jPanel1.add(horarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        horasLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        horasLabel.setForeground(new java.awt.Color(255, 255, 255));
        horasLabel.setText("NUMERO. HORAS");
        jPanel1.add(horasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 1070, 30));
        jPanel1.add(apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 1010, 30));
        jPanel1.add(apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 1010, 30));
        jPanel1.add(nss, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 930, 30));

        limpiar.setBackground(new java.awt.Color(35, 81, 146));
        limpiar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limpiarMousePressed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, 150, 50));
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 950, 30));
        jPanel1.add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 1120, 30));

        numeroTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTelActionPerformed(evt);
            }
        });
        jPanel1.add(numeroTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 1090, 30));
        jPanel1.add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 1090, 30));
        jPanel1.add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 1010, 30));

        horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maturino", "Vespertino", "Nocturno" }));
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });
        jPanel1.add(horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 120, 30));

        curpLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        curpLabel.setForeground(new java.awt.Color(255, 255, 255));
        curpLabel.setText("CURP");
        jPanel1.add(curpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));
        jPanel1.add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 1090, 30));

        iconrhmu.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        iconrhmu.setForeground(new java.awt.Color(255, 255, 255));
        iconrhmu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconrhmu.png"))); // NOI18N
        iconrhmu.setText("RH-MU El control es poder...");
        iconrhmu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(iconrhmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1050, -1));

        motivo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        motivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/motivo3.png"))); // NOI18N
        motivo.setPreferredSize(new java.awt.Dimension(1370, 411));
        jPanel1.add(motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1550, 240));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 120, 30));

        sexoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        sexoLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexoLabel.setText("SEXO");
        jPanel1.add(sexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        supervisorLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        supervisorLabel.setForeground(new java.awt.Color(255, 255, 255));
        supervisorLabel.setText("SUPERVISOR");
        jPanel1.add(supervisorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));
        jPanel1.add(supervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 640, 30));

        area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Gerencia", "Bodega", "Piso", "Caja" }));
        jPanel1.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        //<editor-fold>
        anadir(nombre.getText(), apellidoP.getText(), apellidoM.getText(), String.valueOf(area.getSelectedItem()), numeroTel.getText(), nss.getText(), correo.getText(), Float.valueOf(sueldo.getText()), rfc.getText(), String.valueOf(horario.getSelectedItem()), Integer.valueOf(horas.getText()), curp.getText(), String.valueOf(sexo.getSelectedItem()), supervisor.getText());
        //</editor-fold> 
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void numeroTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTelActionPerformed

    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMousePressed
        // TODO add your handling code here:
        nombre.setText("");
        apellidoP.setText("");
        apellidoM.setText("");
        nss.setText("");
        correo.setText("");
        rfc.setText("");
        curp.setText("");
        numeroTel.setText("");
        sueldo.setText("");
        supervisor.setText("");
        horas.setText("");
        
    }//GEN-LAST:event_limpiarMousePressed
    
    public void agrandar(int tamano){
       
        
            
            nombre.setSize(nombre.getWidth()+tamano, nombre.getHeight());
            apellidoM.setSize(apellidoM.getWidth()+ tamano, apellidoM.getHeight());
            apellidoP.setSize(apellidoP.getWidth()+tamano, apellidoP.getHeight());
            nss.setSize(nss.getWidth()+tamano, nss.getHeight());
            //area.setSize(area.getWidth()+tamano, area.getHeight());
            motivo.setSize(motivo.getWidth()+tamano, motivo.getHeight());
            numeroTel.setSize(numeroTel.getWidth()+tamano, numeroTel.getHeight());
            correo.setSize(correo.getWidth()+tamano, correo.getHeight());
            rfc.setSize(rfc.getWidth()+tamano, rfc.getHeight());
            System.out.println(motivo.getSize());
            
            aceptarButton.setLocation(aceptarButton.getX()+tamano, aceptarButton.getY());
            horas.setSize(horas.getWidth()+tamano, horas.getHeight());
            curp.setSize(curp.getWidth()+tamano, curp.getHeight());
            sueldo.setSize(sueldo.getWidth()+tamano, sueldo.getHeight());
            supervisor.setSize(supervisor.getWidth()+tamano, supervisor.getHeight());
            
            
           
            
        
        
        
    }
    /*public void motivoSize(int size){
        motivo.setSize(motivo.getWidth()+size, motivo.getHeight());
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField apellidoM;
    private javax.swing.JLabel apellidoMLabel;
    private javax.swing.JTextField apellidoP;
    private javax.swing.JLabel apellidoPLabel;
    private javax.swing.JComboBox<String> area;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField curp;
    private javax.swing.JLabel curpLabel;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JTextField horas;
    private javax.swing.JLabel horasLabel;
    private javax.swing.JLabel iconrhmu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel motivo;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nss;
    private javax.swing.JLabel nssLabel;
    private javax.swing.JLabel num;
    private javax.swing.JTextField numeroTel;
    private javax.swing.JTextField rfc;
    private javax.swing.JLabel rfcLabel;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JTextField sueldo;
    private javax.swing.JLabel sueldoLabel;
    private javax.swing.JTextField supervisor;
    private javax.swing.JLabel supervisorLabel;
    // End of variables declaration//GEN-END:variables
}