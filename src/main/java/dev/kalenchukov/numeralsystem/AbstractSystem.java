package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collections;
import java.util.List;

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
	 * @see Numerable#getDigits()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getDigits()
	{
		return Collections.unmodifiableList(this.digit);
	}
}
