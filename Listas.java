 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Listas: abtracta
 */
abstract class Listas<T> implements Ilista<T>{
    protected int count;

    @Override
	public void InsertAtStart(T value) {
		
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void InsertAtEnd(T value) {
			
	}

	@Override
	public void Insert(T value, int index) {
		
	}

	@Override
	public T Delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T DeleteAtStart() {
		
		return null;
	}

	@Override
	public T DeleteAtEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T Get(int index) {
	   
        return null;

	}

	@Override
	public boolean IsEmpty() {
		return false;
	}

	@Override
	public int Count() {
		return 0;
	}

   
}