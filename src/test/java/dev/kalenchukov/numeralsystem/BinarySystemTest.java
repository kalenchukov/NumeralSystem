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
	 * Проверка количества цифр бинарной системы счисления.
	 */
	@Test
	public void testGetDigitCount()
	{
		assertEquals(2, NUMERAL_SYSTEM.getDigits().size());
	}

	/**
	 * Проверка получения цифр бинарной системы счисления.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'0', '1'
		);

		assertTrue(digits.containsAll(NUMERAL_SYSTEM.getDigits()));
	}

	/**
	 * Проверка позиции цифр бинарной системы счисления.
	 */
	@Test
	public void testGetDigitPosition()
	{
		List<Character> digits = NUMERAL_SYSTEM.getDigits();

		assertEquals(Character.valueOf('0'), digits.get(0));
		assertEquals(Character.valueOf('1'), digits.get(1));
	}
}