package FirstTp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MainTest {
//les d'assertion ==> assetEquals(at1,at2),

// script pr test automatique
	Calculatric c = new Calculatric();
	Scanner sc = new Scanner(System.in);

	@Test
	void testDiv() {
		System.out.println("first val = ");
		double x = sc.nextDouble();
		System.out.println("second val = ");
		double y = sc.nextDouble();
		double res = c.div(x, y);
		double resEx = 0;
		assertEquals(res, resEx);
	}

	void testAdd() {
		double rest = c.add(3, 4);
		double resExs = 3;
		assertEquals(rest, resExs);
	}

}
