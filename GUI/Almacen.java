/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.MenuPrincipal;
import com.itextpdf.text.DocumentException;

import java.sql.Connection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sistemabruyen.Conexion;
import sistemabruyen.ExportarPdf;

//import static sistemabruyen.pruebaConexion.PASSWORD;
//import static sistemabruyen.pruebaConexion.URL;
//import static sistemabruyen.pruebaConexion.USERNAME;

/**
 *
 * @author Facundo
 */
public class Almacen extends javax.swing.JFrame {

    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Almacen() {
        initComponents();
        CajaNombre.requestFocus();
        tablaP.setRowHeight(30);
        
        modelo = new DefaultTableModel();
        txtId.setVisible(false);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Precio");
        tablaP.setModel(modelo);
        importarFalso(modelo);      
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        LabelAgregarP = new javax.swing.JLabel();
        LabelNomP = new javax.swing.JLabel();
        LabelPp = new javax.swing.JLabel();
        LabelCodP = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        CajaPrecio = new javax.swing.JTextField();
        CajaCodigo = new javax.swing.JTextField();
        botonAgregarP = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        botonVolverMenu = new javax.swing.JButton();
        botonBuscarCodigo = new javax.swing.JButton();
        CajaBuscar = new javax.swing.JTextField();
        LabelBuscarCodigo = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        botonVolverLista = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        imagenAtras = new javax.swing.JLabel();
        imagenBuscar = new javax.swing.JLabel();
        imagenAgregar = new javax.swing.JLabel();
        imagenEdit = new javax.swing.JLabel();
        imagenMod = new javax.swing.JLabel();
        imagenRemov = new javax.swing.JLabel();
        imgAtrasMenu = new javax.swing.JLabel();
        imagenPrin = new javax.swing.JLabel();
        pdf = new javax.swing.JButton();
        lablPdf = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PUNTO DE VENTA BRU-YEN");
        setBackground(new java.awt.Color(0, 153, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 3, 36)); // NOI18N
        jLabel1.setText("ADMINISTRACION ALMACEN");

        botonEditar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        LabelAgregarP.setFont(new java.awt.Font("Malgun Gothic", 3, 24)); // NOI18N
        LabelAgregarP.setText("AGREGAR PRODUCTO");

        LabelNomP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelNomP.setText("Nombre:");

        LabelPp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelPp.setText("Precio:  $");

        LabelCodP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelCodP.setText("Codigo: #");

        CajaNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CajaPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CajaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPrecioActionPerformed(evt);
            }
        });
        CajaPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaPrecioKeyTyped(evt);
            }
        });

        CajaCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        botonAgregarP.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonAgregarP.setText("AGREGAR");
        botonAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPActionPerformed(evt);
            }
        });

        botonBorrar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonBorrar.setText("BORRAR");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        tablaP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaP.setAlignmentY(0.4F);
        jScrollPane3.setViewportView(tablaP);

        botonVolverMenu.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonVolverMenu.setText("VOLVER MENU");
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });

        botonBuscarCodigo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonBuscarCodigo.setText("BUSCAR");
        botonBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCodigoActionPerformed(evt);
            }
        });

        CajaBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        LabelBuscarCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        botonModificar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonVolverLista.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonVolverLista.setText("VOLVER A LISTA");
        botonVolverLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverListaActionPerformed(evt);
            }
        });

        txtId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        imagenAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N

        imagenAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N

        imagenEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N

        imagenMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mod.png"))); // NOI18N

        imagenRemov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N

        imgAtrasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N

        imagenPrin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N

        pdf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pdf.setText("EXPORTAR A PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        lablPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N

        jButton1.setText("reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(imagenAgregar)
                                        .addGap(14, 14, 14)
                                        .addComponent(botonModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(imagenEdit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelPp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelCodP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addComponent(LabelBuscarCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNomP)
                                .addGap(18, 18, 18)
                                .addComponent(CajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonAgregarP)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBuscarCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonVolverLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lablPdf)
                                    .addComponent(imagenAtras))
                                .addGap(145, 145, 145)
                                .addComponent(txtId)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(imagenPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 54, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagenRemov, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imagenMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(botonEditar)
                                        .addGap(6, 6, 6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgAtrasMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVolverMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelAgregarP)
                        .addComponent(imgAtrasMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonVolverMenu))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNomP)
                            .addComponent(CajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelBuscarCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPp)
                            .addComponent(CajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCodP)
                            .addComponent(CajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imagenAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(botonAgregarP))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(botonModificar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagenEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscarCodigo)
                            .addComponent(CajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lablPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonVolverLista)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(imagenAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(imagenPrin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imagenRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imagenMod, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 249, Short.MAX_VALUE)
                        .addComponent(imagenBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void botonAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPActionPerformed
            if(!CajaCodigo.getText().isEmpty()){
                agregar(); 
            }else{
                JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR PRODUCTO,COMPLETE LOS CAMPOS");
            }
            
    }//GEN-LAST:event_botonAgregarPActionPerformed

    
    
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
       borrar();
       
    }//GEN-LAST:event_botonBorrarActionPerformed

    
    
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        editar();
       
    }//GEN-LAST:event_botonEditarActionPerformed

    
    
    private void CajaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPrecioActionPerformed
                
    }//GEN-LAST:event_CajaPrecioActionPerformed

    
    
    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        Almacen almacen = new Almacen();
        this.hide();
        MenuPrincipal menu = new MenuPrincipal();
        almacen.dispose();
        menu.setVisible(true);   
    }//GEN-LAST:event_botonVolverMenuActionPerformed

    
    
    
    private void botonBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCodigoActionPerformed
             buscar(modelo);
             limpiarCajas();
    }//GEN-LAST:event_botonBuscarCodigoActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
            botonModificar();
            
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonVolverListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverListaActionPerformed
        limpiarCajas();
        limpiarCeldas(); 
        importarFalso(modelo); 
    }//GEN-LAST:event_botonVolverListaActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        ExportarPdf pdf = new ExportarPdf();
        try {
            pdf.generetePdf(tablaP);
        } catch (DocumentException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_pdfActionPerformed

    private void CajaPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaPrecioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros= key >=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_CajaPrecioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void importarDatos(DefaultTableModel model){
        Connection conn = Conexion.getConnection();
        Statement st;
        String[] dato= new String[3];
        try{
            String sql = "SELECT * FROM producto";
            
            st=conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while(rs.next()){
                
                dato[0]=rs.getString(2);
                dato[1]=rs.getString(3);
                dato[2]=rs.getString(4);
                model.addRow(dato);
           }
                
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public void buscar(DefaultTableModel model){
        String[] dato= new String[3];
        limpiarCeldas();
        Connection conn = Conexion.getConnection();
            try{
                //consulta 
                ps=conn.prepareStatement("SELECT * FROM producto WHERE nombre = '"+CajaBuscar.getText().toUpperCase()+"'or codigo = '"+CajaBuscar.getText()+"'");
                rs=ps.executeQuery();
                //--------------------------------//
                if(rs.next()) {
                    
                    dato[0]=rs.getString("codigo");
                    dato[1]=rs.getString("nombre");
                    dato[2]=rs.getString("precio")+"$";
                    model.addRow(dato);
                }else{
                    JOptionPane.showMessageDialog(null,"NO EXISTE PRODUCTO BUSCADO");
                    importarFalso(model);   
                }
            } catch(Exception e){
                 System.out.println(e);
    }   
    }
    
    
    public void limpiarCeldas(){
        
        modelo.setRowCount(0);
    }
    
    
    private void limpiarCajas(){
         CajaNombre.setText(null);
         CajaPrecio.setText(null);
         CajaCodigo.setText(null);
         CajaBuscar.setText(null);
         txtId.setText(null);
    }
   
    
    
    public void editar(){
       int fila = tablaP.getSelectedRow();
       if(fila >=0 ){
          CajaCodigo.setText(tablaP.getValueAt(fila, 0).toString());
          CajaNombre.setText(tablaP.getValueAt(fila,1).toString());
          String aux = tablaP.getValueAt(fila, 2).toString();
          aux=aux.substring(0,aux.length()-1);
          CajaPrecio.setText(aux);
          txtId.setText(traer_id(CajaCodigo.getText()));
          
          
       }
       else{
          JOptionPane.showMessageDialog(null, "FILA NO SELECCIONADA");
          
       }
    }
    
    public void botonModificar(){
        Connection conn = Conexion.getConnection();
            
                
                try{
                 
                    String sql = "UPDATE producto SET codigo = ?, nombre = ? , precio = ? WHERE idempleado = ?";
              
                     ps=conn.prepareStatement(sql);
                 
                     ps.setString(1,CajaCodigo.getText());
                     ps.setString(2, CajaNombre.getText().toUpperCase());
                     ps.setString(3,CajaPrecio.getText());
                     ps.setString(4,txtId.getText());
                     
                     ps.executeUpdate();
                     limpiarCeldas();
                     importarFalso(modelo);
                     limpiarCajas();
                }catch(Exception e){
                        System.out.println(e);
                        
                }
          
    }
    
    
    public void agregar(){
        Connection conn = Conexion.getConnection();
            if(!existeCodigo()){
             try{
                 String sql = "INSERT INTO producto (codigo,nombre,precio) VALUES(?,?,?) ";
                
                 ps=conn.prepareStatement(sql);
                 
                 ps.setString(1,CajaCodigo.getText());
                 ps.setString(2, CajaNombre.getText().toUpperCase());
                 ps.setString(3,CajaPrecio.getText());
                 
                 ps.execute();
                 
                 JOptionPane.showMessageDialog(null,"PRODUCTO GUARDADO");
                 
               
                 //----LLAMDA METODOS---//
                 limpiarCeldas();
                 limpiarCajas();
               
                 importarFalso(modelo);
                
                 
                }catch(Exception e){
                 System.out.println(e);
                 
             }
            }
            else{
                JOptionPane.showMessageDialog(null,"EL CODIGO  " + "'"+CajaCodigo.getText()+"'" + " YA SE ENCUENTRA EN EL SISTEMA");
                limpiarCajas();
            }
            
        
    }
    
    public void importarFalso(DefaultTableModel model){
        Connection conn = Conexion.getConnection();
        Statement st;
        String[] dato= new String[3];
        
        try{
            String sql = "SELECT * FROM producto ORDER BY nombre";
            
            st=conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while(rs.next()){
                
                dato[0]=rs.getString(2);
                dato[1]=rs.getString(3);
                dato[2]=rs.getString(4)+"$";
                model.addRow(dato);
           }
                
        }catch(Exception e){
            System.out.println(e);
        }
        
       
    }
    
    public boolean existeCodigo(){
        Connection conn = Conexion.getConnection();
        Statement st;
        String[] dato= new String[3];
        boolean b = true;        
        try{
            String sql = "SELECT * FROM producto WHERE  codigo = '"+CajaCodigo.getText()+"'";
            
            st=conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            if(rs.next()){
                 b=true;
                
           }else{
                b=false;
            }
                
        }catch(Exception e){
            System.out.println(e);
        }
      
        
        return b;
    }
    
    public String traer_id(String codigo){
        Connection conn = Conexion.getConnection();
        Statement st;
        String s = null;
        
        try{
            String sql = "SELECT  idproducto FROM  producto WHERE  codigo = '"+codigo+"'";
            
            st=conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            if(rs.next()){
              s=rs.getString(1);
                
           }
             
        }catch(Exception e){
            System.out.println(e);
        }
        
      return s;
      
    }
    
    
    public void borrar(){
        Connection conn = Conexion.getConnection();
        String botones [] = {"Aceptar","Cancelar"};
        int fila = tablaP.getSelectedRow();
        
        if(fila >=0 ){
            
            
        int eleccion=JOptionPane.showOptionDialog(this,"¿Desea borrar el producto: "+tablaP.getValueAt(fila,1).toString().toUpperCase()+" ?","ELIMINAR PRODUCTO" , 0, 0, null, botones, this);
     
        if(eleccion == JOptionPane.YES_OPTION){
                try{
                    
                    String sql = "DELETE FROM producto WHERE codigo = ?";
              
                     ps=conn.prepareStatement(sql);
                 
                     ps.setString(1,tablaP.getValueAt(fila, 0).toString());
                     
                     ps.executeUpdate();
                     limpiarCeldas();
                     importarFalso(modelo);
                    
                    
                 //----VACIO CAJAS DE TEXTO LUEGO DE AGREGAR---//
                    limpiarCajas();
                }catch(Exception e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR PRODUCTO, COMPLETE LOS CAMPOS");
                }
          }else if (eleccion == JOptionPane.NO_OPTION){
              JOptionPane.showMessageDialog(null,"SE HA CANCELADO LA OPERACION");
              limpiarCajas();
        }
        }else{
             JOptionPane.showMessageDialog(null,"POR FAVOR, SELECCIONE EL PRODUCTO A ELIMINAR");
        }
    }
    
   
    

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaBuscar;
    private javax.swing.JTextField CajaCodigo;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaPrecio;
    private javax.swing.JLabel LabelAgregarP;
    private javax.swing.JLabel LabelBuscarCodigo;
    private javax.swing.JLabel LabelCodP;
    private javax.swing.JLabel LabelNomP;
    private javax.swing.JLabel LabelPp;
    private javax.swing.JButton botonAgregarP;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscarCodigo;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonVolverLista;
    private javax.swing.JButton botonVolverMenu;
    private javax.swing.JLabel imagenAgregar;
    private javax.swing.JLabel imagenAtras;
    private javax.swing.JLabel imagenBuscar;
    private javax.swing.JLabel imagenEdit;
    private javax.swing.JLabel imagenMod;
    private javax.swing.JLabel imagenPrin;
    private javax.swing.JLabel imagenRemov;
    private javax.swing.JLabel imgAtrasMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lablPdf;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tablaP;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
    
}
