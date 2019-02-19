package com.example;

public class RandomClass {
	public void testAction() {
		/*double one = 3.6;
		double two = 0;
		double x = one / two;
		System.out.println(x);
		long l = Double.doubleToLongBits(x);
		System.out.println(l);
		long m = Double.doubleToRawLongBits(x);
		System.out.println(m);

		System.out.println(Long.divideUnsigned(m, 2L));
		System.out.println(Math.ceil(5d/4));
		System.out.println(Double.doubleToLongBits(Math.ceil(5d/4)));
*/
		for (int i = 1; i <= 16; i++) {

			int row = i / 4;
			if (i % 4 > 0){
				row++;
			}

			int col = i % 4;
			if (col == 0){
				col = 4;
			}

			System.out.println("i: " + i + "; row: " + row + "; col: " + col);
		}


	}

	public static void main(String[] args) {
		RandomClass randomClass = new RandomClass();
		randomClass.testAction();
	}
}
