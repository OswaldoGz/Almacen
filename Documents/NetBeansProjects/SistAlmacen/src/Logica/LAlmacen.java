/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DAlmacen;

import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.table.DefaultTableModel;
import presentacion.FrmFacturas;

/**
 *
 * @author Oswaldo
 */
public class LAlmacen {
     Connection cn = LConexion.getConnection();
         public DefaultTableModel mostrarInventario(DAlmacen miProducto){
    DefaultTableModel miModelo = null;
    try {
        String titulos [] = {"CODIGO","DESCRIPCION","STOCK","U/MEDIDA","P/UNITARIO","TOTAL","LINEA"};
        String dts [] =  new String [7];
        miModelo = new DefaultTableModel(null, titulos);
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{ call sp_mostrar_inventario(?)}");
        cst.setString(1, miProducto.getIdAlmacen());
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
        dts [0] = rs.getString("a.IdAlmacen");
        dts [1] = rs.getString("a.Descripcion");
        dts [2] = rs.getString("a.Stock");
        dts [3] = rs.getString("a.UMedida");
        dts [4] = rs.getString("a.PUnitario");
        dts [5] = rs.getString("Total");
        dts [6] = rs.getString("l.Nombre");

        miModelo.addRow(dts);
        }
        
    }  catch  (Exception ex ){
    
    
    }
    
    return miModelo;
    
    }
    
    public String[] mostrarbuscarProductos(DAlmacen misProductos){
            String dts [] = null;
    try{
        dts = new String[6]; 
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_mostrarbuscar_productos(?)}");
        cst.setString(1, misProductos.getIdAlmacen());
        
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
        dts [0] = rs.getString("IdAlmacen");
        dts [1] = rs.getString("Descripcion");
        dts [2] = "1";
        dts [3] = rs.getString("UMedida");        
        dts [4] = rs.getString("PUnitario");
        dts [5] = rs.getString("PUnitario");
        

        }
    
    
    }catch(Exception ex){
        ex.printStackTrace();

    }
    
    return dts;
    }
    
}
