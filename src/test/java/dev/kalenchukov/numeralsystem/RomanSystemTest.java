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

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link RomanSystem}.
 *
 * @author Алексей Каленчуков
 */
public class RomanSystemTest
{
	/**
	 * Проверка метода {@link RomanSystem#get()}.
	 */
	@Test
	public void get()
	{
		RomanSystem numeralSystem = new RomanSystem();
		List<Character> expectedList = List.of(
			'I', 'V', 'X', 'L', 'C', 'D', 'M'
		);

		List<Character> actualList = numeralSystem.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link RomanSystem#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		RomanSystem numeralSystem1 = new RomanSystem();
		RomanSystem numeralSystem2 = new RomanSystem();

		boolean actual = numeralSystem1.equals(numeralSystem2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link RomanSystem#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		RomanSystem numeralSystem1 = new RomanSystem();
		RomanSystem numeralSystem2 = new RomanSystem();

		int expectedHashCode = numeralSystem1.hashCode();
		int actualHashCode = numeralSystem2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}