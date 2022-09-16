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
import org.jetbrains.annotations.Unmodifiable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Класс абстрактной системы счисления
 */
public abstract class AbstractSystem implements Numerable
{
	/**
	 * Цифры.
	 */
	@NotNull
	private final List<@NotNull Character> digits;

	/**
	 * Конструктор для {@code AbstractSystem}.
	 *
	 * @param digits Цифры.
	 */
	protected AbstractSystem(@NotNull final List<@NotNull Character> digits)
	{
		this.digits = digits;
	}

	/**
	 * @see Numerable#get()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> get()
	{
		return Collections.unmodifiableList(this.digits);
	}

	/**
	 * @see Numerable#contains(Character)
	 */
	@Override
	public boolean contains(@NotNull final Character digit)
	{
		Objects.requireNonNull(digit);

		return this.digits.contains(digit);
	}

	/**
	 * @see Numerable#allMatch(String)
	 */
	@Override
	public boolean allMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(this.stringToArrayCharacter(string))
					 .allMatch(this.digits::contains);
	}

	/**
	 * @see Numerable#toArray()
	 */
	@NotNull
	@Override
	public Character @NotNull [] toArray()
	{
		return this.digits.toArray(Character[]::new);
	}

	/**
	 * @see Numerable#toString(String)
	 */
	@Override
	@NotNull
	public String toString(@NotNull final String separator)
	{
		StringBuilder string = new StringBuilder();

		for (int index = 0; index < this.digits.size(); index++)
		{
			string.append(this.digits.get(index));

			if (index != this.digits.size() - 1) {
				string.append(separator);
			}
		}

		return string.toString();
	}

	/**
	 * @see Object#toString()
	 */
	@Override
	@NotNull
	public String toString()
	{
		return this.toString("");
	}

	/**
	 * Преобразовывает строку в массив символов.
	 *
	 * @param string Строка.
	 * @return Массив символов.
	 */
	@NotNull
	private Character @NotNull [] stringToArrayCharacter(@NotNull final String string)
	{
		return string.chars()
					 .mapToObj(i -> (char) i)
					 .toArray(Character[]::new);
	}
}
