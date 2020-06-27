/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DFacturas;
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
public class LFacturas {
    Connection cn = LConexion.getConnection();
    
    public String insertarFacturas(DFacturas misFacturas){
    String msg = null;
    FrmFacturas miFrmFactura= new FrmFacturas();
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_insertar_facturas(?,?,?,?)}");
        cst.setInt(1, misFacturas.getLineasId());
        cst.setInt(2, misFacturas.getProveedoresId());
        cst.setDate(3, misFacturas.getFechaEntrada());
        cst.registerOutParameter(4, Types.INTEGER);
       
        cst.executeUpdate();
        int idres = cst.getInt(4);
        miFrmFactura.retornaId(idres);
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    
    
}
