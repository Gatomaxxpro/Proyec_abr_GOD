
package Logica;
import Modelo.vo.*;
import Modelo.Dao.*;
public class LogicaComprobarP {
    private DaoComprobarP p = new DaoComprobarP();
    
    public boolean comprobarProveedor(String a){
        return p.comprobarProveedor(a);
    }
}
