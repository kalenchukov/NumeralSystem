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
}
