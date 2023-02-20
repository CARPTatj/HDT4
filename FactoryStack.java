 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Factory: crea distintos tipos de stacks
 */
public class FactoryStack<T>{
    private Stack<T> stack;

    public Stack<T> getInstance(int tipo, int tipoS){
        switch(tipoS){
            case 1:
                this.stack = new StackVector<T>(); 
                break;
            case 2:
                this.stack = new StackArrayList<T>(); 
                break;
            case 3:
                this.stack = new List<T>(tipoS); 
                break;
            default:
                break;
        }

        return this.stack;
    }
}