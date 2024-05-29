
package Modelo.vo;

public class Ventas {
    private Juegos juego;
    private double precioVenta;
    private double ganancia;
    private Proveedor p;
    public Ventas (){
        
    }
    public String getProveevor(){
        return p.getNombre();
    }
    public String getNombre(){
        return juego.getNombre();
    }
    
    public double getprecioVenta(){
        return juego.getPrecios();
    }
    
    public int getStock(){
        return juego.getStock();
    }
    public void setStock(int a){
        juego.setStockVenta(a);
    }
}
