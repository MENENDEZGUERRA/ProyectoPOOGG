//Imports
import java.util.Scanner;
import java.util.InputMismatchException;

public class view {
    //menu
    public void menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
 
        while (!salir) {
            //header
            System.out.println("\n\n-- BIENVENIDO A GG --");
            //options
            System.out.println("1. Agregar Lugar");
            System.out.println("2. Calificar un lugar");
            System.out.println("3. Buscar lugar");
            System.out.println("4. Lista Lugares");
            System.out.println("5. Salir");
 
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        
                        break;

                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
