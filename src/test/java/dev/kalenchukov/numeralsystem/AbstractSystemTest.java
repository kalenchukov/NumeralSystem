/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link AbstractSystem}.
 *
 * @author Алексей Каленчуков
 */
public class AbstractSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new DecimalSystem();

	/**
	 * Проверка метода {@link AbstractSystem#contains(Character)}.
	 */
	@ParameterizedTest
	@ValueSource(chars = {
		'7', '0', '3'
	})
	public void contains(Character value)
	{
		assertTrue(NUMERAL_SYSTEM.contains(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#contains(Character)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(chars = {
		'A', 'a', 'Ё'
	})
	public void containsNotCorrect(Character value)
	{
		assertFalse(NUMERAL_SYSTEM.contains(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#allMatch(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"56734589057651234", "0", "23434"
	})
	public void allMatch(String value)
	{
		assertTrue(NUMERAL_SYSTEM.allMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#anyMatch(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"AB0CD", "7sddd"
	})
	public void anyMatch(String value)
	{
		assertTrue(NUMERAL_SYSTEM.anyMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#anyMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "ABCDEF", "erfds"
	})
	public void anyMatchNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.anyMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#noneMatch(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"ABCDEF", "sddf"
	})
	public void noneMatch(String value)
	{
		assertTrue(NUMERAL_SYSTEM.noneMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#noneMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "AB7DEF", "324asd"
	})
	public void noneMatchNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.noneMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#allMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "123F", "F", "123456A789"
	})
	public void allMatchNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.allMatch(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSorted(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"0", "9", "55", "77665544322", "0123456789", "9876543210"
	})
	public void isSorted(String value)
	{
		assertTrue(NUMERAL_SYSTEM.isSorted(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSorted(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "6789012345", "2345671890", "23r44567"
	})
	public void isSortedNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.isSorted(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedAsc(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"0", "22", "22334455", "0123", "789", "23456", "0123456789"
	})
	public void isSortedAsc(String value)
	{
		assertTrue(NUMERAL_SYSTEM.isSortedAsc(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedAsc(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "A", "10", "576890", "576z890", "1234567890"
	})
	public void isSortedAscNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.isSortedAsc(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedDesc(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"0", "9", "77", "6655443221", "65", "3210", "9876543210"
	})
	public void isSortedDesc(String value)
	{
		assertTrue(NUMERAL_SYSTEM.isSortedDesc(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedDesc(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "A", "09", "098", "25431", "25431a", "0987654321"
	})
	public void isSortedDescNotCorrect(String value)
	{
		assertFalse(NUMERAL_SYSTEM.isSortedDesc(value));
	}

	/**
	 * Проверка метода {@link AbstractSystem#toArray()}.
	 */
	@Test
	public void toArray()
	{
		Character[] digits = new Character[] {
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка метода {@link AbstractSystem#toString(String)}.
	 */
	@Test
	public void toStringSeparator()
	{
		String string = "0,1,2,3,4,5,6,7,8,9";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка метода {@link AbstractSystem#toString()}.
	 */
	@Test
	public void testToString()
	{
		String string = "0123456789";

		assertEquals(string, NUMERAL_SYSTEM.toString());
	}
}
