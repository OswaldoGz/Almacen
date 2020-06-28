/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Datos.DAlmacen;
import Datos.DDetalleFacturas;
import Datos.DFacturas;
import Logica.LAlmacen;
import Logica.LDetalleFacturas;
import Logica.LFacturas;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

;

/**
 *
 * @author Oswaldo
 */
public class FrmFacturas extends javax.swing.JInternalFrame {

    DefaultTableModel miModelo;
    static int idlineas = 0;
      /**
     * Creates new form FrmFacturas
     */
    public FrmFacturas() {
        initComponents();
        habilitar(true);
        txtIdLineas.setVisible(false);
        txtIdProveedores.setVisible(false);
        txtTotal.setEditable(false);
        miModelo = (DefaultTableModel) tblFacturas.getModel();
        
        tblFacturas.getColumn("CODIGO").setWidth(30);
        tblFacturas.getColumn("CODIGO").setPreferredWidth(30);

        tblFacturas.getColumn("CANTIDAD").setWidth(30);
        tblFacturas.getColumn("CANTIDAD").setPreferredWidth(30);

        tblFacturas.getColumn("U/MEDIDA").setWidth(30);
        tblFacturas.getColumn("U/MEDIDA").setPreferredWidth(30);

        tblFacturas.getColumn("TOTAL").setWidth(30);
        tblFacturas.getColumn("TOTAL").setPreferredWidth(30);

        tblFacturas.getColumn("P/UNITARIO").setWidth(30);
        tblFacturas.getColumn("P/UNITARIO").setPreferredWidth(30);

        tblFacturas.getColumn("DESCRIPCION").setWidth(130);
        tblFacturas.getColumn("DESCRIPCION").setPreferredWidth(130);

    }

    public static void setProveedores(String id, String proveedor) {
        txtIdProveedores.setText(id);
        txtProveedor.setText(proveedor);
    }

    public static void setLinea(String id, String linea) {
        idlineas = Integer.parseInt(id);
        txtIdLineas.setText(id);
        txtLinea.setText(linea);
     
    }

        public void habilitar(boolean b) {
        txtEnter.setEnabled(!b);
        txtFecha.setEnabled(!b);
        txtLinea.setEnabled(!b);
        txtProveedor.setEnabled(!b);
        btnCancelar.setEnabled(!b);
        btnGuardar.setEnabled(!b);
        //btnBuscarLinea.setEnabled(!b);
        //btnBuscarProveedor.setEnabled(!b);
        btnNuevo.setEnabled(b);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLinea = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        txtIdLineas = new javax.swing.JTextField();
        txtIdProveedores = new javax.swing.JTextField();
        txtEnter = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Facturas");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Id:");

        jLabel2.setText("Linea");

        jLabel3.setText("Proveedor:");

        jLabel4.setText("Fecha:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineaActionPerformed(evt);
            }
        });

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLinea.setText("...");
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        btnProveedor.setText("...");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "U/MEDIDA", "P/UNITARIO", "TOTAL"
            }
        ));
        tblFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFacturasKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblFacturas);

        txtIdLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLineasActionPerformed(evt);
            }
        });

        txtIdProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedoresActionPerformed(evt);
            }
        });

        txtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterActionPerformed(evt);
            }
        });
        txtEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnterKeyPressed(evt);
            }
        });

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel5.setText("TOTAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLinea)
                                    .addComponent(txtProveedor)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProveedor)
                                    .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(txtIdLineas)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLinea)
                    .addComponent(txtIdLineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedor)
                            .addComponent(txtIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:     
      habilitar(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        // TODO add your handling code here:
        FrmBuscarLineas mi = new FrmBuscarLineas(new JFrame(), true);
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
    }//GEN-LAST:event_btnLineaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        FrmBuscarProveedor mi = new FrmBuscarProveedor(new JFrame(), true);
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void txtIdLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLineasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdLineasActionPerformed

    private void txtIdProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String msg = "", msgfinal = "";

        if (txtLinea.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "CAMPO LINEA OBLIGATORIO", "VALIDACION", JOptionPane.WARNING_MESSAGE);
            txtLinea.requestFocusInWindow();
            return;
        }
        if (txtProveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "CAMPO proveedor OBLIGATORIO", "VALIDACION", JOptionPane.WARNING_MESSAGE);
            txtProveedor.requestFocusInWindow();
            return;
        }
        if (txtFecha.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "CAMPO fecha OBLIGATORIO", "VALIDACION", JOptionPane.WARNING_MESSAGE);
            txtFecha.requestFocusInWindow();
            return;
        }

        LFacturas fn = new LFacturas();
        DFacturas dts = new DFacturas();

        dts.setLineasId(Integer.parseInt(txtIdLineas.getText()));
        dts.setProveedoresId(Integer.parseInt(txtIdProveedores.getText()));
        Calendar cal;
        cal = txtFecha.getCalendar();

        int aa, mm, dd;

        aa = cal.get(Calendar.YEAR) - 1900;
        mm = cal.get(Calendar.MONTH);
        dd = cal.get(Calendar.DAY_OF_MONTH);

        dts.setFechaEntrada(new Date(mm, aa, dd));
        int idfact = fn.insertarFacturas(dts);
        //sepuede limpiar p21 min16

        if (idfact > 0) {
            int filas = tblFacturas.getRowCount();
            for (int i = 0; i < filas; i++) {
                String idprod = tblFacturas.getValueAt(i, 0).toString();
                String descrip = tblFacturas.getValueAt(i, 1).toString();
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i, 2).toString());
                String umedidad = tblFacturas.getValueAt(i, 3).toString();
                double punitario = Double.parseDouble(tblFacturas.getValueAt(i, 4).toString());
                double total = Double.parseDouble(tblFacturas.getValueAt(i, 5).toString());
                LDetalleFacturas fundf = new LDetalleFacturas();
                DDetalleFacturas dtsf = new DDetalleFacturas();
                dtsf.setFacturasId(idfact);
                dtsf.setProductosId(idprod);
                dtsf.setCantidad(cantidad);
                dtsf.setTotal(total);

                String mensaje = fundf.registrarDetalleFactura(dtsf);
                if (mensaje.equals("si")) {
                    LAlmacen funAl = new LAlmacen();
                    DAlmacen dtsp = new DAlmacen();

                    dtsp.setIdAlmacen(idprod);
                    dtsp.setDescripcion(descrip);
                    dtsp.setStock(cantidad);
                    dtsp.setUMedida(umedidad);
                    dtsp.setPUnitario(punitario);
                    dtsp.setLineasId(idlineas);

                    msgfinal = funAl.insertarProductos(dtsp);

                }

            }
            JOptionPane.showMessageDialog(rootPane, msgfinal, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                txtLinea.setText("");
                idlineas =0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "ocurrio un problema al insertar", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
      
        limpiar();
        habilitar(true);

    }//GEN-LAST:event_btnGuardarActionPerformed
    public void limpiar() {
        
        txtLinea.setText("m");
        txtEnter.setText("");
        txtFecha.setDate(null);
        txtProveedor.setText("m");
        
        txtIdLineas.setText("");
        txtIdProveedores.setText("");
        txtTotal.setText("");
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
            int filas = tblFacturas.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
      
  

    }

    public boolean estaenTabla(String texto) {
        boolean res = false;
        DecimalFormat ft = new DecimalFormat("###.00");
        for (int i = 0; i < tblFacturas.getRowCount(); i++) {
            String codigo = tblFacturas.getValueAt(i, 0).toString();
            if (codigo.equals(texto)) {
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i, 2).toString());
                double preciounitario = Double.parseDouble(tblFacturas.getValueAt(i, 4).toString());
                int totalcantidad = cantidad + 1;
                tblFacturas.setValueAt(totalcantidad, i, 2);

                double totalparcial = totalcantidad * preciounitario;
                tblFacturas.setValueAt(ft.format(totalparcial), i, 5);
                res = true;
            }
        }
        sumarTotal();
        return res;
    }

    public void sumarTotal() {
        DecimalFormat ft = new DecimalFormat("###.00");
        double totalparcial = 0, totalfinal = 0;
        for (int i = 0; i < tblFacturas.getRowCount(); i++) {
            totalparcial = Double.parseDouble(tblFacturas.getValueAt(i, 5).toString());
            totalfinal += totalparcial;
            txtTotal.setText(ft.format(totalfinal));

        }

    }
    private void txtEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean b = estaenTabla(txtEnter.getText());
            if (b == false) {
                mostrarProductos(txtEnter.getText());
            }
            sumarTotal();
            txtEnter.setText("");
        }

    }//GEN-LAST:event_txtEnterKeyPressed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
       habilitar(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblFacturasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFacturasKeyPressed
        // TODO add your handling code here:
        DecimalFormat ft = new DecimalFormat("####.00");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = 0; i < tblFacturas.getRowCount(); i++) {
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i, 2).toString());
                double preciounitario = Double.parseDouble(tblFacturas.getValueAt(i, 4).toString());

                double totalparcial = cantidad * preciounitario;
                tblFacturas.setValueAt(ft.format(totalparcial), i, 5);
            }
            sumarTotal();
    }//GEN-LAST:event_tblFacturasKeyPressed
    }
    private void txtLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineaActionPerformed
        //  your handling code here:

    }//GEN-LAST:event_txtLineaActionPerformed

    private void txtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterActionPerformed
    

    public void mostrarProductos(String producto) {
        LAlmacen fn = new LAlmacen();
        DAlmacen dts = new DAlmacen();
        DefaultTableModel tblDatos = (DefaultTableModel) tblFacturas.getModel();
        dts.setIdAlmacen(producto);
        String registros[] = fn.mostrarbuscarProductos(dts);
        if (registros[0] != null) {
            tblDatos.insertRow(0, registros);
            tblFacturas.setModel(tblDatos);
        } else {
            registros[0] = txtEnter.getText();
            registros[1] = "";
            registros[2] = "1";
            registros[3] = "";
            registros[4] = "0.00";
            registros[5] = "0.00";
            tblDatos.insertRow(0, registros);
            tblFacturas.setModel(tblDatos);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLinea;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtEnter;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtId;
    private static javax.swing.JTextField txtIdLineas;
    private static javax.swing.JTextField txtIdProveedores;
    private static javax.swing.JTextField txtLinea;
    private static javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
