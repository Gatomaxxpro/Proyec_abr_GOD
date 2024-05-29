package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoAgregarProveedor {
    
    private Repositorio a = new Repositorio();
    
    public boolean AgregarProv(String b ){
        return a.listaProveedor(b);
    }
    
}
