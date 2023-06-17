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

import dev.kalenchukov.stringi.Stringi;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link AbstractSystem}.
 *
 * @author Алексей Каленчуков
 */
public class AbstractSystemTest
{
	/**
	 * Класс проверки метода {@link AbstractSystem#contains(Character)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Contains
	{
		/**
		 * Проверка метода {@link AbstractSystem#contains(Character)}.
		 */
		@ParameterizedTest
		@ValueSource(chars = {
			'7', '0', '3'
		})
		public void contains(Character value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.contains(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.contains(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#allMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class AllMatch
	{
		/**
		 * Проверка метода {@link AbstractSystem#allMatch(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"56734589057651234", "0", "23434"
		})
		public void allMatch(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.allMatch(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.allMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#anyMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class AnyMatch
	{
		/**
		 * Проверка метода {@link AbstractSystem#anyMatch(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"AB0CD", "7sddd"
		})
		public void anyMatch(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.anyMatch(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.anyMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#noneMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class NoneMatch
	{
		/**
		 * Проверка метода {@link AbstractSystem#noneMatch(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"ABCDEF", "sddf"
		})
		public void noneMatch(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.noneMatch(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.noneMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#isSorted(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSorted
	{
		/**
		 * Проверка метода {@link AbstractSystem#isSorted(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"0", "9", "55", "77665544322", "0123456789", "9876543210"
		})
		public void isSorted(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSorted(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSorted(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#isSortedAsc(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSortedAsc
	{
		/**
		 * Проверка метода {@link AbstractSystem#isSortedAsc(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"0", "22", "22334455", "0123", "789", "23456", "0123456789"
		})
		public void isSortedAsc(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSortedAsc(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSortedAsc(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#isSortedDesc(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSortedDesc
	{
		/**
		 * Проверка метода {@link AbstractSystem#isSortedDesc(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"0", "9", "77", "6655443221", "65", "3210", "9876543210"
		})
		public void isSortedDesc(String value)
		{
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSortedDesc(value);

			assertThat(actual).isTrue();
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
			Numerable numeralSystem = new DecimalSystem();

			boolean actual = numeralSystem.isSortedDesc(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#equals(Object)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Equals
	{
		/**
		 * Проверка метода {@link AbstractSystem#equals(Object)}.
		 */
		@Test
		public void testEquals()
		{
			Numerable numeralSystem1 = new BinarySystem();
			Numerable numeralSystem2 = new BinarySystem();

			boolean actual = numeralSystem1.equals(numeralSystem2);

			assertThat(actual).isTrue();
		}

		/**
		 * Проверка метода {@link AbstractSystem#equals(Object)} с {@code null}.
		 */
		@Test
		public void testEqualsNull()
		{
			Numerable numeralSystem1 = new BinarySystem();
			Numerable numeralSystem2 = null;

			boolean actual = numeralSystem1.equals(numeralSystem2);

			assertThat(actual).isFalse();
		}

		/**
		 * Проверка метода {@link AbstractSystem#equals(Object)} с разными классами.
		 */
		@Test
		public void testEqualsDifferentClass()
		{
			Numerable numeralSystem1 = new BinarySystem();
			Numerable numeralSystem2 = new DecimalSystem();

			boolean actual = numeralSystem1.equals(numeralSystem2);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractSystem#hashCode()}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class HashCode
	{
		/**
		 * Проверка метода {@link AbstractSystem#hashCode()}.
		 */
		@Test
		public void testHashCode()
		{
			Numerable numeralSystem1 = new BinarySystem();
			Numerable numeralSystem2 = new BinarySystem();

			int expectedHashCode = numeralSystem1.hashCode();
			int actualHashCode = numeralSystem2.hashCode();

			assertThat(actualHashCode).isEqualTo(expectedHashCode);
		}

		/**
		 * Проверка метода {@link AbstractSystem#hashCode()} с разными классами.
		 */
		@Test
		public void testHashCodeDifferentClass()
		{
			Numerable numeralSystem1 = new BinarySystem();
			Numerable numeralSystem2 = new HexadecimalSystem();

			int expectedHashCode = numeralSystem1.hashCode();
			int actualHashCode = numeralSystem2.hashCode();

			assertThat(actualHashCode).isNotEqualTo(expectedHashCode);
		}
	}

	/**
	 * Проверка метода {@link AbstractSystem#toArray()}.
	 */
	@Test
	public void toArray()
	{
		Character[] expectedArray = new Character[] {
			'0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9'
		};

		Character[] actualArray = new DecimalSystem().toArray();

		assertThat(actualArray).containsSequence(expectedArray);
	}

	/**
	 * Проверка метода {@link AbstractSystem#toString()}.
	 */
	@Test
	public void testToString()
	{
		String expectedString = "0123456789";

		String actualString = new DecimalSystem().toString();

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractSystem#toString(String)}.
	 */
	@Test
	public void toStringSeparator()
	{
		String expectedString = "0,1,2,3,4,5,6,7,8,9";

		String actualString = new DecimalSystem().toString(",");

		assertThat(actualString).isEqualTo(expectedString);
	}
}
