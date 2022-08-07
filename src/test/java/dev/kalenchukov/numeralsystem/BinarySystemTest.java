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

public class BinarySystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new BinarySystem();

	/**
	 * Проверка цифр.
	 */
	@Test
	public void testGet()
	{
		List<Character> digits = List.of(
			'0', '1'
		);

		assertArrayEquals(digits.toArray(), NUMERAL_SYSTEM.get().toArray());
	}

	/**
	 * Проверка с содержащейся цифрой.
	 */
	@Test
	public void testContains()
	{
		assertTrue(NUMERAL_SYSTEM.contains('1'));
	}

	/**
	 * Проверка с не содержащейся цифрой.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(NUMERAL_SYSTEM.contains('2'));
	}

	/**
	 * Проверка получения массива цифр.
	 */
	@Test
	public void testToArray()
	{
		Character[] digits = new Character[] {
			'0', '1'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка преобразования цифр в строку с разделителем.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "0,1";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка преобразования цифр в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "01";

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

		assertFalse(NUMERAL_SYSTEM.equals(new RomanSystem()));

		assertTrue(NUMERAL_SYSTEM.equals(new BinarySystem()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new BinarySystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new RomanSystem().hashCode());
	}
}