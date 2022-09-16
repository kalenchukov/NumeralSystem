package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AbstractSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new DecimalSystem();

	/**
	 * Проверка с содержащейся цифрой.
	 */
	@Test
	public void testContains()
	{
		assertTrue(NUMERAL_SYSTEM.contains('7'));
	}

	/**
	 * Проверка с не содержащейся цифрой.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(NUMERAL_SYSTEM.contains('F'));
	}

	/**
	 * Проверяет корректные данные.
	 */
	@Test
	public void testAllMatch()
	{
		assertTrue(NUMERAL_SYSTEM.allMatch("0123456789"));
	}

	/**
	 * Проверяет корректные данные.
	 */
	@Test
	public void testAnyMatch()
	{
		assertTrue(NUMERAL_SYSTEM.anyMatch("AB0CD"));
	}

	/**
	 * Проверяет некорректные данные.
	 */
	@Test
	public void testAnyMatchNot()
	{
		assertFalse(NUMERAL_SYSTEM.anyMatch(""));
		assertFalse(NUMERAL_SYSTEM.anyMatch("ABCDEF"));
	}

	/**
	 * Проверяет корректные данные.
	 */
	@Test
	public void testNoneMatch()
	{
		assertTrue(NUMERAL_SYSTEM.noneMatch("ABCDEF"));
	}

	/**
	 * Проверяет некорректные данные.
	 */
	@Test
	public void testNoneMatchNot()
	{
		assertFalse(NUMERAL_SYSTEM.noneMatch(""));
		assertFalse(NUMERAL_SYSTEM.noneMatch("AB0DEF"));
	}

	/**
	 * Проверяет некорректные данные.
	 */
	@Test
	public void testAllMatchNot()
	{
		assertFalse(NUMERAL_SYSTEM.allMatch(""));
		assertFalse(NUMERAL_SYSTEM.allMatch("123F"));
		assertFalse(NUMERAL_SYSTEM.allMatch("F"));
		assertFalse(NUMERAL_SYSTEM.allMatch("123456A789"));
	}
	/**
	 * Проверка получения массива цифр.
	 */
	@Test
	public void testToArray()
	{
		Character[] digits = new Character[] {
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка преобразования цифр в строку с разделителем.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "0,1,2,3,4,5,6,7,8,9";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка преобразования цифр в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "0123456789";

		assertEquals(string, NUMERAL_SYSTEM.toString());
	}
}
