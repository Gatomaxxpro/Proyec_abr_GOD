package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaListajuegos {
    private DaoListaJuegos s = new DaoListaJuegos();
    
    public void ListaJuegos (String a){
        s.ListaJuegos(a);
    }
}
