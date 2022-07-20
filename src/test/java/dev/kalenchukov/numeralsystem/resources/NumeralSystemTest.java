/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem.resources;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumeralSystemTest
{
	/**
	 * Проверка количества цифр бинарной системы счисления.
	 */
	@Test
	public void testBinaryCount()
	{
		assertEquals(2, NumeralSystem.BINARY.getDigits().size());
	}

	/**
	 * Проверка получения цифр бинарной системы счисления.
	 */
	@Test
	public void testBinary()
	{
		List<Character> digits = List.of(
			'0', '1'
		);

		assertTrue(digits.containsAll(NumeralSystem.BINARY.getDigits()));
	}

	/**
	 * Проверка позиции цифр бинарной системы счисления.
	 */
	@Test
	public void testBinaryPosition()
	{
		List<Character> digits = NumeralSystem.BINARY.getDigits();

		assertEquals(Character.valueOf('0'), digits.get(0));
		assertEquals(Character.valueOf('1'), digits.get(1));
	}

	/**
	 * Проверка количества цифр восьмеричной системы счисления.
	 */
	@Test
	public void testOctalCount()
	{
		assertEquals(8, NumeralSystem.OCTAL.getDigits().size());
	}

	/**
	 * Проверка получения цифр восьмеричной системы счисления.
	 */
	@Test
	public void testOctal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7'
		);

		assertTrue(digits.containsAll(NumeralSystem.OCTAL.getDigits()));
	}

	/**
	 * Проверка позиции цифр восьмеричной системы счисления.
	 */
	@Test
	public void testOctalPosition()
	{
		List<Character> digits = NumeralSystem.OCTAL.getDigits();

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
	 * Проверка количества цифр десятеричной системы счисления.
	 */
	@Test
	public void testDecimalCount()
	{
		assertEquals(10, NumeralSystem.DECIMAL.getDigits().size());
	}

	/**
	 * Проверка получения цифр десятеричной системы счисления.
	 */
	@Test
	public void testDecimal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		);

		assertTrue(digits.containsAll(NumeralSystem.DECIMAL.getDigits()));
	}

	/**
	 * Проверка позиции цифр десятеричной системы счисления.
	 */
	@Test
	public void testDecimalPosition()
	{
		List<Character> digits = NumeralSystem.DECIMAL.getDigits();

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
	}

	/**
	 * Проверка количества цифр десятеричной системы счисления.
	 */
	@Test
	public void testDuodecimalCount()
	{
		assertEquals(12, NumeralSystem.DUODECIMAL.getDigits().size());
	}

	/**
	 * Проверка получения цифр двенадцатеричной системы счисления.
	 */
	@Test
	public void testDuodecimal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B'
		);

		assertTrue(digits.containsAll(NumeralSystem.DUODECIMAL.getDigits()));
	}

	/**
	 * Проверка позиции цифр двенадцатеричной системы счисления.
	 */
	@Test
	public void testDuodecimalPosition()
	{
		List<Character> digits = NumeralSystem.DUODECIMAL.getDigits();

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
	}

	/**
	 * Проверка количества цифр десятеричной системы счисления.
	 */
	@Test
	public void testHexadecimalCount()
	{
		assertEquals(16, NumeralSystem.HEXADECIMAL.getDigits().size());
	}

	/**
	 * Проверка получения цифр шестнадцатеричной системы счисления.
	 */
	@Test
	public void testHexadecimal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E',
			'F'
		);

		assertTrue(digits.containsAll(NumeralSystem.HEXADECIMAL.getDigits()));
	}

	/**
	 * Проверка позиции цифр шестнадцатеричной системы счисления.
	 */
	@Test
	public void testHexadecimalPosition()
	{
		List<Character> digits = NumeralSystem.HEXADECIMAL.getDigits();

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