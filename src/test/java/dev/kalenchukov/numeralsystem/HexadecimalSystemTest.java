/*
 * Copyright © 2022 Алексей Каленчуков
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
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HexadecimalSystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new HexadecimalSystem();

	/**
	 * Проверка цифр.
	 */
	@Test
	public void testGet()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E',
			'F'
		);

		assertArrayEquals(digits.toArray(), NUMERAL_SYSTEM.get().toArray());
	}

	/**
	 * Проверка с содержащейся цифрой.
	 */
	@Test
	public void testContains()
	{
		assertTrue(NUMERAL_SYSTEM.contains('D'));
	}

	/**
	 * Проверка с не содержащейся цифрой.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(NUMERAL_SYSTEM.contains('W'));
	}

	/**
	 * Проверка получения массива цифр.
	 */
	@Test
	public void testToArray()
	{
		Character[] digits = new Character[] {
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E',
			'F'
		};

		assertArrayEquals(digits, NUMERAL_SYSTEM.toArray());
	}

	/**
	 * Проверка преобразования цифр в строку с разделителем.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F";

		assertEquals(string, NUMERAL_SYSTEM.toString(","));
	}

	/**
	 * Проверка преобразования цифр в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "0123456789ABCDEF";

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

		assertFalse(NUMERAL_SYSTEM.equals(new OctalSystem()));

		assertTrue(NUMERAL_SYSTEM.equals(new HexadecimalSystem()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new HexadecimalSystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new OctalSystem().hashCode());
	}
}