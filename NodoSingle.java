 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase NodoSingle: modela un Nodo para singleList. 
 */
public class NodoSingle<T>{
    private T value;
	private NodoSingle<T> next;
	
	public NodoSingle(T value) {
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
	public NodoSingle<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(NodoSingle<T> next) {
		this.next = next;
	}
	

}