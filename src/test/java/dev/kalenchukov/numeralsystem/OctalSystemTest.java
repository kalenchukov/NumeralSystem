package dev.kalenchukov.numeralsystem;

import dev.kalenchukov.numeralsystem.resources.NumeralSystem;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OctalSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new OctalSystem();

	/**
	 * Проверка количества цифр восьмеричной системы счисления.
	 */
	@Test
	public void testGetDigitCount()
	{
		assertEquals(8, NUMERAL_SYSTEM.getDigits().size());
	}

	/**
	 * Проверка получения цифр восьмеричной системы счисления.
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
	 * Проверка позиции цифр восьмеричной системы счисления.
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
}