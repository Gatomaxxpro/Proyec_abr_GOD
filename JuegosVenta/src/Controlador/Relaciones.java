package Controlador;

import java.io.IOException;
import java.util.Scanner;
import Vista.*;

public class Relaciones {
    
    public void Principal(){
        Scanner lee = new Scanner(System.in);
        char op = 'n';
        
        
        for(char i = op; i == op;){
            
        try{
        limpiarPantalla();
        }catch(Exception e){}
        System.out.println("██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗ ");
        System.out.println("██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗");
        System.out.println("██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║");
        System.out.println("██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║");
        System.out.println("██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝");
        System.out.println("╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝ ");
        System.out.println("                                                                             ");
        
        
        
        System.out.println("Bienvenid@, que tipo de usuario es?");
        System.out.println("=====================================");
        System.out.println("1.- Administrador");
        System.out.println("2.- Empleado");
        System.out.println("3.- Salir de la APP");
        System.out.println("=====================================");
        op=lee.next().charAt(0);
        
        switch(op){
            case'1':
                inicioAdmin();
                break;
            case '2':
                inicioEmpleado();
                break;
            case '3':
                System.out.println("Gracias por usar la APP!!");
                break;
            default:
                System.out.println("OPCION ERRONEA");
                String c = lee.next();
                break;
        }
        }
    }
    
    public  void inicioAdmin(){
        try{
        limpiarPantalla();
        }catch(Exception e){}
        char op;
        String usuario, clave;
        Scanner le = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Introduce tu usuario de admin");
        usuario=le.nextLine();
        System.out.println("Introduce tu clave de usuario de admin");
        clave=le.nextLine();
        menuAdmin();
    }
    
    public  void inicioEmpleado(){
        try{
        limpiarPantalla();
        }catch(Exception e){}
        char op;
        String usuario, clave;
        Scanner le = new Scanner(System.in);
        System.out.println("Introduce tu usuario de Empleado");
        usuario=le.nextLine();
        System.out.println("Introduce tu clave de usuario de Empleado");
        clave=le.nextLine();
        menuEmp();
    }
    
    public  void menuAdmin(){
        try{
        limpiarPantalla();
        }catch(Exception e){}
        String op="";
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Bienvenid@ administrador, que desea hacer?");
        System.out.println("=====================================");
        System.out.println("1.- Juego");
        System.out.println("2.- Proveedor");
      //System.out.println("3.- Categoria");
        System.out.println("3.- Compra");
        System.out.println("4.- Venta");
       // System.out.println("6.- Estatus de compra");
        System.out.println("5.- Salir");
        System.out.println("=====================================");
        op=leer.next();
        
        switch(op){
            case "1":
                Juegos j = new Juegos();
                j.JuegosV();
                break;
            case "2":
                SeccionProveedor o = new SeccionProveedor();
                o.SeccionProveedorV();
                break;
            case "4":
                Venta pu = new Venta();
                pu.Venta();
                break;
            case "3":
                Compras c = new Compras();
                c.Compras();
            case "5":
                System.out.println("Gracias");
                System.exit(0);
        }
        
    }
    
    public static void menuEmp (){
        
        char op;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Seleccione la opcion requerida");
        System.out.println("1.Categorias");
        System.out.println("2.Update");
        System.out.println("3.Venta");
        op=scanner.next().charAt(0);
        
        switch(op){
            case '1':
                System.out.println("Categorias");
        String categorias= scanner.nextLine();
        break;
        
            case '2':
                System.out.println("Update");
        String update= scanner.nextLine();
        break;
            case '3':
                System.out.println("Venta");
        double venta=scanner.nextDouble();
            default:
                System.out.println("Error");
                break;
        
        }
    }
    
    public static void limpiarPantalla() throws IOException, InterruptedException{
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
    }
}
