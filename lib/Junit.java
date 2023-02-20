import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class Junit{
    Calculadora calculadora = new Calculadora();
	StackArrayList stackArray = new StackArrayList<Integer>();
	StackVector stackVectir = new StackVector<Integer>();
	int numero = 4;

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

	@Test
	void sumaTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.CalculateArray(lista);
		assertEquals(5, resultado);
	}

	@Test
	void restaTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("3");
		lista.add("2");
		lista.add("-");
		int resultado = calculadora.CalculateArray(lista);
		assertEquals(-1, resultado);
	}

	@Test
	void multiTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("9");
		lista.add("*");
		int resultado = calculadora.CalculateArray(lista);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestArray() throws Exception{
		Calculadora calculadora = new Calculadora();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("6");
		lista.add("24");
		lista.add("/");
		int resultado = calculadora.CalculateArray(lista);
		assertEquals(4, resultado);
	}

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
		int resultado = calculadora.CalculateArray(lista);
		assertEquals(15, resultado);
	}

	//JUNIT PARA VECTOR

	
	@Test
	void pullpushTestVector() {
		StackVector stackVector = new StackVector<Integer>();
		stackVector.push(4);
		stackVector.push(3);
		stackVector.push(2);
		int resultado = 0;
		resultado = (int) stackVector.pull();
		assertEquals(2, resultado);
	}

	@Test
	void sumaTestVector() throws Exception{
		Calculadora calculadora = new Calculadora();
		Vector<String> lista =  new Vector<>();
		lista.add("2");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.CalculateVect(lista);
		assertEquals(5, resultado);
	}

	@Test
	void restaTestVector() throws Exception{
		Calculadora calculadora = new Calculadora();
		Vector<String> lista =  new Vector<>();
		lista.add("3");
		lista.add("2");
		lista.add("-");
		int resultado = calculadora.CalculateVect(lista);
		assertEquals(-1, resultado);
	}

	@Test
	void multiTestVector() throws Exception{
		Calculadora calculadora = new Calculadora();
		Vector<String> lista =  new Vector<>();
		lista.add("7");
		lista.add("9");
		lista.add("*");
		int resultado = calculadora.CalculateVect(lista);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestVector() throws Exception{
		Calculadora calculadora = new Calculadora();
		Vector<String> lista =  new Vector<>();
		lista.add("6");
		lista.add("24");
		lista.add("/");
		int resultado = calculadora.CalculateVect(lista);
		assertEquals(4, resultado);
	}

	@Test
	void unmontonTestVector() throws Exception{
		Calculadora calculadora = new Calculadora();
		Vector<String> lista =  new Vector<>();
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.CalculateVect(lista);
		assertEquals(15, resultado);
	}
}