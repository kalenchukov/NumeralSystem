/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

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
	private final List<@NotNull Character> digit;

	/**
	 * Конструктор для {@code AbstractSystem}.
	 *
	 * @param digit Цифры.
	 */
	protected AbstractSystem(@NotNull final List<@NotNull Character> digit)
	{
		this.digit = digit;
	}

	/**
	 * @see Numerable#get()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> get()
	{
		return Collections.unmodifiableList(this.digit);
	}

	/**
	 * @see Numerable#contains(Character)
	 */
	@Override
	public boolean contains(@NotNull final Character digit)
	{
		Objects.requireNonNull(digit);

		return this.digit.contains(digit);
	}

	/**
	 * @see Numerable#toArray()
	 */
	@NotNull
	@Override
	public Character @NotNull [] toArray()
	{
		return this.digit.toArray(Character[]::new);
	}

	/**
	 * @see Numerable#toString(String)
	 */
	@Override
	@NotNull
	public String toString(@NotNull final String separator)
	{
		StringBuilder string = new StringBuilder();

		for (int index = 0; index < this.digit.size(); index++)
		{
			string.append(this.digit.get(index));

			if (index != this.digit.size() - 1) {
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
}
