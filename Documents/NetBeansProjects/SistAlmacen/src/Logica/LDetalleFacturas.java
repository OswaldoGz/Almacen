/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DDetalleFacturas;
import Datos.DLineas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.concurrent.Callable;


/**
 *
 * @author Oswaldo
 */
public class LDetalleFacturas {
    Connection cn = LConexion.getConnection();
    public String registrarDetalleFactura(DDetalleFacturas miDetalle){
    String msg = null;
    try{
        CallableStatement cst = cn.prepareCall("{ call sp_insertar_detallefacturas(?,?,?,?)}");
        cst.setInt(1,miDetalle.getFacturasId());
        cst.setString(2,miDetalle.getProductosId());
        cst.setInt(3,miDetalle.getCantidad());
        cst.setDouble(4,miDetalle.getTotal());
        cst.executeUpdate();
        msg = "si";
    }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
    
    
    }
    
     return msg;
    
    
    } 

}
