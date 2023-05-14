/*
 * Copyright © 2023 Алексей Каленчуков
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

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link QuaternarySystem}.
 *
 * @author Алексей Каленчуков
 */
public class QuaternarySystemTest
{
	@NotNull
	public static final Numerable NUMERAL_SYSTEM = new QuaternarySystem();

	/**
	 * Проверка метода {@link QuaternarySystem#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> digits = List.of(
			'0', '1', '2', '3'
		);

		assertArrayEquals(digits.toArray(), NUMERAL_SYSTEM.get().toArray());
	}

	/**
	 * Проверка метода {@link QuaternarySystem#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, NUMERAL_SYSTEM);

		assertEquals(NUMERAL_SYSTEM, NUMERAL_SYSTEM);

		assertNotEquals(NUMERAL_SYSTEM, new BinarySystem());

		assertEquals(NUMERAL_SYSTEM, new QuaternarySystem());
	}

	/**
	 * Проверка метода {@link QuaternarySystem#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(NUMERAL_SYSTEM.hashCode(), NUMERAL_SYSTEM.hashCode());

		assertEquals(NUMERAL_SYSTEM.hashCode(), new QuaternarySystem().hashCode());

		assertNotEquals(NUMERAL_SYSTEM.hashCode(), new BinarySystem().hashCode());
	}
}