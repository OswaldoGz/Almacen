
package Datos;


public class DUsuarios {
       int idUsuario ;
    String Nombre;
    String Usuario;
    String Clave;
    String Perfil;
    
    public DUsuarios(){
    
    
    }

    public DUsuarios(int idUsuario, String Nombre, String Usuario, String Clave, String Perfil) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Perfil = Perfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

 
}
