package Vista;

import java.io.IOException;
import java.util.Scanner;
import Controlador.*;
import Modelo.vo.*;

public class RellenarJuego {
    
    Scanner scanner = new Scanner(System.in);
    
    //private Compras Regreso =new Compras();
    private Controlador a = new Controlador();
    
    public void RenovarStock(){
        try{
            limpiarPantalla();
        }catch(Exception e){}
        System.out.println("Ha seleccionado: Renovar Stock de juego ya existente");
        System.out.println("=====================================");
        a.mostrarCompra();
        System.out.println("=====================================");
        System.out.println("Escribe el nombre del juego a renovar");
        String yo= scanner.next();
        System.out.println("=====================================");
        System.out.println("Escribe la cantidad a rellenar");
        int yo2= scanner.nextInt();
        Controlador e = new Controlador();
        e.ControladorStock(yo, yo2);
        
        //Regreso.Compras();
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
