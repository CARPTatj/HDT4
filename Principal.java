 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Princial: muestra todo lo hecho en el programa e interactua con el usuario.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String menu = "Que tipo de Calculadora quiere utilizar? \n" + 
        "1. Listas en Array. \n" +
        "2. Listas en Vector. \n" +
        "3. Listas en list (SingleList o DoubleList) \n";

        String menu1 = "1. SingleList\n" +
        "2. Double List";
                    
        Archivo archivo = new Archivo("./datos.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();
        Scanner teclado = new Scanner(System.in);
        System.out.println(menu);
        int opcion = teclado.nextInt();
        teclado.nextLine();

        try{
            switch(opcion){
                case 1:
                    System.out.println("Resolusiones es tipo ArrayList");
                    calculadora.Calculate(lineasDatos);
                    for (String fila : lineasDatos) {
                        ArrayList<String> oneLine = new ArrayList<String>();
                        String [] lineaSeparada = fila.split(" ");
                        for (String caracter : lineaSeparada) {
                            oneLine.add(caracter);
                        }
                        
                        try {
                            calculadora = new Calculadora();
                            System.out.println("Resultado: " + calculadora.Calculate(oneLine));
                        } catch (Exception nullException) {
                            System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Resolusiones es tipo vector");
                    break;
                case 3:
                    System.out.println("Resolusiones es tipo listas");
                    System.out.println(menu1);
                    int lava = teclado.nextInt();
                    teclado.nextLine();
                    switch(lava){
                        case 1:
                            System.out.println("Resolusiones es tipo SingleList");
                            break;
                        case 2: 
                            System.out.println("Resolusiones es tipo doubleList");
                            break;
                        default:
                            break;
                        }
                    break;
                default: 
                    break;
            }
        }   catch (Exception e) {
            teclado.nextLine();
            System.out.println("Ingresó algo inválido.");
            //TODO: handle exception
        }

    }   

}