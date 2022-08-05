/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Класс римской системы счисления.
 */
public class RomanSystem extends AbstractSystem
{
	/**
	 * Цифры.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> DIGITS = List.of(
		'\u0049', '\u0056', '\u0058', '\u004C', '\u0043', '\u0044', '\u004D'
	);

	/**
	 * Конструктор для {@code RomanSystem}.
	 */
	public RomanSystem()
	{
		super(DIGITS);
	}
}
