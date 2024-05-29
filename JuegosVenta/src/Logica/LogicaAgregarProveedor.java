package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaAgregarProveedor {
    
    private DaoAgregarProveedor a = new DaoAgregarProveedor();
    
    public boolean AgregarProv(String b ){
        return a.AgregarProv(b);
    }
}
