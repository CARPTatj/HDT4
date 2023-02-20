 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase calculadora: modela la calculadora postfix
 */
import java.util.ArrayList;
import java.util.Vector;
public class Calculadora{
    private StackArrayList <Integer> stackArray;
    private StackVector <Integer> stackVect;
    private List <Integer> stackList;


    public Calculadora() {
        this.stackArray = new StackArrayList();
        this.stackVect = new StackVector();
       // this.stackList =  new List();
    }

    public Calculadora(StackArrayList<Integer> stackArray, StackVector<Integer> stackVect, List<Integer> stackList) {
        this.stackArray = stackArray;
        this.stackVect = stackVect;
        this.stackList = stackList;
    }

    public int CalculateArray(ArrayList postfix_expression) throws Exception {
        int resultado = 0;
        ArrayList<String> caracteres = postfix_expression;
        for(String caracter : caracteres){
            if(verificar(caracter)){
                int numero = Integer.parseInt(caracter);
                stackArray.push(numero);
            }
            else if(verificar(caracter) == false){
                if(caracter.equals("+")){
                    resultado = stackArray.pull() + stackArray.pull();
                    stackArray.push(resultado);
                }
                else if(caracter.equals("-")){
                    resultado = stackArray.pull() - stackArray.pull();
                    stackArray.push(resultado);
                }
                else if(caracter.equals("*")){
                    resultado = stackArray.pull() * stackArray.pull();
                    stackArray.push(resultado);
                }
                else if(caracter.equals("/")){
                    resultado = stackArray.pull() / stackArray.pull();
                    stackArray.push(resultado);
                }
            }
        }              

        return resultado;
    }

    public int CalculateVect(Vector postfix_expression) throws Exception {
        int resultado = 0;
        Vector<String> caracteres = postfix_expression;
        for(String caracter : caracteres){
            if(verificar(caracter)){
                int numero = Integer.parseInt(caracter);
                stackVect.push(numero);
            }
            else if(verificar(caracter) == false){
                if(caracter.equals("+")){
                    resultado = stackVect.pull() + stackVect.pull();
                    stackVect.push(resultado);
                }
                else if(caracter.equals("-")){
                    resultado = stackVect.pull() - stackVect.pull();
                    stackVect.push(resultado);
                }
                else if(caracter.equals("*")){
                    resultado = stackVect.pull() * stackVect.pull();
                    stackVect.push(resultado);
                }
                else if(caracter.equals("/")){
                    resultado = stackVect.pull() / stackVect.pull();
                    stackVect.push(resultado);
                }
            }
        }              

        return resultado;
    }

    public int CalculateList(ArrayList postfix_expression) throws Exception {
        int resultado = 0;
        
        return resultado;
    }

    private boolean verificar(String caracter){
        try {
            Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

}