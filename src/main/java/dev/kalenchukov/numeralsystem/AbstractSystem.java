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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Класс абстрактной системы счисления.
 *
 * @author Алексей Каленчуков
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
	 * @param digits цифры.
	 */
	protected AbstractSystem(@NotNull final List<@NotNull Character> digits)
	{
		this.digits = digits;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> toList()
	{
		return Collections.unmodifiableList(this.digits);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param digit {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean contains(@NotNull final Character digit)
	{
		Objects.requireNonNull(digit);

		return this.digits.contains(digit);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean allMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .allMatch(this.digits::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean anyMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .anyMatch(this.digits::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean noneMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .noneMatch(this.digits::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean isSorted(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		return this.isSortedAsc(string) || this.isSortedDesc(string);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean isSortedAsc(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (!this.allMatch(string)) {
			return false;
		}

		if (string.length() == 1) {
			return true;
		}

		int lastIndex = -1;

		for (char digit : string.toCharArray())
		{
			int nextIndex = this.digits.indexOf(digit);

			if (lastIndex > nextIndex) {
				return false;
			}

			lastIndex = nextIndex;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean isSortedDesc(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (!this.allMatch(string)) {
			return false;
		}

		if (string.length() == 1) {
			return true;
		}

		int lastIndex = this.digits.size() + 1;

		for (char digit : string.toCharArray())
		{
			int nextIndex = this.digits.indexOf(digit);

			if (lastIndex < nextIndex) {
				return false;
			}

			lastIndex = nextIndex;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public Character @NotNull [] toArray()
	{
		return this.digits.toArray(Character[]::new);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param separator {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	@NotNull
	public String toString(@NotNull final String separator)
	{
		return Stringi.glue(this.digits, separator);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	@NotNull
	public String toString()
	{
		return this.toString("");
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param obj {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Numerable)) {
			return false;
		}

		final Numerable numeralSystem = (Numerable) obj;

		if (!Objects.equals(this.toList(), numeralSystem.toList())) {
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		return this.toList().hashCode();
	}
}
