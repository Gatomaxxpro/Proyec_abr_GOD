package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaCompra {
    
    private DaoCompra d = new DaoCompra();
    
    public boolean LogicaCompra(Compra c){
        
        if(c.getPrecio()<=0 || c.getPrecio()>=2600){
        return false;
        }else{
            if(c.getStock()>0){
                return d.DaoCompra(c);
            }
        }
        
        return d.DaoCompra(c);
    }
}
