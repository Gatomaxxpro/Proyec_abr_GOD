package Vista;

import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;
import java.io.IOException;

public class Venta {
    
    public void Venta(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Controlador p=new Controlador();
        do {
            try{
                limpiarPantalla();
            }catch(Exception e){}
            Controlador o = new Controlador();
            o.mostrarCompra();
            System.out.println("==========================================");
            System.out.println("Seleccione la opción deseada:");
            System.out.println("==========================================");
            System.out.println("1. Seleccione el proveedor del juego");
            System.out.println("2. Regresar al menú");
            System.out.println("==========================================");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for(int i=0; i==0;){
                        try{
                            limpiarPantalla();
                        }catch(Exception e){}
                        int go;
                        int pato;
                        
                        
                        System.out.println("Seleccione nombre del proveedor del juego");
                        System.out.println("=====================================");
                        p.mostrarListaP();
                        System.out.println("=====================================");
                        String r = scanner.next();
                        if(p.comprobarProveedor(r)){
                            System.out.println("Lista de " + r);
                            System.out.println("=====================================");
                        p.mostrarLista(r);
                        System.out.println("=====================================");
                                
                            for(int u=0;u==0;){
                        
                            p.Venta(nombreJuego(), stockJuego());
                            System.out.println("Seleccione 0 para comprar de nuevo");
                            System.out.println("Seleccione 1 para salir");
                            u=scanner.nextInt();
                            i=u;
                            }
                       }else{
                            System.out.println("NO EXISTE PROVEEDOR");
                        }
                   }
                    
                    
                    break;
                case 2:
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
    
    public int stockJuego(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el Stock del juego: ");
        int stockJ= scanner.nextInt(); 
        return stockJ;
    }
    
    public String nombreJuego(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el Nombre del juego: ");
        String nomj= scanner.next(); 
        return nomj;
    }
}
