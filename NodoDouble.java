/*
* Alina Carías (22539)
* Algoritmos y Estructuras de Datos Sección 40
* Hoja de Trabajo 4
* 19-02-2023
* Clase NodoDouble: modela un Nodo para doubleList. 
*/
/**
 * @author MAAG
 *
 */
public class NodoDouble<T>{
    private T value;
	private NodoDouble<T> next;
	private NodoDouble<T> previous;
	
	public NodoDouble(T value) {
		this.setValue(value);
	}
	
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public NodoDouble<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(NodoDouble<T> next) {
		this.next = next;
	}
	/**
	 * @return the previous
	 */
	public NodoDouble<T> getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(NodoDouble<T> previous) {
		this.previous = previous;
	}
    
}