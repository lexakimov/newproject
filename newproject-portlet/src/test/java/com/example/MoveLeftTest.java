package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveLeftTest {

	private void functionCall(String name, Tile[][] matrixIn, Tile[][] matrixOut) {
		System.out.println("\n" + name);
		System.out.println("IN:\t\t " + Arrays.deepToString(matrixIn));
		System.out.println("EXPECTED: " + Arrays.deepToString(matrixOut));
		GameUtil.moveLeft(matrixIn);
		System.out.println("ACTUAL: " + Arrays.deepToString(matrixIn));
		Assert.assertArrayEquals(matrixOut, matrixIn);
	}

	/**
	 * Тест пустого
	 */
	@Test
	public void moveLeft1() {
		Tile[][] matrixIn = {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null}
		};

		Tile[][] matrixOut = {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null}
		};
		functionCall("moveLeft1", matrixIn, matrixOut);
	}

	/**
	 * Тест на простое смещение
	 */
	@Test
	public void moveLeft2() {
		Tile[][] matrixIn = {
				{new Tile(2, 0, 0), null, null, null},
				{null, new Tile(4, 1, 1), null, null},
				{null, null, new Tile(8, 2, 2), null},
				{null, null, null, new Tile(16, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(2, 0, 0), null, null, null},
				{new Tile(4, 1, 0), null, null, null},
				{new Tile(8, 2, 0), null, null, null},
				{new Tile(16, 3, 0), null, null, null}
		};
		functionCall("moveLeft2", matrixIn, matrixOut);
	}

	/**
	 * тест на смещение различных
	 */
	@Test
	public void moveLeft3() {
		Tile[][] matrixIn = {
				{null, new Tile(2, 0, 1), new Tile(4, 0, 2), null},
				{new Tile(8, 1, 0), new Tile(4, 1, 1), null, null},
				{null, null, new Tile(8, 2, 2), new Tile(2, 2, 3)},
				{new Tile(2, 3, 0), null, null, new Tile(32, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(2, 0, 0), new Tile(4, 0, 1), null, null},
				{new Tile(8, 1, 0), new Tile(4, 1, 1), null, null},
				{new Tile(8, 2, 0), new Tile(2, 2, 1), null, null},
				{new Tile(2, 3, 0), new Tile(32, 3, 1), null, null}
		};
		functionCall("moveLeft3", matrixIn, matrixOut);
	}

	/**
	 * тест на объединение без конкуренции
	 */
	@Test
	public void moveLeft4() {
		Tile[][] matrixIn = {
				{new Tile(2, 0, 0),	new Tile(2, 0, 1),	null,				null},
				{null,				new Tile(4, 1, 1),	new Tile(4, 1, 2),	null},
				{null,				null,				new Tile(8, 2, 2),	new Tile(8, 2, 2)},
				{new Tile(32, 3, 0), null,				null,				new Tile(32, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(4, 0, 0), null, null, null},
				{new Tile(8, 1, 0), null, null, null},
				{new Tile(16, 2, 0), null, null, null},
				{new Tile(64, 3, 0), null, null, null}
		};
		functionCall("moveLeft4", matrixIn, matrixOut);
	}

	/**
	 * тест на объединение и движение
	 */
	@Test
	public void moveLeft5() {
		Tile[][] matrixIn = {
				{new Tile(4, 0, 0), null,				new Tile(2, 0, 2),	new Tile(2, 0, 3)},
				{new Tile(4, 1, 0), new Tile(8, 1, 1),	null,				new Tile(4, 1, 3)},
				{null,				new Tile(8, 2, 1),	new Tile(8, 2, 2),	new Tile(16, 2, 3)},
				{new Tile(32, 3, 0), new Tile(32, 3, 1), null,				new Tile(32, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(4, 0, 0),		new Tile(4, 0, 1),	null,				null},
				{new Tile(4, 1, 0),		new Tile(8, 1, 1),	new Tile(4, 1, 2),	null},
				{new Tile(16, 2, 0),	new Tile(16, 2, 1),	null,				null},
				{new Tile(64, 3, 0),	new Tile(32, 3, 1),	null,				null}
		};
		functionCall("moveLeft5", matrixIn, matrixOut);
	}

	/**
	 * попарное объединение
	 */
	@Test
	public void moveLeft6() {
		Tile[][] matrixIn = {
				{new Tile(4, 0, 0), new Tile(4, 0, 1), new Tile(4, 0, 2), new Tile(4, 0, 3)},
				{new Tile(4, 1, 0), new Tile(4, 1, 1), new Tile(4, 1, 2), new Tile(4, 1, 3)},
				{new Tile(4, 2, 0), new Tile(4, 2, 1), new Tile(4, 2, 2), new Tile(4, 2, 3)},
				{new Tile(4, 3, 0), new Tile(4, 3, 1), new Tile(4, 3, 2), new Tile(4, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(8, 0, 0), new Tile(8, 0, 1), null, null},
				{new Tile(8, 1, 0), new Tile(8, 1, 1), null, null},
				{new Tile(8, 2, 0), new Tile(8, 2, 1), null, null},
				{new Tile(8, 3, 0), new Tile(8, 3, 1), null, null}
		};
		functionCall("moveLeft6", matrixIn, matrixOut);
	}

	/**
	 * всё занято
	 */
	@Test
	public void moveLeft7() {
		Tile[][] matrixIn = {
				{new Tile(2, 0, 0), new Tile(4, 0, 1), new Tile(8, 0, 2), new Tile(16, 0, 3)},
				{new Tile(32, 1, 0), new Tile(2, 1, 1), new Tile(32, 1, 2), new Tile(64, 1, 3)},
				{new Tile(128, 2, 0), new Tile(256, 2, 1), new Tile(512, 2, 2), new Tile(1024, 2, 3)},
				{new Tile(16, 3, 0), new Tile(8, 3, 1), new Tile(4, 3, 2), new Tile(2, 3, 3)}
		};

		Tile[][] matrixOut = {
				{new Tile(2, 0, 0), new Tile(4, 0, 1), new Tile(8, 0, 2), new Tile(16, 0, 3)},
				{new Tile(32, 1, 0), new Tile(2, 1, 1), new Tile(32, 1, 2), new Tile(64, 1, 3)},
				{new Tile(128, 2, 0), new Tile(256, 2, 1), new Tile(512, 2, 2), new Tile(1024, 2, 3)},
				{new Tile(16, 3, 0), new Tile(8, 3, 1), new Tile(4, 3, 2), new Tile(2, 3, 3)}
		};
		functionCall("moveLeft7", matrixIn, matrixOut);
	}

	@Test
	public void moveLeft8() {
		Tile[][] matrixIn = {
				{null, 				null,				null,				null},
				{new Tile(4, 1, 0), null, 				null,				null},
				{new Tile(2, 2, 0), null,				null,				null},
				{new Tile(4, 3, 0), new Tile(2, 3, 1),	new Tile(2, 3, 2),	new Tile(2, 3, 3)}
		};


		Tile[][] matrixOut = {
				{null, 				null,				null,				null},
				{new Tile(4, 1, 0), null, 				null,				null},
				{new Tile(2, 2, 0), null,				null,				null},
				{new Tile(4, 3, 0), new Tile(4, 3, 1), 	new Tile(2, 3, 2),	null}
		};
		functionCall("moveLeft8", matrixIn, matrixOut);
	}
}