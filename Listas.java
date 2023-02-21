 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Listas: abtracta
 */
abstract class Listas<T> implements Ilista<T>{
    protected int count;

    
	/** 
	 * @param value
	 */
	@Override
	public void InsertAtStart(T value) {
		
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void InsertAtEnd(T value) {
			
	}

	
	/** 
	 * @param value
	 * @param index
	 */
	@Override
	public void Insert(T value, int index) {
		
	}

	
	/** 
	 * @param index
	 * @return T
	 */
	@Override
	public T Delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T DeleteAtStart() {
		
		return null;
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T DeleteAtEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/** 
	 * @param index
	 * @return T
	 */
	@Override
	public T Get(int index) {
	   
        return null;

	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean IsEmpty() {
		return false;
	}

	
	/** 
	 * @return int
	 */
	@Override
	public int Count() {
		return 0;
	}

   
}