package salario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalarioTest {

	@Test
	public void testcalculaSalarioNeto() {
		double valorEsperado = 300;
	    Salario sal= new Salario();
		double resultado= sal.calculaSalarioNeto(300);
		assertEquals(valorEsperado,resultado,0);		
	}
	@Test 
	public void testcalculaSalarioNeto2() {
		double valorEsperado = 1000;
		Salario sal = new Salario();
		double resultado= sal.calculaSalarioNeto(1000);
		assertEquals(valorEsperado,resultado,0);
	}
	@Test 
	public void testcalculaSalarioNeto3() {
		double valorEsperado = 1312;
		Salario sal = new Salario();
		double resultado= sal.calculaSalarioNeto(1600);
		assertEquals(valorEsperado,resultado,0);
	}
	@Test 
	public void testcalculaSalarioNeto4() {
		Salario sal= new Salario();
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			sal.calculaSalarioNeto(0);
		});
	}
	@Test
	public void testcalculaSalarioBruto() {
		double valorEsperado = 1280;
		Salario sal= new Salario();
		double salarioBruto = sal.calculaSalarioBruto("vendedor", 1500,4);
		assertEquals(valorEsperado,salarioBruto,0);
	}
	@Test
	public void testcalculaSalarioBruto2() {
		double valorEsperado = 1620;
		Salario sal = new Salario();
		double salarioBruto = sal.calculaSalarioBruto("encargado", 1000, 1);
		assertEquals(valorEsperado,salarioBruto,0);
	}
	@Test
	public void testcalculaSalarioBruto3() {
		Salario sal= new Salario();
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			sal.calculaSalarioBruto(null, -2, -2);
		});
	}
	@Test 
	public void testcalculaSalarioBruto4() {
		Salario sal= new Salario();
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			sal.calculaSalarioBruto("panadero", 0, 0);
		});
	}
	
			
}
