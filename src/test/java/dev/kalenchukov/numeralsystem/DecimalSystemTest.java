/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DecimalSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new DecimalSystem();

	/**
	 * Проверка цифр.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		);

		assertArrayEquals(digits.toArray(), NUMERAL_SYSTEM.getDigits().toArray());
	}

	/**
	 * Проверка с содержащейся цифрой.
	 */
	@Test
	public void testHasDigit()
	{
		assertTrue(NUMERAL_SYSTEM.hasDigit('7'));
	}

	/**
	 * Проверка с не содержащейся цифрой.
	 */
	@Test
	public void testHasDigitNot()
	{
		assertFalse(NUMERAL_SYSTEM.hasDigit('F'));
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

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(NUMERAL_SYSTEM.equals(null));

		assertTrue(NUMERAL_SYSTEM.equals(NUMERAL_SYSTEM));

		assertFalse(NUMERAL_SYSTEM.equals(new DuodecimalSystem()));

		assertTrue(NUMERAL_SYSTEM.equals(new DecimalSystem()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new DecimalSystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new DuodecimalSystem().hashCode());
	}
}