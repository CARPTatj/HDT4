 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase calculadora: modela la calculadora postfix
 * Calculadora copiada de HDT2
 */
import java.util.ArrayList;
import java.util.Vector;
import java.util.*;
public class Calculadora extends InfixAPostFix{
    private FactoryStack<Integer> factStck = new FactoryStack<Integer>();
    private Stack<Integer> stack = factStck.getInstance(null, null);
    private InfixAPostFix cambio = new InfixAPostFix();
    private static boolean instance_flag;
    private static Calculadora calc;

    public Calculadora() throws SingletonException{
        instance_flag = true;
    }

  
    
    /** 
     * @param tipo
     * @param tipo2
     * @return Calculadora
     */
    public static Calculadora getInstance(String tipo, String tipo2){
        if (instance_flag){
            return calc;
        }
        else{
            calc = new Calculadora();
            return calc;
        }
    }
    
    /** 
     * @param infix
     * @return int
     * @throws Exception
     */
    public int Calculate(ArrayList<String> infix) throws Exception {
        int resultado = 0;
        ArrayList<String> caracteres = cambio.infixToPostfix(infix);
        for(String caracter : caracteres){
            if(verificar(caracter)){
                int numero = Integer.parseInt(caracter);
                stack.push(numero);
            }
            else if(verificar(caracter) == false){
                if(caracter.equals("+")){
                    resultado = stack.pull() + stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("-")){
                    resultado = stack.pull() - stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("*")){
                    resultado = stack.pull() * stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("/")){
                    resultado = stack.pull() / stack.pull();
                    stack.push(resultado);
                }
            }
        }              

        return resultado;
    }

    
    /** 
     * @param caracter
     * @return boolean
     */
    private boolean verificar(String caracter){
        try {
            Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}