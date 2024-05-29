package Logica;

import Modelo.vo.*;
import Modelo.Dao.*;

public class LogicaStock {
    
    private DaoStock d = new DaoStock();
    
    public boolean LogicaStock(String c, int e){

        if(e<0||e>500){
            return false;
            
        }else{
            if(e>0 && e<500)
                return d.DaoStock(c, e);
        } 
    return false;   
    }
    
}
