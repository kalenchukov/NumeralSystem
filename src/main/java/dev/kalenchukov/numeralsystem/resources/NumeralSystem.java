/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem.resources;

import dev.kalenchukov.numeralsystem.*;
import org.jetbrains.annotations.NotNull;

/**
 * Перечисление систем счисления.
 */
public enum NumeralSystem
{
	/**
	 * Двоичная.
	 */
	BINARY(new BinarySystem()),

	/**
	 * Римская.
	 */
	ROMAN(new RomanSystem()),

	/**
	 * Восьмеричная.
	 */
	OCTAL(new OctalSystem()),

	/**
	 * Десятеричная.
	 */
	DECIMAL(new DecimalSystem()),

	/**
	 * Двенадцатеричная.
	 */
	DUODECIMAL(new DuodecimalSystem()),

	/**
	 * Шестнадцатеричная.
	 */
	HEXADECIMAL(new HexadecimalSystem());

	/**
	 * Система счисления.
	 */
	@NotNull
	private final Numerable numeralSystem;

	/**
	 * Конструктор для {@code NumeralSystem}.
	 *
	 * @param numeralSystem Система счисления.
	 */
	NumeralSystem(@NotNull final Numerable numeralSystem)
	{
		this.numeralSystem = numeralSystem;
	}

	/**
	 * Возвращает систему счисления.
	 *
	 * @return Система счисления.
	 */
	@NotNull
	public Numerable getNumeralSystem()
	{
		return this.numeralSystem;
	}
}