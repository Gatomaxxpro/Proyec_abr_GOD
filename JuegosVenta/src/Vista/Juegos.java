package Vista;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Controlador.*;

public class Juegos {
    public void JuegosV(){
        Scanner sc = new Scanner(System.in);
        String op;
        Controlador c = new Controlador();
        Relaciones u = new Relaciones();
        for(int j=0; j == 0;){
            try {
                limpiarPantalla();
            }catch(Exception e){}
        
            System.out.println("LISTA DE JUEGOS");
            System.out.println("=====================================");
            System.out.println("Escriba el nombre de alguno de los proveedores siguientes");
        
            for(int i=0;i == 0 ;){
                c.mostrarListaP();
                System.out.println("=====================================");
                
                String a = sc.next();
                if(c.comprobarProveedor(a)){
                    try {
                        limpiarPantalla();
                    }catch(Exception e){}
                    
                    System.out.println("Lista de juegos de " + a);
                    System.out.println("=====================================");
                    c.mostrarLista(a);
                    System.out.println("=====================================");
                } else{
                    System.out.println("El proveedor que escribio no existe");
                }
                System.out.println("presione 1 para regresar");
                System.out.println("presione 0 para mostrar otra lista");
                i= sc.nextInt();
            }
            u.menuAdmin();
            //mostrar juegos
            
            
            
        }
        
    
    }
    private void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd"+"/c"+"cls");
        pb.inheritIO().start().waitFor();
    }
}
