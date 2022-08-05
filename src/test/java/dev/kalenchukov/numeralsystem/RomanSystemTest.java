/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RomanSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new RomanSystem();

	/**
	 * Проверка количества цифр.
	 */
	@Test
	public void testGetDigitCount()
	{
		assertEquals(7, NUMERAL_SYSTEM.getDigits().size());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'I', 'V', 'X', 'L', 'C', 'D', 'M'
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

		assertEquals(Character.valueOf('I'), digits.get(0));
		assertEquals(Character.valueOf('V'), digits.get(1));
		assertEquals(Character.valueOf('X'), digits.get(2));
		assertEquals(Character.valueOf('L'), digits.get(3));
		assertEquals(Character.valueOf('C'), digits.get(4));
		assertEquals(Character.valueOf('D'), digits.get(5));
		assertEquals(Character.valueOf('M'), digits.get(6));
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
}