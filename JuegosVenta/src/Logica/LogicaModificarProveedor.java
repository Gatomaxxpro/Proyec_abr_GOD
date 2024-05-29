package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaModificarProveedor {
    
    private DaoModificarP a = new DaoModificarP();
    private boolean b;
    
    public boolean modificarProveedor(String c, String d){
        b = a.modificarProveedor(c, d);
        return b;
    }
}
