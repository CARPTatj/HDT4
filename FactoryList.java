/*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase Factory: hace la factory de las listas double y single
 */
public class FactoryList<T>{
    private Listas<T> lista;
    
    
    /** 
     * @param tipo
     * @param tipoS
     * @return Listas<T>
     */
    public Listas<T> getInstance(int tipo, int tipoS){
            switch(tipoS){
                case 1:
                    this.lista = new SingleList<T>(); 
                    break;
                case 2:
                    this.lista = new DoubleList<T>(); 
                    break;
                default:
                    break;
            }
    
            return this.lista;
        }

    
    /** 
     * @param tipo
     * @return Listas<T>
     */
    public Listas<T> getInstance(int tipo) {
        return null;
    }
    }
   


