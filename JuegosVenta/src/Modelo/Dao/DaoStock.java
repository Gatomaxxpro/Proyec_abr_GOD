package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoStock {
    
    Repositorio dao = new Repositorio();
    
    public boolean DaoStock(String c, int e){
        
        return dao.agregarStock(c, e);
    }
}
