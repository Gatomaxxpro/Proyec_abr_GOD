
package Modelo.vo;

public class Proveedor {
    private String nombre;
    
    public Proveedor(){
        
    }
    
    public Proveedor(String n){
        nombre = n;
    } 
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
