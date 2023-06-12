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

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link DuodecimalSystem}.
 *
 * @author Алексей Каленчуков
 */
public class DuodecimalSystemTest
{
	/**
	 * Проверка метода {@link DuodecimalSystem#get()}.
	 */
	@Test
	public void get()
	{
		DuodecimalSystem numeralSystem = new DuodecimalSystem();
		List<Character> expectedList = List.of(
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9',
			'A', 'B'
		);

		List<Character> actualList = numeralSystem.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link DuodecimalSystem#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		DuodecimalSystem numeralSystem1 = new DuodecimalSystem();
		DuodecimalSystem numeralSystem2 = new DuodecimalSystem();

		boolean actual = numeralSystem1.equals(numeralSystem2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link DuodecimalSystem#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		DuodecimalSystem numeralSystem1 = new DuodecimalSystem();
		DuodecimalSystem numeralSystem2 = new DuodecimalSystem();

		Integer expectedHashCode = numeralSystem1.hashCode();
		Integer actualHashCode = numeralSystem2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}