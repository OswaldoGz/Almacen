
package Datos;

/**
 *
 * @author Oswaldo
 */
public class DLineas {
    int Id;
    String Linea;
    
        public DLineas(){


    }
    
        public DLineas(int idl, String lineas){
            this.Id = idl;
            this.Linea = lineas;


    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }
    

    
}
