package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoEliminarP {
    private Repositorio a = new Repositorio();
    
    public boolean EliminarProv(String r){
        return a.EliminarProveedor(r);
    }
}
