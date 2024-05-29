
package Vista;

import java.io.IOException;
import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;

public class NuevoJuego {
    Scanner scanner = new Scanner(System.in);
    //private Compras x;
    
    public void NuevoJuego(){
        for(int i=0; i==0;){
            try{
                limpiarPantalla();
            }catch(Exception e){}
            System.out.println("Ha seleccionado: Comprar Videojuego");
            System.out.println("=====================================");
            System.out.println("Escriba el nombre del juego: ");
            String nomJ= scanner.next();
            System.out.println("Escriba el Stock del juego: ");
            int stockJ= scanner.nextInt();
            System.out.println("Escriba el Precio del juego: ");
            double pJ= scanner.nextDouble();
            System.out.println("Escriba el Proveedor del juego: ");
            String nomP= scanner.next();
            System.out.println("=====================================");
            Proveedor random = new Proveedor(nomP); 
            Compra n = new Compra(nomJ, random, stockJ, pJ);
            Controlador l = new Controlador();
            l.ControladorCompra(n);
            System.out.println("=====================================");
            System.out.println("Seleccione 0 para registrar un nuevo");
            System.out.println("Seleccione 1 para salir");
            i=scanner.nextInt();
           // x.Compras();
        }
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
