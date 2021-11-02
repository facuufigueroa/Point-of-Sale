
package GUI;


import java.sql.Connection;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemabruyen.Conexion;


public class PuntoDeVenta extends javax.swing.JFrame {

    DefaultTableModel modeloVenta;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public PuntoDeVenta() {
        initComponents();
        txtCodigo.requestFocus();
        setLocationRelativeTo(null);
        
        iniciarTabla();   
    }

    
    
    public void limpiarCajasNumericas(){
        txtTotal.setText(null);
        txtPagaCon.setText(null);
        txtVuelto.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSup = new javax.swing.JPanel();
        labelPuntoDeVenta = new javax.swing.JLabel();
        botonVolvermenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        botonBorrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonNuevaCompra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelImagenPunto = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPagaCon = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelPagaCon = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelVuelto = new javax.swing.JLabel();
        panelCodigo = new javax.swing.JPanel();
        labelCod = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        labelOtro = new javax.swing.JLabel();
        txtOtro = new javax.swing.JTextField();
        botonAgregarOtro = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        labelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtnombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PUNTO DE VENTA BRU-YEN");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panelSup.setBackground(new java.awt.Color(0, 163, 0));
        panelSup.setBorder(new javax.swing.border.MatteBorder(null));

        labelPuntoDeVenta.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        labelPuntoDeVenta.setText("PUNTO DE VENTA");

        botonVolvermenu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonVolvermenu.setText("VOLVER A MENU");
        botonVolvermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolvermenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSupLayout = new javax.swing.GroupLayout(panelSup);
        panelSup.setLayout(panelSupLayout);
        panelSupLayout.setHorizontalGroup(
            panelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(botonVolvermenu)
                .addGap(441, 441, 441)
                .addComponent(labelPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        panelSupLayout.setVerticalGroup(
            panelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSupLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(panelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolvermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablaVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 51)));
        tablaVenta.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVenta);

        botonBorrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonBorrar.setText("BORRAR PRODUCTO");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonCancelar.setText("CANCELAR COMPRA");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonNuevaCompra.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonNuevaCompra.setText("NUEVA COMPRA");
        botonNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaCompraActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        labelImagenPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga_1.png"))); // NOI18N

        txtTotal.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText(" Total a pagar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        txtPagaCon.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtPagaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagaConActionPerformed(evt);
            }
        });
        txtPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagaConKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        labelPagaCon.setBackground(new java.awt.Color(0, 51, 153));
        labelPagaCon.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelPagaCon.setForeground(new java.awt.Color(204, 0, 0));
        labelPagaCon.setText("Paga con");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPagaCon, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPagaCon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtVuelto.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        labelVuelto.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelVuelto.setForeground(new java.awt.Color(204, 0, 0));
        labelVuelto.setText("Vuelto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(labelVuelto)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelVuelto)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(labelImagenPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPagaCon, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelImagenPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCodigo.setBackground(new java.awt.Color(0, 153, 0));

        labelCod.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelCod.setText("CODIGO PRODUCTO");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelCodigoLayout = new javax.swing.GroupLayout(panelCodigo);
        panelCodigo.setLayout(panelCodigoLayout);
        panelCodigoLayout.setHorizontalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCod)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCodigoLayout.setVerticalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        labelOtro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelOtro.setText("OTRO");

        txtOtro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOtroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtroKeyTyped(evt);
            }
        });

        botonAgregarOtro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAgregarOtro.setText("AGREGAR");
        botonAgregarOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarOtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonAgregarOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));

        labelBuscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelBuscar.setText("BUSCAR");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtnombre.setText("NOMBRE");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("PRECIO");

        txtPrecio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("CODIGO");

        cajaCodigo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaCodigo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBorrar)
                                    .addComponent(botonCancelar))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(panelSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(botonNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            agregarAtabla();
            actualizarTotal(modeloVenta); 
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void botonAgregarOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarOtroActionPerformed
        agregarOtro();
        actualizarTotal(modeloVenta);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_botonAgregarOtroActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        cancelarCompra();
        txtCodigo.requestFocus();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        borrarProducto();
      
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaCompraActionPerformed
        nuevaCompra();
        txtCodigo.requestFocus();
    }//GEN-LAST:event_botonNuevaCompraActionPerformed

    private void botonVolvermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolvermenuActionPerformed
        PuntoDeVenta punto = new PuntoDeVenta();
        this.hide();
        MenuPrincipal menu = new MenuPrincipal();
        punto.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_botonVolvermenuActionPerformed

    private void txtPagaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagaConActionPerformed
         
    }//GEN-LAST:event_txtPagaConActionPerformed

    private void txtPagaConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagaConKeyPressed
           if(evt.getKeyCode()==KeyEvent.VK_ENTER){
              vuelto();
           }
    }//GEN-LAST:event_txtPagaConKeyPressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        buscarVenta();
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cajaCodigo.setText(null);
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtBuscar.setText(null);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOtroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtroKeyPressed
        
    }//GEN-LAST:event_txtOtroKeyPressed

    private void txtOtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtroKeyTyped
        int key = evt.getKeyChar();
        boolean numeros= key >=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtOtroKeyTyped

    
    
    public void iniciarTabla(){
        modeloVenta=new DefaultTableModel();
        modeloVenta.addColumn("Producto");
        modeloVenta.addColumn("Precio");
       
        tablaVenta.setModel(modeloVenta);
        tablaVenta.setRowHeight(50);
    }
    
   
    
    
    
    public void agregarOtro(){
        String otro [] = new String[2];
        if(txtOtro.getText().length()!=0){
            otro[0]="OTRO";
            otro[1]= txtOtro.getText()+"$";
            modeloVenta.addRow(otro);
            txtOtro.setText(null);
        }
        else{
            JOptionPane.showMessageDialog(this, "NO INGRESO MONTO");
        }
     }
    
    
    public void borrarProducto(){
       
        int fila = 0;
        int resp=0;
        String botones [] = {"Aceptar","Cancelar"};
        try{
            fila=tablaVenta.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "SELECCIONA EL PRODUCTO A ELIMINAR");
                
            }else{
                
                resp=JOptionPane.showOptionDialog(this,"¿ESTAS SEGURO DE ELIMINAR EL PRODUCTO?","ELIMINAR",0,0,null,botones,this);
                if(resp==JOptionPane.YES_OPTION){
                    restarTotal(fila);
                    modeloVenta.removeRow(fila);
                    vuelto();
                }
               
            } 
        }catch(Exception e){
            
        }
    }
    
    public void actualizarTotal(DefaultTableModel modelo){
        int t = 0;
        int p1=0;
        String p=null;
        
        if(modelo.getRowCount()>0 ){
            for(int i=0;i<modelo.getRowCount();i++){
                
                p=modelo.getValueAt(i, 1).toString();
                p=p.substring(0,p.length()-1);
                t+=Integer.parseInt(p);
                txtTotal.setText(String.valueOf(t)+"$");
            }
            
        }
        
    }
    
    public void agregarAtabla(){
         String[] dato= new String[3];
    
        Connection conn = Conexion.getConnection();
            try{
                //consulta 
                ps=conn.prepareStatement("SELECT * FROM producto WHERE codigo = '"+txtCodigo.getText().toUpperCase()+"'");
                rs=ps.executeQuery();
                //--------------------------------//
                if(rs.next()) {
                    
                    dato[0]=rs.getString("nombre");
                    dato[1]=rs.getString("precio")+"$";
                   
                    modeloVenta.addRow(dato);
                  
                }else{
                    JOptionPane.showMessageDialog(null,"No existe producto buscado");
                    
                }
                txtCodigo.setText(null);
            } catch(Exception e){
                 System.out.println(e);
    }  
    }
    
    public void restarTotal(int f){
        
        if(f >=0 ){
          String aux = tablaVenta.getValueAt(f, 1).toString();
          aux=aux.substring(0,aux.length()-1);
          String aux2= txtTotal.getText().substring(0, txtTotal.getText().length()-1);
          txtTotal.setText(String.valueOf(Integer.parseInt(aux2)-(Integer.parseInt(aux)))+"$");
          
       }
       else{
          JOptionPane.showMessageDialog(null, "FILA NO SELECCIONADA");
          
       }
    }
    
    
    public void cancelarCompra(){
        String botones [] = {"Aceptar","Cancelar"};
        int eleccion=JOptionPane.showOptionDialog(this,"¿Desea cancelar la compra ?","Cancelar" , 0, 0, null, botones, this);
     
            if(eleccion==JOptionPane.YES_OPTION){
                modeloVenta.setRowCount(0);
                limpiarCajasNumericas();
                }
    }
    
    
    public void nuevaCompra(){
        modeloVenta.setRowCount(0);
        limpiarCajasNumericas(); 
    }
    
    
   
    public void vuelto(){
        if(txtTotal.getText().length()!=0){
            int pagaCon = Integer.parseInt(txtPagaCon.getText());
            String p = txtTotal.getText();
            p=p.substring(0,p.length()-1);
            int total=Integer.parseInt(p);
            int vuelto=total-pagaCon;
         
            txtVuelto.setText(String.valueOf(vuelto)+"$");
        
    }else{
            JOptionPane.showMessageDialog(this, "NO SE REALIZO NINGUNA COMRA");
            txtPagaCon.setText(null);
        }
    }
    
   
   public void buscarVenta(){
       String[] dato= new String[3];
        
        Connection conn = Conexion.getConnection();
            try{
                //consulta 
                ps=conn.prepareStatement("SELECT * FROM producto WHERE nombre = '"+txtBuscar.getText().toUpperCase()+"'or codigo = '"+txtBuscar.getText()+"'");
                rs=ps.executeQuery();
                //--------------------------------//
                if(rs.next()) {
                    
                    dato[0]=rs.getString("codigo");
                    dato[1]=rs.getString("nombre");
                    dato[2]=rs.getString("precio")+"$";
                    
                    cajaCodigo.setText(dato[0]);
                    txtPrecio.setText(dato[2]);
                    txtNombre.setText(dato[1]);
            }
                
            
                
            }catch(Exception e){
                System.out.println(e);
            }
   }
            
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarOtro;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonNuevaCompra;
    private javax.swing.JButton botonVolvermenu;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelCod;
    private javax.swing.JLabel labelImagenPunto;
    private javax.swing.JLabel labelOtro;
    private javax.swing.JLabel labelPagaCon;
    private javax.swing.JLabel labelPuntoDeVenta;
    private javax.swing.JLabel labelVuelto;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JPanel panelSup;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtro;
    private javax.swing.JTextField txtPagaCon;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVuelto;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables
}
