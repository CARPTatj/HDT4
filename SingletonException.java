 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase singeltonException: hace la escepcion de singleton
 */
/**
 * @author MAAG
 *
 */
public class SingletonException extends RuntimeException {
	
	//new exception type for singleton classes
	public SingletonException(){
		super();
	}
	
	public SingletonException(String s){
		super(s);
	}
}
