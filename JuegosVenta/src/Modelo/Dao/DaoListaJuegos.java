package Modelo.Dao;

import Repositorio.*;
import Modelo.vo.*;

public class DaoListaJuegos {
    private Repositorio s = new Repositorio();
    
    public void ListaJuegos(String a){
        s.RepositorioLista(a);
    }
}
