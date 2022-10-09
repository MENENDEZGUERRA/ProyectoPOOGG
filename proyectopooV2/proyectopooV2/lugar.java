import java.io.File;
import java.util.ArrayList;

public class lugar {
    String nombre;
    String direccion;
    ArrayList<reviews> info = new ArrayList<>();
    int tipo;




    // File filename = new File(nombre+".txt");

    // lugar (String nameString, String direccionString, int type){
    //     this.nombre = nameString;
    //     this.direccion = direccionString;
    //     this.tipo = type;

    // }

    // public void leer() throws FileNotFoundException{
    //     //crea los items que tengo en mi archivo
    //     String[] data;
    //     Scanner sc = new Scanner(filename);
    //     while (sc.hasNextLine()) {
    //         data =sc.nextLine().split(",");
    //         //reviews reviewssss = new reviews(data[0], Integer.parseInt(data[1]));
    //         //stats.add(reviewssss);
    //     } 
    //     sc.close();
    // }
}