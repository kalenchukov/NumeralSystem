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
 * Интерфейс системы счисления.
 */
public interface Numerable
{
	/**
	 * Возвращает цифры системы счисления.
	 *
	 * @return Коллекцию цифр системы счисления.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getDigits();

	/**
	 * Возвращает массив из цифр системы счисления.
	 *
	 * @return Массив из цифр системы счисления.
	 */
	@NotNull
	Character @NotNull [] toArray();

	/**
	 * Возвращает строковое представление цифр системы счисления.
	 *
	 * @param separator Разделитель.
	 * @return Строку из цифр системы счисления.
	 */
	@NotNull
	String toString(@NotNull final String separator);
}
