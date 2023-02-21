/*
* Alina Carías (22539)
* Algoritmos y Estructuras de Datos Sección 40
* Hoja de Trabajo 4
* 19-02-2023
* Interfaz Stack: es la interfaz que implementa la clase Stack
/**
 * @author MAAG
 *
 */

public interface IStack<T>{
    int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}