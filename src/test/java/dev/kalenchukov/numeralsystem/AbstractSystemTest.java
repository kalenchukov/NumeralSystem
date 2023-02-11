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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link AbstractSystem}.
 */
public class AbstractSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new DecimalSystem();

	/**
	 * Проверка метода {@link AbstractSystem#contains(Character)}.
	 */
	@Test
	public void testContains()
	{
		assertTrue(NUMERAL_SYSTEM.contains('7'));
	}

	/**
	 * Проверка метода {@link AbstractSystem#contains(Character)} с некорректным значением.
	 */
	@Test
	public void testContainsNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.contains('F'));
	}

	/**
	 * Проверка метода {@link AbstractSystem#allMatch(String)}.
	 */
	@Test
	public void testAllMatch()
	{
		assertTrue(NUMERAL_SYSTEM.allMatch("56734589057651234"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#anyMatch(String)}.
	 */
	@Test
	public void testAnyMatch()
	{
		assertTrue(NUMERAL_SYSTEM.anyMatch("AB0CD"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#anyMatch(String)} с некорректным значением.
	 */
	@Test
	public void testAnyMatchNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.anyMatch(""));
		assertFalse(NUMERAL_SYSTEM.anyMatch("ABCDEF"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#noneMatch(String)}.
	 */
	@Test
	public void testNoneMatch()
	{
		assertTrue(NUMERAL_SYSTEM.noneMatch("ABCDEF"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#noneMatch(String)} с некорректным значением.
	 */
	@Test
	public void testNoneMatchNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.noneMatch(""));
		assertFalse(NUMERAL_SYSTEM.noneMatch("AB0DEF"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#allMatch(String)} с некорректным значением.
	 */
	@Test
	public void testAllMatchNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.allMatch(""));
		assertFalse(NUMERAL_SYSTEM.allMatch("123F"));
		assertFalse(NUMERAL_SYSTEM.allMatch("F"));
		assertFalse(NUMERAL_SYSTEM.allMatch("123456A789"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedAsc(String)}.
	 */
	@Test
	public void testIsSortedAsc()
	{
		assertTrue(NUMERAL_SYSTEM.isSortedAsc("0123456789"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedAsc(String)} с некорректным значением.
	 */
	@Test
	public void testIsSortedAscNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.isSortedAsc("1234567890"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedDesc(String)}.
	 */
	@Test
	public void testIsSortedDesc()
	{
		assertTrue(NUMERAL_SYSTEM.isSortedDesc("9876543210"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#isSortedDesc(String)} с некорректным значением.
	 */
	@Test
	public void testIsSortedDescNotCorrect()
	{
		assertFalse(NUMERAL_SYSTEM.isSortedDesc("0987654321"));
	}

	/**
	 * Проверка метода {@link AbstractSystem#toArray()}.
	 */
	@Test
	public void testToArray()
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
	public void testToStringSeparator()
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
