import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lugar {
    String nombre;
    String direccion;
    ArrayList<reviews> stats;
    int tipo;
    File filename = new File(nombre+".txt");

    lugar (String name, String addy, int type){
        this.nombre = name;
        this.direccion = addy;
        this.tipo = type;

    }
    
    public void leer() throws FileNotFoundException{
        //crea los items que tengo en mi archivo
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(",");
            //reviews reviewssss = new reviews(data[0], Integer.parseInt(data[1]));
            //stats.add(reviewssss);
        } 
        sc.close();
    }
}