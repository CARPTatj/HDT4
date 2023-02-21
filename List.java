 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase List: contiene las dos tipos de listas, clase hija
 */
public class List<T> extends Stack<T>{
   
    private FactoryList<T> factoList = new FactoryList<T>();
    private Listas<T> listaI;



    public List(int tipoS) {
        this.listaI = factoList.getInstance(tipoS);
    }

    
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return listaI.Count();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return listaI.IsEmpty();
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		listaI.InsertAtStart(value);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
       
		return listaI.DeleteAtStart();
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {		
		return (T) listaI.Get(listaI.Count());
	}
}