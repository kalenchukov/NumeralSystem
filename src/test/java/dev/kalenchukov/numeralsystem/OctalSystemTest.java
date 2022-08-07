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

public class OctalSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new OctalSystem();

	/**
	 * Проверка количества цифр.
	 */
	@Test
	public void testGetDigitCount()
	{
		assertEquals(8, NUMERAL_SYSTEM.getDigits().size());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7'
		);

		assertTrue(digits.containsAll(NUMERAL_SYSTEM.getDigits()));
	}

	/**
	 * Проверка позиции цифр.
	 */
	@Test
	public void testGetDigitPosition()
	{
		List<Character> digits = NUMERAL_SYSTEM.getDigits();

		assertEquals(Character.valueOf('0'), digits.get(0));
		assertEquals(Character.valueOf('1'), digits.get(1));
		assertEquals(Character.valueOf('2'), digits.get(2));
		assertEquals(Character.valueOf('3'), digits.get(3));
		assertEquals(Character.valueOf('4'), digits.get(4));
		assertEquals(Character.valueOf('5'), digits.get(5));
		assertEquals(Character.valueOf('6'), digits.get(6));
		assertEquals(Character.valueOf('7'), digits.get(7));
	}

	/**
	 * Проверка получения массива цифр.
	 */
	@Test
	public void testToArray()
	{
		Character[] digits = new Character[] {
			'0', '1', '2', '3', '4', '5', '6', '7'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка преобразования цифр в строку с разделителем.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "0,1,2,3,4,5,6,7";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка преобразования цифр в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "01234567";

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

		assertFalse(NUMERAL_SYSTEM.equals(new HexadecimalSystem()));

		assertTrue(NUMERAL_SYSTEM.equals(new OctalSystem()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new OctalSystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new HexadecimalSystem().hashCode());
	}
}