 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase DoubleList: hace una lista con espacios antes y despues del dato
 */
/**
 * @author MAAG
 *
 */
public class DoubleList<T> extends Listas<T>{
    private NodoDouble<T> start;
	private NodoDouble<T> end;
	private int count;
	
	public DoubleList() {
		start = null;
		end = null;
		count = 0;
	}
	
	
	/** 
	 * @param value
	 */
	@Override
	public void InsertAtStart(T value) {
		NodoDouble<T> newNode = new NodoDouble<T>(value);
		
		if (IsEmpty()) {
		
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			
			newNode.setNext(start);
			start.setPrevious(newNode);
			newNode.setPrevious(end);
			end.setNext(newNode);
			start = newNode;
		}
		
		count++;
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void InsertAtEnd(T value) {
		
	NodoDouble<T> newNode = new NodoDouble<T>(value);
		
		if (IsEmpty()) {
		
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			
			newNode.setPrevious(end);
			newNode.setNext(start);
			start.setPrevious(newNode);
			end.setNext(newNode);
			end = newNode;
		}
		
		count++;
		
	}

	
	/** 
	 * @param value
	 * @param index
	 */
	@Override
	public void Insert(T value, int index) {
		
		if (IsEmpty()) //if the list is empty then insert at start
        {
            InsertAtStart(value);
        }
        else 
        {
            if (index >= Count()) //if the index is equal or greater than count then insert at end
            {
                InsertAtEnd(value);
            } 
            else if (index == 0) //If the index to insert is 0 and the list is not empty
            {
                InsertAtStart(value);
            }
            else if ((index > 0) && (index < Count())) //Index between 1 (second element) and Count() - 1 previous the last one
            {
                NodoDouble<T> newNode = new NodoDouble<T>(value);
                NodoDouble<T> temp = start;
                int i = 0;

                //Search the position where the node will be inserted
                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }

                //doing the insertion
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }
		
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
		if (!IsEmpty()) {
			
			if (Count() == 1) {
				NodoDouble<T> temp = start;
				start = null;
				end = null;
				count--;
				return temp.getValue();
			} else {
				NodoDouble<T> temp = start;
				end.setNext(temp.getNext());
				temp.getNext().setPrevious(end);
				start = temp.getNext();
				count--;
				return temp.getValue();
			}
			
		} else {
			return null;
		}
		
		
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
	    if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                NodoDouble<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;

	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean IsEmpty() {
		return count == 0;
	}

	
	/** 
	 * @return int
	 */
	@Override
	public int Count() {
		return count;
	}


	


}