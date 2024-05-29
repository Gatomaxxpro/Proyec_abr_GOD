
package Vista;
import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class ModificarProveedor {

private String nomProveedor;
    Scanner sc= new Scanner(System.in);
    Proveedor c;
    Controlador a = new Controlador();
            
    
    public void ModificarProveedor(){
        for (int i = 0; i==0;){
            
        try{
                limpiarPantalla();
            }catch(Exception e){}
        System.out.println("MODIFICAR PROVEEDOR");
        System.out.println("==========================================");
        System.out.println("Proveedores Existentes");
        a.mostrarListaP();
        System.out.println("==========================================");
        System.out.println("Escribe el nombre de el proveedor a modificar");
        nomProveedor=sc.next();
        System.out.println("Escribe el nuevo nombre");
        String nn = sc.next();
        System.out.println("==========================================");
        a.modificarProveedor(nomProveedor, nn);
        System.out.println("==========================================");
        System.out.println("Quiere modificar otro proveedor o regresar al menu anterior?");
        System.out.println("Presione 1 para regresar");
        System.out.println("Presione 0 para Modificar otro proveedor");
        i = sc.nextInt();
        }
        SeccionProveedor j = new SeccionProveedor();
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
    

