package Vista;

import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class EliminarProveedor {
    
    Controlador a = new Controlador();
    String nomProveedor;
    
    Scanner sc = new Scanner(System.in);
    
    public void EliminarProveedor(){
        for (int i = 0; i==0;){
            
        try{
                limpiarPantalla();
            }catch(Exception e){}
        System.out.println("ELIMINAR PROVEEDOR");
        System.out.println("==========================================");
        System.out.println("Proveedores Existentes");
        a.mostrarListaP();
        System.out.println("==========================================");
        System.out.println("Escribe el nombre de el proveedor a eliminar");
        nomProveedor=sc.next();
        //Proveedor nomProveedor = new Proveedor(this.nomProveedor);
        System.out.println("==========================================");
        a.EliminarPr(nomProveedor);
        System.out.println("==========================================");
        System.out.println("Quiere Eliminar otro proveedor o regresar al menu anterior?");
        System.out.println("Presione 1 para regresar");
        System.out.println("Presione 0 para Eliminar otro proveedor");
        i = sc.nextInt();
        }
        SeccionProveedor j = new SeccionProveedor();
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
    

