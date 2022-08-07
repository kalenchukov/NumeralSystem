/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Objects;

/**
 * Класс шестнадцатеричной системы счисления.
 */
public class HexadecimalSystem extends AbstractSystem
{
	/**
	 * Цифры.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> DIGITS = List.of(
		'\u0030', '\u0031', '\u0032', '\u0033', '\u0034',
		'\u0035', '\u0036', '\u0037', '\u0038', '\u0039',
		'\u0041', '\u0042', '\u0043', '\u0044', '\u0045',
		'\u0046'
	);

	/**
	 * Конструктор для {@code HexadecimalSystem}.
	 */
	public HexadecimalSystem()
	{
		super(DIGITS);
	}

	/**
	 * @see Object#equals(Object)
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		final HexadecimalSystem numeralSystem = (HexadecimalSystem) obj;

		if (!Objects.equals(HexadecimalSystem.DIGITS, numeralSystem.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return HexadecimalSystem.DIGITS.hashCode();
	}
}
