package Vista;

import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class Compras {
    
    Scanner scanner = new Scanner(System.in);
    private NuevoJuego a = new NuevoJuego();
    private RellenarJuego b = new RellenarJuego();
    
    public void Compras(){
        
        int opcion;

        do {
            try{
                limpiarPantalla();
            }catch(Exception e){}
            Controlador o = new Controlador();
            o.mostrarCompra();
            System.out.println("==========================================");
            System.out.println("Seleccione la opción deseada:");
            System.out.println("==========================================");
            System.out.println("1. Comprar Videojuego");
            System.out.println("2. Renovar Stock de juego ya existente");
            System.out.println("3. Regresar al menú");
            System.out.println("==========================================");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                     a.NuevoJuego();
                    
                    break;
                case 2:
                    b.RenovarStock();
                    break;
                case 3:
                    System.out.println("Regresando al menú principal.");
                    Relaciones y = new Relaciones();
                    y.menuAdmin();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }


        } while (opcion != 0);

        scanner.close();
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
