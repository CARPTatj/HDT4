 /*
 * Alina Carías (22539)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19.02-2023
 * Clase JUNIT: verifica si los calculos estan funcionando
 * JUNIT copiada de HDT2
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class Junit{
	Calculadora calculadora = new Calculadora();
	int numero = 4;
	StackArrayList stackArray = new StackArrayList<Integer>();
	StackVector stackVectir = new StackVector<Integer>();

	//JUNIT PARA ARRAYLIST
    
	@Test
	void pullpushTestArray() {
		StackArrayList stackArray = new StackArrayList<Integer>();
		stackArray.push(4);
		stackArray.push(3);
		stackArray.push(2);
		int resultado = 0;
		resultado = (int) stackArray.pull();
		assertEquals(2, resultado);
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void sumaTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate(lista);
		assertEquals(5, resultado);
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void restaTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("3");
		lista.add("2");
		lista.add("-");
		int resultado = calculadora.Calculate(lista);
		assertEquals(-1, resultado);
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void multiTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("9");
		lista.add("*");
		int resultado = calculadora.Calculate(lista);
		assertEquals(63, resultado);
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void diviTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("6");
		lista.add("24");
		lista.add("/");
		int resultado = calculadora.Calculate(lista);
		assertEquals(4, resultado);
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void unmontonTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate(lista);
		assertEquals(15, resultado);
	}

}