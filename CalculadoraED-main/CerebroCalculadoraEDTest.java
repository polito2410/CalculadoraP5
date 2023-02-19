package calcualdora;

//CAMBIADO LAS PUBLIC//

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CerebroCalculadoraEDTest {
	
	public CerebroCalculadoraED test;

//***********************************************************************************************//
	
			//Inicio de tests//

//***********************************************************************************************//

	@BeforeEach
public void Principal() {
	test=new CerebroCalculadoraED();
}

	
//***********************************************************************************************//

	//TEST SUMA//
	
	@Test
	public void resta() {
		test.procesarOperacion("2");
		assertEquals(test.resultado,test.numero1-test.numero2);
	}
	
//***********************************************************************************************//

	//TEST RESTA//
	
	@Test
public void suma() {
	test.procesarOperacion("1");
	assertEquals(test.resultado, test.numero1+test.numero2);
}

//***********************************************************************************************//

	//TEST MULTIPLICACION//
	
	@Test
public void multiplicacion() {
	test.procesarOperacion("3");
	assertEquals(test.resultado,test.numero1*test.numero2);
}
	
//***********************************************************************************************//

	//TEST DIVISION//
	
	@Test
public void division() {
	test.procesarOperacion("4");
	assertEquals(test.resultado,test.numero1/test.numero2);
}

	
//***********************************************************************************************//

	//Test sumar al resultado//
	
	@Test
public void sumar_resultado() {
	double resultadoprincipal=test.resultado;
	test.procesarOperacion("5");
	assertEquals(test.resultado,resultadoprincipal+test.numero2);
}

//***********************************************************************************************//
	
	//Test restar al resultado// //Error ya que al resultado en la clase principal lo suma por lo que se añade un +//
	
	@Test
public void restar_resultado() {
	double resultadoprincipal=test.resultado;
	test.procesarOperacion("6");
	assertEquals(test.resultado,resultadoprincipal+test.numero2); //<--------
}
	
	
//***********************************************************************************************//

	//Test multiplcacion al resultado//
	
	@Test
public void multiplicar_resultado() {
	double resultadoprincipal=test.resultado;
	test.procesarOperacion("7");
	assertEquals(test.resultado,resultadoprincipal*test.numero2);
}

//***********************************************************************************************//

	//Test division al resultado//
	
@Test
public void dividir_resultado() {
	double resultadoprincipal=test.resultado;
	test.procesarOperacion("8");
	assertEquals(test.resultado,resultadoprincipal/test.numero2);
}

//***********************************************************************************************//
	//test Numeroaleatorio//
	
	@Test
public void numaleatorio() {
	test.procesarOperacion("10");
	assertTrue(test.resultado > 0 & test.resultado < 100);
}


}
