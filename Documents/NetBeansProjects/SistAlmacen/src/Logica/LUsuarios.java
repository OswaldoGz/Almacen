
package Logica;

import Datos.DUsuarios;
import com.mysql.jdbc.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.crypto.ExemptionMechanismException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oswaldo
 */
public class LUsuarios {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarUsuarios(DUsuarios misUsuarios){
    DefaultTableModel miModelo = null;
    try {
        String titulos [] = {"Id","Nombre","Usuario","Clave","Perfil",};
        String dts [] =  new String [5];
        miModelo = new DefaultTableModel(null, titulos);
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{ call sp_mostrarbuscar_usuarios(?)}");
        cst.setString(1, misUsuarios.getUsuario());
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
        dts [0] = rs.getString("IdUsuarios");
        dts [1] = rs.getString("Nombre");
        dts [2] = rs.getString("Usuario");
        dts [3] = rs.getString("Clave");
        dts [4] = rs.getString("Perfil");
        miModelo.addRow(dts);
        }
        
    }  catch  (Exception ex ){
    
    
    }
    
    return miModelo;
    
    }
    public String insertarUsuarios(DUsuarios misUsuarios){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_insertar_usuarios(?,?,?,?)}");
        cst.setString(1, misUsuarios.getNombre());
        cst.setString(2, misUsuarios.getUsuario());
        cst.setString(3, misUsuarios.getClave());
        cst.setString(4, misUsuarios.getPerfil());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
        
    public String editarUsuarios(DUsuarios misUsuarios){
    String msg = null;
    try{
        CallableStatement cst = (CallableStatement) cn.prepareCall("{call sp_editar_usuarios(?,?,?,?,?)}");
        cst.setInt(1, misUsuarios.getIdUsuario());
        cst.setString(2, misUsuarios.getNombre());
        cst.setString(3, misUsuarios.getUsuario());
        cst.setString(4, misUsuarios.getClave());
        cst.setString(5, misUsuarios.getPerfil());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    public String eliminarUsuarios(DUsuarios misUsuarios){
    String msg = null;
    try{
        CallableStatement cst =  (CallableStatement) cn.prepareCall("{call sp_eliminar_usuarios(?)}");
        cst.setInt(1, misUsuarios.getIdUsuario());
        cst.executeUpdate();
        msg = "si";
    
    
    }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    
    return msg;
    }
    
}
