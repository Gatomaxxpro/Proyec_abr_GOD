package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoCompra {
    
    private Repositorio a = new Repositorio();
    
    public boolean DaoCompra(Compra c){
        
        return a.RepositorioCompra(c);
    }
    
}
