package Repositorio;
import java.util.ArrayList;
import java.util.List;
import Modelo.vo.*;
public class Repositorio {
    private static List<Proveedor> listaP = new ArrayList<>();
    private static List<Compra> compra = new ArrayList<>();
    private static List<Juegos> listaJuegos = new ArrayList<>();
    
    public Repositorio(){
        
    }
    public boolean ComprobarP(String a){
        Proveedor y = new Proveedor(a);
        for(Proveedor q : listaP){
            if(a.trim().equals(q.getNombre().trim())){
                return true;
            }
        }
        return false;
    }
    
    public boolean listaProveedor(String a){
        int posicion = listaP.indexOf(a);
        Proveedor prov = new Proveedor(a);
        if(posicion < 0){
            listaP.add(prov);
            listaP.forEach(System.out:: println);
            return true;
        }
        return false;
    }
    
    public void mostrarP(){
        for(Proveedor j : listaP){
            System.out.println(j);
        }
        //listaP.forEach(System.out:: println);
    }
    
    public boolean ListaJuegos(Compra s){
        Juegos m = new Juegos( s);
        
        int posicion = listaJuegos.indexOf(m);
        if(posicion < 0){
            listaJuegos.add(m);
            listaJuegos.forEach(System.out:: println);
            return true;
        }
        return false;
    }
    
    public boolean RepositorioLista(String a){  
                for (Juegos j : listaJuegos) {                
                    if (a.trim().equals(j.getNombreP().trim())) {
                        System.out.println(j.toString());
                    }
                }
            return true;
        }
        
    
    
    public boolean RepositorioCompra(Compra a){
        int posicion = compra.indexOf(a);
        for(Proveedor s : listaP){
            if (a.getProveedor().trim().equals(s.getNombre().trim())){
                if(posicion < 0){
                compra.add(a);
                compra.forEach(System.out:: println);
                ListaJuegos(a);
                return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean agregarStock(String nom, int Cant){
        for(Compra z : compra){
            if(nom.trim().equals(z.getNombre().trim())){
                int posicion = compra.indexOf(z);
                z.setNuevoStock(Cant);
                compra.set(posicion, z);
                System.out.println("Compra actualizada: " + z);
                agregarStockLista(nom, Cant);
                
                return true;
                
            }
        }
        System.out.println("Compra no encontrada para: " + nom);
        return false;
                
    }
    public boolean agregarStockLista(String nom, int Cant){
        for(Juegos z: listaJuegos){
            if(nom.trim().equals(z.getNombre().trim())){
                int posicion = listaJuegos.indexOf(z);
                z.stockCompra(Cant);
                listaJuegos.set(posicion, z);
                System.out.println("Compra actualizada: " + z);
                return true;
                
            }
        }
        
        return false;
                
    }
    
    public void mostrarCompra(){
        compra.forEach(System.out::println);
    }
    
    public boolean venta(String e, int r){
        for(Compra z : compra){
            if(e.trim().equals(z.getNombre().trim())){
                int posicion = compra.indexOf(z);
                z.setMenosStock(r);
                compra.set(posicion, z);
                System.out.println("Venta actualizada: " + z);
                restarStockLista(e,r);
                return true;
                
            }
        }
        return false;
    }
    
    public boolean restarStockLista(String nom, int Cant){
        for(Juegos z: listaJuegos){
            if(nom.trim().equals(z.getNombre().trim())){
                int posicion = listaJuegos.indexOf(z);
                z.setStockVenta(Cant);
                listaJuegos.set(posicion, z);
                System.out.println("Compra actualizada: " + z);
                return true;
                
            }
        }
        
        return false;
                
    }
    
    public boolean ModificarProveedor(String a, String p){
        for(Proveedor z : listaP){
            if(a.trim().equals(z.getNombre().trim())){
                int posicion = listaP.indexOf(z);
                z.setNombre(p);
                listaP.set(posicion, z);
                System.out.println("Proveedor actualizado: " + z);
                ModificarProveedorCompra(a, p);
                ModificarProveedorLista(a, p);
                return true;
                
            }
        }
        System.out.println("No existe el proveedor: " + a );
        return false;
    }
    
    public boolean ModificarProveedorCompra(String a, String p){
        for(Compra z : compra){
            if(a.trim().equals(z.getProveedor().trim())){
                int posicion = compra.indexOf(z);
                Proveedor j = new Proveedor(p);
                z.setProveedor(j);
                compra.set(posicion, z);
                return true;
            }
        }
        return false;
    }
    
    public boolean ModificarProveedorLista(String a, String p){
        for(Juegos z : listaJuegos){
            if(a.equals(z.getNomP())){
                int posicion = compra.indexOf(z);
                Proveedor j = new Proveedor(p);
                z.setNomP(a);
                listaJuegos.set(posicion, z);       
                return true;        
            }
        }
        return false;
    }
    
    public boolean EliminarProveedor(String r){
        int posicion = -1;
        for(Proveedor proveedor: listaP ){
            if(r.trim().equals(proveedor.getNombre().trim())){
                posicion = listaP.indexOf(proveedor);
                break;
            }
        }
        if(posicion > -1){
            listaP.remove(posicion);
            System.out.println("ELIMINACION EXITOSA");
            return true;
        }
        System.out.println("ELIMINACION FALLIDA");
        return false;
    }
}
