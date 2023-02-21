 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase StackArrayList: Crea listas estilo ArrayList
 */
/**
 * @author MAAG
 *
 */
import java.util.ArrayList;

public class StackArrayList<T> extends Stack<T>  {

	private ArrayList<T> miListaInterna = new ArrayList<T>();
	
	public StackArrayList() {
		miListaInterna = new ArrayList<T>(); 
	}
	
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return miListaInterna.size();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {		
		return miListaInterna.get(0);
	}

}
