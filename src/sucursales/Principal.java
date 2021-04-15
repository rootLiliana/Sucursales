/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lili
 */
public class Principal extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
  Connection conexion;
    String usuario,password;
    Conexion claseCon = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
    public Principal(String usr, String pass) {
        this.usuario=usr;
        this.password=pass;
        initComponents();
        mostrarHab();
        mostrarHabDis();
        mostrarCli();
       // mostrarCliP();
        mostrarRes();
        setLocationRelativeTo(null);
        setTitle("Sistema Hoteles CONCORD");
        Calendar c1=Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH));
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        lblDate.setText("Fecha:"+dia+"-"+(mes+1)+"-"+annio);
        lblUsr.setText("Usuario:"+usr);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JTabbedPane();
        PanelCliente = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApPat = new javax.swing.JLabel();
        txtApPat = new javax.swing.JTextField();
        lblApMat = new javax.swing.JLabel();
        txtApMat = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        lblNoExt = new javax.swing.JLabel();
        lblNoInt = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNoExt = new javax.swing.JTextField();
        txtNoInt = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        BtnAddClient = new javax.swing.JButton();
        lblUsr = new javax.swing.JLabel();
        lnlEstado = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        lblIDCliente = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        btnEliReg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCli = new javax.swing.JTable();
        BtActualizar = new java.awt.Button();
        btnCambio = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtIdVent = new javax.swing.JTextField();
        txtIDRes = new javax.swing.JTextField();
        txtIDCli = new javax.swing.JTextField();
        txtTOTAL = new javax.swing.JTextField();
        BtnPagar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtDHos = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCos = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRES = new javax.swing.JTable();
        BtnBorrar = new javax.swing.JButton();
        BtnCambiar = new javax.swing.JButton();
        BtnActu = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtNoHa1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableHab = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNoHab = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCapPer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipoHab = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtr = new javax.swing.JTextField();
        txth = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDis = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableRes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableCli1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtl = new javax.swing.JTextField();
        txts = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txte = new javax.swing.JTextField();
        txtco = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblApPat.setText("Apellido Paterno:");

        lblApMat.setText("Apellido Materno:");

        lblTel.setText("Telefono:");

        lblCalle.setText("Calle:");

        lblNoExt.setText("No Ext:");

        lblNoInt.setText("No. Int:");

        lblColonia.setText("Colonia:");

        lblMunicipio.setText("Municipio:");

        BtnAddClient.setText("Añadir Cliente");
        BtnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddClientActionPerformed(evt);
            }
        });

        lblUsr.setText("Usuario:");

        lnlEstado.setText("Estado:");

        lblPais.setText("Pais:");

        lblIDCliente.setText("ID Cliente:");

        lblCP.setText("CP:");

        txtCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPActionPerformed(evt);
            }
        });

        btnEliReg.setText("Eliminar registro");
        btnEliReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliRegActionPerformed(evt);
            }
        });

        TableCli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableCli);

        BtActualizar.setLabel("Actualizar");
        BtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtActualizarActionPerformed(evt);
            }
        });

        btnCambio.setText("Cambiar datos");
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                                .addComponent(lblApMat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblTel)
                                .addGap(2, 2, 2)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApPat)
                                    .addComponent(lblIDCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblCalle)
                                .addGap(18, 18, 18)
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)
                                .addGap(38, 38, 38))
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelClienteLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblColonia)
                                            .addComponent(lblNoExt))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lnlEstado)
                                            .addComponent(lblMunicipio)
                                            .addComponent(lblPais)
                                            .addComponent(lblCP))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelClienteLayout.createSequentialGroup()
                                        .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliReg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelClienteLayout.createSequentialGroup()
                                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                                .addComponent(txtNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(lblNoInt)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(PanelClienteLayout.createSequentialGroup()
                                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(BtnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(lblUsr)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                                .addComponent(BtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                                .addComponent(btnCambio)
                                .addGap(28, 28, 28))))))
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsr))
                                .addGap(26, 26, 26)
                                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCalle)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDCliente)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoExt)
                            .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNoInt)
                                .addComponent(txtNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombre))))
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColonia)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApPat)
                    .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipio)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApMat)
                    .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lnlEstado)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTel)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAddClient))
                .addGap(18, 18, 18)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCP)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambio)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        PanelPrincipal.addTab(" Cliente", PanelCliente);

        jLabel18.setText("ID Venta:");

        jLabel19.setText("ID Reserva:");

        jLabel20.setText("ID CLiente:");

        jLabel21.setText("TOTAL");

        txtIdVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVentActionPerformed(evt);
            }
        });

        txtIDRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDResActionPerformed(evt);
            }
        });

        BtnPagar.setText("PAGAR");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        jLabel13.setText("No Hab");

        txtDHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDHosActionPerformed(evt);
            }
        });

        jLabel22.setText("Costo");

        txtCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCosActionPerformed(evt);
            }
        });

        jLabel23.setText("IVA");

        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        tableRES.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableRES);

        BtnBorrar.setText("BORRAR VENTA");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnCambiar.setText("CAMBIAR VENTA");
        BtnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarActionPerformed(evt);
            }
        });

        BtnActu.setText("ACTUALIZAR");
        BtnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActuActionPerformed(evt);
            }
        });

        jLabel28.setText("Dias Hospedaje");

        txtNoHa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoHa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel28))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoHa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIVA)
                        .addGap(603, 603, 603))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDRes)
                                    .addComponent(txtIdVent)
                                    .addComponent(txtIDCli))
                                .addGap(133, 133, 133))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCos)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtDHos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnActu)
                            .addComponent(BtnPagar)
                            .addComponent(BtnBorrar)
                            .addComponent(BtnCambiar))
                        .addGap(391, 391, 391))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIdVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPagar))))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrar))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BtnCambiar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtDHos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BtnActu)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNoHa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        PanelPrincipal.addTab("Venta", jPanel3);

        TableHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TableHab);

        jButton1.setText("Agregar habitación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar habitación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Actualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de Habitación");

        txtNoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoHabActionPerformed(evt);
            }
        });

        jLabel6.setText("Capacidad de personas");

        txtCapPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapPerActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de habitación");

        jLabel8.setText("Status");

        jLabel9.setText("Costo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapPer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(187, 187, 187))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8))
                                .addGap(213, 213, 213))))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(86, 86, 86)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCapPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        PanelPrincipal.addTab("Resumen de Habitaciones", jPanel4);

        jLabel14.setText("ID de Cliente:");

        jLabel15.setText("No. de Habitaciones:");

        jLabel16.setText("Dias de Hospedaje");

        jLabel17.setText("DIA DE LLEGADA");

        jLabel24.setText("ID: RESERVA:");

        jLabel27.setText("Habitaciones");

        jButton2.setText("RESERVAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        jButton4.setText("CANCELAR RESERVA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Clientes");

        TableDis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableDis);

        jLabel2.setText("Reservas");

        TableRes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(TableRes);

        jLabel3.setText("Fecha:");

        jLabel4.setText("Usuario:");

        TableCli1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(TableCli1);

        jLabel10.setText("No. habitacion");

        jLabel11.setText("STATUS");

        jLabel12.setText("Costo");

        jButton9.setText("Actualizar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel14))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel17))
                            .addGap(23, 23, 23)
                            .addComponent(txtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(0, 260, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        PanelPrincipal.addTab("Reserva", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVentActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID Reserva");
        modelo.addColumn("habitaciones");
        modelo.addColumn("no habitacion");
        modelo.addColumn("fecha de entrada");
        modelo.addColumn("fecha de salida");
        modelo.addColumn("id cliente");
        modelo.addColumn("estatus");
        modelo.addColumn("Costo");

        TableRes.setModel(modelo);
        String dato[]=new String[55];
        Statement st;
        try {

            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Reserva");
            rs=ps.executeQuery();

            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                dato[6]=rs.getString(7);
                dato[7]=rs.getString(8);

                modelo.addRow(dato);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PreparedStatement ps = null;

        try{
            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Reserva");
            rs=ps.executeQuery();
            int Fila = TableRes.getSelectedRow();
            String Cod_Reser= TableRes.getValueAt(Fila, 0).toString();

            ps = conexion.prepareStatement("delete from Reserva where Cod_Reser=?");
            ps.setString(1, Cod_Reser);
            ps.execute();

            modelo.removeRow(Fila);
        }   catch (SQLException ex) {

            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement ps = null;
        try{
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);
            ps = conexion.prepareStatement("INSERT INTO `Reserva` (`Cod_Reser`,`Cant_Hab`,No_Hab,Fec_Ini,Dias_Hos,ID_Client,Status,Costo) VALUES(?,?,?,?,?,?,?,?);");

            ps.setString(1,txtr.getText());
            ps.setString(2,txth.getText());
            ps.setString(3,txtn.getText());
            ps.setString(4,txtl.getText());
            ps.setString(5,txts.getText());
            ps.setString(6,txtc.getText());
            ps.setString(7,txte.getText());
            ps.setString(8,txtco.getText());
            ps.executeUpdate();
            rs=ps.getResultSet();

            JOptionPane.showMessageDialog(null, "Guardados exitosamente");
            Object[] fila = new Object[15];
            fila[0] = txtr.getText();
            fila[1] = txth.getText();
            fila[2] = txtn.getText();
            fila[3] = txtl.getText();
            fila[4] = txts.getText();
            fila[5] = txtc.getText();
            fila[6] = txte.getText();
            fila[7] = txtco.getText();

            modelo.addRow(fila);
        }catch(Exception ex){
            System.out.println(ex);

            JOptionPane.showMessageDialog(null, "NO TIENES ACCESO  \n");

            System.out.println(ex);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCapPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapPerActionPerformed

    private void txtNoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoHabActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("No Habitacion");
        modelo.addColumn("Capacidad de personas");
        modelo.addColumn("Tipo de habitacion");
        modelo.addColumn("Status");
        modelo.addColumn("Costo");

        TableHab.setModel(modelo);
        String dato[]=new String[25];
        Statement st;
        try {

            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Habitacion");
            rs=ps.executeQuery();

            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);

                modelo.addRow(dato);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);

            ps = conexion.prepareStatement("update Habitacion set Cap_Per = '"+txtCapPer.getText()+"', Tipo_Hab = '"+txtTipoHab.getText()+"', Status = '"+txtStatus.getText()+"',Costo = '"+txtCosto.getText()+"' where No_hab = '"+txtNoHab.getText()+"'");
            ps.executeUpdate();
            rs=ps.getResultSet();
            JOptionPane.showMessageDialog(null, "Guardados exitosamente");

        } catch (Exception ex){
            System.out.println(ex);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PreparedStatement ps = null;

        try{
            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Habitacion");
            rs=ps.executeQuery();
            int Fila = TableHab.getSelectedRow();
            String ID_Client= TableHab.getValueAt(Fila, 0).toString();

            ps = conexion.prepareStatement("delete from Habitacion where No_Hab=?");
            ps.setString(1, ID_Client);
            ps.execute();

            modelo.removeRow(Fila);

        }   catch (SQLException ex) {

            System.out.println(ex.toString());

        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        try{
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);
            ps = conexion.prepareStatement("INSERT INTO `Habitacion` (`No_Hab`,`Cap_Per`,`Tipo_Hab`,`Status`,`Costo`) VALUES(?,?,?,?,?);");
            ps.setString(1,txtNoHab.getText());
            ps.setString(2,txtCapPer.getText());
            ps.setString(3,txtTipoHab.getText());
            ps.setString(4,txtStatus.getText());
            ps.setString(5,txtCosto.getText());
            ps.executeUpdate();
            rs=ps.getResultSet();

            JOptionPane.showMessageDialog(null, "Guardados exitosamente");
            Object[] fila = new Object[5];

            fila[0] = txtNoHab.getText();
            fila[1] = txtCapPer.getText();
            fila[2] = txtTipoHab.getText();
            fila[3] = txtStatus.getText();
            fila[4] = txtCosto.getText();
            modelo.addRow(fila);

        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hubo un error en la incescion de datos \n"+ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
  PreparedStatement ps = null;

        try{
            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Ventas");
            rs=ps.executeQuery();
            int Fila = tableRES.getSelectedRow();
            String ID_Ven= tableRES.getValueAt(Fila, 0).toString();

            ps = conexion.prepareStatement("delete from Ventas where ID_Ven=?");
            ps.setString(1, ID_Ven);
            ps.execute();

            modelo.removeRow(Fila);
        }   catch (SQLException ex) {

            System.out.println(ex.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAActionPerformed

    private void txtCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCosActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        // TODO add your h   /*String ip,pto,bd;
      
      
        PreparedStatement ps = null;
        try{
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);
            ps = conexion.prepareStatement("INSERT INTO `Ventas` (`ID_Ven`,`ID_Client`,`No_Hab`,`Cod_Reser`,`Costo`,`IVA`,`Dias_Hos`,Total) VALUES(?,?,?,?,?,?,?,?);");
           
            float f=Float.parseFloat(txtCos.getText());
           float f2=Float.parseFloat(txtDHos.getText());
           float IVA=Float.parseFloat(txtIVA.getText());
           float res=f*f2;
           float tol=res*IVA;
           float total=res+tol;
           String t=Float.toString(total);
           txtTOTAL.setText(t);
            ps.setString(1,txtIdVent.getText());
            ps.setString(2,txtIDCli.getText());
            ps.setString(3,txtNoHa1.getText());
            ps.setString(4,txtIDRes.getText());
            ps.setString(5,txtCos.getText());
            ps.setString(6,txtIVA.getText());
            ps.setString(7,txtDHos.getText());
            ps.setString(8,t);
           
           
           ps.executeUpdate();
            rs=ps.getResultSet();

            JOptionPane.showMessageDialog(null, "Guardados exitosamente");
            Object[] fila = new Object[15];
            fila[0] = txtIdVent.getText();
            fila[1] = txtIDCli.getText();
            fila[2] = txtNoHa1.getText();
            fila[3] = txtIDRes.getText();
            fila[4] = txtCos.getText();
            fila[5] = txtIVA.getText();
            fila[6] = txtDHos.getText();
            fila[7] = t;
            modelo.addRow(fila);
        }catch(SQLException ex){
            System.out.println(ex);

            JOptionPane.showMessageDialog(null, "Hubo un error en la incescion de datos \n"+ex);

            System.out.println(ex);
        }
    }//GEN-LAST:event_BtnPagarActionPerformed

    private void txtIDResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDResActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
        /*PreparedStatement ps=null;*/
        try {
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);

            ps = conexion.prepareStatement("update Cliente set Nombre = '"+txtNombre.getText()+"', Ap_Pat = '"+txtApPat.getText()+"', Ap_Mat = '"+txtApMat.getText()+"',TEL = '"+txtTel.getText()+"',Calle = '"+txtCalle.getText()+"', `No_Ext`= '"+txtNoExt.getText()+"', `No_Int` = '"+txtNoInt.getText()+"', Colonia = '"+txtColonia.getText()+"',Municipio = '"+txtMunicipio.getText()+"', CP = '"+txtCP.getText()+"', Estado = '"+txtEstado.getText()+"', Pais = '"+txtPais.getText()+"' where ID_Client = '"+txtIDCliente.getText()+"'");
            ps.executeUpdate();
            rs=ps.getResultSet();
            JOptionPane.showMessageDialog(null, "Guardados exitosamente");

        } catch (Exception ex){
            System.out.println(ex);}
    }//GEN-LAST:event_btnCambioActionPerformed

    private void BtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtActualizarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Telefono");
        modelo.addColumn("Telefono");
        modelo.addColumn("Calle");
        modelo.addColumn("Colonia");
        modelo.addColumn("Municipio");
        modelo.addColumn("CP");
        modelo.addColumn("Estado");
        modelo.addColumn("Pais");

        TableCli.setModel(modelo);
        String dato[]=new String[25];
        Statement st;
        try {

            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Cliente");
            rs=ps.executeQuery();

            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                dato[6]=rs.getString(7);
                dato[7]=rs.getString(9);
                dato[8]=rs.getString(10);
                dato[9]=rs.getString(12);
                dato[10]=rs.getString(13);

                modelo.addRow(dato);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtActualizarActionPerformed

    private void btnEliRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliRegActionPerformed
        PreparedStatement ps = null;

        try{
            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Cliente");
            rs=ps.executeQuery();
            int Fila = TableCli.getSelectedRow();
            String ID_Client= TableCli.getValueAt(Fila, 0).toString();

            ps = conexion.prepareStatement("delete from Cliente where ID_Client=?");
            ps.setString(1, ID_Client);
            ps.execute();

            modelo.removeRow(Fila);
        }   catch (SQLException ex) {

            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnEliRegActionPerformed

    private void txtCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPActionPerformed

    private void BtnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddClientActionPerformed
        /*String ip,pto,bd;
        txtIDCliente.setText("");
        txtNombre.setText("");
        txtApMat.setText("");
        txtApPat.setText("");
        txtCalle.setText("");
        txtColonia.setText("");
        txtMunicipio.setText("");
        txtEstado.setText("");
        txtPais.setText("");
        txtNoExt.setText("");
        txtNoInt.setText("");
        txtCP.setText("");
        txtTel.setText("");
        */
        PreparedStatement ps = null;
        try{
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);
            ps = conexion.prepareStatement("INSERT INTO `Cliente` (`ID_Client`,`Nombre`,`Ap_Pat`,`Ap_Mat`,`TEL`,`Calle`,`No_Ext`,`No_Int`,`Colonia`,`Municipio`,`CP`,`Estado`,`Pais`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1,txtIDCliente.getText());
            ps.setString(2,txtNombre.getText());
            ps.setString(3,txtApPat.getText());
            ps.setString(4,txtApMat.getText());
            ps.setString(5,txtTel.getText());
            ps.setString(6,txtCalle.getText());
            ps.setString(7,txtNoExt.getText());
            ps.setString(8,txtNoInt.getText());
            ps.setString(9,txtColonia.getText());
            ps.setString(10,txtMunicipio.getText());
            ps.setString(11,txtCP.getText());
            ps.setString(12,txtEstado.getText());
            ps.setString(13,txtPais.getText());
            ps.executeUpdate();
            rs=ps.getResultSet();
            /*
            System.out.println("INSERT INTO `Cliente` (ID_Client,Nombre,Ap_Pat,Ap_Mat,TEL,Calle,No.Ext,No.Int,Colonia,Municipio,CP,Estado,Pais)"
                + "VALUES("+ txtIDCliente.getText()+","
                +txtNombre.getText() +","
                +txtApPat.getText() +","
                +txtApMat.getText() +","
                +txtTel.getText() +","
                +txtCalle.getText() +","
                +txtNoExt.getText() +","
                +txtNoInt.getText() +","
                +txtColonia.getText() +","
                +txtMunicipio.getText() +","
                +txtCP.getText() +","
                +txtEstado.getText() +","
                +txtPais.getText() +");");
            */
            JOptionPane.showMessageDialog(null, "Guardados exitosamente");
            Object[] fila = new Object[15];
            fila[0] = txtIDCliente.getText();
            fila[1] = txtNombre.getText();
            fila[2] = txtApPat.getText();
            fila[3] = txtApMat.getText();
            fila[4] = txtTel.getText();
            fila[5] = txtCalle.getText();
            fila[6] = txtNoExt.getText();
            fila[7] = txtNoInt.getText();
            fila[8] = txtColonia.getText();
            fila[9] = txtMunicipio.getText();
            fila[10] = txtCP.getText();
            fila[11] = txtEstado.getText();
            fila[12] = txtPais.getText();
            modelo.addRow(fila);
        }catch(SQLException ex){
            System.out.println(ex);

            JOptionPane.showMessageDialog(null, "Hubo un error en la incescion de datos \n"+ex);
            /*  System.out.println("INSERT INTO `Cliente` (ID_Client,Nombre,Ap_Pat,Ap_Mat,TEL,Calle,No.Ext,No.Int,Colonia,Municipio,CP,Estado,Pais)"
                + "VALUES("+ txtIDCliente.getText()+","
                +txtNombre.getText() +","
                +txtApPat.getText() +","
                +txtApMat.getText() +","
                +txtTel.getText() +","
                +txtCalle.getText() +","
                +txtNoExt.getText() +","
                +txtNoInt.getText() +","
                +txtColonia.getText() +","
                +txtMunicipio.getText() +","
                +txtCP.getText() +","
                +txtEstado.getText() +","
                +txtPais.getText() +");");
            */
            System.out.println(ex);
        }
    }//GEN-LAST:event_BtnAddClientActionPerformed

    private void txtNoHa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoHa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoHa1ActionPerformed

    private void txtDHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDHosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDHosActionPerformed

    private void BtnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActuActionPerformed
 DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID_Ven");
        modelo.addColumn("ID_Client");
        modelo.addColumn("No_Hab");
        modelo.addColumn("Cod_Reser");
        modelo.addColumn("Costo");
        modelo.addColumn("IVA");
        modelo.addColumn("Dias_Hos");
        modelo.addColumn("Total");

        tableRES.setModel(modelo);
        String dato[]=new String[25];
        Statement st;
        try {

            conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
            ps=conexion.prepareStatement("SELECT*FROM Ventas");
            rs=ps.executeQuery();

            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                dato[6]=rs.getString(7);
                dato[7]=rs.getString(8);
                

                modelo.addRow(dato);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActuActionPerformed

    private void BtnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarActionPerformed
  try {
            conexion = claseCon.obtenerConexion("localhost", "3306","Concord_Cancun",usuario,password);

            ps = conexion.prepareStatement("UPDATE Ventas SET ID_Client = '"+txtIDCli.getText()+"', No_Hab = '"+txtNoHa1.getText()+"', Cod_Reser = '"+txtIDRes.getText()+"',Costo = '"+txtCos.getText()+"',IVA = '"+txtIVA.getText()+"', `Dias_Hos`= '"+txtDHos.getText()+"', `Total` = '"+txtTOTAL.getText()+"' where ID_Ven = '"+txtIdVent.getText()+"'");
            ps.executeUpdate();
            rs=ps.getResultSet();
            JOptionPane.showMessageDialog(null, "Guardados exitosamente");

        } catch (Exception ex){
            System.out.println(ex);}            
    }//GEN-LAST:event_BtnCambiarActionPerformed
void limpiar(){
        txtIDCliente.setText("");
        txtNombre.setText("");
        txtApPat.setText("");
        txtApMat.setText("");
        txtTel.setText("");
        txtCalle.setText("");
        txtNoExt.setText("");
        txtNoInt.setText("");
        txtColonia.setText("");
        txtMunicipio.setText("");
        txtCP.setText("");
        txtEstado.setText("");
        txtPais.setText("");
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed
    void mostrarHab(){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID_Ven");
    modelo.addColumn("ID_Client");
    modelo.addColumn("No_Hab");
    modelo.addColumn("Cod_Reser");
    modelo.addColumn("Costo");
    modelo.addColumn("IVA");
    modelo.addColumn("Dias_Hos");
    modelo.addColumn("Total");
    tableRES.setModel(modelo);
    
    String dato[]=new String[25];
    Statement st;
      try {
          
          conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
          ps=conexion.prepareStatement("SELECT*FROM Ventas");
          rs=ps.executeQuery();
         
          while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(2);
              dato[2]=rs.getString(3);
              dato[3]=rs.getString(4);
              dato[4]=rs.getString(5);
              dato[5]=rs.getString(6);
              dato[6]=rs.getString(7);
              dato[7]=rs.getString(8);
              modelo.addRow(dato);
          }
          
        
          
      } catch (SQLException ex) {
          System.out.println(ex);
          Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
    
    }
    
    void mostrarHabDis(){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("No. Habitacion");
    modelo.addColumn("Capacidad de Persona");
    modelo.addColumn("Tipo de Habitacion");
    modelo.addColumn("Costo");
    TableDis.setModel(modelo);
    String dato[]=new String[25];
    Statement st;
      try {
          conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
          ps=conexion.prepareStatement("SELECT*FROM Habitacion WHERE `Status`='Disponible';");
          rs=ps.executeQuery(); 
          while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(2);
              dato[2]=rs.getString(3);
              dato[3]=rs.getString(5);
              modelo.addRow(dato);
          }
          
      } catch (SQLException ex) {
          System.out.println(ex);
          Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
    }
    
    void mostrarCliP(){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID Cliente");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido Paterno");
    modelo.addColumn("Telefono");
    modelo.addColumn("Telefono");
    modelo.addColumn("Calle");
    modelo.addColumn("Colonia");
    modelo.addColumn("Municipio");
    modelo.addColumn("CP");
    modelo.addColumn("Estado");
    modelo.addColumn("Pais");
                            
    TableCli.setModel(modelo);
    String dato[]=new String[25];
    Statement st;
      try {
          
          conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
          ps=conexion.prepareStatement("SELECT*FROM Cliente");
          rs=ps.executeQuery();
         
          while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(2);
              dato[2]=rs.getString(3);
              dato[3]=rs.getString(4);
              dato[4]=rs.getString(5);
              dato[5]=rs.getString(6);
              dato[6]=rs.getString(7);
              dato[7]=rs.getString(9);
              dato[8]=rs.getString(10);
              dato[9]=rs.getString(12);
              dato[10]=rs.getString(13);
              
              modelo.addRow(dato);
          }
          
        
          
      } catch (SQLException ex) {
          System.out.println(ex);
          Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    }
    void mostrarCli(){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID Cliente");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido Paterno");
    modelo.addColumn("Telefono");
    TableCli1.setModel(modelo); 
    String dato[]=new String[25];
    Statement st;
      try {
          
          conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
          ps=conexion.prepareStatement("SELECT*FROM Cliente");
          rs=ps.executeQuery();
         
          while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(2);
              dato[2]=rs.getString(3);
              dato[3]=rs.getString(5);
              modelo.addRow(dato);
          }
          
        
          
      } catch (SQLException ex) {
          System.out.println(ex);
          Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    void mostrarRes(){
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID Reserva");
    modelo.addColumn("Fecha llegada");
    modelo.addColumn("Fecha Fin");
    modelo.addColumn("Status");
    TableRes.setModel(modelo);
    
    String dato[]=new String[25];
    Statement st;
      try {
          
          conexion =claseCon.obtenerConexion("localhost", "3306", "Concord_Cancun", usuario, password);
          ps=conexion.prepareStatement("SELECT*FROM Reserva");
          rs=ps.executeQuery();
         
          while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(4);
              dato[2]=rs.getString(5);
              dato[3]=rs.getString(7);
              modelo.addRow(dato);
          }
          
        
          
      } catch (SQLException ex) {
          System.out.println(ex);
          Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
    }    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtActualizar;
    private javax.swing.JButton BtnActu;
    private javax.swing.JButton BtnAddClient;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnCambiar;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JTabbedPane PanelPrincipal;
    private javax.swing.JTable TableCli;
    private javax.swing.JTable TableCli1;
    private javax.swing.JTable TableDis;
    private javax.swing.JTable TableHab;
    private javax.swing.JTable TableRes;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnEliReg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblApMat;
    private javax.swing.JLabel lblApPat;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNoExt;
    private javax.swing.JLabel lblNoInt;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JLabel lnlEstado;
    private javax.swing.JTable tableRES;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCapPer;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDHos;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIDCli;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDRes;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtIdVent;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNoExt;
    private javax.swing.JTextField txtNoHa1;
    private javax.swing.JTextField txtNoHab;
    private javax.swing.JTextField txtNoInt;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTOTAL;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTipoHab;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtco;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txth;
    private javax.swing.JTextField txtl;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtr;
    private javax.swing.JTextField txts;
    // End of variables declaration//GEN-END:variables
}
