 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * clase infixApostfix: es el traductor entre infix a postfix
 * resuelto con la ayuda de tutorialspoint (link dado por el profesor) y chatgpt
 */
import java.util.ArrayList;
import java.util.Stack;

public class InfixAPostFix {
    
    
    /** 
     * @param operator
     * @return int
     */
    private static int precedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    
    
    /** 
     * @param infix
     * @return ArrayList<String>
     */
    public ArrayList<String> infixToPostfix(ArrayList<String> infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        stack.push('#');
        for (int i = 0; i < ((CharSequence) infix).length(); i++) {
            char ch = ((CharSequence) infix).charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == '^') {
                stack.push(ch);
            } else if (ch == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            } else {
                while (stack.peek() != '#' && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (stack.peek() != '#') {
            postfix.append(stack.pop());
        }
        return infix ;
    }
    
}