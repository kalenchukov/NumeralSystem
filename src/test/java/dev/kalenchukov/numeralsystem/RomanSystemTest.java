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

public class RomanSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new RomanSystem();

	/**
	 * Проверка цифр.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'I', 'V', 'X', 'L', 'C', 'D', 'M'
		);

		assertArrayEquals(digits.toArray(), NUMERAL_SYSTEM.getDigits().toArray());
	}

	/**
	 * Проверка получения массива цифр.
	 */
	@Test
	public void testToArray()
	{
		Character[] digits = new Character[] {
			'I', 'V', 'X', 'L', 'C', 'D', 'M'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка преобразования цифр в строку с разделителем.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "I,V,X,L,C,D,M";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка преобразования цифр в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "IVXLCDM";

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

		assertFalse(NUMERAL_SYSTEM.equals(new BinarySystem()));

		assertTrue(NUMERAL_SYSTEM.equals(new RomanSystem()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new RomanSystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new BinarySystem().hashCode());
	}
}