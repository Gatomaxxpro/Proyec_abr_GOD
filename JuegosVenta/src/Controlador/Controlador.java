package Controlador;
import Logica.*;
import Modelo.vo.*;
public class Controlador {
    
    
    private LogicaMostrarProveedor c = new LogicaMostrarProveedor();
    private LogicaComprobarP p = new LogicaComprobarP();
    private LogicaListajuegos b = new LogicaListajuegos();
    private LogicaAgregarProveedor xd = new LogicaAgregarProveedor();
    private LogicaModificarProveedor z = new LogicaModificarProveedor();
    private LogicaEliminarProv n = new LogicaEliminarProv();
    private LogicaCompra l = new LogicaCompra();
    private LogicaStock j = new LogicaStock();
    private LogicaMostrarCompra d = new LogicaMostrarCompra();
    private LogicaVenta v = new LogicaVenta();
    
    
    public boolean ControladorCompra(Compra c){

        return l.LogicaCompra(c);
    }
    
    public boolean ControladorStock(String c, int e){

        return j.LogicaStock(c, e);
    }
    
    public void mostrarCompra(){
        d.mostrarCompra();
    }
    public void mostrarLista(String o){
        b.ListaJuegos(o);
        
    }
    public boolean Venta(String e, int r){

        return v.venta(e, r);
    }
    
    public void mostrarListaP(){
        c.mostrarListaP();
    }
    
    public boolean comprobarProveedor(String a){
        return p.comprobarProveedor(a);
    }
    
    public boolean AgregarProv(String b ){
        return xd.AgregarProv(b);
    }
    
    public boolean modificarProveedor(String a, String b){
        return z.modificarProveedor(a, b);
    }
    
    public  boolean EliminarPr(String r){
        return n.EliminarP(r);
    }
    
    /*public boolean restaStockN(String e, int o){

        return a.RestaStockN(e, o);
    }
    public boolean restaStockM(String e, int o){

        return a.RestaStockM(e, o);
    }
    public boolean restaStockS(String e, int o){

        return a.RestaStockS(e, o);
    }*/
}
