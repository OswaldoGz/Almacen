/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Oswaldo
 */
public class MDIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MDIPrincipal
     */
    public MDIPrincipal() {
      
        
        initComponents();
        
        ImageIcon icFacturas = new ImageIcon(getClass().getResource("/Imagenes/Facturasicono.png"));
        Icon iconoFac = new ImageIcon(icFacturas.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        btnFacturas.setIcon(iconoFac);
        
          ImageIcon icRecibos = new ImageIcon(getClass().getResource("/Imagenes/Reciboicono.png"));
        Icon iconoRec = new ImageIcon(icRecibos.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        btnRecibos.setIcon(iconoRec);
        
          ImageIcon icAlmacen = new ImageIcon(getClass().getResource("/Imagenes/IconoAlmacen.png"));
        Icon iconoAlm = new ImageIcon(icAlmacen.getImage().getScaledInstance(40,60, Image.SCALE_DEFAULT));
        btnAlmacen.setIcon(iconoAlm);
        
        ImageIcon mConsultas = new ImageIcon(getClass().getResource("/Imagenes/BusquedaIcono.png"));
        Icon icConsultas = new ImageIcon(mConsultas.getImage().getScaledInstance(32,32, Image.SCALE_DEFAULT));
        menuConsultas.setIcon(icConsultas);
        
        ImageIcon imenuDB = new ImageIcon(getClass().getResource("/Imagenes/DBMenu.png"));
        Icon icDb = new ImageIcon(imenuDB.getImage().getScaledInstance(32,32, Image.SCALE_DEFAULT));
        menuDB.setIcon(icDb);
        
        ImageIcon imHerramientas = new ImageIcon(getClass().getResource("/Imagenes/opciones.png"));
        Icon icHerramientas = new ImageIcon(imHerramientas.getImage().getScaledInstance(32,32, Image.SCALE_DEFAULT));
        menuHerramientas.setIcon(icHerramientas);
        
        ImageIcon imitemUs = new ImageIcon(getClass().getResource("/Imagenes/usuarios.png"));
        Icon icUs = new ImageIcon(imitemUs.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemUsuarios.setIcon(icUs);
        
        ImageIcon ImInfo = new ImageIcon(getClass().getResource("/Imagenes/Info.png"));
        Icon icInfo = new ImageIcon(ImInfo.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemInfo.setIcon(icInfo);
        
        ImageIcon imItemDB = new ImageIcon(getClass().getResource("/Imagenes/respaldoyrestaurar.png"));
        Icon icItemDB = new ImageIcon(imItemDB.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemDB.setIcon(icItemDB);
        
        ImageIcon ImIReportes = new ImageIcon(getClass().getResource("/Imagenes/Facturasicono.png"));
        Icon icReportes = new ImageIcon(ImIReportes.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemReportes.setIcon(icReportes);
        
        ImageIcon ImDetFac = new ImageIcon(getClass().getResource("/Imagenes/Facturas.png"));
        Icon IcDetFac = new ImageIcon(ImDetFac.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemDFac.setIcon(IcDetFac);
        
        ImageIcon ImDetRec = new ImageIcon(getClass().getResource("/Imagenes/Reciboicono.png"));
        Icon IcDetRec = new ImageIcon(ImDetRec.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemDRec.setIcon(IcDetRec);
        
        ImageIcon ImLineas = new ImageIcon(getClass().getResource("/Imagenes/areas.png"));
        Icon IcLineas = new ImageIcon(ImLineas.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemLineas.setIcon(IcLineas);
        
        ImageIcon ImProvee = new ImageIcon(getClass().getResource("/Imagenes/areas.png"));
        Icon IcProve = new ImageIcon(ImProvee.getImage().getScaledInstance(26,26, Image.SCALE_DEFAULT));
        ItemProveedores.setIcon(IcProve);
        
        timer.start();
    }

    Timer  timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Calendar cal = new GregorianCalendar();
                int hh, mm, ss, dia, mes , aa;
             hh = cal.get(Calendar.HOUR_OF_DAY);
             ss = cal.get(Calendar.SECOND);
             mm = cal.get(Calendar.MINUTE);
             
             dia = cal.get(Calendar.DAY_OF_MONTH);
             mes = cal.get(Calendar.MONTH);
             aa = cal.get(Calendar.YEAR);
             
             lblHora.setText(hh+":"+mm+":"+ss);
             lblFecha.setText(dia+"/"+(mes+1)+"/"+aa);
             
            }       
            });
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        btnRecibos = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        ItemReportes = new javax.swing.JMenuItem();
        ItemDFac = new javax.swing.JMenuItem();
        ItemDRec = new javax.swing.JMenuItem();
        menuDB = new javax.swing.JMenu();
        ItemDB = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        ItemUsuarios = new javax.swing.JMenuItem();
        ItemInfo = new javax.swing.JMenuItem();
        ItemLineas = new javax.swing.JMenuItem();
        ItemProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnFacturas.setText("Facturas");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        btnRecibos.setText("Recibos");

        btnAlmacen.setText("Almacén");
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Hora");

        jLabel3.setText("Fecha");

        lblUsuario.setText("jLabel4");

        lblHora.setText("jLabel5");

        lblFecha.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(lblFecha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblUsuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHora)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFecha))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 540));

        dpnEscritorio.setMaximumSize(new java.awt.Dimension(500, 600));
        dpnEscritorio.setMinimumSize(new java.awt.Dimension(501, 600));
        dpnEscritorio.setPreferredSize(new java.awt.Dimension(500, 600));

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(dpnEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 950, 540));

        menuConsultas.setText("Consultas");

        ItemReportes.setText("Reporte");
        ItemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReportesActionPerformed(evt);
            }
        });
        menuConsultas.add(ItemReportes);

        ItemDFac.setText("Detalle de Facturas");
        menuConsultas.add(ItemDFac);

        ItemDRec.setText("Detalle de Recibos");
        menuConsultas.add(ItemDRec);

        jMenuBar2.add(menuConsultas);

        menuDB.setText("Base de datos");

        ItemDB.setText("Respaldar/Restaurar");
        menuDB.add(ItemDB);

        jMenuBar2.add(menuDB);

        menuHerramientas.setText("Herramientas");

        ItemUsuarios.setText("Usuarios");
        ItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuariosActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemUsuarios);

        ItemInfo.setText("Informacion");
        menuHerramientas.add(ItemInfo);

        ItemLineas.setText("Lineas");
        ItemLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLineasActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemLineas);

        ItemProveedores.setText("Proveedores");
        ItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProveedoresActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemProveedores);

        jMenuBar2.add(menuHerramientas);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
        FrmFacturas misFacturas = new FrmFacturas();
        dpnEscritorio.add(misFacturas);
        misFacturas.show();
        
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void ItemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemReportesActionPerformed

    private void ItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuariosActionPerformed
        FrmUsuarios misUsuarios =  new FrmUsuarios();
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_ItemUsuariosActionPerformed

    private void ItemLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLineasActionPerformed
        FrmLineas misLineas = new FrmLineas();
        dpnEscritorio.add(misLineas);
        misLineas.show();
        
    }//GEN-LAST:event_ItemLineasActionPerformed

    private void ItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProveedoresActionPerformed
        // TODO add your handling code here:
        FrmProveedores misProveedores = new FrmProveedores();
        dpnEscritorio.add(misProveedores);
        misProveedores.show();
    }//GEN-LAST:event_ItemProveedoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new MDIPrincipal().setVisible(true);
             
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemDB;
    private javax.swing.JMenuItem ItemDFac;
    private javax.swing.JMenuItem ItemDRec;
    private javax.swing.JMenuItem ItemInfo;
    private javax.swing.JMenuItem ItemLineas;
    private javax.swing.JMenuItem ItemProveedores;
    private javax.swing.JMenuItem ItemReportes;
    private javax.swing.JMenuItem ItemUsuarios;
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnRecibos;
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuDB;
    private javax.swing.JMenu menuHerramientas;
    // End of variables declaration//GEN-END:variables
}
