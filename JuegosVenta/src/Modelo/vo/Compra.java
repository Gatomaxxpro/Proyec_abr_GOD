package Modelo.vo;

public class Compra {
    private String nombre;    
    private Proveedor proveedor;
    private int cantidad;
    private double precio;

    public Compra() {
        
    }
    
    
    
    public Compra(String n, Proveedor p, int c, double d ){
        nombre = n;
        proveedor = p;
        cantidad = c;
        precio = d;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre = n;
    }
    
    public Proveedor getNombreProveedor(){
        return proveedor;
    }
    
    public String getProveedor(){
        return proveedor.getNombre();
    }
    public void setProveedor(Proveedor p){
        proveedor = p;
    }
    
    public int getStock(){
        return cantidad;
    }
    public void setStock(int c){
        cantidad=c;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(int a){
        precio = a;
    }
    
    public void setNuevoStock(int z){
        cantidad=cantidad+z;
    }
    
    public void setMenosStock(int z){
        cantidad=cantidad-z;
    }
    @Override
    public String toString() {
        return "Compra{" + "nombre=" + nombre + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
}
