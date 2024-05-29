package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoModificarP {
    
    private Repositorio a = new Repositorio();
    private boolean b;
    
    public boolean modificarProveedor(String c, String q){
        b = a.ModificarProveedor(c, q);
        return b;
    }
    
}
