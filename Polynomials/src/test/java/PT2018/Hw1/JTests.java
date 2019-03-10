package PT2018.Hw1;

import org.junit.Test;

import backend.Functii;
import backend.Polinom;
import junit.framework.TestCase;

public class JTests extends TestCase{
		
@Test
public void testAdd() {
	Polinom a = new Polinom("-3x^2+4x+3");
	Polinom b = new Polinom("5x^2-2x-1");
	Polinom c=new Polinom("2x^2+2x+2");
	Polinom d=new Polinom(Functii.adunare(a,b));
	//System.out.println(d.display());
	assertEquals(c.display(),d.display());
	}
@Test
public void testSub() {
	Polinom a = new Polinom("-3x^2+4x+3");
	Polinom b = new Polinom("5x^2-2x-1");
	Polinom c = new Polinom("-8x^2+6x+4");
	Polinom d = new Polinom(Functii.scadere(a, b));
	assertEquals(c.display(),d.display());
}
@Test
public void testMul() {
	Polinom a = new Polinom("2x^2+4");
	Polinom b = new Polinom("2x^2-4");
	Polinom c = new Polinom("4x^4-16");
	Polinom d = new Polinom(Functii.inmultire(a, b));
	assertEquals(c.display(),d.display());
}
@Test
public void testDif() {
	Polinom a = new Polinom("3x^4+2x^2+1");
	Polinom b = new Polinom("12x^3+4x");
	Polinom c = new Polinom(Functii.derivare(a));
	assertEquals(b.display(),c.display());
}
}

