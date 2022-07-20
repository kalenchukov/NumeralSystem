package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Класс двоичной системы счисления.
 */
public class BinarySystem extends AbstractSystem
{
	/**
	 * Цифры.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> DIGITS = List.of(
		'\u0030', '\u0031'
	);

	/**
	 * Конструктор для {@code BinarySystem}.
	 */
	public BinarySystem()
	{
		super(DIGITS);
	}
}
