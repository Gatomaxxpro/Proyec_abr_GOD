package Vista;

import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class AgregarProveedor {
    
    private String nomProveedor;
    Scanner sc= new Scanner(System.in);
    Proveedor c = new Proveedor();
    Controlador a = new Controlador();
            
    
    public void AgregarProveedor(){
        for (int i = 0; i==0;){
            
        try{
                limpiarPantalla();
            }catch(Exception e){}
        System.out.println("NUEVO PROVEEDOR");
        System.out.println("==========================================");
        System.out.println("Escribe el nombre de el proveedor a agregar");
        nomProveedor=sc.next();
        //c.setNombre(nomProveedor);
        System.out.println("==========================================");
        a.AgregarProv(nomProveedor);
        System.out.println("==========================================");
        System.out.println("Quiere agregar otro proveedor o regresar al menu anterior?");
        System.out.println("Presione 1 para regresar");
        System.out.println("Presione 0 para Agregar otro proveedor");
        i=sc.nextInt();
        }
        SeccionProveedor j = new SeccionProveedor();
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
