package dev.kalenchukov.numeralsystem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Интерфейс системы счисления.
 */
public interface Numerable
{
	/**
	 * Возвращает цифры.
	 *
	 * @return Коллекцию цифр.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getDigits();
}
