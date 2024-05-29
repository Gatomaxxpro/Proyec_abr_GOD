
package Modelo.Dao;
import Repositorio.*;
import Modelo.vo.*;
public class DaoComprobarP {
    private Repositorio p = new Repositorio();
    
    public boolean comprobarProveedor(String a){
        return p.ComprobarP(a);
    }
}
