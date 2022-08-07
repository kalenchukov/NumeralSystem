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
	 * Проверка получения цифр.
	 */
	@Test
	public void testBinary()
	{
		List<Character> digits = List.of(
			'0', '1'
		);

		assertArrayEquals(digits.toArray(), NumeralSystem.BINARY.get().toArray());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testOctal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7'
		);

		assertArrayEquals(digits.toArray(), NumeralSystem.OCTAL.get().toArray());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testDecimal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		);

		assertArrayEquals(digits.toArray(), NumeralSystem.DECIMAL.get().toArray());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testDuodecimal()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B'
		);

		assertArrayEquals(digits.toArray(), NumeralSystem.DUODECIMAL.get().toArray());
	}

	/**
	 * Проверка получения цифр.
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

		assertArrayEquals(digits.toArray(), NumeralSystem.HEXADECIMAL.get().toArray());
	}

	/**
	 * Проверка получения цифр.
	 */
	@Test
	public void testRoman()
	{
		List<Character> digits = List.of(
			'I', 'V', 'X', 'L', 'C', 'D', 'M'
		);

		assertArrayEquals(digits.toArray(), NumeralSystem.ROMAN.get().toArray());
	}
}