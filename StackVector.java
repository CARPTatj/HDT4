 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase StackVectoy: Crea las listas estilo vector
 */
import java.util.Vector;
public class StackVector<T> extends Stack<T> {

    private Vector<T> miSegundaListaInterna = new Vector<T>();
	
	public StackVector() {
		miSegundaListaInterna = new Vector<T>(); 
	}
	
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return miSegundaListaInterna.size();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return miSegundaListaInterna.isEmpty();
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		miSegundaListaInterna.add(0, value);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return miSegundaListaInterna.remove(0);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {		
		return miSegundaListaInterna.get(0);
	}
}