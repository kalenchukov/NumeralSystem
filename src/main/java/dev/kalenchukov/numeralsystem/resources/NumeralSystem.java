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

package dev.kalenchukov.numeralsystem.resources;

import dev.kalenchukov.numeralsystem.*;
import org.jetbrains.annotations.NotNull;

/**
 * Перечисление систем счисления.
 *
 * @author Алексей Каленчуков
 */
public enum NumeralSystem
{
	/**
	 * Двоичная.
	 */
	BINARY(new BinarySystem()),

	/**
	 * Троичная.
	 */
	TERNARY(new TernarySystem()),

	/**
	 * Четвертичная.
	 */
	QUATERNARY(new QuaternarySystem()),

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
	HEXADECIMAL(new HexadecimalSystem()),

	/**
	 * Римская.
	 */
	ROMAN(new RomanSystem());

	/**
	 * Система счисления.
	 */
	@NotNull
	private final Numerable numeralSystem;

	/**
	 * Конструктор для {@code NumeralSystem}.
	 *
	 * @param numeralSystem система счисления.
	 */
	NumeralSystem(@NotNull final Numerable numeralSystem)
	{
		this.numeralSystem = numeralSystem;
	}

	/**
	 * Возвращает систему счисления.
	 *
	 * @return система счисления.
	 */
	@NotNull
	public Numerable getNumeralSystem()
	{
		return this.numeralSystem;
	}
}