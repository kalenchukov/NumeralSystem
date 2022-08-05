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
	 * Возвращает цифры.
	 *
	 * @return Коллекцию цифр.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getDigits();

	/**
	 * Возвращает строковое представление цифр.
	 *
	 * @param separator Разделитель.
	 * @return Строку из цифр.
	 */
	@NotNull
	String toString(@NotNull final String separator);
}
