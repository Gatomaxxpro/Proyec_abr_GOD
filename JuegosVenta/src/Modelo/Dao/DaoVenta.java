package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoVenta {
    
    private Repositorio dao = new Repositorio();
    
    public boolean Venta(String e, int r){
        
        return dao.venta(e, r);
    }
    
}
