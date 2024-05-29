package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaVenta {
    
    private DaoVenta d = new DaoVenta();
    
    public boolean venta(String e, int r){
        if(r <= 0 || r > 5){
            return false;
        }else{
            return d.Venta(e, r);
        }
        
        
    }
}
