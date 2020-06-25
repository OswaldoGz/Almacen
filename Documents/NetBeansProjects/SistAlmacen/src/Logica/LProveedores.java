/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DProveedores;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oswaldo
 */
public class LProveedores {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarProveedores(DProveedores misProveedores){
    DefaultTableModel miModelo = null;
    try {
        String titulos [] = {"Id","Nombre","Telefono","Domicilio"};
        String dts [] =  new String [5];
        miModelo = new DefaultTableModel(null, titulos);
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{ call sp_mostrarbuscar_proveedores(?)}");
        cst.setString(1, misProveedores.getNombre());
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
        dts [0] = rs.getString(1);
        dts [1] = rs.getString(2);
        dts [2] = rs.getString(3);
        dts [3] = rs.getString(4);
        miModelo.addRow(dts);
        }
        
    }  catch  (Exception ex ){
    
    
    }
    
    return miModelo;
    
    }
    public String insertarProveedores(DProveedores misProveedores){
    String msg = null;
    try{
        CallableStatement cst = (CallableStatement) cn.prepareCall("{call sp_insertar_proveedores(?,?,?)}");
        cst.setString(1, misProveedores.getNombre());
        cst.setString(2, misProveedores.getTelefono());
        cst.setString(3, misProveedores.getDomicilio());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
        
    public String editarProveedores(DProveedores misProveedores){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_editar_proveedores(?,?,?,?)}");
        cst.setInt(1, misProveedores.getId());
        cst.setString(2, misProveedores.getNombre());
        cst.setString(3, misProveedores.getTelefono());
        cst.setString(4, misProveedores.getDomicilio());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    
    public String eliminarProveedores(DProveedores misProveedores){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_eliminar_proveedores(?)}");
        cst.setInt(1, misProveedores.getId());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    
    
}
