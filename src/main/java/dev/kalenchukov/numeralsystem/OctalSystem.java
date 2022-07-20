package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Класс восьмеричной системы счисления.
 */
public class OctalSystem extends AbstractSystem
{
	/**
	 * Цифры.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> DIGITS = List.of(
		'\u0030', '\u0031', '\u0032', '\u0033', '\u0034',
		'\u0035', '\u0036', '\u0037'
	);

	/**
	 * Конструктор для {@code OctalSystem}.
	 */
	public OctalSystem()
	{
		super(DIGITS);
	}
}
