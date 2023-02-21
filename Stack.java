import java.util.concurrent.CountDownLatch;

/*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Stack: Stack abstracta
 */
abstract class Stack<T> implements IStack<T>{
    protected int count;

    
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
        return 0;
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return false;
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return null;
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {		
		return null;
	}
    
}