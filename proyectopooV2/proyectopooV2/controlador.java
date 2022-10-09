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



    //Add a review to selected place
    public void addReview(lugar _lugar){
        System.out.println("\nEnter User Name");
        String userName = sn.next();
        while(userName != null){
            System.out.println("\nEnter Date day");
            int DateDay = sn.nextInt();
            System.out.println("\nEnter Month number");
            int DateMonth = sn.nextInt();
            System.out.println("\nEnter date Year");
            int DateYear = sn.nextInt();
            System.out.println("\nEnter Number of stars (1-5)");
            int NumberofStars = sn.nextInt();
            System.out.println("\nEnter Review");
            String review = sn.next();

            reviews newReview = new reviews(userName,DateDay,DateMonth,DateYear,NumberofStars,review);
            _lugar.info.add(newReview);
            break;
        }

        //Testing, errase later
        System.out.println("\nAll reviews for " + _lugar.getNombre());
        for(int i = 0; i < _lugar.info.size(); i++) { 
            reviews reviewSel = _lugar.info.get(i); 
            System.out.print(i + ". User: " + reviewSel.getUsuario() + "\n");
            System.out.print("Stars: " + reviewSel.getStars() + "\n");
            System.out.print("Review: " + reviewSel.getReviewText() + "\n");
            System.out.print("Published: " + reviewSel.getDay() + "/" + reviewSel.getMonth() + "/" + reviewSel.getYear() + "\n");
        }
    }


    
}
