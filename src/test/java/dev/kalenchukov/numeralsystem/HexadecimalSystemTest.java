/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import dev.kalenchukov.numeralsystem.resources.NumeralSystem;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HexadecimalSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new HexadecimalSystem();

	/**
	 * Проверка количества цифр десятеричной системы счисления.
	 */
	@Test
	public void testGetDigitCount()
	{
		assertEquals(16, NUMERAL_SYSTEM.getDigits().size());
	}

	/**
	 * Проверка получения цифр шестнадцатеричной системы счисления.
	 */
	@Test
	public void testGetDigit()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E',
			'F'
		);

		assertTrue(digits.containsAll(NUMERAL_SYSTEM.getDigits()));
	}

	/**
	 * Проверка позиции цифр шестнадцатеричной системы счисления.
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
		assertEquals(Character.valueOf('8'), digits.get(8));
		assertEquals(Character.valueOf('9'), digits.get(9));
		assertEquals(Character.valueOf('A'), digits.get(10));
		assertEquals(Character.valueOf('B'), digits.get(11));
		assertEquals(Character.valueOf('C'), digits.get(12));
		assertEquals(Character.valueOf('D'), digits.get(13));
		assertEquals(Character.valueOf('E'), digits.get(14));
		assertEquals(Character.valueOf('F'), digits.get(15));
	}
}