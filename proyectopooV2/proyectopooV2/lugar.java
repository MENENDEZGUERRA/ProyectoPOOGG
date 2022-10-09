import java.io.File;
import java.util.ArrayList;

public class lugar {
    String nombre;
    String direccion;
    ArrayList<reviews> info = new ArrayList<>();
    int tipo;


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<reviews> getStats() {
        return info;
    }

    public int getTipo() {
        return tipo;
    }

    File filename = new File(nombre+".txt");

    lugar (String nameString, String direccionString, int type){
        this.nombre = nameString;
        this.direccion = direccionString;
        this.tipo = type;

    }

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