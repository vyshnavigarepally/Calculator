package calculate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

	@Test
	public void additionTest()
	{
		Calculator ca=new Calculator();
		assertEquals(8.0,ca.addnums(2.0,6.0),"Add");
		assertEquals(2.2,ca.addnums(1, 1.2),"Add");
	}
	@Test
	public void multiplicationTest()
	{
		Calculator ca=new Calculator();
		assertEquals(16.0,ca.multiplynums(2.0,8.0),"Multiply");
		assertEquals(4,ca.multiplynums(2,2),"Multiply");

	}
	@Test
	public void divisionTest()
	{
		Calculator ca=new Calculator();
		assertEquals(1.0,ca.dividenums(3,3),"Division");
		assertEquals(1.5,ca.dividenums(3.0,2.0),"Division");
		Assertions.assertThrows(ArithmeticException.class,() -> ca.dividenums(7.0,0));
	}
}
