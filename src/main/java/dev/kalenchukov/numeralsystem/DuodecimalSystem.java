package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

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
}
