package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaEliminarProv {
    
    private DaoEliminarP a = new DaoEliminarP();
    
    public boolean EliminarP(String r){
        return a.EliminarProv(r);
    }
}
