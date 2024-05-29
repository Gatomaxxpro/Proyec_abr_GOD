
package Modelo.vo;


public class Juegos {
    private Proveedor nomP;
    private String nombre;
    private Compra juego;
    private int Stock = 0;
    private double precios = 0;

    public Juegos() {
    }
    
    
    public Juegos(Compra j){
        juego = j;
        Stock = Stock + j.getStock();
        precios = juego.getPrecio() +(juego.getPrecio()* 0.30);
        nombre = juego.getNombre();
        nomP= j.getNombreProveedor();
    }

    public String getNombreP() {
        return nomP.getNombre();
    }
    
    public Proveedor getNomP() {
        return nomP;
    }

    
    public void setNomP(String nomP) {
        this.nomP.setNombre(nomP);
    }

    public Compra getJuego() {
        return juego;
    }

    public void setJuego(Compra juego) {
        this.juego = juego;
    }
    
    public String getNombre (){
        return nombre;
    }
    public void setNombre(String a){
        nombre = a;
    }
    
    public int getStock(){
        return Stock;       
    }
    
    public void setStock(int a){
        
        Stock = a;
    }
    
    public void stockCompra(int a){
        
        Stock = Stock + a;
    }
    
    public void setStockVenta(int a){
        
        Stock = Stock - a;
     
    }
    
    public double getPrecios(){
        return precios;        
    }
    
    public void setPrecios(double a){
        precios = a+(a*.30);
        
    }
    


    @Override
    public String toString() {
        return "Datos del juego: " + "Nombre de proveedor= " + nomP + ", nombre= " + nombre + ", Stock= " + Stock + ", precios= " + precios ;
    }

    
}
