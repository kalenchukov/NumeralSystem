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
 * Класс двенадцатеричной системы счисления.
 */
public class DuodecimalSystem extends AbstractSystem
{
	/**
	 * Цифры.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> DIGITS = List.of(
		'\u0030', '\u0031', '\u0032', '\u0033', '\u0034',
		'\u0035', '\u0036', '\u0037', '\u0038', '\u0039',
		'\u0041', '\u0042'
	);

	/**
	 * Конструктор для {@code DuodecimalSystem}.
	 */
	public DuodecimalSystem()
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

		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}

		final DuodecimalSystem numeralSystem = (DuodecimalSystem) obj;

		if (!Objects.equals(DuodecimalSystem.DIGITS, numeralSystem.get())) {
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
		return DuodecimalSystem.DIGITS.hashCode();
	}
}
