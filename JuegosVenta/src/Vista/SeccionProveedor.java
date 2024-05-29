package Vista;

import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class SeccionProveedor {
    
    AgregarProveedor a = new AgregarProveedor();
    ModificarProveedor b = new ModificarProveedor();
    EliminarProveedor c = new EliminarProveedor();
    String op;
    Controlador t = new Controlador();
    Relaciones u = new Relaciones();
    Scanner sc = new Scanner(System.in);
    
    public void SeccionProveedorV(){
        try{
        limpiarPantalla();
        }catch(Exception e){}
        for(int i=0 ; i==0;){
            System.out.println("Seccion proveedores");
            System.out.println("=====================================");
            System.out.println("Proveedores actuales: ");
            t.mostrarListaP();
            System.out.println("=====================================");
            System.out.println("1.- Agregar nuevo Proveedor ");
            System.out.println("2.- Modificar Proveedor");
            System.out.println("3.- Eliminar Proveedor");
            System.out.println("4.- Salir");
            System.out.println("=====================================");
            op=sc.nextLine();
        
            switch(op){
                case "1":
                    a.AgregarProveedor();
                    break;
                case "2":
                    b.ModificarProveedor();
                    break;
                case "3":
                    c.EliminarProveedor();
                    break;
                case "4":
                    u.menuAdmin();
                    break;
                default:
                    System.out.println("Opcion no existente");
                    break;
            }
        }
    }
    
    private void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd"+"/c"+"cls");
        pb.inheritIO().start().waitFor();
    }
}
