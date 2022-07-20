package dev.kalenchukov.numeralsystem.resources;

import dev.kalenchukov.numeralsystem.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collections;
import java.util.List;

/**
 * Перечисление систем счисления.
 */
public enum NumeralSystem
{
	/**
	 * Двоичная система счисления.
	 */
	BINARY(BinarySystem.DIGITS),

	/**
	 * Восьмеричная система счисления.
	 */
	OCTAL(OctalSystem.DIGITS),

	/**
	 * Десятеричная система счисления.
	 */
	DECIMAL(DecimalSystem.DIGITS),

	/**
	 * Двенадцатеричная система счисления.
	 */
	DUODECIMAL(DuodecimalSystem.DIGITS),

	/**
	 * Шестнадцатеричная система счисления.
	 */
	HEXADECIMAL(HexadecimalSystem.DIGITS);

	/**
	 * Цифры.
	 */
	@NotNull
	private final List<@NotNull Character> digits;

	/**
	 * Конструктор для {@code NumeralSystem}.
	 *
	 * @param digits Цифры.
	 */
	NumeralSystem(@NotNull final List<@NotNull Character> digits)
	{
		this.digits = digits;
	}

	/**
	 * Возвращает цифры системы счисления.
	 *
	 * @return Цифры.
	 */
	@NotNull
	@Unmodifiable
	public List<@NotNull Character> getDigits()
	{
		return Collections.unmodifiableList(this.digits);
	}
}
