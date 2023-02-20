import java.util.ArrayList;

public class Principal{
    Archivo archivo = new Archivo("./datos.txt");
    ArrayList<String> lineasDatos = archivo.leerArchivo();
}