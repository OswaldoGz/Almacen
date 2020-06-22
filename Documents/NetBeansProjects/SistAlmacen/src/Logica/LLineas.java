/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DLineas;
import Datos.DUsuarios;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oswaldo
 */
public class LLineas {   
    
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarLineas(DLineas misLineas){
    DefaultTableModel miModelo = null;
    try {
        String titulos [] = {"Id","Linea"};
        String dts [] =  new String [5];
        miModelo = new DefaultTableModel(null, titulos);
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{ call sp_mostrarbuscar_lineas(?)}");
        cst.setString(1, misLineas.getLinea());
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
        dts [0] = rs.getString("IdLineas");
        dts [1] = rs.getString("Nombre");

        miModelo.addRow(dts);
        }
        
    }  catch  (Exception ex ){
    
    
    }
    
    return miModelo;
    
    }
    public String insertarLineas(DLineas misLineas){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_insertar_lineas(?)}");
        cst.setString(1, misLineas.getLinea());

        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
        
    public String editarLineas(DLineas misLineas){
    String msg = null;
    try{
        CallableStatement cst = (CallableStatement) cn.prepareCall("{call sp_editar_lineas(?,?)}");
        cst.setInt(1, misLineas.getId());
        cst.setString(2, misLineas.getLinea());

        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    public String eliminarLineas(DLineas misLineas){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_eliminar_lineas(?)}");
        cst.setInt(1, misLineas.getId());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    
}
