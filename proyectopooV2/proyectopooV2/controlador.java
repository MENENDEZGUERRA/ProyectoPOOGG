import java.util.ArrayList;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class controlador {
    //Objects
    view Interface = new view();
    ArrayList<lugar> lugaresData = new ArrayList<>();
    Scanner sn = new Scanner(System.in);


    //Methods
    //DeployMenu
    public void deployMenu(){
        Interface.menu();
    }

    //Add lugar
    public void addPlace(){
        System.out.println("\nEnter New Place Name");
        String newName = sn.next();
        while(newName != null){
            System.out.println("Enter New Place Address");
            String newAddrs = sn.next();
            System.out.println("Enter New Place Type\n1. Tipo de lugar 1\n2.Tipo 2\n3.Tipo 3");
            int newType = sn.nextInt();
            //Apply properties
            lugar Newlugar = new lugar(newName,newAddrs,newType);
            lugaresData.add(Newlugar);
            break;
        }
    }

    //Deploy places
    public void deployPlaces(){
        for(int i = 0; i < lugaresData.size(); i++) { 
            lugar lugarSelec = lugaresData.get(i); 
            System.out.print(i + "." + lugarSelec.getNombre() + "\n");
        }
    }

    
}
